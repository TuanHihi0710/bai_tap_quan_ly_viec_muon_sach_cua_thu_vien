import java.util.ArrayList;
import java.util.List;

public class QuanLyViecMuonSachCuaSinhVien {
    private List<TheMuon> danhSachTheMuon;
    public QuanLyViecMuonSachCuaSinhVien(){
        danhSachTheMuon=new ArrayList<>();
    }
    public void ThemDanhSachThongTinSinhVienMuonSach(String inputHoVaTen, int inputNamSinh, int inputTuoi, String inputLop, int inputSoPhieuMuon, String inputNgayMuon, String inputHanTra, String inputSoHieuSach){
        TheMuon theMuon = new TheMuon(inputHoVaTen,inputNamSinh,inputTuoi,inputLop,inputSoPhieuMuon,inputNgayMuon,inputHanTra,inputSoHieuSach);
        danhSachTheMuon.add(theMuon);
    }
    public void XuatDanhSachThongTinSinhVienMuonSach(){
        for (int i = 0; i < danhSachTheMuon.size(); i++) {
            danhSachTheMuon.get(i).XuatThongTinTheMuon();
        }
    }
}
