package MainMenu;

import Manager.QuanLyCanBo;
import Model.CanBo;
import Model.CongNhan;
import Model.KySu;
import Model.NhanVien;

import java.util.Scanner;

public class MainMenu {
    QuanLyCanBo quanLyCanBo;
    private Scanner sc = new Scanner(System.in);

    public MainMenu() {
        quanLyCanBo = new QuanLyCanBo();
    }

    public void showMainMenu() {
        String menu = "1.Thêm mới cán bộ\n2.Tìm kiếm theo họ và tên\n3.Hiển thị thông tin danh sách cán bộ\n0.Thoát chương trình";
        int choice;
        do {
            System.out.println(menu);
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addMenu();
                    break;
                case 2:
                    timKiem();
                    break;
                case 3:
                    hienThi();
                    break;
            }
        } while (choice != 0);
    }

    public void addMenu() {
        String menu = "--------------Thêm--------------\n1.Thêm công nhân\n2.Thêm kỹ sư\n3.Thêm nhân viên\n0.Thoát";
        int choice;
        do {
            System.out.println(menu);
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addCongNhan();
                    break;
                case 2:
                    addKySu();
                    break;
                case 3:
                    addNhanvien();
                    break;
            }
        } while (choice != 0);
    }

    public void timKiem() {
        System.out.println("Hãy nhập họ tên bạn muốn tìm");
        sc.nextLine();
        String name = sc.nextLine();
        quanLyCanBo.findByName(name);
    }

    //***************************ADD******************************
    public void addCongNhan() {
        System.out.println("**************Thêm Công Nhân*******************");
        sc.nextLine();
        System.out.println("Hãy nhập tên");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi");
        int age = sc.nextInt();
        System.out.println("Giới tính");
        sc.nextLine();
        String gender = sc.nextLine();
        System.out.println("Địa chỉ");
        String address = sc.nextLine();
        System.out.println("Cấp bậc");
        int cerf=-1;
        do {
            cerf = sc.nextInt();
            if (cerf<0 || cerf>10) System.out.println("Cấp bậc chỉ trong khoảng 1 đến 10");
        }while(cerf<0 || cerf >10);
        CanBo congNhan = new CongNhan(name, age, gender, address, cerf);
        quanLyCanBo.add(congNhan);
    }

    public void addKySu() {
        System.out.println("************Thêm Kỹ Sư*******************");
        sc.nextLine();
        System.out.println("Hãy nhập tên");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi");
        int age = sc.nextInt();
        System.out.println("Giới tính");
        sc.nextLine();
        String gender = sc.nextLine();
        System.out.println("Địa chỉ");
        String address = sc.nextLine();
        System.out.println("Chuyên Ngành");
        String chuyenNganh = sc.nextLine();
        CanBo kySu = new KySu(name, age, gender, address, chuyenNganh);
        quanLyCanBo.add(kySu);
    }

    public void addNhanvien() {
        System.out.println("************Thêm nhân viên*******************");
        sc.nextLine();
        System.out.println("Hãy nhập tên");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi");
        int age = sc.nextInt();
        System.out.println("Giới tính");
        sc.nextLine();
        String gender = sc.nextLine();
        System.out.println("Địa chỉ");
        String address = sc.nextLine();
        System.out.println("Công việc");
        String congViec = sc.nextLine();
        CanBo nhanVien = new NhanVien(name, age, gender, address, congViec);
        quanLyCanBo.add(nhanVien);
    }

    //************************************************************
    public void hienThi() {
        CanBo[] canbo = quanLyCanBo.danhSach();
        int size = quanLyCanBo.size;
        System.out.println("--------Danh sách cán bộ----------");
        for (int i = 0; i < size; i++) {
            System.out.println(canbo[i].toString());
        }
    }
}