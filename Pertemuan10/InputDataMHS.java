package Pertemuan10;
import java.util.ArrayList;

public class InputDataMHS {
    ArrayList<Mahasiswa> listMahasiswa;

    public InputDataMHS() {
        listMahasiswa = new ArrayList();
    }

    public void inputData(String npm, String nama, String alamat, String mataKuliah, double nilaiAkhir) {
        Mahasiswa mhs = new Mahasiswa(npm, nama, alamat, mataKuliah, nilaiAkhir);
        listMahasiswa.add(mhs);
    }

    public ArrayList<Mahasiswa> getALL() {
        return listMahasiswa;
    }

    public void hapusData(int index) {
        listMahasiswa.remove(index);
    }
}
