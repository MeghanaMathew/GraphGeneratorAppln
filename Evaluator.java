import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;

public class Evaluator {

    private static Evaluator instance;

    Queue<Integer> points;

    private Evaluator(){
        this.points = new LinkedList<>();
    }

    public void setPoints(int next) {

        if(points.size() > 20){
            points.remove();
        }
        points.add(next);
    }

    public static Evaluator getInstance(){
        if(instance == null){
            instance = new Evaluator();
        }
        return instance;
    }

    public void draw(Graphics g) {
        if(points.size()>0) {
            int avg = 0;

            Integer[] array = this.points.toArray(new Integer[points.size()]);
            int x = 0;
            for (int i = 0; i < array.length; i++) {
                avg += array[i];
            }
            avg = avg / array.length;

            g.setColor(Color.RED);
            g.drawLine(0, 100 - avg, 300, 100 - avg);
            g.drawLine(0, 200 - avg, 300, 200 - avg);
            g.drawLine(0, 300 - avg, 300, 300 - avg);
            g.setColor(Color.BLACK);
        }
    }


}

