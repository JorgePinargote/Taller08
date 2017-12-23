package emsamablajecomputadoras.creacional;

public class AsusGamer extends PcDecorator {
	public Memoria ramex;

	public AsusGamer(Icomputadora computador) {
		super(computador);
		ramex = new Memoria();
		ramex.capacidad = 16;
		ramex.tipo = "ddr";
	}
	
	public String especificacionesTecnicas(){
        return  "Extendida a Gamer\n" + super.computador.especificacionesTecnicas() + 
        		"\nMemoria Ram Extendida: "+ramex.capacidad+ " Gb " + ramex.tipo; 
    }
	

}
