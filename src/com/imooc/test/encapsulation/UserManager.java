package com.imooc.test.encapsulation;
public class UserManager{
    // �û���Ϣ��֤�ķ���
    public String checkUser(User one, User two) {
       // �ж��û����Ƿ�Ϊ�գ��Ƿ�һ��
       String name1 = one.getName();
       String name2 = two.getName();
       String passwd1 = one.getPwd();
       String passwd2 = two.getPwd();
       
       if(name1.equals(null)|name2.equals(null)){
           System.out.println("�û�������Ϊ��");
       }else if(name1.equals(name2)){
           
       }else{
           System.out.println("�û�����һ��");
       }

    // �ж������Ƿ�Ϊ�գ��Ƿ�һ��
        if(passwd1.equals(null)|passwd2.equals(null)){
            System.out.println("���벻��Ϊ��");
        }else if(passwd1.equals(passwd2)){
            
        }else{
            System.out.println("���벻һ��");
        }
        return "";

    }
}  