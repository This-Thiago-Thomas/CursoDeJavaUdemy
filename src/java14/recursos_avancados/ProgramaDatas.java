package java14.recursos_avancados;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

//Datas
public class ProgramaDatas {
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje); //Formato ISO (Internacional)

        LocalDate ano_novo = LocalDate.of(2020, Month.JANUARY, 1);
        System.out.println(ano_novo); //Formato Iso (Internacional)

        int ano = ano_novo.getYear();
        Month mes = ano_novo.getMonth();
        int dia = ano_novo.getDayOfMonth();

        System.out.println("O ano novo será em "+dia+" do "+mes+" de "+ano);
        System.out.println("Hoje é dia "+hoje.getDayOfMonth()+" do "+hoje.getMonthValue()+" de "+hoje.getYear());

        Period periodo = Period.between(hoje, ano_novo);
        System.out.println(periodo);

        System.out.println("Faltam "+periodo.getMonths()+" meses e "+periodo.getDays()+" dias para o ano novo");

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyy");
        System.out.println(hoje.format(formatador));

        LocalDateTime agora = LocalDateTime.now();

        System.out.println(agora);//Formato ISO (Internacional)

        DateTimeFormatter formatador_horas = DateTimeFormatter.ofPattern("hh:mm:ss");

        String horaAtual = agora.format(formatador_horas);
        System.out.println("Hora certa, Hora certa!! Agora são "+horaAtual);

        LocalTime intervalo = LocalTime.of(9, 30);
        System.out.println("A hora do recreio é "+intervalo);



    }
}
