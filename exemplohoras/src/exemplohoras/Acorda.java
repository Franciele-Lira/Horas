package exemplohoras;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

import java.util.Locale;


public class Acorda {
    public static void main(String[] args) {
      
        LocalTime horarioAtual = LocalTime.now();
        LocalDate dataAtual = LocalDate.now();
        
    
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH'h'mm");
        
        DateTimeFormatter data = DateTimeFormatter.ofPattern("dd/MM/yyyy, EEEE", Locale.getDefault());
     
        String horarioFormatado = horarioAtual.format(formatter);
        
        String dataFormatada = dataAtual.format(data);
        
      System.out.println("Acorda, reage, bota o cropped pois jão sao : " + horarioFormatado);
      System.out.println("E hoje ainda é : " + dataFormatada);
    }
}
