package com.ld.jetty;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyServer {
        public static void main(String[] args) throws Exception {  
            new ClassPathXmlApplicationContext("/spring.xml");
        }  
    }  