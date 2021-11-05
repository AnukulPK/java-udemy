public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Anukul");

        int myFirstNumber = (10+5)+(2*10);
        int mySecondNumber = 12;
        int myThirdNumber = 6;
        int myTotal = myFirstNumber+mySecondNumber+myThirdNumber;
        int myLastOne = 1000-myTotal;
        System.out.println(myLastOne);
    }

    public static boolean isLeapYear(int year){
        if(year>=1 && year<=9999){
            if(year%4==0 && (year%100==0) && (year%400==0)){
                return true;
            }else{
                return false;
            }
        }else return false;

    }
}
