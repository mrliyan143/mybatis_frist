package Test;

import com.itheima.pojo.Employee;
import com.utils.MybatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.Reader;

public class EmployeeTest {
    @Test
    public void findById() {

        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("小李");
        employee.setAge(21);
        employee.setPosition("ceo");
        SqlSession sqlSession = MybatisUtils.getSqlsession();
//        sqlSession.insert("addEmployee",employee);
//        sqlSession.commit();
//        sqlSession.selectOne("findEmpById",1);
        sqlSession.delete("deleteEmployee",1);

//        sqlSession.update("upEmployee",employee);
        sqlSession.commit();
        sqlSession.close();
        System.out.println(employee.toString());
    }

}
