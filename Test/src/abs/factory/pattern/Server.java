package abs.factory.pattern;

public class Server extends Computer{

	private String RAM;
	private String HDR;
	private String speed;
	
	Server(String RAM, String HDR, String speed){
		this.RAM = RAM;
		this.HDR = HDR;
		this.speed = speed;
	}
	
	@Override
	public String getRAM() {
		return this.RAM;
	}

	@Override
	public String getHDR() {
		return this.HDR;
	}

	@Override
	public String getSpeed() {
		return this.speed;
	}
}
