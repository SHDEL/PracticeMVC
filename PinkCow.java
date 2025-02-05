public class PinkCow extends ModelCow{
    CowType type = CowType.PINK;
    public PinkCow(int num, int y, int m) {
        super(num, y, m);
        //TODO Auto-generated constructor stub
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
        int k = 30;
        int month = this.getMonth();
        int ans = k - month;
        System.out.println(ans + " l");
        return "Strawberry Milk: " + Integer.toString(ans) + " l \n";

    }
    
}
