//5번
import java.util.Calendar;

public class Q5 {
    public static void printCalender(String time,Calendar cal){
        int hourOfDay=cal.get(Calendar.HOUR_OF_DAY);
        int minute=cal.get(Calendar.MINUTE);
        System.out.println(time+hourOfDay+"시 "+minute+"분입니다.");
    }
    public static void printString(Calendar cal){
        int hourOfDay=cal.get(Calendar.HOUR_OF_DAY);
        if(Calendar.HOUR_OF_DAY>=4&&Calendar.HOUR_OF_DAY<=12&&Calendar.MINUTE<=0)
            System.out.println("Good Morning");
        else if(Calendar.HOUR_OF_DAY<=18)
            System.out.println("Good Afternoon");
        else if(Calendar.HOUR_OF_DAY<=22)
            System.out.println("Good Evening");
        else
            System.out.println("Good Night");

    }
    public static void main(String[] args){
        Calendar now =Calendar.getInstance(); //캘린더 객체 생성
        printCalender("현재 시간은 ", now);
        printString(now);
    }

}
