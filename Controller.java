import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    ArrayList<ModelCow> arr = new ArrayList<>();
    View v = new View();
    ModelCow cowFound;
    public Controller(){
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
        else if (type == CowType.BROWN){
            BrownCow cow = new BrownCow(id, years, month);
            arr.add(cow);
        }
        else if (type == CowType.PINK){
            PinkCow cow = new PinkCow(id, years, month);
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
        String text = "";
        int i = 1;
        for (ModelCow cow : arr){
            text += i +  " " + cow.toString() + "\n";
            System.out.println(cow);
            i++;
        }
        v.getControllerData(text);
        for (ModelCow cow  : arr){
            System.out.println(cow.getCowId());
        }
    }
    public void getViewInput(String input){
        System.out.println("Input: " + input);
        String state = verifyData(input);
        v.getControllerResponse(state);
        String ans1 = "Plain Milk: 0 l \n";
        String ans2 = "Chocolate Milk: 0 l \n";
        String ans3 = "Strawberry Milk: 0 l \n";
        try {
            if (cowFound instanceof WhiteCow){
                WhiteCow cow = (WhiteCow)cowFound;
                ans1 = cow.calculateMilk();
                System.out.println(cow);
            }
            else if (cowFound instanceof BrownCow){
                BrownCow cow = (BrownCow)cowFound;
                ans2 = cow.calculateMilk();
                System.out.println(cow);
            }
            else{
                PinkCow cow = (PinkCow)cowFound;
                ans3 = cow.calculateMilk();
                System.out.println(cow);
            }
        } catch (Exception e) {
            // TODO: handle exception
            v.getMilkResult(ans1, ans2, ans3);
        }
        v.getMilkResult(ans1, ans2, ans3);
        cowFound = null;
    }
    public String verifyData(String input){
        if (input.length() != 8){
            System.out.println("false");
            return "Cow ID must be 8 digits";
        }
        if (input.charAt(0) == '0'){
            System.out.println("false");
            return "Cow ID First digit could not be 0";
        }
        else{
            int id = Integer.parseInt(input);
            for (ModelCow cow : arr){
                if (id == cow.getCowId()){
                    cowFound = cow;
                    System.out.println("found");
                    return "CowID Found";
                }
            }
        }
        return "CowID Not Found";
    }
}