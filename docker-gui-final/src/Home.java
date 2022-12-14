import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame implements ActionListener {
    Home() {
        JLabel label1 = new JLabel();
        ImageIcon logo = new ImageIcon("/home/youssef/IdeaProjects/docker-gui-final/src/logo.png");
        label1.setIcon(logo);
        label1.setBorder(new EmptyBorder(140,10,10,10));
        label1.setVerticalAlignment(JLabel.CENTER);
        label1.setHorizontalAlignment(JLabel.CENTER);

        JButton button = new JButton("NEXT...");
        button.setFont(new Font(Font.SANS_SERIF,Font.BOLD,30));
        button.setFocusable(false);
        button.setBackground(new Color(70, 70, 255));
        button.setBorder(null);
        button.addActionListener(this);

        this.setLayout(new GridLayout(2,1,100,100));
        this.add(label1);
        this.add(button);
        this.setVisible(true);
        this.setSize(1200,700);
        this.setTitle("HOME");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(70, 70, 255));
        this.setLocationRelativeTo(null);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        this.dispose();
        JFrame frame2 = new Dashboard();
    }
}
