class Telefonbuch extends Baum
{
    Telefon suchen(String S)
    {
        return (Telefon) super.suchen(S);
    }
    
    void dazu(Telefon T)
    {
        super.dazu(T);
    }
    
    void Beispieltelbuch()
    {
        for(int i=0;i<15;i++)
        {
            String t="0";
            String s=""+(char) (Math.random()*26+65);
            for(int j=0;j<12;j++)
            {
                t=t+((int) (Math.random()*10));
                s=s+(char) (Math.random()*26+97);
            }
            dazu(new Telefon(s,t));
        }
    }
}
