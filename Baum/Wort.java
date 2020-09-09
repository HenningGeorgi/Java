class Wort implements Daten
{
    String eng,deu,bsp;
    
    Wort(String en,String dt,String bspSatz)
    {
        eng=en;
        deu=dt;
        bsp=bspSatz;
    }
    
    public String ord()
    {
        return eng;
    }
    
    public void Ausgabe()
    {
        System.out.println(eng+": "+deu+", Bsp: "+bsp);
    }
}
