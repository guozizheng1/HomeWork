package com.imooc.test.encapsulation;
public class UserManager{
    // 用户信息验证的方法
    public String checkUser(User one, User two) {
       // 判断用户名是否为空，是否一致
       String name1 = one.getName();
       String name2 = two.getName();
       String passwd1 = one.getPwd();
       String passwd2 = two.getPwd();
       
       if(name1.equals(null)|name2.equals(null)){
           System.out.println("用户名不能为空");
       }else if(name1.equals(name2)){
           
       }else{
           System.out.println("用户名不一致");
       }

    // 判断密码是否为空，是否一致
        if(passwd1.equals(null)|passwd2.equals(null)){
            System.out.println("密码不能为空");
        }else if(passwd1.equals(passwd2)){
            
        }else{
            System.out.println("密码不一致");
        }
        return "";

    }
}  