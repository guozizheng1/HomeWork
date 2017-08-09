package com.imooc.test.encapsulation;

public class User {
	//定义属性用户名、密码
    private String name;
    private String passwd;
    public User(){
        
    }
    
    public User(String name, String passwd){
        this.setName(name);
        this.setPwd(passwd);
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name =name;
    }
    
    public String getPwd(){
        return this.passwd;
    }
    
    public void setPwd(String passwd){
        this.passwd = passwd;
    }
    
    public void userInfo(){
        System.out.println("用户名：" + this.getName());
        System.out.println("密码：" + this.getPwd());
    }
}
