package emsamablajecomputadoras.creacional;

public class StrRoge extends testStrategy {

	public StrRoge(Icomputadora computadora) {
		super(computadora);
	}

	@Override
	public boolean testInicial() {
		boolean bandera=true;
		Computador pc = (Computador)computadora; 
		
		if(!(pc.marca.equals("ASUS"))) bandera=false;
	
		if(!(pc.getOs().getNombre().equals("Windows")))bandera=false;
		
		if(!(pc.getOs().arquitectura == 64))bandera=false;
		
		if(!(pc.getOs().getVersion().equals("10 pro")))bandera=false;
		
		return bandera;
	}

	@Override
	public boolean testMedio() {
		boolean bandera=true;
		Computador pc = (Computador)computadora; 
		
		if(!(pc.modelo.equals("Roge")))bandera=false;
		
		if(!(pc.almacenamiento.capacidad == 1000))bandera=false;
		if(!(pc.almacenamiento.tipo.equals("HDD")))bandera=false;
		
		return bandera;
	}

	@Override
	public boolean testCompleto() {
		boolean bandera=true;
		Computador pc = (Computador)computadora; 
		
		if(!(pc.ram.capacidad == 32))bandera=false;
		if(!(pc.ram.tipo.equals("ddr4")))bandera=false;
		
		if(!(pc.placa.modelo.equals("Strix")))bandera=false;
		if(!(pc.placa.numeracion.equals("x99")))bandera=false;
		
		return bandera;
	}


}
