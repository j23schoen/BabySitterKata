/*
Full description for this program can be found at https://gist.github.com/jameskbride/5482722
 */
public class BabySitter {

    private final int startToBedtimeHourPay = 12;
    private final int bedtimeToMidnightPay = 8;
    private final int midnightToEndOfShiftPay = 16;
    int startTime =0;
    int endTime = 0;
    int bedTime = 0;

    //constructor method called to instantiate the variables to the paramaters passed in from babySitterTests
    public BabySitter(int start, int end, int sleep){
        startTime = start;
        endTime = end;
        bedTime = sleep;
    }



    public int moneyEarnedForShift(){
        int totalPay = 0;
        int hourly = 0;

        //this if else statement calls two methods to check that the startTime is not before 5 and that the
        //endTime is not after 16(4am)
        if(checkStartTime(startTime, endTime) && checkEndTime(startTime, endTime)){

        }
        else{
            System.out.println("bad values entered");
            return 0;
        }

        //this for loop initializes currentTime to startTime initially, then the currentTime increments by 1 hour
        //each time through the loop to add the correct dollar amount to the total pay
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

    //checkStartTime checks to make sure the startTime is greater than 5 and less than the endTime
    private boolean checkStartTime(int start, int end){

        if(start > 4 && start < end){
            return true;
        }
        else{
            return false;
        }
    }

    //checkEndTime checks to make sure the end time is greater than the start time and less than or equal to 16
    private boolean checkEndTime(int start, int end){

        if(end <= 16 && end > start){
            return true;
        }
        else{
            return false;
        }
    }

}
