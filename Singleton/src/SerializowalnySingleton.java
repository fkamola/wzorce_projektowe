import java.io.ObjectStreamException;
import java.io.Serializable;

public class SerializowalnySingleton implements Serializable{
	
	private static final long serialVersionUID = -7604766932017737115L;

    private SerializowalnySingleton(){}
    
    
    //implementacja Billa Pugh'a
    private static class SingletonHolder{
        private static final SerializowalnySingleton instance = new SerializowalnySingleton();
    }
    
    public static SerializowalnySingleton getInstance(){
        return SingletonHolder.instance;
    }
    
    protected Object readResolve() throws ObjectStreamException{
        return getInstance();
    }
}
