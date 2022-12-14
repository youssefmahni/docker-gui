import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {
    JButton btn1 = new JButton("CONTAINERS");
    JButton btn2 = new JButton("IMAGES");
    JButton btn3 = new JButton("VOLUMES");
    JButton btn4 = new JButton("NETWORKS");

    Dashboard(){
        //start buttons
        btn1.setPreferredSize(new Dimension(200,80));
        btn1.setBackground(new Color(138,180,248));
        btn1.setForeground(Color.WHITE);
        btn1.setFocusable(false);
        btn1.setBorder(new EmptyBorder(0,10,0,10));
        btn1.addActionListener(this);


        btn2.setPreferredSize(new Dimension(200,80));
        btn2.setBackground(new Color(138,180,248));
        btn2.setForeground(Color.WHITE);
        btn2.setFocusable(false);
        btn2.setBorder(new EmptyBorder(0,10,0,10));
        btn2.addActionListener(this);

        btn3.setPreferredSize(new Dimension(200,80));
        btn3.setBackground(new Color(138,180,248));
        btn3.setForeground(Color.WHITE);
        btn3.setFocusable(false);
        btn3.setBorder(new EmptyBorder(0,10,0,10));
        btn3.addActionListener(this);

        btn4.setPreferredSize(new Dimension(200,80));
        btn4.setBackground(new Color(138,180,248));
        btn4.setForeground(Color.WHITE);
        btn4.setFocusable(false);
        btn4.setBorder(new EmptyBorder(0,10,0,10));
        btn4.addActionListener(this);
        //end buttons
        //start panels
        JPanel panel = new JPanel();
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        panel.setBorder(new EmptyBorder(10,10,10,10));

        JPanel header = new JPanel();
        JLabel title = new JLabel("DASHBOARD");
        title.setFont(new Font(Font.SANS_SERIF, Font.BOLD , 50));
        title.setBorder(new EmptyBorder(80,1,1,1));
        header.add(title);
        //end panels



        this.setLayout(new GridLayout(2,1,0,0));
        this.add(header);
        this.add(panel);
        this.setVisible(true);
        this.setSize(1200,700);
        this.setTitle("HOME");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn1){
            this.dispose();
            JFrame images = new Containers();
        }
        if (e.getSource()==btn2){
            this.dispose();
            JFrame images = new Images();
        }
        if (e.getSource()==btn3){
            this.dispose();
            JFrame images = new Volumes();
        }
        if (e.getSource()==btn4){
            this.dispose();
            JFrame images = new Networks();
        }

    }
}


