package cn.itcast.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
//使用junit测试Spring boot应用,需要加此注解;并可指定阴道内
@SpringBootTest(classes = Application.class)
public class C3p0DataSourceTest {
    @Autowired
    private DataSource dataSource;

    @Test
    public void test() throws SQLException {
        System.out.println("--------------11-------------------");
        Connection connection = dataSource.getConnection();
        System.out.println("--------------22-------------------");
        System.out.println(connection);

    }
}
