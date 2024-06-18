import java.util.TreeMap;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Beschreiben Sie hier die Klasse WEAkennlinie.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class WEAkennlinie
{
    private final String StandartDatei = "WEA-Kennlinienmodell_Beispiel.txt";

    private TreeMap<Double,Double> WEAkennline;

    public WEAkennlinie ()
    {
        TXTDateiEinlesen();
    }

    private void TXTDateiEinlesen()
    {
        try {BufferedReader reader = new BufferedReader(
                    new FileReader(StandartDatei));
            String zeile = reader.readLine();
            while(zeile != null){
                zeile = reader.readLine();
                String[] zeileArray = zeile.split(" ");
                WEAkennline.put(new Double(zeileArray[0]),new Double(zeileArray[1]));
            }
        }
        catch(FileNotFoundException e){

        }
        catch(IOException e){

        }
    }
}
