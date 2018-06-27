
/**
 * Beschreiben Sie hier die Klasse Teams.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Team
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String teamname;
    private int spieler;
    private int punkte;
    private int platzierung;
    private int tore;
    private int gegentore;
    private int torverhealtnis;
    

    /**
     * Konstruktor für Objekte der Klasse Teams
     */
    public Team(int spieler, String teamname, int punkte, int platzierung, int tore, int gegentore, int torverhältnis )
    {
       this.spieler = spieler;
       this.punkte = punkte;
       this.platzierung = platzierung;
       this.tore = tore;
       this.gegentore = gegentore;
       this.torverhealtnis = torverhealtnis;
       this.teamname = teamname;
    }
    
    public String gibTeamname()
    {
        return teamname;
    }
    
    public int gibSpieler()
    {
        return spieler;
    }
    
     public int gibPunkte()
    {
        return punkte;
    }
    
     public int gibPlatzierung()
    {
        return platzierung;
    }
    
     public int gibTore()
    {
        return gegentore;
    }
    
     public int gibgegentore()
    {
        return gegentore;
    }
    
     public int gibTorverhealtnis()
    {
        return torverhealtnis;
    }
    
     
}