package coreconcepts;

import java.util.*;
import java.text.*;
import java.sql.Timestamp;

public class DateToTimestamp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String from_date = "11-06-2007";
			String to_date = "11-06-2045";
			DateFormat formatter;
			Date d1, d2;

			formatter = new SimpleDateFormat("dd-MM-yyyy");
			d1 = (Date) formatter.parse(from_date);
			d2 = (Date) formatter.parse(to_date);

			java.sql.Timestamp fromTimeStampDate = new Timestamp(d1.getTime());
			System.out.println("Today is fromTimeStampDate 	: "
					+ fromTimeStampDate);

			d2.setHours(23);
			d2.setMinutes(59);
			d2.setSeconds(59);
			java.sql.Timestamp toTimeStampDate = new Timestamp(d2.getTime());
			System.out.println("Today is toTimeStampDate	:" + toTimeStampDate);

		} catch (ParseException e) {
			System.out.println("Exception :" + e);
		}

	}
}
