package com.itheima_02;

import java.util.ArrayList;

/*
 * ����һ���ַ������飺{�������ᡱ,����Զ�š�,�����޼ɡ�,������ͤ��,���Ŵ�ɽ��,��Ī���ȡ�}���������е�Ԫ����ӵ������У������������ŵ���Ա��ӡ������̨�ϡ�
 * 
 * ������
 * 		A:�����ַ�������
 * 		B:�������϶���
 * 		C:�����ַ������飬��ȡ��ÿһ���ַ���Ԫ��
 * 		D:�ѻ�ȡ�����ַ���Ԫ����ӵ�����
 * 		E:��������
 * 			Ҫ�ж�ÿһ���ַ���Ԫ���Ƿ���"��"��ͷ������ǣ�������ڿ���̨
 */
public class ArrayListTest2 {
	public static void main(String[] args) {
		//�����ַ�������
		String[] strArray = {"������","��Զ��","���޼�","����ͤ","�Ŵ�ɽ","Ī����"};
		
		//�������϶���
		ArrayList<String> array = new ArrayList<String>();
		
		//�����ַ������飬��ȡ��ÿһ���ַ���Ԫ��
		for(int x=0; x<strArray.length; x++) {
			//�ѻ�ȡ�����ַ���Ԫ����ӵ�����
			array.add(strArray[x]);
		}
		
		//��������
		for(int x=0; x<array.size(); x++) {
			String s = array.get(x);
			//Ҫ�ж�ÿһ���ַ���Ԫ���Ƿ���"��"��ͷ������ǣ�������ڿ���̨
			if(s.startsWith("��")) {
				System.out.println(s);
			}
		}
	}
}
