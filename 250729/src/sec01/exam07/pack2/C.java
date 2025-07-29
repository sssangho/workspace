package sec01.exam07.pack2;

import sec01.exam07.pack1.A;

public class C extends A{
	public C() {
		super();
		this.field = "value";
		this.method();
	}
	
	public void method() {
//		A a = new A();
		this.field = "value";
		this.method();
	}

}
