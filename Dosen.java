public class Dosen extends Profile implements DosenInterface
{
    private String nidn;
    
    public void setNidn(String nidn) 
    {
        this.nidn = nidn;
    }
 
    public String getNidn() 
    {
        return this.nidn;
    }
 
    public void memberiTugas(String mataKuliah)
    {
        System.out.println(this.getNama() + " Melatih " + mataKuliah);
    }
    
    public void mengajar(String hari){
        System.out.println(this.getNama() + " Melatih Pada Hari " + hari);
    }
}