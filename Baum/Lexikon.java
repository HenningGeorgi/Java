public class Lexikon extends Baum
{
    Wort suchen(String S)
    {
        return (Wort) super.suchen(S);
    }
    
    void dazu(Wort W)
    {
        super.dazu(W);
    }
    
    void Beispiellexikon()
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
