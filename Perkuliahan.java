public class Perkuliahan 
{
    public static void main(String[] args) 
    {
        Dosen anto = new Dosen();
        anto.setNama("Zinedine Zidane");
        anto.setNidn("123456789");    
        Mahasiswa ani = new Mahasiswa();
        ani.setNama("Muhammad Zidane Nur");
        ani.setNim("987654321");
        anto.memberiTugas("Kemampuan Dribble");
        anto.mengajar("Sabtu");
        ani.bayarSpp(2000);
        ani.belajar("Dribble Bola");
        ani.nilai(90);
        ani.grade("A");
    }
    
}