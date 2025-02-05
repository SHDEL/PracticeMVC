import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnActionListener implements ActionListener {
    View v;
    Controller c;
    public BtnActionListener(View v, Controller c){
        this.v = v;
        this.c = c;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        try {
            String command = e.getActionCommand();
            if (command == "Submit"){
                handleSubmit();
            }
        } catch (Exception error) {
            // TODO: handle exception
            System.err.println(error);
        }
        
    }
    private void handleSubmit(){
        String input = v.getInputText();
        c.getViewInput(input);
    }
    
}
