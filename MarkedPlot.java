import java.awt.*;

public class MarkedPlot extends DecoratePlot {

    public MarkedPlot(int baseline, Drawable decorate) {
        super(baseline, decorate);
    }

    @Override
    public void setPoints(int next) {
        if (decorate!= null)
            decorate.setPoints(next);
        super.setPoints(next);
    }

    @Override
    public void draw(Graphics g) {
        if (this.decorate!= null)
            this.decorate.draw(g);

        Integer[] array = this.points.toArray(new Integer[points.size()]);

        g.setColor(Color.BLUE);
        int x = 0;
        for(int i = 0; i< Math.min(array.length,this.length); i++){
            g.fillRect(x, this.baseline - array[i], 3,3);
            x += 15;
        }
        g.setColor(Color.BLACK);
    }
}
