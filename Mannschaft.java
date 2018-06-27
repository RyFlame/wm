import java.util.ArrayList;
//lol
public class Mannschaft
{
    private String nameDerMannschaft;
    private ArrayList <Mannschaft> spieler; 
    
    public Mannschaft(String nameDerMannschaft)
    {
        this.nameDerMannschaft = nameDerMannschaft;
        ArrayList<Mannschaft>spieler = new ArrayList<Mannschaft>();
    }
    public String gibNameDerMannschaft()
    {
        return nameDerMannschaft;
    }
    public void spielerHinzufügen(Mannschaft nameDesSpielers)
    {
        spieler.add(nameDesSpielers);
    }
    
}
