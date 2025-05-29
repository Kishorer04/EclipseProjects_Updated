package Common_Package;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Calendar {

	public static void main(String[] args) throws ParseException {
		String dat="21/02/2023";
		System.out.println(dat);
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");

		Date d=sdf.parse(dat);
		System.out.println(d);
		
	}

}
