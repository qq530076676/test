package com.itheima_02;

import java.util.ArrayList;

/*
 * �洢�ַ���������
 * 
 * ������
 * 		A:�������϶���
 * 		B:����ַ���Ԫ��
 * 		C:��������
 */
public class ArrayListTest {
	public static void main(String[] args) {
		//�������϶���
		ArrayList<String> array = new ArrayList<String>();
		
		//����ַ���Ԫ��
		array.add("������");
		array.add("������");
		array.add("������");
		array.add("������");
		
		//��������
		for(int x=0; x<array.size(); x++) {
			String s = array.get(x);
			System.out.println(s);
		}
	}
}
