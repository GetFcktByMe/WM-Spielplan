import lang.stride.*;
/**
 * Beschreiben Sie hier die Klasse Spiele.
 * @author (Ihr Name) @version (eine Versionsnummer oder ein Datum)
 */
public class Spiel
{
    /* Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen*/
    private Team team1;
    private Team team2;
    private int toreTeam1;
    private int toreTeam2;

    

    /**
     * Konstruktor für Objekte der Klasse Spiele
     */
    public Spiel(Team heimteam, Team gastteam)
    {
        /* Instanzvariable initialisieren*/
        team1 = heimteam;
        team2 = gastteam;
        toreTeam1 = 0;
        toreTeam2 = 0;
    }



    /**
     * 
     */
    public void setzeErgebnis( int toreTeam1, int ToreTeam2)
    {
        this.toreTeam1 = toreTeam1;
        this.toreTeam2 = toreTeam2;
        
    }

    }

