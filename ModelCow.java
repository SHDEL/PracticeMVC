public class ModelCow {
    int id;
    int years;
    int month;

    public ModelCow(int num,int y, int m){
        this.id = num;
        this.years = y;
        this.month = m;
    }
    public int getCowId(){
        return this.id;
    }
    public int getYears(){
        return this.years;
    }
    public int getMonth(){
        return this.month;
    }
    @Override
    public String toString() {
        return "ModelCow [id=" + this.id + ", years=" + this.years + ", month=" + this.month;
    }
    
    
}
