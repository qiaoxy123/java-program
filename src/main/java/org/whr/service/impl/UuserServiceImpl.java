package org.whr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.whr.dao.UuserMapper;
import org.whr.domain.Uuser;
import org.whr.domain.UuserExample;
import org.whr.service.UuserService;

import java.util.List;

//此处需要添加注解使IOC容器能够将该类的实例对象作为组件扫描到容器中
@Service(value = "uuserService")
public class UuserServiceImpl  implements UuserService {

    @Autowired
    private UuserMapper uuserMapper; //自动注入，  看到存在成员时，如果有Autowired注解修饰，则从IOC容器取出对象使用


    //添加一个新员工
    @Override
    public boolean reNewUser(Uuser uuser) {
        //1 先查询是否存在该员工
        //mybatis生成的条件实体类的用法
        UuserExample uuserExample = new UuserExample();
        UuserExample.Criteria criteria = uuserExample.createCriteria();
        criteria.andUnameEqualTo(uuser.getUname());

        List<Uuser> uusers = uuserMapper.selectByExample(uuserExample);
        if (uusers.size()>0){
            System.out.println("存在同名用户");
            return false;
        }
        else {

            //2 将信息插入到数据库中
            int i=uuserMapper.insertSelective(uuser);
            System.out.println("成功添加了" + i + "个 user");
            return true;

        }

    }
}
