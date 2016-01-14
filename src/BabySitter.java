
public class BabySitter {

    private final int startToBedtimeHourPay = 12;
    private final int bedtimeToMidnightPay = 8;
    private final int midnightToEndOfShiftPay = 16;
    int startTime =0;
    int endTime = 0;
    int bedTime = 0;

    public BabySitter(int start, int end, int sleep){
        startTime = start;
        endTime = end;
        bedTime = sleep;
    }



    public int moneyEarnedForShift(){
        int totalPay = 0;
        int hourly = 0;

        if(checkStartTime(startTime, endTime) && checkEndTime(startTime, endTime)){

        }
        else{
            System.out.println("bad values entered");
            return 0;
        }


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
        System.out.println("your total pay is: $" + totalPay);
        return totalPay;
    }


    private boolean checkStartTime(int start, int end){
        if(start > 4 && start < end){
            return true;
        }
        else{
            return false;
        }
    }

    private boolean checkEndTime(int start, int end){
        if(end <= 16 && end > start){
            return true;
        }
        else{
            return false;
        }
    }

}
