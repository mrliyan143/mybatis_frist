package Test;

import com.itheima.pojo.Users;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.apache.ibatis.session.SqlSessionFactory;


import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class UserTest {
    @Test
    public void userFindById() {
        String resources = "mybatis-config.xml";
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader(resources);
        } catch (IOException e) {
            e.printStackTrace();
        }

        SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);

        SqlSession sqlSession = sqlMapper.openSession();

        List<Users> list =
                sqlSession.selectList("findById");
        for (Users users : list) {
            System.out.println(users);
        }
//
//        Users users_2 = sqlSession.selectOne("findIdByUser", 2);
//        System.out.println(users_2.getUname());

//        Users users = new Users();
//        users.setUage(21);
//        users.setUid(3);
//        users.setUname("小李");
//        sqlSession.insert("insertUser", users);
//        System.out.println(users.toString());
//        sqlSession.commit();
//        sqlSession.close();
        /*
        面试题测试
        */


    }
}
