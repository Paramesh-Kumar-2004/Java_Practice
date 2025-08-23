
class Ref{
    public static void main(String[] args){
        String VP1 = "VP";
        String VP2 = "VP";
        // Java "==" Check The Reference.
        String VP3 = new String("VP");
        String VP4 = new String("VP");

        System.out.println(VP1 == VP2);
        System.out.println(VP3 == VP4);
        System.out.println(VP3.equals(VP4));
    }
}