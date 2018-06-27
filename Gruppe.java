import java.util.ArrayList;


public class Gruppe
{
    public ArrayList<Mannschaft>gruppe;
    public ArrayList<Spiel>spiele;
    
    public Gruppe()
    {
        ArrayList<Mannschaft>gruppe = new ArrayList<Mannschaft>();
        ArrayList<Spiel>spiele = new ArrayList<Spiel>();
    }
    
    public void mannschafthinzufuegen(Mannschaft mannschaft)
    {
        gruppe.add(mannschaft);
    }
    public ArrayList<Mannschaft>gruppe()
    {
        return gruppe;
    }
    
    public ArrayList<Spiel>spiele()
    {
        return spiele;
    }
    
}
