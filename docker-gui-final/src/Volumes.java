import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Volumes extends JFrame implements ActionListener {
    JButton btn1 = new JButton("list volumes");
    JButton btn2 = new JButton("create volume");
    JButton btn3 = new JButton("delete volume");
    JButton btn4 = new JButton("inspect volume");
    JButton goDashBoard = new JButton("dashboard");
    JTextField volumeName = new JTextField(65);
    JButton submit = new JButton("submit");
    JButton submitInspect = new JButton("submit");


    Volumes() {
        //start header
        JPanel header = new JPanel();
        header.setLayout(null);
        JLabel title = new JLabel("VOLUMES");
        title.setFont(new Font(Font.SANS_SERIF, Font.BOLD , 50));
        title.setBounds(500,50,300,100);
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
        btn2.addActionListener(this);

        btn3.setPreferredSize(new Dimension(250,100));
        btn3.setBackground(new Color(138,180,248));
        btn3.setForeground(Color.WHITE);
        btn3.setFocusable(false);
        btn3.setBorder(new EmptyBorder(0,10,0,10));
        btn3.addActionListener(this);

        btn4.setPreferredSize(new Dimension(250,100));
        btn4.setBackground(new Color(138,180,248));
        btn4.setForeground(Color.WHITE);
        btn4.setFocusable(false);
        btn4.setBorder(new EmptyBorder(0,10,0,10));
        btn4.addActionListener(this);

        JPanel buttons = new JPanel();
        buttons.add(btn1);
        buttons.add(btn2);
        buttons.add(btn3);
        buttons.add(btn4);

        //end commands buttons

        JPanel panel2 = new JPanel();
        volumeName.setPreferredSize(new Dimension(150,40));
        volumeName.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
        volumeName.setVisible(false);
        submit.setPreferredSize(new Dimension(100,38));
        submit.setVisible(false);
        submit.addActionListener(this);
        submitInspect.setPreferredSize(new Dimension(100,38));
        submitInspect.setVisible(false);
        submitInspect.addActionListener(this);
        panel2.add(volumeName);
        panel2.add(submit);
        panel2.add(submitInspect);

        this.setLayout(new GridLayout(3,1,0,0));
        this.add(header);
        this.add(buttons);
        this.add(panel2);
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
            Main.loadVolumes();
        }
        if (e.getSource()== btn2){
            Main.createVolume();
        }
        if (e.getSource()==btn3) {
            volumeName.setVisible(true);
            submit.setVisible(true);
        }
        if (e.getSource()==submit){
            Main.removeVolume(String.valueOf(volumeName.getText()));
        }


        if (e.getSource()==btn4) {
            volumeName.setVisible(true);
            submitInspect.setVisible(true);
        }
        if (e.getSource()==submitInspect){
            Main.inspectVolume(String.valueOf(volumeName.getText()));
        }


    }
}