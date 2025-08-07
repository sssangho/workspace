package sec01.exam01;

class Parent {
	void method1() {}
}
class Child extends Parent {}

public class A {
	Parent ff = new Child();
	Parent field1 = new Parent() {
		int childField;
		void childMethod() {}
		@Override
		void method1() {
			childField = 100;
			childMethod();
		}
	};
	Parent field2 = new Parent() {};
	
	void method() {
//		field1.childMethod();
		field1.method1();
		Parent field3 = new Parent() {};
		
		method2(field3);
		method2(new Parent() {});
	}
	
	void method2(Parent parent) {}
}
