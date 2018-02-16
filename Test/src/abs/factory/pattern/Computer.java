package abs.factory.pattern;

public abstract class Computer {
	
	public abstract String getRAM();
	
	public abstract String getHDR();
	
	public abstract String getSpeed();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "RAM:"+getRAM()+" HDR:"+getHDR()+" speed"+getSpeed();
	}

}
