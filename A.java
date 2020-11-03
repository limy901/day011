package aa.bb;
public interface A
{
	int I =10;
	void m1();
	static void m2(){
		System.out.println("스태틱이라 엄마만 사용");
	}
	default void m3(){
		System.out.println("가끔씩은 정의된게 필요해");
	}
}