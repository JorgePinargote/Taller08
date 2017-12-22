package emsamablajecomputadoras.creacional;

public class AsusZenbook  extends ConstruirComputador{
	

	@Override
	void DefinirComputador() {
		computador = new Computador();
		computador.marca="ASUS";
		computador.modelo="Zenbook";
		
	}

	@Override
	void DefinirAlmacenamiento() {
		computador.almacenamiento= new Memoria();
		computador.almacenamiento.capacidad = 500;
		computador.almacenamiento.tipo="SSD";
		
		computador.ram= new Memoria();
		computador.ram.capacidad=16;
		computador.ram.tipo="ddr3";
		
	}

	@Override
	void DefinirCoolerExterno() {
		computador.coolerExterno=false;
		
	}

	@Override
	void ConstruirSO() {
        computador.os=new SistemaOperativo();
		computador.os.nombre="Windows";
		computador.os.arquitectura=64;
		computador.os.version="10 Home";
		
	}

	@Override
	void ConstruirMainboard() {
		computador.placa = new Mainboard();
		computador.placa.modelo="Prime";
		computador.placa.numeracion="Z370";
		
	}

	

}
