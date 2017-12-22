package emsamablajecomputadoras.creacional;

public abstract class ConstruirComputador {
	
	protected Computador computador;
	
	public Computador getComputador() {
		return computador;
	}
	
	
	abstract void DefinirComputador();
	
	abstract void DefinirAlmacenamiento();
	
	abstract void DefinirCoolerExterno();
	
	abstract void ConstruirSO();
	
	abstract void ConstruirMainboard( );
	
}

