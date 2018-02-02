package com.logLearn.web.rmi.program;

import com.logLearn.web.rmi.service.UserService;
import com.logLearn.web.rmi.service.impl.UserServiceImpl;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;


public class Program{
    public static void main(String[] args) {
        try {
            UserService userService=new UserServiceImpl();
            //注册通讯端口
            LocateRegistry.createRegistry(6600);
            //注册通讯路径
            Naming.rebind("rmi://127.0.0.1:6600/userService", userService);
            System.out.println("Service Start!");
        }  catch (Exception e) {
            System.out.println("创建远程对象发生异常！");
        }
    }
}    