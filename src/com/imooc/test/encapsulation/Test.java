package com.imooc.test.encapsulation;

public class Test {
	// ���Է���
		public static void main(String[] args) {
	     //ʵ�������󣬵�����ط���ʵ������Ч��
	     User one = new User("Lucy", "123456");
	     User two = new User("Mike", "123456");
	     UserManager um = new UserManager();
	     
	     one.userInfo();
	     two.userInfo();
	     System.out.println("==================");
	     um.checkUser(one,two);
	    }
}
