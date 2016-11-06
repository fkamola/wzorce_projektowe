package zadanie3;

public class SteelMakingProcessFactory implements MakingProcessFactory{
	
	public Material createMaterial(){
		return new Steel();
	}
	
	public Finish createFinish(){
		return new Matte();
	}
	
	public AssemblyMethod createAssemblyMethod(){
		return new Automated();
	}
}
