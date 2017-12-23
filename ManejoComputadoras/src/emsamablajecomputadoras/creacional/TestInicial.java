package emsamablajecomputadoras.creacional;

public class TestInicial extends Test {

	@Override
	public boolean isExitoso(testStrategy estrategia) {
		boolean exito = estrategia.testInicial();
		if(exito) {
			System.out.println("Fase de inicio completada con exito...");
		}
		return exito;
	}

	@Override
	protected void write() {
		System.out.println("Ha ocurrido un error en el test inicial");
	}
	
	

}
