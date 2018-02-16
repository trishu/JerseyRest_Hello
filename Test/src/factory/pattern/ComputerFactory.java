package factory.pattern;

public class ComputerFactory {
	
	public static Computer getComputer(String type, String ram, String hdr, String speed){
		if("PC".equals(type)){
			return new PC(ram, hdr, speed);
		}
		else if ("Server".equals(type))
			return new Server(ram, hdr, speed);
		
		return null;
	}

}
