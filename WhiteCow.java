public class WhiteCow extends ModelCow{
    CowType type = CowType.WHITE;
    public WhiteCow(int num, int y, int m){
        super(num, y, m);

    }
    @Override
    public int getCowId() {
        // TODO Auto-generated method stub
        return super.getCowId();
    }
    @Override
    public int getMonth() {
        // TODO Auto-generated method stub
        return super.getMonth();
    }
    @Override
    public int getYears() {
        // TODO Auto-generated method stub
        return super.getYears();
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + ", type=" + this.type + "]";
    }
    public CowType getType(){
        return this.type;
    }
    public String calculateMilk(){
        int k = 120;
        int month = (this.getYears() * 12) + this.getMonth();
        System.out.println(month);
        int ans = k - month;
        System.out.println(ans + " l");
        return "Plain Milk: " + Integer.toString(ans) + " l \n" ;
    }
    
    
}