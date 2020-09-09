class Baum
{
    Eintrag wurzel;
    
    Baum()
    {
        wurzel=new Abschluss();
    }
    
    void dazu(Daten D)
    {
        wurzel=wurzel.hinzu(D);
    }
    
    int Anzahl()
    {
        return wurzel.AnzahlAbHier();
    }
    
    void alleAusgeben()
    {
        wurzel.AusgabeAbHier();
    }
    
    Daten suchen(String S)
    {
        return wurzel.suchen(S);
    }
    
    void Strukturausgabe()
    {
        wurzel.Struktur(0);
    }
    
    void loeschen(String S)
    {
        wurzel=wurzel.loeschen(S);
    }
    
    int AnzahlEbenen()
    {
        return wurzel.AnzahlEbenen();
    }
    
    void Beispielbaum()
    {
        dazu(new Wort("high","hoch","This mountain is very high."));
        dazu(new Wort("low","niedrig","Today's temperature is rather low."));
        dazu(new Wort("computer","Computer",""));
        dazu(new Wort("data","Daten","We need to sava our data."));
        dazu(new Wort("interface","Schnittstelle","We need a VGA-HDMI-interface"));
        dazu(new Wort("public","öffentlich","Public places are crowded."));
        dazu(new Wort("street","Straße","This is the street to London."));
        dazu(new Wort("king","König","Charles will never become king of England."));
        dazu(new Wort("over","über","English has over 100000 words."));
        dazu(new Wort("tower","Turm","This tower is very high"));
    }
        
}
