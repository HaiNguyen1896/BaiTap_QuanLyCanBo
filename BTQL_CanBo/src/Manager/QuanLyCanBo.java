package Manager;

import Model.CanBo;
import Model.CongNhan;
import Model.KySu;
import Model.NhanVien;

public class QuanLyCanBo implements Manager<CanBo> {
    private CanBo[] nhomCanBo;
    public static int size = 0;

    public QuanLyCanBo() {
        nhomCanBo = new CanBo[100];
    }

    @Override
    public void add(CanBo canBo) {
        nhomCanBo[size] = canBo;
        size++;
    }

    @Override
    public void findByName(String name) {
        for(int i =0;i<size;i++){
            if(nhomCanBo[i].getName().equalsIgnoreCase(name)){
                System.out.println(nhomCanBo[i].toString());
            }
        }
        System.out.println("Tìm kiếm thất bại");
    }


    @Override
    public CanBo[] danhSach() {
        return nhomCanBo;
    }
}
