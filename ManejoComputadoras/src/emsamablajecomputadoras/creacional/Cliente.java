package emsamablajecomputadoras.creacional;

public class Cliente {

	public static void main(String[] args) {
		
		
		FabricaPCs director2 = new FabricaPCs();
		director2.setConstruirComputador(new AsusZenbook());
		director2.construirPC();
		Computador pc2 = director2.getComputador();
		
		
		Icomputadora asusGamer = new AsusGamer(pc2);
		
		
		System.out.println(asusGamer.especificacionesTecnicas());
	}

}
