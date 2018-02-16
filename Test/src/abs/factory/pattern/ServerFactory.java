package abs.factory.pattern;

public class ServerFactory implements ComputerAbstractFactory{

	private String ram;
	private String hdr;
	private String speed;
	
	ServerFactory(String ram, String hdr, String speed){
		this.ram = ram;
		this.hdr = hdr;
		this.speed = speed;
	}
	
	@Override
	public Computer createComputer() {
		return new Server(ram, hdr, speed);
	}
}
