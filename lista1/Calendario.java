package lista1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Calendario {
    private ArrayList<Holidays> feriados;

    // Construtor
    public Calendario() {
        this.feriados = new ArrayList<>();
        inicializarFeriados();
    }

    private void inicializarFeriados() {
        try {
            feriados.add(new Holidays("Confraternização Mundial", new SimpleDateFormat("dd-MM-yyyy").parse("01-01-2024")));
            feriados.add(new Holidays("Carnaval", new SimpleDateFormat("dd-MM-yyyy").parse("12-02-2024")));
            feriados.add(new Holidays("Sexta-feira Santa", new SimpleDateFormat("dd-MM-yyyy").parse("29-03-2024")));
            feriados.add(new Holidays("Tiradentes", new SimpleDateFormat("dd-MM-yyyy").parse("21-04-2024")));
            feriados.add(new Holidays("Dia do trabalho", new SimpleDateFormat("dd-MM-yyyy").parse("01-05-2024")));
            feriados.add(new Holidays("Corpus Christi", new SimpleDateFormat("dd-MM-yyyy").parse("30-05-2024")));
            feriados.add(new Holidays("Independência do Brasil", new SimpleDateFormat("dd-MM-yyyy").parse("07-09-2024")));
            feriados.add(new Holidays("Nossa Senhora Aparecida", new SimpleDateFormat("dd-MM-yyyy").parse("12-10-2024")));
            feriados.add(new Holidays("Finados", new SimpleDateFormat("dd-MM-yyyy").parse("02-11-2024")));
            feriados.add(new Holidays("Proclamação da república", new SimpleDateFormat("dd-MM-yyyy").parse("15-11-2024")));
            feriados.add(new Holidays("Consciência Negra", new SimpleDateFormat("dd-MM-yyyy").parse("20-11-2024")));
            feriados.add(new Holidays("Natal", new SimpleDateFormat("dd-MM-yyyy").parse("25-12-2024")));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void imprimirListaFeriados() {
        System.out.println("Lista de Feriados:");
        for (Holidays feriado : feriados) {
            System.out.println(feriado);
        }
    }

    public String verificaFeriado(String dataString){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date data = sdf.parse(dataString);
            for(Holidays feriado: feriados){
            if(feriado.getData().equals(data)){
                return "Dia " + sdf.format(data) + " é " + feriado.getHoliday() + "! 🎉";
            }
            }
        return "Dia " + sdf.format(data) + " não é feriado 🥲";
        } catch (Exception e) {
            e.printStackTrace();
            return "Formato de data inválido";
        }
    }

}