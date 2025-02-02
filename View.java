import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class View {
    JFrame  frame;
    JPanel panel;
    JPanel panel2;
    int screenWidth = 1280;
    int screenHeight = 720;
    JTextField input;
    JLabel labelEnter;
    JButton btnSubmit;

    public View(){
        frame = new JFrame("View");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(screenWidth, screenHeight));
        frame.setResizable(true);
        // frame.setLocationRelativeTo(null);
        addContent();
    }
    private void addContent(){
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(screenWidth, screenHeight));
        panel.setBounds(0,0, screenWidth, screenHeight);;
        panel.setLayout(null);
        panel.setBackground(Color.white);

        labelEnter = new JLabel("Enter 8 digits code: ");
        labelEnter.setBounds(640, 700, 200, 15);

        input = new JTextField();
        input.setBounds(220, 200, 100, 25);

        JButton btnchange = new JButton("submit");
        btnchange.setBounds(100, 300, 150, 50);

        panel.add(btnchange);
        panel.add(labelEnter);
        panel.add(input);
        

        // JButton btnchange2 = new JButton("change to red");
        // btnchange2.setBounds(500, 300, 150, 50);

        // panel2 = new JPanel();
        // panel2.setBounds(0, 0, screenWidth, screenHeight);
        // panel2.setLayout(null);
        // panel2.setBackground(Color.blue);

        

        // panel2.add(btnchange2);
        
        // btnchange.addActionListener(e -> {
        //     panel.setVisible(false);
        //     panel2.setVisible(true);
        // });
        // btnchange2.addActionListener(e -> {
        //     panel2.setVisible(false);
        //     panel.setVisible(true);
        // });

        frame.add(panel);
        // frame.add(panel2);
        frame.pack();
        frame.setVisible(true);
    }
}
