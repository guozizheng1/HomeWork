package com.imooc;

import java.util.Scanner;

public class ArrayManage {
	//��������
	public int[] insertData() {
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length-1;i++) {
			System.out.println("�������"+ (i+1) + "������:");
			int a = sc.nextInt();
			if(a!=0){
				arr[i] = a;
			}else{
				System.out.println("����벻Ϊ0����!");
				//break;
				i--;
			}
		}
		return arr;
	}
	
	
	//��ʾ����
	public void showData(int[] arr) {
		//��������
		System.out.println("����Ԫ�ص�����Ϊ: ");
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]==0) {
				
			}else {
				System.out.print(arr[i] + " ");
			}
			
		}
		System.out.println();
	}
	//��ָ��λ�ô���������
	public void insertAtArray(int[] a){
		Scanner sc = new Scanner(System.in);
		System.out.println("��������������: ");
		int n = sc.nextInt();
		System.out.println("������Ҫ�������ֵ�λ��: ");
		int k = sc.nextInt();
		for(int i=a.length - 1;i>k;i--) {
			a[i] = a[i-1];
		}
		a[k] = n;
		
	}
	//��ѯ�ܱ�3����������
	public void divThree(int[] a){
		//a = insertData();
		//System.out.println("�ܱ�3����������Ϊ:");
		boolean flag = false;
		//�ж�����Ԫ�����Ƿ����ܱ�3��������
		String str = "�ܱ�3����������Ϊ:";
		for(int i=0;i<a.length;i++) {
			if(a[i]%3==0 && a[i]!=0) {
				flag = true;
				str = str + a[i] + " ";
			}
		}
		if(flag==true) {
			System.out.println(str);
			}else {
				System.out.println("������û�������ܱ�3����");
		}
		System.out.println();
	}
	//��ʾ��Ϣ����
	public void notice() {
		
		System.out.println("*************************");
		System.out.println("     1--��������");
		System.out.println("     2--��ʾ��������");
		System.out.println("     3--��ָ��λ�ô���������");
		System.out.println("     4--��ѯ�ܱ�3����������");
		System.out.println("     0--�˳�");
		System.out.println("*************************");
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		ArrayManage am = new ArrayManage();
		int a[] = new int[10];
		// ѭ����������������ʾ��Ϣ
		while(flag){
			//ѭ��������ʾ
			am.notice();
			System.out.println("�������Ӧ���ֽ��в���: ");
			int m = sc.nextInt();
			switch(m){
				case 1:
					//ִ��1��Ӧ�Ĳ�������
					a = am.insertData();
					am.showData(a);
					break;
				case 2:
					//ִ��2��Ӧ����ʾ����Ĳ���
					am.showData(a);
					break;
				case 3:
					//ִ��3��Ӧ����ָ��λ�ò������ݵĲ���
					am.insertAtArray(a);
					am.showData(a);
					break;
				case 4:
					//ִ��4��Ӧ������������ܱ�����������
					am.divThree(a);
					break;
				case 0:
					//�˳�����
					flag = false;
					System.out.println("�˳�����");
					break;
				default:
					System.out.println("�������������������������");
					break;
			}
		}
		

	}
	

}
