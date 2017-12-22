package emsamablajecomputadoras.creacional;

public abstract class PcDecorator implements Icomputadora {
	public Icomputadora computador;
	
	public PcDecorator(Icomputadora computador){
		this.computador = computador;
	}

	@Override
	public String especificacionesTecnicas() {
		return this.computador.especificacionesTecnicas();
	}
	
}
