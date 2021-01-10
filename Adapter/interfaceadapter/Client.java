package Adapter.interfaceadapter;

public class Client {
	public static void main(String[] args) {
		
		AbsAdapter absAdapter = new AbsAdapter() {
			// 只需要覆盖我们需要使用的接口方法
			@Override
			public void m1() {
				System.out.println("override m1 method");
			}
		};
		
		absAdapter.m1();
	}
}
