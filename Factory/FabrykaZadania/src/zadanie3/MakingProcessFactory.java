package zadanie3;

public interface MakingProcessFactory {
	
	public Material createMaterial();
	public Finish createFinish();
	public AssemblyMethod createAssemblyMethod();
	
}
