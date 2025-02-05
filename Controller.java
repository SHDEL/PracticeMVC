import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    ArrayList<ModelCow> arr = new ArrayList<>();
    public Controller(){
        View v = new View();
        readCSV();
        getAllCow();
        BtnActionListener listener = new BtnActionListener(v, this);
        v.intiateActionListener(listener);
    }
    
    public void readCSV(){
        try (Scanner input = new Scanner(Paths.get("Cowdata.csv"));) {
            while (input.hasNext()){
                try {
                    String row = input.nextLine();
                    String [] tokens = row.split(",");
                    int idnum = Integer.parseInt(tokens[0]);
                    CowType cowtype = convertType(tokens[1]);
                    int years = Integer.parseInt(tokens[2]);
                    int month = Integer.parseInt(tokens[3]);
                    addCowlist(idnum, years, month, cowtype);
                }
                catch (Exception e){
                    // System.out.println("At row" + rownum + ", exception named " + e + "...skip");
                    continue;
                }
            }
        }
        catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }
    private void addCowlist(int id, int years, int month, CowType type){
        if (type == CowType.WHITE){
            WhiteCow cow = new WhiteCow(id, years, month);
            arr.add(cow);
        }

    }
    private CowType convertType(String str){
        if (str.equals("WHITE")){
            return CowType.WHITE;
        }
        else if (str.equals("PINK")){
            return CowType.PINK;
        }
        else if (str.equals("BROWN")){
            return CowType.BROWN;
        }
        else{
            return CowType.ERROR;
        }
    }
    public void getAllCow(){
        for (ModelCow cow : arr){
            System.out.println(cow);
        }
    }
    public void getViewInput(String input){
        System.out.println("Input: " + input);

    }
    public void verifyData(){

    }
}