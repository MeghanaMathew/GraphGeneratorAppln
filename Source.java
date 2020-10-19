import java.util.Observable;
import java.util.Random;

public class Source extends Observable{

    private int value;

    public Source() {
        super();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void work(){

        Random rand = new Random();
        this.value = rand.nextInt(100);
        this.setChanged();
        this.notifyObservers();
    }
}
