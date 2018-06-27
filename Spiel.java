import java.util.ArrayList;
import java.util.Iterator;
public class Spiel
{
    private boolean gespielt;
    private int heimtore;
    private int gasttore;
    private String ort;
    private double datum;
    private Mannschaft heimmannschaft;
    private Mannschaft gastmannschaft;
    public Spiel (String ort,double datum,Mannschaft heimmannschaft,Mannschaft gastmannschaft,boolean gespielt)
    {
        this.heimmannschaft = heimmannschaft;
        this.gastmannschaft = gastmannschaft;
        this.ort = ort;
        this.datum = datum;
        this.gespielt = gespielt;
    }
    public void setzetoreheim(int anzahl)
    {
        if(gespielt == false)
        {
            System.out.println("manipulation ist nicht erlaubt!");
        }
        else
        {
            heimtore = anzahl + heimtore;
        }

    }
    public void setzetoregast(int anzahl)
    {
        if(gespielt == false)
        {
            System.out.println("manipulation ist nicht erlaubt!");
        }
        else
        {
            gasttore = anzahl + gasttore;
        }

    }
    public int gibheimtore()
    {
        return heimtore;
    }
    public int gibgasttore()
    {
        return gasttore;
    }
    public String gibort()
    {
        return ort;
    }
    public double gibdatum()
    {
        return datum;
    }
    public Mannschaft gibheimmannschaft()
    {
        return heimmannschaft;
    }
    public Mannschaft gibgastmannschaft()
    {
        return gastmannschaft;
    }
}
  