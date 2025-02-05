public class BrownCow extends ModelCow {
    CowType type = CowType.BROWN;
    public BrownCow(int num, int y, int m) {
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
        int k = 40;
        int years = this.getYears();
        int ans = k - years;
        System.out.println(ans + " l");
        return "Chocolate Milk: " + Integer.toString(ans) + " l \n";

    }
    

}
