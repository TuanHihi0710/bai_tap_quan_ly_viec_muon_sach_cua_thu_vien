public class TheMuon extends SinhVien{
    private int soPhieuMuon;
    private String ngayMuon;
    private String hanTra;
    private String soHieuSach;
    public TheMuon(){}
    public TheMuon(String inputHoVaTen, int inputNamSinh, int inputTuoi, String inputLop, int inputSoPhieuMuon, String inputNgayMuon, String inputHanTra, String inputSoHieuSach){
        super(inputHoVaTen,inputNamSinh,inputTuoi,inputLop);
        soPhieuMuon=inputSoPhieuMuon;
        ngayMuon=inputNgayMuon;
        hanTra=inputHanTra;
        soHieuSach=inputSoHieuSach;
    }

    public int getSoPhieuMuon() {
        return soPhieuMuon;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public String getHanTra() {
        return hanTra;
    }

    public String getSoHieuSach() {
        return soHieuSach;
    }
    public void setSoPhieuMuon(int inputSoPhieuMuon){
        soPhieuMuon=inputSoPhieuMuon;
    }
    public void setNgayMuon(String inputNgayMuon){
        ngayMuon=inputNgayMuon;
    }
    public void setHanTra(String inputHanTra){
        hanTra=inputHanTra;
    }
    public void setSoHieuSach(String inputSoHieuSach){
        soHieuSach=inputSoHieuSach;
    }
    public void XuatThongTinTheMuon(){
        System.out.println("Ho va ten: "+getHoVaTen());
        System.out.println("Nam sinh: "+getNamSinh());
        System.out.println("Tuoi: "+getTuoi());
        System.out.println("Lop: "+getLop());
        System.out.println("So phieu muon: "+getSoPhieuMuon());
        System.out.println("Ngay muon: "+getNgayMuon());
        System.out.println("Han tra: "+getHanTra());
        System.out.println("So hieu sach: "+getSoHieuSach());
    }
}
