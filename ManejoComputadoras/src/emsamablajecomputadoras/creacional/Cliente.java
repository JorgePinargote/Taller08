package emsamablajecomputadoras.creacional;

public class Cliente {

	public static void main(String[] args) {
		FabricaPCs director = new FabricaPCs();
		director.setConstruirComputador(new AsusRoge());
		director.construirPC();
		Computador pc = director.getComputador();
		
		FabricaPCs director2 = new FabricaPCs();
		director2.setConstruirComputador(new AsusZenbook());
		director2.construirPC();
		Computador pc2 = director2.getComputador();
		
		
		PcDecorator  asusGamer = new AsusGamer(pc2);
		
		
		Test inicial = new TestInicial();
		Test medio = new TestMedio();
		Test completo = new TestCompleto();
		
		inicial.setNexttest(medio);
		medio.setNexttest(completo);
		
		
		//El testeo gamer prueba el testeo Zenbook internamente
		testStrategy strGamer = new StrGamer(asusGamer);
		testStrategy strRoge = new StrRoge(pc);
		
		System.out.println(asusGamer.especificacionesTecnicas()+ "\n");
		inicial.Testear(strGamer);
		
		System.out.println(pc.especificacionesTecnicas()+ "\n");
		inicial.Testear(strRoge);
		
		
	}

}
