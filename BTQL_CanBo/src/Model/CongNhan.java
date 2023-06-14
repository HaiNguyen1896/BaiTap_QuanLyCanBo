package Model;

public class CongNhan extends CanBo{
    private int cerf;

    public CongNhan(String name, int age, String gender, String adress, int cerf) {
        super(name, age, gender, adress);
        this.cerf = cerf;
    }

    public int getCerf() {
        return cerf;
    }

    public void setCerf(int cerf) {
        this.cerf = cerf;
    }

    @Override
    public String toString() {
        return super.toString()+" ,bậc lương:"+this.cerf;
    }
}
