import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Containers extends JFrame implements ActionListener {
    JButton btn1 = new JButton("cmd1");
    JButton btn2 = new JButton("cmd2");
    JButton btn3 = new JButton("cmd3");
    JButton btn4 = new JButton("cmd4");
    JButton goDashBoard = new JButton("dashboard");

    Containers() {

        //start header
        JPanel header = new JPanel();
        header.setLayout(null);
        JLabel title = new JLabel("CONTAINERS");
        title.setFont(new Font(Font.SANS_SERIF, Font.BOLD , 50));
        title.setBounds(400,50,400,100);
        header.add(title);
        //*********************
        goDashBoard.setBackground(new Color(138,180,248));
        goDashBoard.setForeground(Color.WHITE);
        goDashBoard.setFocusable(false);
        goDashBoard.setBounds(10,10,115,50);
        goDashBoard.addActionListener(this);
        header.add(goDashBoard);
        //end header

        //start commands buttons

        btn1.setPreferredSize(new Dimension(250,100));
        btn1.setBackground(new Color(138,180,248));
        btn1.setForeground(Color.WHITE);
        btn1.setFocusable(false);
        btn1.setBorder(new EmptyBorder(0,10,0,10));
        btn1.addActionListener(this);

        btn2.setPreferredSize(new Dimension(250,100));
        btn2.setBackground(new Color(138,180,248));
        btn2.setForeground(Color.WHITE);
        btn2.setFocusable(false);
        btn2.setBorder(new EmptyBorder(0,10,0,10));

        btn3.setPreferredSize(new Dimension(250,100));
        btn3.setBackground(new Color(138,180,248));
        btn3.setForeground(Color.WHITE);
        btn3.setFocusable(false);
        btn3.setBorder(new EmptyBorder(0,10,0,10));

        btn4.setPreferredSize(new Dimension(250,100));
        btn4.setBackground(new Color(138,180,248));
        btn4.setForeground(Color.WHITE);
        btn4.setFocusable(false);
        btn4.setBorder(new EmptyBorder(0,10,0,10));

        JPanel buttons = new JPanel();
        buttons.add(btn1);
        buttons.add(btn2);
        buttons.add(btn3);
        buttons.add(btn4);

        //end commands buttons


        this.setLayout(new GridLayout(3,1,0,0));
        this.add(header);
        this.add(buttons);
        this.setVisible(true);
        this.setSize(1200,700);
        this.setTitle("DASHBOARD");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==goDashBoard){
            this.dispose();
            JFrame frame2 = new Dashboard();
        }
        if (e.getSource()==btn1){
            btn1.setText("containers");
            JPanel panel2 = new JPanel();
            JTable  j = new JTable(Main.containersData, Main.containersTitles);
            j.setPreferredSize(new Dimension(1200,200));
            j.setPreferredScrollableViewportSize(new Dimension(1180,180));
            JScrollPane sp = new JScrollPane(j);
            panel2.add(sp);
            this.add(panel2);
        }
    }


}
