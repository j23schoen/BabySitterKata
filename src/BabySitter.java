
public class BabySitter {

    private final int startToBedtimeHourPay = 12;
    private final int bedtimeToMidnightPay = 8;
    private final int midnightToEndOfShiftPay = 16;

    public int moneyEarnedForShift(int startTime, int endTime, int bedTime){
        int totalPay = 0;
        int hourly = 0;

        for( int currentTime = startTime; currentTime < endTime; currentTime ++){
            if(currentTime < bedTime){
                System.out.println("hourly:" + startToBedtimeHourPay);
                System.out.println(totalPay);
                hourly = startToBedtimeHourPay;
            }
            else if(currentTime >= bedTime && currentTime < 12){
                System.out.println("hourly:" + bedtimeToMidnightPay);
                System.out.println(totalPay);
                hourly = bedtimeToMidnightPay;
            }
            else{
                System.out.println("hourly:" + midnightToEndOfShiftPay);
                System.out.println(totalPay);
                hourly = midnightToEndOfShiftPay;
            }

            totalPay += hourly;
            hourly = 0;
        }


        return totalPay;
    }

}
