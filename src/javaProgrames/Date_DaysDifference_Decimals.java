package javaProgrames;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class Date_DaysDifference_Decimals {
	private static double sla = 30;
	static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public static void main(String[] args) throws ParseException {

		String crte_timeStamp = "2021-04-12 09:03:29.758";
		String close_timeStamp = "2021-04-30 09:24:20.4";

		// getDiffOfDaysRemainingInDecimals(crte_timeStamp, close_timeStamp);

		System.out.println("--------------------------------------------");

		String cstCurrentTime = getCurrentCSTTime();
		String review_timeStamp = "2021-04-15 02:16:06.161";
		getDiffOfDaysRemainingInDecimals(review_timeStamp, cstCurrentTime);
	}

	public static void getDiffOfDaysRemainingInDecimals(String dateStart, String dateEnd) throws ParseException {

		Date d1 = null;
		Date d2 = null;
		d1 = format.parse(dateStart);
		d2 = format.parse(dateEnd);

		long duration = d2.getTime() - d1.getTime();
		long actseconds = TimeUnit.MILLISECONDS.toSeconds(duration);

		double days = TimeUnit.SECONDS.toDays(actseconds);

		double expseconds = days * 86400;

		days += (actseconds - expseconds) / 86400;
		String daysInDecimals = String.format("%.3f", days);
		String daysRemaining = String.format("%.3f", (sla - Double.valueOf(days)));

		System.out.println("End Date	:" + dateEnd);
		System.out.println("Start Date 	:" + dateStart);
		System.out.println("Days To Process	:" + daysInDecimals);
		System.out.println("Days Remaining	:" + daysRemaining);
	}

	public static String getCurrentCSTTime() {
		// To CST
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
//		cal.set(Calendar.HOUR_OF_DAY, 0);
//		cal.set(Calendar.MINUTE, 0);
//		cal.set(Calendar.SECOND, 0);
		TimeZone cst = TimeZone.getTimeZone("CST");
		sdf2.setTimeZone(cst);
		System.out.println(sdf2.format(cal.getTime()));
		return sdf2.format(cal.getTime());

	}
}
