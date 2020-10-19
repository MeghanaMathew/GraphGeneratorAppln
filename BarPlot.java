import java.awt.*;

public class BarPlot extends DecoratePlot {

    public BarPlot(int baseline, Drawable decorate) {
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

        Integer[] array = this.points.toArray(new Integer[points.size()]);

        g.setColor(Color.GRAY);
        int x = 0;
        for(int i = 0; i< Math.min(array.length,this.length); i++){
            g.fillRect(x, this.baseline - array[i], 3,array[i]);
            x += 15;
        }
        g.setColor(Color.BLACK);

        if (this.decorate!= null)
            this.decorate.draw(g);

    }
}
