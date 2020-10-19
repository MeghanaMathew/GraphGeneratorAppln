import java.awt.*;
import java.util.LinkedList;

public abstract class DecoratePlot extends Drawable {

    Drawable decorate;

    public DecoratePlot(){

    }

    public DecoratePlot(int baseline, Drawable decorate) {

        this.points = new LinkedList<>();
        super.baseline = baseline;
        this.decorate = decorate;
    }

    @Override
    public void setPoints(int next) {
        super.setPoints(next);
    }

    @Override
    public void draw(Graphics g) {

    }
}
