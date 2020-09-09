abstract class Eintrag
{
    abstract Knoten hinzu(Daten D);
    
    abstract int AnzahlAbHier();
    
    abstract void AusgabeAbHier();
    
    abstract Daten DatenGeben();
    
    void Struktur(int n){}
    
    Daten suchen(String S)
    {
        return null;
    }
    
    Eintrag loeschen(String S)
    {
        return this;
    }
    
    Daten groessterEintrag()
    {
        return null;
    }
    
    int AnzahlEbenen()
    {
        return 0;
    }
    
    int Balance()
    {
        return 0;
    }
    
    Eintrag linksrotieren()
    {
        return this;
    }

    Eintrag rechtsrotieren()
    {
        return this;
    }

}