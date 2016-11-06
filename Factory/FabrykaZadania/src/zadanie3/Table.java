package zadanie3;

public class Table extends Furniture {
	
	MakingProcessFactory makingProcess;
	
	public Table(MakingProcessFactory makingProcess){
		this.makingProcess = makingProcess;
	}
	
	void make() {
		
		System.out.println("Making a "+ name);
		material = makingProcess.createMaterial();
		finish = makingProcess.createFinish();
		method = makingProcess.createAssemblyMethod();
	}
	
	
}
