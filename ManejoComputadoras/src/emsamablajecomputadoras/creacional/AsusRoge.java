package emsamablajecomputadoras.creacional;

public class AsusRoge extends ConstruirComputador {
	

	@Override
	void DefinirComputador() {
		computador = new Computador();
		computador.marca="ASUS";
		computador.modelo="Roge";
	}

	@Override
	void DefinirAlmacenamiento() {
		computador.almacenamiento = new Memoria(); 
		computador.almacenamiento.capacidad = 1000;
		computador.almacenamiento.tipo="HDD";
		
		computador.ram = new Memoria();
		computador.ram.capacidad=32;
		computador.ram.tipo="ddr4";
	}

	@Override
	void DefinirCoolerExterno() {
		computador.coolerExterno=true;	
	}

	@Override
	void ConstruirSO() {
		computador.os=new SistemaOperativo();
		computador.os.nombre="Windows";
		computador.os.arquitectura=64;
		computador.os.version="10 pro";
	}

	@Override
	void ConstruirMainboard() {
		computador.placa = new Mainboard();
		computador.placa.modelo="Strix";
		computador.placa.numeracion="x99";
	}
	
}
