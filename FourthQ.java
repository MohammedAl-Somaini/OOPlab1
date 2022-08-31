public class FourthQ {
    public static void main(String[] args) {
        int Initial_Balance=1000;
        double Interest_of_PerYear=0.05;
        int Interest=0;
        int Year=1;
        double SA3Y=0;
     do {
        Interest+=Initial_Balance*Interest_of_PerYear;
        Year++;
        }
     while (Year<4);
        SA3Y=Initial_Balance+Interest;
        System.out.println("The Balance of The Account After 3 Years is "+SA3Y);

        }
}
