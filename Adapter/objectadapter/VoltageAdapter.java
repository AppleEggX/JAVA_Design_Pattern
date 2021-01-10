package Adapter.objectadapter;

// Adapter Class
public class VoltageAdapter implements IVoltage5V {

	private Voltage220V voltage220V; // 关联关系-聚合
	
	// Constructor, pass a Voltage220V instance
	public VoltageAdapter(Voltage220V voltage220v) {
		this.voltage220V = voltage220v;
	}

	@Override
	public int output5V() {
		int dst = 0;
		if(null != voltage220V) {
			int src = voltage220V.output220V();//��ȡ220V ��ѹ
			System.out.println("Adapting...");
			dst = src / 44;
			System.out.println("Adapted, output voltage=" + dst);
		}
		return dst;
	}
}
