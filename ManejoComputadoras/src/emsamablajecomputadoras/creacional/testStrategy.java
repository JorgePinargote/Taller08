package emsamablajecomputadoras.creacional;

public abstract class testStrategy {
	Icomputadora computadora;
	
	public testStrategy(Icomputadora computadora) {
		this.computadora=computadora;
	}
	
	public abstract boolean testInicial();
	public abstract boolean testMedio();
	public abstract boolean testCompleto();
}
