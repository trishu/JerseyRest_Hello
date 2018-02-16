package factory.pattern;

public class TestFactory {

	public static void main(String[] args) {
		
		Computer pc = ComputerFactory.getComputer("PC", "2gb", "128gb", "1.2ghz");
		Computer server = ComputerFactory.getComputer("Server", "16gb", "1tb", "2.2ghz");
		
		System.out.println("pc: "+pc.getClass());
		System.out.println("server: "+server.getClass());
	}
}
