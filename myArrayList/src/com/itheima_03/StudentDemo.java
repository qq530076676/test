package com.itheima_03;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * ����һ�����ϣ��洢ѧ������ѧ����������������ڼ���¼�룬��󣬱�������
 * 
 * ע�⣺Ϊ�˷���ʹ�ã��Ұ�ѧ�����е����г�Ա����ΪString����
 * 
 * ������
 * 		A:����ѧ����
 * 		B:�������϶���
 * 		C:����¼������,����ѧ������,�Ѽ���¼������ݸ�ֵ��ѧ������ĳ�Ա����
 * 		D:��ѧ��������ΪԪ�ش洢��������
 * 		E:��������
 * 
 */
public class StudentDemo {
	public static void main(String[] args) {
		//�������϶���
		ArrayList<Student> array = new ArrayList<Student>();
		
		/*
		//����¼������,����ѧ������,�Ѽ���¼������ݸ�ֵ��ѧ������ĳ�Ա����
		Scanner sc = new Scanner(System.in);
		System.out.println("������ѧ��������");
		String name = sc.nextLine();
		System.out.println("������ѧ�����䣺");
		String age = sc.nextLine();
		
		Student s = new Student();
		s.setName(name);
		s.setAge(age);
		
		//��ѧ��������ΪԪ�ش洢��������
		array.add(s);
		*/
		
		//Ϊ����ߴ���ĸ����ԣ��ҰѼ���¼�����ݸ�ѧ�����󣬲��洢�������еĶ�����һ��������ʵ��
		
		//���÷���
		addStudent(array);
		addStudent(array);
		addStudent(array);
		
		//��������
		for(int x=0; x<array.size(); x++) {
			Student s = array.get(x);
			System.out.println(s.getName()+"---"+s.getAge());
		}
	}
	
	/*
	 * ������ȷ��
	 * 		����ֵ���ͣ�void
	 * 		�����б�ArrayList<Student> array
	 */
	public static void addStudent(ArrayList<Student> array) {
		//����¼������,����ѧ������,�Ѽ���¼������ݸ�ֵ��ѧ������ĳ�Ա����
		Scanner sc = new Scanner(System.in);
		System.out.println("������ѧ��������");
		String name = sc.nextLine();
		System.out.println("������ѧ�����䣺");
		String age = sc.nextLine();
		
		Student s = new Student();
		s.setName(name);
		s.setAge(age);
		
		//��ѧ��������ΪԪ�ش洢��������
		array.add(s);
	}
}
