package com.qqg.io;

import java.io.InputStream;

public class Resources {

    //根据配置文件路径，将配置文件加载成字节输入流
    public static InputStream getResourceAsSteam(String path){
        InputStream inputStream = Resources.class.getClassLoader().getResourceAsStream(path);
        return inputStream;
    }
}
