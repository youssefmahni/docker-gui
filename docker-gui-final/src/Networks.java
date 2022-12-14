import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Networks extends JFrame implements ActionListener {
    JButton btn1 = new JButton("list network");
    JButton btn2 = new JButton("create network");
    JButton btn3 = new JButton("delete network");
    JButton btn4 = new JButton("inspect network");
    JButton goDashBoard = new JButton("dashboard");
    JTextField networkName = new JTextField(65);
    JButton submit = new JButton("submit");
    JButton submitInspect = new JButton("submit");


    Networks() {
        //start header
        JPanel header = new JPanel();
        header.setLayout(null);
        JLabel title = new JLabel("NETWORKS");
        title.setFont(new Font(Font.SANS_SERIF, Font.BOLD , 50));
        title.setBounds(420,50,350,100);
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
        networkName.setPreferredSize(new Dimension(150,40));
        networkName.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
        networkName.setVisible(false);
        submit.setPreferredSize(new Dimension(100,38));
        submit.setVisible(false);
        submit.addActionListener(this);
        submitInspect.setPreferredSize(new Dimension(100,38));
        submitInspect.setVisible(false);
        submitInspect.addActionListener(this);
        panel2.add(networkName);
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
            Main.loadNetworks();
        }
        if (e.getSource()== btn2){
            Main.createNetwork();
        }
        if (e.getSource()==btn3) {
            networkName.setVisible(true);
            submit.setVisible(true);
        }
        if (e.getSource()==submit){
            Main.removeNetwork(String.valueOf(networkName.getText()));
        }


        if (e.getSource()==btn4) {
            networkName.setVisible(true);
            submitInspect.setVisible(true);
        }
        if (e.getSource()==submitInspect){
            Main.inspectNetwork(String.valueOf(networkName.getText()));
        }


    }
}
