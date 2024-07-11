import java.util.*;
public class dataFormet {

	public static void main(String[] args) {
		Locale locale = new Locale("fr", "FR");
		dataFormat dateFormat = dateFormat.getDateInstance(dateFormat.DEFAULT, locale);
		String date = dateFormat.format(new Date());
		System.out.print(date);
	}

}
