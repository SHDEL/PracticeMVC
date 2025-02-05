import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;


public class View {
    JFrame  frame;
    JPanel panel;
    JPanel panel2;
    int screenWidth = 1280;
    int screenHeight = 720;
    JTextField input;
    JLabel labelEnter;
    JLabel labelApp;
    JButton btnSubmit;
    public ActionListener onSubmitListener;

    public View(){
        frame = new JFrame("View");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(screenWidth, screenHeight));
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        addContent();
    }
    private void addContent(){
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(screenWidth, screenHeight));
        panel.setBounds(0,0, screenWidth, screenHeight);;
        panel.setLayout(null);
        panel.setBackground(Color.white);

        labelApp = new JLabel("Milk Calculator");
        labelApp.setFont(labelApp.getFont().deriveFont(30f));
        labelApp.setBounds(550, 100, 250, 28);

        labelEnter = new JLabel("Enter 8 digits code: ");
        labelEnter.setFont(labelApp.getFont().deriveFont(18f));
        labelEnter.setBounds(570, 200, 200, 24);

        input = new JTextField();
        input.setBounds(580, 230, 150, 25);

        btnSubmit = new JButton("submit");
        btnSubmit.setBounds(576, 300, 150, 50);
        btnSubmit.setFont(btnSubmit.getFont().deriveFont(20f));
        btnSubmit.setFocusPainted(false);
        btnSubmit.setActionCommand("Submit");

        panel.add(labelApp);
        panel.add(btnSubmit);
        panel.add(labelEnter);
        panel.add(input);
        

        // JButton btnchange2 = new JButton("change to red");
        // btnchange2.setBounds(500, 300, 150, 50);

        // panel2 = new JPanel();
        // panel2.setBounds(0, 0, screenWidth, screenHeight);
        // panel2.setLayout(null);
        // panel2.setBackground(Color.blue);

        

        // panel2.add(btnchange2);
        
        // btnSubmit.addActionListener(e -> {
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
    public void intiateActionListener(ActionListener listener){
        btnSubmit.addActionListener(listener);
    }
    // Setter สำหรับกำหนด ActionListener จาก Controller
    // public void setOnSubmitListener(ActionListener listener) {
    //     System.out.println("load in setOnSbmitListener");
    //     this.onSubmitListener = listener;
    // }

    // Getter เพื่อรับค่าจาก JTextField
    public String getInputText() {
        return input.getText();
    }
}
