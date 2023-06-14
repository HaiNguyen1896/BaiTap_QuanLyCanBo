package Model;

public class KySu extends CanBo{
    private String nganh;

    public KySu(String name, int age, String gender, String adress, String nganh) {
        super(name, age, gender, adress);
        this.nganh = nganh;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    @Override
    public String toString() {
        return super.toString()+" chuyên ngành:"+this.nganh;
    }
}
