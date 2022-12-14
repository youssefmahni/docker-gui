import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Containers extends JFrame implements ActionListener {
    JButton btn1 = new JButton("list containers");
    JButton btn2 = new JButton("create container");
    JButton btn3 = new JButton("start container");
    JButton btn4 = new JButton("kill container");
    JButton goDashBoard = new JButton("dashboard");
    JTextField containerName = new JTextField(20);
    JTextField imageName = new JTextField(20);
    JButton submitcreate = new JButton("submit");
    JButton submitrun = new JButton("submit");
    JButton submitKIll = new JButton("submit");

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
        containerName.setPreferredSize(new Dimension(150,40));
        containerName.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
        containerName.setVisible(false);
        imageName.setPreferredSize(new Dimension(150,40));
        imageName.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
        imageName.setVisible(false);
        submitcreate.setPreferredSize(new Dimension(100,38));
        submitcreate.setVisible(false);
        submitcreate.addActionListener(this);
        submitrun.setPreferredSize(new Dimension(100,38));
        submitrun.setVisible(false);
        submitrun.addActionListener(this);
        submitKIll.setPreferredSize(new Dimension(100,38));
        submitKIll.setVisible(false);
        submitKIll.addActionListener(this);
        panel2.add(containerName);
        panel2.add(imageName);
        panel2.add(submitcreate);
        panel2.add(submitKIll);
        panel2.add(submitrun);

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
            btn1.setText("containers");
            Main.loadContainers();
        }
        if (e.getSource()==btn2){
            containerName.setVisible(true);
            imageName.setVisible(true);
            submitcreate.setVisible(true);
        }
        if (e.getSource()==submitcreate){
            Main.createContainer(String.valueOf(containerName.getText()),String.valueOf(imageName.getText()));
        }
        if (e.getSource()==btn3){
            containerName.setVisible(true);
            submitrun.setVisible(true);
        }
        if (e.getSource()==submitrun){
            Main.startContainer(String.valueOf(containerName.getText()));
        }
        if (e.getSource()==btn4){
            containerName.setVisible(true);
            submitKIll.setVisible(true);
        }
        if (e.getSource()==submitKIll){
            Main.killContainer(String.valueOf(containerName.getText()));
        }
    }


}
