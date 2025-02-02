public class ModelCow {
    int id;
    CowType type;
    int years;
    int month;

    public ModelCow(int num, CowType t, int y, int m){
        this.id = num;
        this.type = t;
        this.years = y;
        this.month = m;
    }
    public int getCowId(){
        return this.id;
    }
    public CowType getCowType(){
        return this.type;
    }
    public int getYears(){
        return this.years;
    }
    public int getMonth(){
        return this.month;
    }
    @Override
    public String toString() {
        return "ModelCow [id=" + this.id + ", type=" + this.type + ", years=" + this.years + ", month=" + this.month + "]";
    }
    
    
}
