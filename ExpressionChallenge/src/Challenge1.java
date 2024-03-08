public class Challenge1 {
    public static void main(String[] args) {
        checkNumber(10);
        printConversion(10.25);
        printConversion(1.5);
        printMegabytesAndKiloBytes(2500);
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(isLeapYear(8989));
    }

    public static void checkNumber(int n){
        String str;

        if(n>0) {
            str = "positive";
        }
        else if(n<0) {
            str = "negative";
        }
        else {
            str = "zero";
        }

        System.out.println(str);
    }

    public static long toMilesPerHour(double n){
        long x = Math.round(n/1.609);

        return x;
    }

    public static void printConversion(double n){
        System.out.println(n+ "km/h = "+toMilesPerHour(n)+" mi/h");
    }

    public static void printMegabytesAndKiloBytes(int n){
        System.out.println(n+" KB = "+n/1024+" MB and "+n%1024+" KB");
    }

    public static boolean shouldWakeUp(boolean isWake, int hour){
        if(hour<0||hour>23)return false;
        else if(!isWake)return false;
        else if(hour>=8&&hour<=22) return false;
        else {
            return true;
        }
    }

    public static boolean isLeapYear(int n){

        if(n<1||n>9999)return false;
        if(n%400==0)return true;
        if(n%100==0)return false;
        if(n%4==0)return true;
        else return false;

    }

    public static double round(double n, int place){
        if(place<0)throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, place);
        n = n*factor;
        long tmp = Math.round(n);
        return (double)tmp/factor;

    }
    public static boolean areEqualByThreeDecimalPlaces(double a, double b){
        a =round(a, 3);
        b =round(b, 3);

        return a == b;

    }

    public static boolean hasEqualSum(int a, int b, int c){
        if(a+b==c){
            return true;
        }
        else return false;
    }

    public static boolean isTeen(int n){
        if(n<=19&&n>=13)return true;
        else return false;
    }

    public static boolean hasTeen(int a,int b, int c){
        if(isTeen(a)||isTeen(b)||isTeen(c)) return true;
        else return false;
    }
}
