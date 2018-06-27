import java.util.ArrayList;


public class Gruppe
{
    public ArrayList<Mannschaft> mannschaften;
    public ArrayList<Spiel> spiele;
    
    public Gruppe()
    {
        mannschaften = new ArrayList<Mannschaft>();
        spiele = new ArrayList<Spiel>();
    }
    
    public void mannschafthinzufuegen(Mannschaft mannschaft)
    {
        mannschaften.add(mannschaft);
    }
    public ArrayList<Mannschaft> gibMannschaften()
    {
        return mannschaften;
    }
    
    public ArrayList<Spiel> gibSpiele()
    {
        return spiele;
    }
    
}
