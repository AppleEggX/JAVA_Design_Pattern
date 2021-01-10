package BridgePattern;

public class FoldedPhone extends Phone {

	//Constructor
	public FoldedPhone(Brand brand) {
		super(brand);
	}
	
	public void open() {
		super.open();
		System.out.println("Folded Phone open ");
	}
	
	public void close() {
		super.close();
		System.out.println("Folded Phone close ");
	}
	
	public void call() {
		super.call();
		System.out.println("Foled Phone call ");
	}
}
