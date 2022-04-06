package mapper;

import com.baomidou.mybatisplus.core.MybatisSqlSessionFactoryBuilder;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import data.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Project name(项目名称)：Mybatis_Plus条件构造器之基本比较操作
 * Package(包名): mapper
 * Class(测试类名): StudentMapperTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/4/6
 * Time(创建时间)： 21:09
 * Version(版本): 1.0
 * Description(描述)： 测试类
 * eq
 * 等于 =
 * ne
 * 不等于 <>
 * gt
 * 大于 >
 * ge
 * 大于等于 >=
 * lt
 * 小于 <
 * le
 * 小于等于 <=
 * between
 * BETWEEN 值1 AND 值2
 * notBetween
 * NOT BETWEEN 值1 AND 值2
 * in
 * 字段 IN (value.get(0), value.get(1), ...
 * notIn
 * 字段 NOT IN (v0, v1, ...
 */

class StudentMapperTest
{
    @Test
    public void eq() throws IOException
    {
        String resource = "mybatis-config.xml";
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream(resource);
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("class_no", 1001L);

        List<Student> list = studentMapper.selectList(queryWrapper);
        for (Student student : list)
        {
            System.out.print(student);
        }

        System.out.println("数量：" + list.size());

        sqlSession.close();
    }

    @Test
    public void ne() throws IOException
    {
        String resource = "mybatis-config.xml";
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream(resource);
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.ne("sex", "男");

        List<Student> list = studentMapper.selectList(queryWrapper);
        for (Student student : list)
        {
            System.out.print(student);
        }

        System.out.println("数量：" + list.size());

        sqlSession.close();
    }

    @Test
    public void gt() throws IOException
    {
        String resource = "mybatis-config.xml";
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream(resource);
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.gt("class_no", 1007L);

        List<Student> list = studentMapper.selectList(queryWrapper);
        for (Student student : list)
        {
            System.out.print(student);
        }

        System.out.println("数量：" + list.size());

        sqlSession.close();
    }

    @Test
    public void ge() throws IOException
    {
        String resource = "mybatis-config.xml";
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream(resource);
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.ge("class_no", 1007L);

        List<Student> list = studentMapper.selectList(queryWrapper);
        for (Student student : list)
        {
            System.out.print(student);
        }

        System.out.println("数量：" + list.size());

        sqlSession.close();
    }

    @Test
    public void lt() throws IOException
    {
        String resource = "mybatis-config.xml";
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream(resource);
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.lt("class_no", 1003L);

        List<Student> list = studentMapper.selectList(queryWrapper);
        for (Student student : list)
        {
            System.out.print(student);
        }

        System.out.println("数量：" + list.size());

        sqlSession.close();
    }

    @Test
    public void le() throws IOException
    {
        String resource = "mybatis-config.xml";
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream(resource);
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.le("class_no", 1003L);

        List<Student> list = studentMapper.selectList(queryWrapper);
        for (Student student : list)
        {
            System.out.print(student);
        }

        System.out.println("数量：" + list.size());

        sqlSession.close();
    }

    @Test
    public void between() throws IOException
    {
        String resource = "mybatis-config.xml";
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream(resource);
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.between("class_no", 1003L, 1005L);

        List<Student> list = studentMapper.selectList(queryWrapper);
        for (Student student : list)
        {
            System.out.print(student);
        }

        System.out.println("数量：" + list.size());

        sqlSession.close();
    }

    @Test
    public void notBetween() throws IOException
    {
        String resource = "mybatis-config.xml";
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream(resource);
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.notBetween("class_no", 1003L, 1005L);

        List<Student> list = studentMapper.selectList(queryWrapper);
        for (Student student : list)
        {
            System.out.print(student);
        }

        System.out.println("数量：" + list.size());

        sqlSession.close();
    }

    @Test
    public void in() throws IOException
    {
        String resource = "mybatis-config.xml";
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream(resource);
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.in("class_no", 1003L, 1005L);

        List<Student> list = studentMapper.selectList(queryWrapper);
        for (Student student : list)
        {
            System.out.print(student);
        }

        System.out.println("数量：" + list.size());

        sqlSession.close();
    }

    @Test
    public void notIn() throws IOException
    {
        String resource = "mybatis-config.xml";
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream(resource);
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.notIn("class_no", 1003L, 1005L);

        List<Student> list = studentMapper.selectList(queryWrapper);
        for (Student student : list)
        {
            System.out.print(student);
        }

        System.out.println("数量：" + list.size());

        sqlSession.close();
    }
}