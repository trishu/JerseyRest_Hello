package abs.factory.pattern;

public class TestAbsFactory {

	public static void main(String[] args) {
		
		Computer pc = ComputerFactory.getComputer(new PCFactory("2gn", "128gn", "1.2ghz"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("16gn", "256gn", "2.2ghz"));
		
		System.out.println("pc: "+ pc);
		System.out.println("server: "+ server);
	}
}
