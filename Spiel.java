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
    public void setzeToreHeim(int anzahl)
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
    public void setzeToreGast(int anzahl)
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
    public int gibHeimtore()
    {
        return heimtore;
    }
    public int gibGasttore()
    {
        return gasttore;
    }
    public String gibOrt()
    {
        return ort;
    }
    public double gibDatum()
    {
        return datum;
    }
    public Mannschaft gibHeimmannschaft()
    {
        return heimmannschaft;
    }
    public Mannschaft gibgastmannschaft()
    {
        return gastmannschaft;
    }
}
  