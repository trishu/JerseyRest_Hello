package abs.factory.pattern;

public class PCFactory implements ComputerAbstractFactory{

	private String ram;
	private String hdr;
	private String speed;
	
	PCFactory(String ram, String hdr, String speed){
		this.ram = ram;
		this.hdr = hdr;
		this.speed = speed;
	}
	
	@Override
	public Computer createComputer() {
		return new PC(ram, hdr, speed);
	}

}
