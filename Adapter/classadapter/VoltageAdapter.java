package Adapter.classadapter;

// adapter class
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

	@Override
	public int output5V() {
		int srcV = output220V();
		int dstV = srcV / 44 ; // Change to 5V
		return dstV;
	}

}
