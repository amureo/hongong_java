package sec02.verify.exam02;

import java.util.Calendar;

public class Example {
	public static void main(String[] args) {
		Calendar now=Calendar.getInstance();

		int year=now.get(Calendar.YEAR);
		int month=now.get(Calendar.MONTH)+1;
		String strMonth=(month<10)?("0"+month):(""+month);
		int day=now.get(Calendar.DAY_OF_MONTH);
		String strDay=(day<10)?("0"+day):(""+day);

		int week=now.get(Calendar.DAY_OF_WEEK);
		String strWeek=null;
		switch(week) {
		case Calendar.MONDAY:
			strWeek="월";
			break;
		case Calendar.TUESDAY:
			strWeek="화";
			break;
		case Calendar.WEDNESDAY:
			strWeek="수";
			break;
		case Calendar.THURSDAY:
			strWeek="목";
			break;
		case Calendar.FRIDAY:
			strWeek="금";
			break;
		case Calendar.SATURDAY:
			strWeek="토";
			break;
		case Calendar.SUNDAY:
			strWeek="일";
			break;
		}

		int hour=now.get(Calendar.HOUR);
		String strHour=(hour<10)?("0"+hour):(""+hour);
		int minute=now.get(Calendar.MINUTE);
		String strMinute=(minute<10)?("0"+minute):(""+minute);

		System.out.print(year+"년 ");
		System.out.print(month+"월 ");
		System.out.print(day+"일 ");
		System.out.print(strWeek+"요일 ");
		System.out.print(hour+"시 ");
		System.out.print(minute+"분 ");
	}
}
