package emsamablajecomputadoras.creacional;

public abstract class Test {
	protected Test nextTest;
	
	public abstract boolean isExitoso(testStrategy estrategia);

	public void setNexttest(Test nexttest) {
		nextTest = nexttest;
	}
	
	public void Testear(testStrategy estrategia) {
		  if(!isExitoso(estrategia)){
			  write();
	      }else if(nextTest != null){
	    	  nextTest.Testear(estrategia);
	      }else {
	    	  System.out.println("Test finalizado con Exito \n");
	      }
	}
	
	abstract protected void write();

}
