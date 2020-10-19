import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;


public class SimplePlot extends Drawable {

    public SimplePlot(int baseline) {
        super();
        this.points = new LinkedList<>();
        this.baseline = baseline;
    }

    @Override
    public void draw(Graphics g) {

        g.drawRect(0, this.baseline-100, 300, 100);
        Integer[] array = points.toArray(new Integer[points.size()]);

        g.setColor(Color.BLUE);
        int x = 0;
        for(int i = 0; i < array.length-1; i++){
            g.drawLine(x, this.baseline-array[i], x+15, this.baseline-array[i+1]);
            x+= 15;
        }
        g.setColor(Color.BLACK);
    }
}
