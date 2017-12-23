package emsamablajecomputadoras.creacional;

public class StrZenbook extends testStrategy {
	
	public StrZenbook(Icomputadora computadora) {
		super(computadora);
	}

	@Override
	public boolean testInicial() {
		boolean bandera=true;
		Computador pc = (Computador)computadora; 
		
		if(!(pc.marca.equals("ASUS"))) bandera=false;
	
		if(!(pc.getOs().getNombre().equals("Windows")))bandera=false;
		
		if(!(pc.getOs().arquitectura == 64))bandera=false;
		
		if(!(pc.getOs().getVersion().equals("10 Home")))bandera=false;
		
		return bandera;
	}

	@Override
	public boolean testMedio() {
		boolean bandera=true;
		Computador pc = (Computador)computadora; 
		
		if(!(pc.modelo.equals("Zenbook")))bandera=false;
		
		if(!(pc.almacenamiento.capacidad == 500))bandera=false;
		if(!(pc.almacenamiento.tipo.equals("SSD")))bandera=false;
		
		return bandera;
	}

	@Override
	public boolean testCompleto() {
		boolean bandera=true;
		Computador pc = (Computador)computadora; 
		
		if(!(pc.ram.capacidad == 16))bandera=false;
		if(!(pc.ram.tipo.equals("ddr3")))bandera=false;
		
		if(!(pc.placa.modelo.equals("Prime")))bandera=false;
		if(!(pc.placa.numeracion.equals("Z370")))bandera=false;
		
		return bandera;
	}

}
