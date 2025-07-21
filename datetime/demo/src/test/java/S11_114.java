//operações importates com data e hora 
//datetime são objetos imutaveis, ou seja, não podem ser alterados depois de criados

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class S11_114 {

    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2025-07-18"); //gere uma data a partir desse texto 
        LocalDateTime d05 = LocalDateTime.parse("2025-07-18T15:11:00");  //gere uma data e hora a partir desse texto 
        Instant d06 = Instant.parse("2025-07-18T15:11:00Z"); //gere uma data e hora a partir desse texto, o Z indica que é horário de londres

        LocalDate pastWeekLocalDate = d04.minusDays(7); //subtrai 7 dias da data
        LocalDate nextWeekLocalDate = d04.plusDays(7); //adiciona 7 dias na data

        System.out.println("Uma semana atrás: " + pastWeekLocalDate);
        System.out.println("Uma semana depois: " + nextWeekLocalDate);
    } 
}
