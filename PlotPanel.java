import javax.swing.JPanel;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;


public class PlotPanel extends JPanel implements Observer {

    private Drawable[] items = new Drawable[3];


    public PlotPanel(Drawable graph1, Drawable graph2, Drawable graph3) {
        items[0] = graph1;
        items[1] = graph2;
        items[2] = graph3;
    }

    @Override
    public void update(Observable o, Object arg) {
        int valueObserved = ((Source)o).getValue();
        for (int i = 0; i < items.length; i += 1) {
            items[i].setPoints(valueObserved);
        }
        Evaluator eval = Evaluator.getInstance();
        eval.setPoints(valueObserved);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);

        for (int i = 0; i < items.length; i++) {
            items[i].draw(g);
        }
        Evaluator eval = Evaluator.getInstance();
        eval.draw(g);
    }

}
