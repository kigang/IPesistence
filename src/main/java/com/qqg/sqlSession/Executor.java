package com.qqg.sqlSession;

import com.qqg.pojo.Configuration;
import com.qqg.pojo.MappedStatement;

import java.util.List;

public interface Executor {

    <E> List<E> query(Configuration configuration, MappedStatement mappedStatement, Object... params) throws Exception;

    int update(Configuration configuration, MappedStatement mappedStatement, Object... params) throws Exception;

    //Boolean insert(Configuration configuration, MappedStatement mappedStatement, Object... params) throws Exception;
}
