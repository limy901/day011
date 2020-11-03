package aa.cc;

import aa.bb.A;
import aa.bb.AChild;

class AUser
{
	public static void main(String[] args){
		System.out.println("엄마인터페이스, 상수에 바로 접근 : "+A.I);
		A.m2();
		A a = new AChild();
		a.m1();
		a.m3();
		System.out.println("자식객체에서 엄마 상수 불러오기 :"+a.I);
	}
}