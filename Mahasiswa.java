public class Mahasiswa extends Profile implements MahasiswaInterface
{
    private String nim;
 
    public void setNim(String nim) 
    {
        this.nim = nim;
    }
 
    public void bayarSpp(int jumlah)
    {
        System.out.println(this.getNama() + " Membayar Uang Parkir " + jumlah);
    }
 
    public void belajar(String mataKuliah)
    {
        System.out.println(this.getNama() + " Berlatih " + mataKuliah);
    }

    public void nilai(int nilai){
        System.out.println(this.getNama() + " Mendapatkan Poin " + nilai);
    }

    public void grade(String grade){
        System.out.println(this.getNama() + " Mendapatkan Grade " + grade);
    }
}