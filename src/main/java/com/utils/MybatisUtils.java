package com.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

public class MybatisUtils {
    private static SqlSessionFactory sessionFactory = null;
    static {

        try {
            Reader  reader =
                    Resources.getResourceAsReader("mybatis-config.xml");

             sessionFactory =
                    new SqlSessionFactoryBuilder().build(reader);

        }catch (Exception e){
            e.printStackTrace();
        }


    }
    public static SqlSession getSqlsession(){
        return sessionFactory.openSession();
    }

    }

