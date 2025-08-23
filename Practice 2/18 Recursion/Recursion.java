
class Recursion{
    static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args){
        System.out.println("Recursion");
        int VP = 5;
        System.out.print("Factorial Of "+VP+" Is : "+fact(VP));
    }
}