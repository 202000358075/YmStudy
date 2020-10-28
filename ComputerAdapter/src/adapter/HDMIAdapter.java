package adapter;

public class HDMIAdapter implements HDMI_Interface{
	VGA_Interface vi;

	HDMIAdapter(VGA_Interface vi) {
		this.vi = vi;
	}
	@Override
	public void connectHDMI() {
		// TODO Auto-generated method stub
		vi.connectVGA();
	}

}
