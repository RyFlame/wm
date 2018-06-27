import java.util.ArrayList;
import java.util.Iterator;
public class Spiel
{
    private String gespielt;
    private int heimtore;
    private int gasttore;
    private String ort;
    private double datum;
    private Mannschaft heimmannschaft;
    private Mannschaft gastmannschaft;
    public Spiel (String ort,double datum,Mannschaft heimmannschaft,Mannschaft gastmannschaft,String gespielt)
    {
        this.heimmannschaft = heimmannschaft;
        this.gastmannschaft = gastmannschaft;
        this.ort = ort;
        this.datum = datum;
        this.gespielt = gespielt;
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
  