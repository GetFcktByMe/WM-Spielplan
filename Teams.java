
/**
 * Beschreiben Sie hier die Klasse Teams.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Teams
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String teamname;
    private int spieler;
    private int punkte;
    private int platzierung;
    private int tore;
    private int gegentore;
    private int torverhältnis;
    

    /**
     * Konstruktor für Objekte der Klasse Teams
     */
    public Teams(int spieler, String teamname, int punkte, int platzierung, int tore, int gegentore, int torverhältnis )
    {
       this.spieler = spieler;
       this.punkte = punkte;
       this.platzierung = platzierung;
       this.tore = tore;
       this.gegentore = gegentore;
       this.torverhältnis = torverhältnis;
       this.teamname = teamname;
    }

    
}