package Model;

public class NhanVien extends CanBo{
    private String congViec;

    public NhanVien(String name, int age, String gender, String adress, String congViec) {
        super(name, age, gender, adress);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return super.toString()+" công việc:"+this.congViec;
    }
}
