import java.time.LocalDate; 
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.Instant;

public class S11_113 {

public static void main(String args[]) {

    //como obter os nomes dos zoneIds disponíveis para usar nas funções de conversão de data e hora:
    // for (String s : ZoneId.getAvailableZoneIds()) {
    //     System.out.println(s);
    // }

    LocalDate d04 = LocalDate.parse("2025-07-18"); //gere uma data a partir desse texto 
    LocalDateTime d05 = LocalDateTime.parse("2025-07-18T15:11:00");  //gere uma data e hora a partir desse texto 
    Instant d06 = Instant.parse("2025-07-18T15:11:00Z"); //gere uma data e hora a partir desse texto, o Z indica que é horário de londres

    //converter data global para local informando o timexone:
    LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault()); //pega o timezone do pc do usuário
    LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal")); //pega o timezone do pc do usuário
    LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault()); //pega o timezone do pc do usuário
    LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal")); //pega o timezone de portugal

    System.out.println("r1 = " + r1); //imprime a data no formato local do usuário
    System.out.println("r2 = " + r2); //imprime a data no timezone de portugal
    System.out.println("r3 = " + r3); //imprime a data e hora no formato local do usuário
    System.out.println("r4 = " + r4); //imprime a data e hora no timezone de portugal

    //imprimindo os valores de um localDate:
    System.out.println("d04 dia =" + d04.getDayOfMonth());//quando digita get aparece várias opções de métodos, como getDayOfMonth, getDayOfWeek, getYear, etc.
    System.out.println("d04 mes =" + d04.getMonthValue());
    System.out.println("d04 ano =" + d04.getYear());

    //imprimindo os valores de um localDateTime:
    System.out.println("d05 hora =" + d05.getHour()); //quando digita get aparece várias opções de métodos, como getHour, getMinute, getSecond, etc.
    System.out.println("d05 minuto =" + d05.getMinute());
    System.out.println("d05 segundo =" + d05.getSecond());
    //resto da data igual o localDate
    }
}
