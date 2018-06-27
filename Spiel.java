import java.util.ArrayList;
import java.util.Iterator;
public class Spiel
{
    
    private int heimtore;
    private int gasttore;
    private String ort;
    private double datum;
    private Mannschaft heimmannschaft;
    private Mannschaft gastmannschaft;
    public ArrayList<Mannschaft>fuerspiel;
    public Spiel (String ort,double datum)
    {
        fuerspiel = new ArrayList<Mannschaft>();
        this.ort = ort;
        this.datum = datum;
    }
    public void setzemannschaften(Mannschaft heimmannschaft,Mannschaft gastmannschaft)
    {
        fuerspiel.add(heimmannschaft);
        fuerspiel.add(gastmannschaft);
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
  