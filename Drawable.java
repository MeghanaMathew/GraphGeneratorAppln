import java.awt.*;
import java.util.Queue;

public abstract class Drawable {

    Queue<Integer> points;
    int baseline;
    int length = 20;

    public void setPoints(int next) {

        if(points.size() > this.length){
            points.remove();
        }
        points.add(next);
    }

    public void draw(Graphics g) {

    }
}
