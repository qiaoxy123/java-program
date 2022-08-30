package org.whr.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.core.io.Resource;
import org.whr.dao.DepartmentMapper;
import org.whr.domain.Department;

import java.io.IOException;
import java.io.InputStream;

/*
Dao层测试
 */
public class DaoUnitTest {


    private DepartmentMapper departmentMapper;


    public DaoUnitTest() throws IOException {
        //读取单元测试的mybatis配置文件
        String resource ="mybatisJunitTest.xml";
        InputStream inputStream= Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);//当前session是自动提交的commit
        //通过动态代理生成实现类
        departmentMapper=sqlSession.getMapper(DepartmentMapper.class);

    }

    @Test
    public void selsectOneDepartment() throws IOException {
        //读取单元测试的mybatis配置文件
        //String resource ="mybatisJunitTest.xml";
        //InputStream inputStream= Resources.getResourceAsStream(resource);

        Department department=departmentMapper.selectByPrimaryKey(1);
        System.out.println(department);

    }


}
