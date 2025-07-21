import java.time.LocalDate; 
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

public class S11_111 {

public static void main(String args[]) {

    // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    LocalDate d01 = LocalDate.now(); //data local
    LocalDateTime d02 = LocalDateTime.now(); //data e horário local
    Instant d03 = Instant.now(); //horário de londres
    LocalDate d04 = LocalDate.parse("2025-07-18"); //gere uma data a partir desse texto 
    LocalDateTime d05 = LocalDateTime.parse("2025-07-18T15:11:00");  //gere uma data e hora a partir desse texto 
    Instant d06 = Instant.parse("2025-07-18T15:11:00Z"); //gere uma data e hora a partir desse texto, o Z indica que é horário de londres
    Instant d07 = Instant.parse("2025-07-18T15:11:00-03:00"); //gere uma data e hora a partir de um fuso de -03:00 em relaçao a londres
    LocalDate d08 = LocalDate.parse("18/07/2025", fmt1); //sem o formatter da exceção pois eu não formatei a data corretamente. para funcionar, precisaria do datetime formatter
    LocalDateTime d09 = LocalDateTime.parse("18/07/2025 15:11:00", fmt2); //sem o formatter da exceção pois eu não formatei a data corretamente. para funcionar, precisaria do datetime formatter
    LocalDate d10 =LocalDate.of(2025, 07, 18);
    LocalDateTime d11 = LocalDateTime.of(2025, 07, 18, 15, 11, 00); //cria uma data e hora a partir dos parâmetros informados

    System.out.println("d01 = " + d01); 
    System.out.println("d02 = " + d02); 
    System.out.println("d03 = " + d03); 
    System.out.println("d04 = " + d04); 
    System.out.println("d05 = " + d05); 
    System.out.println("d06 = " + d06); 
    System.out.println("d07 = " + d07); //imprime o horário de londres
    System.out.println("d08 = " + d08); //imprime no formato iso, mesmo que eu tenha instanciado por um formato customizado
    System.out.println("d09 = " + d09); //imprime no formato iso, mesmo que eu tenha instanciado por um formato customizado
    System.out.println("d10 = " + d10); 
    }
}