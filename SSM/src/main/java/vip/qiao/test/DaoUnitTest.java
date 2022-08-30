package vip.qiao.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.core.io.Resource;
import vip.qiao.dao.DepartmentMapper;

import vip.qiao.dao.MeetingMapper;

import vip.qiao.dao.UuserMapper;
import vip.qiao.domain.Department;

import vip.qiao.domain.Meeting;

import vip.qiao.domain.Uuser;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/*
* Dao层的单元测试类
* */
public class DaoUnitTest {

    private DepartmentMapper departmentMapper;
    private UuserMapper uuserMapper;
    private MeetingMapper meetingMapper;

    public DaoUnitTest() throws IOException {
        //读取单元测试使用的mybatis配置文件
        String resource = "mybatisJunitTest.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);//当前session是自动提交的commit
        //通过动态代理生成实现类
        uuserMapper = sqlSession.getMapper(UuserMapper.class);
        departmentMapper = sqlSession.getMapper(DepartmentMapper.class);
        meetingMapper = sqlSession.getMapper(MeetingMapper.class);
    }

    @Test
    public void testSelectOneDepartment() throws IOException {
        //读取单元测试使用的mybatis配置文件
//        String resource = "mybatisJunitTest.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession sqlSession = sqlSessionFactory.openSession(true);//当前session是自动提交的commit
//        //通过动态代理生成实现类
//        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        Department department = departmentMapper.selectByPrimaryKey(4);
        System.out.println(department);
    }

    @Test
    public void testSelectAllUuser() throws IOException {
        //读取单元测试使用的mybatis配置文件
//        String resource = "mybatisJunitTest.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession sqlSession = sqlSessionFactory.openSession(true);//当前session是自动提交的commit
//        //通过动态代理生成实现类
//        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        List<Uuser> uusers = uuserMapper.selectByExample(null);
        System.out.println(uusers);
    }

//    测试持有1对1 对象的自动封装
    @Test
    public void testDepartmentSelectByPrimaryKey(){
        Department department = departmentMapper.selectByPrimaryKey(1);
        System.out.println(department);
    }

    @Test
    public void testMeetingSelectByPrimaryKeyWithObject(){
        Meeting meeting = meetingMapper.selectByPrimaryKey(2);
        System.out.println(meeting);
    }
}
