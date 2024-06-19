package org.choongang.global.configs;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.Reader;

public class DBConn {
    private static SqlSessionFactory factory;

    static {
        Reader reader = Resources.getResourceAsStream("org/choongang/global/configs/mybatis.config.Xml");
    }

    public static SqlSession sqlSession() {
        return null;
    }

}
