class Telefon implements Daten
{
    String name,Tel;
    
    Telefon(String nam,String tel)
    {
        name=nam;
        Tel=tel;
    }
    
    public String ord()
    {
        return name;
    }
    
    public void Ausgabe()
    {
        System.out.println(name+": "+Tel);
    }
}
