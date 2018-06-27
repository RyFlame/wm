import java.util.ArrayList;

public class Mannschaft
{
    private String nameDerMannschaft;
    private ArrayList <Mannschaft> spieler; 
    private String coach;
    public Mannschaft(String nameDerMannschaft, String coach)
    {
        this.nameDerMannschaft = nameDerMannschaft;
        ArrayList<Mannschaft>spieler = new ArrayList<Mannschaft>();
        this.coach = coach;
    }
    public String gibNameDerMannschaft()
    {
        return nameDerMannschaft;
    }
    public void spielerHinzufügen(Mannschaft nameDesSpielers)
    {
        spieler.add(nameDesSpielers);
    }
    public String gibCoach()
    {
        return coach;
    }
}
