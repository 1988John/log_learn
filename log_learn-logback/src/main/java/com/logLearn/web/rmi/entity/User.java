package com.logLearn.web.rmi.entity;

import java.io.Serializable;

public class User implements Serializable {  
    /** 
     *  
     */  
    private static final long serialVersionUID = -8400949180923337013L;  
    private String id;  
    private String name;  
    private int age;  
  
      
  
    public String getId() {  
        return id;  
    }  
  
    public void setId(String id) {  
        this.id = id;  
    }  
  
    public String getName() {  
        return name;  
    }  
  
    public void setName(String name) {  
        this.name = name;  
  
    }  
  
    public int getAge() {  
        return age;  
    }  
  
    public void setAge(int age) {  
        this.age = age;  
    }

    @Override
    public String toString() {
        return "id="+id+",name="+name+",age="+age;
    }
}