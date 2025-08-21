

class For_Each{
    public static void main(String[] args){
        System.out.println("For Each Loop");
        int VP[] = {1,4,3,8,2004};

        System.out.print("\nInterger : ");
        for(int i : VP){
            System.out.print(i+" ");
        }

        String PV[] = {"VP","PV","VV","PP"};
        System.out.print("\nString   : ");
        for(String i : PV){
            System.out.print(i+" ");
        }
    }
}
