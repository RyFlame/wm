

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse GruppeTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class GruppeTest
{
    private Gruppe gruppe1;
    private Mannschaft mannscha1;
    private Mannschaft mannscha2;
    private Mannschaft mannscha3;
    private Mannschaft mannscha4;
    private Spiel spiel1;
    private Spiel spiel2;
    private Spiel spiel3;
    private Spiel spiel4;
    private Spiel spiel5;
    private Spiel spiel6;

    
    
    
    
    

    
    
    
    
    

    /**
     * Konstruktor fuer die Test-Klasse GruppeTest
     */
    public GruppeTest()
    {
    }

    /**
     *  Setzt das Testgerüst fuer den Test.
     *
     * Wird vor jeder Testfall-Methode aufgerufen.
     */
    @Before
    public void setUp()
    {
        gruppe1 = new Gruppe();
        mannscha1 = new Mannschaft("Uspekistan", "achmet");
        mannscha2 = new Mannschaft("Schweden", "hyska");
        mannscha3 = new Mannschaft("portugal", "otto");
        mannscha4 = new Mannschaft("Deutschland", "löwenerschlägägenderkrasserjäger");
        gruppe1.mannschafthinzufuegen(mannscha3);
        gruppe1.mannschafthinzufuegen(mannscha4);
        gruppe1.gibSpiele();
        gruppe1.mannschafthinzufuegen(mannscha1);
        gruppe1.mannschafthinzufuegen(mannscha2);
        spiel1 = new Spiel("Schweden", 16.07, mannscha3, mannscha4, "ja");
        spiel2 = new Spiel("Schweden", 16.07, mannscha3, mannscha1, "ja");
        spiel3 = new Spiel("Schweden", 16.07, mannscha3, mannscha2, "nein");
        spiel4 = new Spiel("löwenerschlägägenderkrasserjäger", 16.07, mannscha4, mannscha1, "ja");
        spiel5 = new Spiel("Schweden", 16.07, mannscha4, mannscha2, "ja");
        spiel6 = new Spiel("Schweden", 16.07, mannscha2, mannscha1, "nein");
    }

    /**
     * Gibt das Testgerüst wieder frei.
     *
     * Wird nach jeder Testfall-Methode aufgerufen.
     */
    @After
    public void tearDown()
    {
    }
}
