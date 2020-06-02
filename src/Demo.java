import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Demo {
    private String myName;
    private int myAge;
    private String mySex;
    private String myBirth;

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public int getMyAge() {
        return myAge;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

    public String getMySex() {
        return mySex;
    }

    public void setMySex(String mySex) {
        this.mySex = mySex;
    }

    public String getMyBirth() {
        return myBirth;
    }

    public void setMyBirth(String myBirth) {
        this.myBirth = myBirth;
    }

    @Override
    public String toString() {
        return  "myName='" + myName + '\'' +
                ", myAge=" + myAge +
                ", mySex='" + mySex + '\'' +
                ", myBirthday=" + myBirth;
    }

    public static Long diffDays (String curDate, String tarDate){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年mm月dd日");

        Calendar calendar_curDate = Calendar.getInstance();
        Calendar calendar_tarDate = Calendar.getInstance();

        Date date_curDate = null;
        Date date_tarDate = null;

        try{
            date_curDate = simpleDateFormat.parse(curDate);
            date_tarDate = simpleDateFormat.parse(tarDate);
            calendar_curDate.setTime(date_curDate);
            calendar_tarDate.setTime(date_tarDate);
        }catch(ParseException pe){
            pe.printStackTrace();
        }

        long time_curDate = calendar_curDate.getTimeInMillis();
        long time_tarDate = calendar_tarDate.getTimeInMillis();

        long diffDays = (time_curDate - time_tarDate) / (1000 * 3600 * 24);

        return diffDays;
    }

    public static void main(String[] args){
        try {

            Demo joker = new Demo();
            joker.setMyName("joker");
            joker.setMyAge(20);

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年mm月dd日");
            joker.setMyBirth("2000年4月1日");
            Date Date = new Date();
            String curDate = simpleDateFormat.format(Date);
            Long diffDays = diffDays(curDate, joker.getMyBirth());

            joker.setMySex("male");

            boolean flag = true;
            Scanner scanner = new Scanner(System.in);
            while (flag) {
                switch (scanner.nextInt()) {
                    case 1:
                        System.out.print(joker.getMyName());
                        flag = false;
                        break;
                    case 2:
                        System.out.print(joker.getMyAge());
                        flag = false;
                        break;
                    case 3:
                        System.out.print(joker.getMySex());
                        flag = false;
                        break;
                    case 4:
                        System.out.println(joker.getMyBirth());
                        System.out.println("距今你已存在"+ diffDays +"天");
                        flag = false;
                        break;
                    case 5:
                        System.out.print(joker.toString());
                        flag = false;
                        break;
                    default:
                        System.out.println("输入错误，请重新输入");
                        break;
                }
            }
        }catch(RuntimeException re){
            System.out.println("您没有输入一个数字，正在退出...");
            re.printStackTrace();
        }
    }

}
