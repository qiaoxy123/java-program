package org.whr.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.whr.domain.Uuser;
import org.whr.service.UuserService;


/**
 * 使用spring整合junit进行单元测试
 *
 * */
@RunWith(SpringJUnit4ClassRunner.class)//加载spring   容器
@ContextConfiguration("classpath:applicationContext.xml")//加载配置文件
public class ServiceUnitTest {
    //代码调试的时候其中有一个办法是日志输出，1  System.out.println   ，   2 日志logger
    //
    @Autowired
    private UuserService uuserService;

    @Test
    public void testServiceReNewUser(){
        Uuser user1 = new Uuser("kk", false, "123");
        boolean b = uuserService.reNewUser(user1);
        System.out.println(b);
    }


}
