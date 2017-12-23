package emsamablajecomputadoras.creacional;

public class StrGamer extends testStrategy {
	testStrategy zenbook;
	public Memoria ramex;

	public StrGamer(PcDecorator pcdec) {
		super(((AsusGamer)pcdec).computador);
		zenbook = new StrZenbook(((AsusGamer)pcdec).computador);
		ramex = ((AsusGamer)pcdec).ramex;
	}

	@Override
	public boolean testInicial() {
		return zenbook.testInicial();
	}

	@Override
	public boolean testMedio() {
		return zenbook.testMedio();
	}

	@Override
	public boolean testCompleto(){
		boolean bandera = true;
		
		if(!(ramex.capacidad==16))bandera = false;
		if(!(ramex.tipo.equals("ddr")))bandera=false;
		
		return bandera && zenbook.testCompleto();
	}

}
