package emsamablajecomputadoras.creacional;

public class FabricaPCs {
	
	private ConstruirComputador computador;
	
	public void construirPC() {
		computador.DefinirComputador();
		computador.ConstruirMainboard();
		computador.ConstruirSO();
		computador.DefinirAlmacenamiento();
		computador.DefinirCoolerExterno();
		
	}
	
	public void setConstruirComputador(ConstruirComputador pc) {
		computador = pc;
	}
	
	public Computador getComputador() {
		return computador.getComputador();
	}

}
