import java.util.ArrayList;
import java.util.Iterator;
public class Spiel
{
    
    private int heimtore;
    private int gasttore;
    private String ort;
    private double datum;
    private String heimmannschaft;
    private String gastmannschaft;
    
    public Spiel(String heimmannschaft,String gastmannschaft,String ort,double datum)
    {
        this.heimmannschaft = heimmannschaft;
        this.gastmannschaft = gastmannschaft;
        this.ort = ort;
        this.datum = datum;
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
    public String gibheimmannschaft()
    {
        return heimmannschaft;
    }
    public String gibgastmannschaft()
    {
        //i
        return gastmannschaft;
    }
}
  