import java.time.LocalDate; 
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

public class S11_112 {

public static void main(String args[]) {

    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); //fala que horas são no fuso do pc do usuário
    DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME; //se tentar imprimir o d06 da erro pois ele é instant, e esse formatter não fala o timezone
    DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

    LocalDate d04 = LocalDate.parse("2025-07-18"); //gere uma data a partir desse texto 
    LocalDateTime d05 = LocalDateTime.parse("2025-07-18T15:11:00");  //gere uma data e hora a partir desse texto 
    Instant d06 = Instant.parse("2025-07-18T15:11:00Z"); //gere uma data e hora a partir desse texto, o Z indica que é horário de londres

    System.out.println("d04 = " + d04.format(fmt1));
    System.out.println("d04 = " + fmt1.format(d04)); 
    System.out.println("d05 = " + d05.format(fmt1));
    System.out.println("d05 = " + d05.format(fmt2));  
    // System.out.println("d06 = " + d06.format(fmt3)); //não da certo pq ele é tipo instant, tem q ser assim:
    System.out.println("d06 = " + fmt3.format(d06)); //assim pega pelo objeto fmt3 que é do tipo ZoneId, e não do tipo DateTimeFormatter
    System.out.println("d06 = " + fmt5.format(d06)); //imprime no formato iso, mesmo que eu tenha instanciado por um formato customizado
    }
}

//se tentar colocar uma data global (com z no final) para imprimir com um formatter sem especificação de timezone da exceção, pois o formatter não sabe qual timezone usar