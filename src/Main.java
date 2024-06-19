import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
//creazione oggetto
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        //inserisco la lunghezza della data in FULL per stampare tutti i campi richiesti dall'esercizio
        String dateFull  = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("Grandezza grande: " + dateFull);

    }
}
