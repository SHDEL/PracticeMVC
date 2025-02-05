import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
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
    JLabel labelApp;
    JLabel labelstatus;
    JLabel labelhead;
    JLabel labelhead2;
    JButton btnSubmit;
    JTextArea cowTextArea;
    JTextArea milkTextArea;
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

        labelstatus = new JLabel("This field will show status of Program");
        labelstatus.setFont(labelApp.getFont().deriveFont(14f));
        labelstatus.setBounds(730, 230, 300, 24);
        labelstatus.setVisible(false);

        labelhead = new JLabel("Cow Data");
        labelhead.setFont(labelApp.getFont().deriveFont(20f));
        labelhead.setBounds(90, 50, 250, 28);

        labelhead2 = new JLabel("Milk Calculate Result:");
        labelhead2.setFont(labelApp.getFont().deriveFont(20f));
        labelhead2.setBounds(970, 50, 250, 28);

        input = new JTextField();
        input.setBounds(580, 230, 150, 25);

        btnSubmit = new JButton("submit");
        btnSubmit.setBounds(576, 300, 150, 50);
        btnSubmit.setFont(btnSubmit.getFont().deriveFont(20f));
        btnSubmit.setFocusPainted(false);
        btnSubmit.setActionCommand("Submit");

        cowTextArea = new JTextArea();
        cowTextArea.setBounds(90, 100, 410, 300);
        cowTextArea.setRows(15);  // จำนวนบรรทัดที่ต้องการแสดงผล
        cowTextArea.setColumns(30);  // ความกว้างของข้อความ
        cowTextArea.setLineWrap(true);  // ตัดบรรทัดอัตโนมัติ
        cowTextArea.setWrapStyleWord(true);
        cowTextArea.setFont(cowTextArea.getFont().deriveFont(14f));
        cowTextArea.setBorder(BorderFactory.createLineBorder(Color.getColor("BLACK")));
        cowTextArea.setEditable(false);

        milkTextArea = new JTextArea();
        milkTextArea.setBounds(970, 100, 200, 200);
        milkTextArea.setRows(3);  // จำนวนบรรทัดที่ต้องการแสดงผล
        milkTextArea.setColumns(30);  // ความกว้างของข้อความ
        milkTextArea.setLineWrap(true);  // ตัดบรรทัดอัตโนมัติ
        milkTextArea.setWrapStyleWord(true);
        milkTextArea.setFont(milkTextArea.getFont().deriveFont(18f));
        milkTextArea.setEditable(false);

        panel.add(labelhead);
        panel.add(labelhead2);
        panel.add(cowTextArea);
        panel.add(milkTextArea);
        panel.add(labelstatus);
        panel.add(labelApp);
        panel.add(btnSubmit);
        panel.add(labelEnter);
        panel.add(input);
    
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
    public void intiateActionListener(ActionListener listener){
        btnSubmit.addActionListener(listener);
    }

    // Getter เพื่อรับค่าจาก JTextField
    public String getInputText() {
        return input.getText();
    }
    public void getControllerData(String text){
        cowTextArea.setText(text);
    }
    public void getControllerResponse(String state){
        labelstatus.setText(state);
        labelstatus.setVisible(true);
    }
    public void getMilkResult(String m1, String m2, String m3){
        milkTextArea.setText(m1 + m2 + m3);
    }
}
