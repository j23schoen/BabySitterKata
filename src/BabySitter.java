
public class BabySitter {

    private final int startToBedtimeHourPay = 12;
    private final int bedtimeToMidnightPay = 8;
    private final int midnightToEndOfShiftPay = 16;

    public int moneyEarnedForShift(int startTime, int endTime, int bedTime){
        int totalPay = 0;
        int hourly = 0;

        for( int currentTime = startTime; currentTime < endTime; currentTime ++){
            if(currentTime < bedTime){
                hourly = startToBedtimeHourPay;
                System.out.println(totalPay);
                System.out.println("hourly:" +hourly);
            }
            else if(currentTime >= bedTime && currentTime < 12){
                hourly = bedtimeToMidnightPay;
                System.out.println("hourly:" +hourly);
                System.out.println(totalPay);
            }
            else{
                hourly = midnightToEndOfShiftPay;
            }

            totalPay += hourly;
            hourly = 0;
        }


        return totalPay;
    }

}
