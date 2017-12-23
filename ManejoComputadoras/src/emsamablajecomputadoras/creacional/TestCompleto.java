package emsamablajecomputadoras.creacional;

public class TestCompleto extends Test {

	@Override
	public boolean isExitoso(testStrategy estrategia) {
		return estrategia.testCompleto();
	}

	@Override
	protected void write() {
		System.out.println("Ha ocurrido un error en el test completo");
		
	}

}
