import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ObservableSubject  {
	private Object data = null;
	protected final PropertyChangeSupport propertyChangeSupport;

    ObservableSubject() {
    	propertyChangeSupport=new PropertyChangeSupport(this);
    }
    void changeData(Object data) {
    	 // The two methods of Observable class
       // setChanged();
    	data=this.data;
    	propertyChangeSupport.firePropertyChange("data",null, data );
    }
	public void addPropertyChangeListener(ObserverWindow observerWindow) {
		// I have spent so much time looking at examples of this stuff being used and reading through java oracle and the like about it and still have
		//almost o clue as to what I am doing... 
		propertyChangeSupport.firePropertyChange("data",null, data );
	}
    

}

