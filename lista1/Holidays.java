package lista1;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Holidays {
    private Date data;
    private String name;

    public Holidays(String name, Date data){
        this.data = data;
        this.name = name;
    }

    public String getHoliday() {
        return name;
    }

    public Date getData() {
        return data;
    }

    public void setHoliday(String name){
        this.name = name;
    }

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return name + " - " + sdf.format(data);
    }

}

