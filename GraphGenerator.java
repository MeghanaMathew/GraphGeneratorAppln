import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphGenerator extends JFrame implements ActionListener{

    private Source source;

    public GraphGenerator() {

        this.source = new Source();
        Drawable graph1 = new SimplePlot(100);
        Drawable graph2 = new MarkedPlot(200, new SimplePlot(200));
        Drawable graph3 = new BarPlot(300, new MarkedPlot(300, new SimplePlot(300)));

        PlotPanel plot = new PlotPanel(graph1,graph2,graph3);
        this.setContentPane(plot);
        plot.repaint();
        this.source.addObserver(plot);

        JButton loginButton = new JButton("Run");
        loginButton.setBounds(110, 320, 80, 25);
        loginButton.addActionListener(this);
        plot.setLayout(null);
        plot.add(loginButton);

    }

    public void actionPerformed(ActionEvent e) {
        //System.out.println("in action");
        String s = e.getActionCommand();
        if (s != null && s.equals("Run")) {
            this.source.work();
        }
    }

    public static void main(String[] args) {

        GraphGenerator win = new GraphGenerator();
        win.setSize(200, 400);
        win.setVisible(true);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}