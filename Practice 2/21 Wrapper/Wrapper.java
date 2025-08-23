
class Wrapper{
    public static void main(String[] args){

        System.out.println("Wrapper");
        String VP = "2004";

        int PV = Integer.parseInt(VP);

        System.out.println("After Parse  : "+(PV+0));
        System.out.println("Before Parse : "+(VP+0));

    }
}