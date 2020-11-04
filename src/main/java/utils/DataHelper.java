package utils;


import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;

public class DataHelper {

    private DateTime data;
    private DateTimeFormatter fmt;

    public DataHelper(){
        this.data = new DateTime();
    }

    public String getDataAtualBr(){
        fmt = DateTimeFormat.forPattern("dd/MM/yyyy");
        return fmt.print(data);
    }
}
