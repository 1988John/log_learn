package com.logLearn.web.rmi.service;


import com.logLearn.web.rmi.entity.User;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface UserService extends Remote {  
    User getUserById(String id)throws RemoteException;
}  