import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

        //Creazione oggetto tramite la stringa richiesta
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime data2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        // per verificare quanto richiesto dall'esercizio utilizzo il boolean così mi darà in stampa true || false
        // per controllare se la prima data e precedente alla seconda data si utilizza il isBefore
        boolean data1PrecedeData2 = data.isBefore(data2);
        System.out.println("La prima data è precedente alla seconda: " + data1PrecedeData2);

        //per controllare che la seconda data sia successiva alla prima data si utilizza il isAfter
        boolean data2SuccessivaData1 = data2.isAfter(data);
        System.out.println("La seconda data è successiva alla prima: " + data2SuccessivaData1);

        // per controllare se le date solo uguali si utilizza il isEqual
        boolean dateUguali = data.isEqual(data2);
        System.out.println("Le due date sono uguali: " + dateUguali);
    }
}