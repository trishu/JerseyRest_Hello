package abs.factory.pattern;

public class ComputerFactory {

	public static Computer getComputer(ComputerAbstractFactory absFactory){
		return absFactory.createComputer();
	}
}
