package com.imooc;

import java.util.Scanner;

public class ArrayManage {
	//插入数据
	public int[] insertData() {
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length-1;i++) {
			System.out.println("请输入第"+ (i+1) + "个数据:");
			int a = sc.nextInt();
			if(a!=0){
				arr[i] = a;
			}else{
				System.out.println("请插入不为0的数!");
				//break;
				i--;
			}
		}
		return arr;
	}
	
	
	//显示数据
	public void showData(int[] arr) {
		//定义数组
		System.out.println("数组元素的内容为: ");
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]==0) {
				
			}else {
				System.out.print(arr[i] + " ");
			}
			
		}
		System.out.println();
	}
	//在指定位置处插入数据
	public void insertAtArray(int[] a){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入插入的数字: ");
		int n = sc.nextInt();
		System.out.println("请输入要插入数字的位置: ");
		int k = sc.nextInt();
		for(int i=a.length - 1;i>k;i--) {
			a[i] = a[i-1];
		}
		a[k] = n;
		
	}
	//查询能被3整除的数据
	public void divThree(int[] a){
		//a = insertData();
		//System.out.println("能被3整除的数据为:");
		boolean flag = false;
		//判断数组元素中是否有能被3整除的数
		String str = "能被3整除的数据为:";
		for(int i=0;i<a.length;i++) {
			if(a[i]%3==0 && a[i]!=0) {
				flag = true;
				str = str + a[i] + " ";
			}
		}
		if(flag==true) {
			System.out.println(str);
			}else {
				System.out.println("数组中没有数据能被3整除");
		}
		System.out.println();
	}
	//提示信息方法
	public void notice() {
		
		System.out.println("*************************");
		System.out.println("     1--插入数据");
		System.out.println("     2--显示所有数据");
		System.out.println("     3--在指定位置处插入数据");
		System.out.println("     4--查询能被3整除的数据");
		System.out.println("     0--退出");
		System.out.println("*************************");
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		ArrayManage am = new ArrayManage();
		int a[] = new int[10];
		// 循环输出操作数组的提示信息
		while(flag){
			//循环调用提示
			am.notice();
			System.out.println("请输入对应数字进行操作: ");
			int m = sc.nextInt();
			switch(m){
				case 1:
					//执行1对应的插入数据
					a = am.insertData();
					am.showData(a);
					break;
				case 2:
					//执行2对应的显示数组的操作
					am.showData(a);
					break;
				case 3:
					//执行3对应的在指定位置插入数据的操作
					am.insertAtArray(a);
					am.showData(a);
					break;
				case 4:
					//执行4对应的输出数组中能被三整除的数
					am.divThree(a);
					break;
				case 0:
					//退出程序
					flag = false;
					System.out.println("退出程序！");
					break;
				default:
					System.out.println("你输入的数据有误！请重新输入");
					break;
			}
		}
		

	}
	

}
