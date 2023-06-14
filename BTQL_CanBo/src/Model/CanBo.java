package Model;

public class CanBo {
    private String name;
    private int age;
    private String gender;
    private String adress;

    public CanBo(String name, int age, String gender, String adress) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Tên:" + name +" ,tuổi:"+age+" ,Giới tính:"+gender+" ,Địa chỉ:"+adress;
    }
}
