package lista1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class App {
    
    public static String ex1(int num){

        String pharse = "";
        if(num % 2 == 0){
            pharse = num + " é par";
        } else {
            pharse = num + " é ímpar";
        }

        if(num < 0){
            pharse = pharse + " e negativo";
        } else {
            pharse = pharse + " e positivo";
        }

        return pharse;
    }
    
    public static void ex2(long num){
        long[] array = new long[(int) num];

        array[0] = 0;
        array[1] = 1;

        for(int i = 2; i < num; i++){
            array[i] = array[i-1] + array[i-2];
        }

        for (long element : array) {
            System.out.print(element + " ");
        }

    }
    
    public static void ex3(long num){
        System.out.println("Tabela de multiplicação de " + num);

        for(int i = 0 ; i <=10; i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }

    public static void ex4(long num){
        for(int i = 1 ; i <=5; i++){
            for(int j = 0; j< i; j ++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void ex5(String[] array1, String array2[]) {

        List<String> result = new ArrayList<>();
        
        for(int i = 0; i< array1.length; i++){
            for(int j = 0; j< array2.length; j++){
                if(array1[i] == array2[j]){
                    System.out.println(array1[i]);
                }
            }
        }
    }

    public static void holidays(){
        String[] holidays = {"01-01-2024", "12-02-2024", "13-02-2024", "29-03-2024", "21-04-2024", "01-05-2024", 
        "30-05-2024", "07-09-2024", "12-10-2024", "02-11-2024", "15-11-2024", "20-11-2024", "25-12-2024" };

        for(int i = 0; i < holidays.length; i++){
            System.out.println(holidays[i]);
        }
    }


    public static void main(String[] args) {
        /*  System.out.println(ex1(-5)); */
        /*  ex2(20); */
         /*  ex3(6); */
         /* ex4(5); */
  
          /* String[] array1 = {"Morango", "Banana", "Maçã", "Uva", "Caqui"};
          String[] array2 = {"Manga", "Caqui", "Morango", "Amora"};
         ex5(array1, array2); */
  
         Calendario calendario = new Calendario();
         calendario.imprimirListaFeriados();
        String result =  calendario.verificaFeriado("21-04-2024");
         System.out.println(result);
         
      }
}