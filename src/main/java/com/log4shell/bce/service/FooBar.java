package com.log4shell.bce.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.sql.SQLException;
import java.util.*;

@Service
public class FooBar {
    static Logger logger = LogManager.getLogger(FooBar.class.getName());

    public void foobar(HttpServletRequest hsr){
//        Enumeration<String> e = hsr.getHeaderNames();
//        while(e.hasMoreElements()){
//            String param = e.nextElement();
//            System.out.println(param + ": " + hsr.getHeader(param));
//        }
    }
}
