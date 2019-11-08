package thread;

class A {
	public int i = 0;

	A(int m) {
		i = 1;
	}
	A(){
		
	}
}

class B extends A {
	B(int m){
		i = 2;
	}
}

public class E {
	public static void main(String args[]) {
		B b = new B(100);
		System.out.println(b.i);

	}
}