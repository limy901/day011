package aa.cc;

import aa.bb.A;
import aa.bb.AChild;

class AUser
{
	public static void main(String[] args){
		System.out.println("�����������̽�, ����� �ٷ� ���� : "+A.I);
		A.m2();
		A a = new AChild();
		a.m1();
		a.m3();
		System.out.println("�ڽİ�ü���� ���� ��� �ҷ����� :"+a.I);
	}
}