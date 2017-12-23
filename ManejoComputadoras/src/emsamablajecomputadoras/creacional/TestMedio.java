package emsamablajecomputadoras.creacional;

public class TestMedio extends Test {

	@Override
	public boolean isExitoso(testStrategy estrategia) {
		boolean exito = estrategia.testMedio();
		if(exito) {
			System.out.println("Fase Media completada con exito...");
		}
		return exito;
	}

	@Override
	protected void write() {
		System.out.println("Ha ocurrido un error en el test medio");
	}

}
