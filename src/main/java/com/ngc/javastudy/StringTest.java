package com.ngc.javastudy;

import com.sun.net.httpserver.HttpServer;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.HttpServletBean;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Field;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy
 * @date 2019-12-13 14:07
 */
public class StringTest extends HttpServlet {

    public static void main(String[] args) throws Exception {

        Class c = Class.forName("");
        c.newInstance();
        Field[] declaredFields = c.getDeclaredFields();
        for (Field field:declaredFields){
        }

    }

}
class A {
    public static String c = "C";
    static {
        System.out.print("A");
    }
}

class B extends A{
    static {
        System.out.print("B");
    }
}
