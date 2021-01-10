package BridgePattern;

public class UpRightPhone extends Phone {
	
		public UpRightPhone(Brand brand) {
			super(brand);
		}
		
		public void open() {
			super.open();
			System.out.println(" UpRight open ");
		}
		
		public void close() {
			super.close();
			System.out.println(" Upright close ");
		}
		
		public void call() {
			super.call();
			System.out.println(" Upright call ");
		}
}
