public class SinhVien {
    private String hoVaTen;
    private int namSinh;
    private int tuoi;
    private String lop;
    public SinhVien(){}
    public SinhVien(String inputHoVaTen, int inputNamSinh, int inputTuoi, String inputLop){
        hoVaTen=inputHoVaTen;
        namSinh=inputNamSinh;
        tuoi=inputTuoi;
        lop=inputLop;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getLop() {
        return lop;
    }
    public void setHoVaTen(String inputHoVaten){
        hoVaTen=inputHoVaten;
    }
    public void setNamSinh(int inputNamSinh){
        namSinh=inputNamSinh;
    }
    public void setTuoi(int inputTuoi){
        tuoi=inputTuoi;
    }
}
