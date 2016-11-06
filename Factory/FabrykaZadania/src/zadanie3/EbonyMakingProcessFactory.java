package zadanie3;

public class EbonyMakingProcessFactory implements MakingProcessFactory{
	
	public Material createMaterial(){
		return new Ebony();
	}
	
	public Finish createFinish(){
		return new Glossy();
	}
	
	public AssemblyMethod createAssemblyMethod(){
		return new ByHand();
	}
}
