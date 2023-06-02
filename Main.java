import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyViecMuonSachCuaSinhVien quanLyViecMuonSachCuaSinhVien = new QuanLyViecMuonSachCuaSinhVien();
        int nhap = 0;
        do {
            try {
                System.out.println("=======MENU===========");
                System.out.println("Nhập vào một số từ 1 đến 2 để chọn Menu:");
                System.out.println("1: Nhập thông tin sinh vien muon sach");
                System.out.println("2: Xuat thong tin sinh vien muon sach");
                Scanner sc = new Scanner(System.in);
                nhap = sc.nextInt();
                if (nhap < 1 || nhap > 2) {
                    System.out.println("Nhap sai gia tri vui long nhap lai");
                } else if (nhap == 1) {
                    System.out.println("Nhập thông tin sinh vien muon sach");
                    System.out.println("Nhap vao ho va ten");
                    Scanner scHoVaTen = new Scanner(System.in);
                    String inputHoVaTen = scHoVaTen.nextLine();
                    System.out.println("Nhap vao nam sinh");
                    Scanner scNamSinh = new Scanner(System.in);
                    int inputNamSinh = scNamSinh.nextInt();
                    System.out.println("Nhap vao tuoi");
                    Scanner scTuoi = new Scanner(System.in);
                    int inputTuoi = scTuoi.nextInt();
                    System.out.println("Nhap vao lop");
                    Scanner scLop = new Scanner(System.in);
                    String inputLop = scLop.nextLine();
                    System.out.println("Nhap vao so phieu muon");
                    Scanner scSoPhieuMuon = new Scanner(System.in);
                    int inputSoPhieuMuon = scSoPhieuMuon.nextInt();
                    System.out.println("Nhap vao ngay muon");
                    Scanner scNgayMuon = new Scanner(System.in);
                    String inputNgayMuon = scNgayMuon.nextLine();
                    System.out.println("Nhap vao han tra");
                    Scanner scHanTra = new Scanner(System.in);
                    String inputHanTra = scHanTra.nextLine();
                    System.out.println("Nhap vao so hieu sach");
                    Scanner scSoHieuSach = new Scanner(System.in);
                    String inputSoHieuSach = scSoHieuSach.nextLine();
                    quanLyViecMuonSachCuaSinhVien.ThemDanhSachThongTinSinhVienMuonSach(inputHoVaTen, inputNamSinh, inputTuoi, inputLop, inputSoPhieuMuon, inputNgayMuon, inputHanTra, inputSoHieuSach);
                } else if (nhap == 2) {
                    System.out.println("Xuat thong tin sinh vien muon sach");
                    quanLyViecMuonSachCuaSinhVien.XuatDanhSachThongTinSinhVienMuonSach();
                }
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Số lượng phần tử đang lớn hơn số phần tử trong mảng");
            } catch (NullPointerException ex) {
                System.out.println("Lỗi tham chiếu null");
            } catch (InputMismatchException ex) {
                System.out.println("Loi sai dau vao");
            } catch (Exception ex) {
                System.out.println("Lỗi ngoại lệ trong");
            }
        } while (nhap != 3);
    }
}