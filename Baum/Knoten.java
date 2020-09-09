class Knoten extends Eintrag
{
    Daten inhalt;
    Eintrag gr,kl;

    Knoten(Daten D)
    {
        inhalt=D;
        gr=new Abschluss();
        kl=new Abschluss();
    }

    public Knoten hinzu(Daten D)
    {
        if(D.ord().compareTo(inhalt.ord())<0)
        //ord() liefert für jedes Daten-Objekt, dessen zur
        //Einsortierung verwendetes Ordnungsmerkmal
        {
            kl=kl.hinzu(D);
        }
        else
        {
            gr=gr.hinzu(D);
        }
        return this.ausbalancieren();
    }

    public Daten DatenGeben()
    {
        return inhalt;
    }

    public int AnzahlAbHier()
    {
        return 1+kl.AnzahlAbHier()+gr.AnzahlAbHier();
    }

    void AusgabeAbHier()
    {
        kl.AusgabeAbHier();
        inhalt.Ausgabe();
        gr.AusgabeAbHier();
    }

    void Struktur(int n)
    {
        kl.Struktur(n+1);
        for(int i=0;i<n;i++)
        {
            System.out.print("   ");
        }
        inhalt.Ausgabe();
        gr.Struktur(n+1);
    }

    Daten suchen(String S)
    {
        int comp=inhalt.ord().compareTo(S);
        if(comp==0)
        {
            return inhalt;
        }
        else if(comp>0)
        {
            return kl.suchen(S);
        }
        else
        {
            return gr.suchen(S);
        }
    }

    Eintrag loeschen(String S)
    {
        int comp=inhalt.ord().compareTo(S);
        if(comp==0)
        {
            if(kl.AnzahlAbHier()==0)
            {
                return gr;
            }
            else if(gr.AnzahlAbHier()==0)
            {
                return kl;
            }
            else
            {
                inhalt=kl.groessterEintrag();
                kl=kl.loeschen(inhalt.ord());
                return this;
            }
        }
        else if(comp>0)
        {
            kl=kl.loeschen(S);
        }
        else
        {
            gr=gr.loeschen(S);
        }
        return this.ausbalancieren();
    }

    Daten groessterEintrag()
    {
        if(gr.AnzahlAbHier()==0)
        {
            return inhalt;
        }
        else
        {
            return gr.groessterEintrag();
        }
    }
    
    int AnzahlEbenen()
    {
        int Ekl=kl.AnzahlEbenen();
        int Egr=gr.AnzahlEbenen();
        if(Ekl<Egr)
        {
            return 1+Egr;
        }
        else
        {
            return 1+Ekl;
        }
    }
    
    int Balance()
    {
        return gr.AnzahlEbenen()-kl.AnzahlEbenen();
    }
    
    Knoten rechtsrotieren()//nur möglich wenn kl Knoten ist!
    {
        Knoten Kl=(Knoten)kl;
        kl=Kl.gr;
        Kl.gr=this;
        return Kl;
    }

    Knoten linksrotieren()//nur möglich wenn gr Knoten ist!
    {
        Knoten Gr=(Knoten)gr;
        gr=Gr.kl;
        Gr.kl=this;
        return Gr;
    }
    
    Knoten ausbalancieren()
    {
        if(Balance()>1)//Übergewicht bei gr
        {
            if(gr.Balance()<0)
            {
                gr=gr.rechtsrotieren();
            }
            return linksrotieren();
        }
        else if(Balance()<-1)
        {
            if(kl.Balance()>0)
            {
                kl=kl.linksrotieren();
            }
            return rechtsrotieren();
        }
        return this;
    }
}
