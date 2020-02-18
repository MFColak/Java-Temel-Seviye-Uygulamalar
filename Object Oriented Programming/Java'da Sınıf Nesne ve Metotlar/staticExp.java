import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

class timeShow{
	public int liste;
	public static String dateTime(Timestamp ts) {
		Date date=new Date(ts.getTime());
		String format="dd/MM/YYYY - [hh:mm]";
		SimpleDateFormat sdf=new SimpleDateFormat(format);
		return sdf.format(date);
	}
}
public class staticExp {
	public static void main(String[] args) {
		Date dt=new Date();
		Timestamp ts=new Timestamp(dt.getTime());
		String result=timeShow.dateTime(ts);//Nesne yaratmadan metodu kullandýk
		System.out.println(ts);
		System.out.println(result);
	}
}
