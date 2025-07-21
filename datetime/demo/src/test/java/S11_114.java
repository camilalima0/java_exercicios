//operações importates com data e hora 
//datetime são objetos imutaveis, ou seja, não podem ser alterados depois de criados

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class S11_114 {

    public static void main(String[] args) {
            LocalDate d04 = LocalDate.parse("2025-07-18"); //gere uma data a partir desse texto 
                    LocalDateTime d05 = LocalDateTime.parse("2025-07-18T15:11:00");  //gere uma data e hora a partir desse texto 
                            Instant d06 = Instant.parse("2025-07-18T15:11:00Z"); //gere uma data e hora a partir desse texto, o Z indica que é horário de londres

                                    //da para adicionar ou subtrair dias, meses, anos, horas, minutos, segundos, etc. digitando d04.
                                            LocalDate pastWeekLocalDate = d04.minusDays(7); //subtrai 7 dias da data
                                                    LocalDate nextWeekLocalDate = d04.plusDays(7); //adiciona 7 dias na data

                                                            System.out.println("Uma semana atrás: " + pastWeekLocalDate); 
                                                                    System.out.println("Uma semana depois: " + nextWeekLocalDate);

                                                                            LocalDateTime pastWeekLocalDateTime = d05.minusDays(7); //subtrai 7 dias da data e hora
                                                                                    LocalDateTime nextWeekLocalDateTime = d05.plusDays(7); //ad

                                                                                            System.out.println("Uma semana atrás: " + pastWeekLocalDateTime);
                                                                                                    System.out.println("Uma semana depois: " + nextWeekLocalDateTime);

                                                                                                            //para instant, é necessário usar chronoUnit para especificar a unidade de tempo
                                                                                                                    Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
                                                                                                                            Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

                                                                                                                                    System.out.println("Uma semana atrás: " + pastWeekInstant);
                                                                                                                                            System.out.println("Uma semana depois: " + nextWeekInstant);

                                                                                                                                                    //como descobrir a duração entre duas datas?
                                                                                                                                                            //importar a biblioteca Duration
                                                                                                                                                                    Duration t1 = Duration.between(pastWeekLocalDateTime, d05); //duração entre duas datas e horas

                                                                                                                                                                            // desse jeito não da certo calcular a diferença entre dois local date, tem que transformar para localDateTime:
                                                                                                                                                                                    //Duration t2 = Duration.between(pastWeekLocalDate, d04);
                                                                                                                                                                                            Duration t2 = Duration.between(pastWeekLocalDate.atTime(0, 0), d04.atTime(0, 0)); 
                                                                                                                                                                                                    //ou
                                                                                                                                                                                                            t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());

                                                                                                                                                                                                                    Duration t3 = Duration.between(pastWeekInstant, d06); //duração entre duas datas e horas com instant
                                                                                                                                                                                                                            Duration t4 = Duration.between(d06, pastWeekInstant); //teste de fazer uma data mais antiga e depois uma data mais a frente. imprime diferença negativa

                                                                                                                                                                                                                                    System.out.println("Duração entre as duas datas: " + t1.toDays() + "dias"); 
                                                                                                                                                                                                                                            System.out.println("Duração entre as duas datas: " + t2.toDays() + "dias");
                                                                                                                                                                                                                                                    System.out.println("Duração entre as duas datas: " + t3.toDays() + "dias");
                                                                                                                                                                                                                                                            System.out.println("Duração entre as duas datas: " + t4.toDays() + "dias");
                                                                                                                                                                                                                                                                    
                                                                                                                                                                                                                                                                        } 
                                                                                                                                                                                                                                                                        }
