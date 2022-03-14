package com.qqg.sqlSession;

import com.qqg.config.XMLConfigBuilder;
import com.qqg.pojo.Configuration;
import org.dom4j.DocumentException;

import java.beans.PropertyVetoException;
import java.io.InputStream;

public class SqlSessionFactoryBuilder {
    private Configuration configuration;

    public SqlSessionFactoryBuilder() {
        this.configuration = new Configuration();
    }

    public SqlSessionFactory build(InputStream inputStream) throws DocumentException, PropertyVetoException, ClassNotFoundException {
        //1.解析配置⽂件，封装Configuration
        XMLConfigBuilder xmlConfigerBuilder = new XMLConfigBuilder(configuration);
        Configuration configuration = xmlConfigerBuilder.parseConfiguration(inputStream);
        //2. 创 建 sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new DefaultSqlSessionFactory(configuration);
        return sqlSessionFactory;
    }
}
