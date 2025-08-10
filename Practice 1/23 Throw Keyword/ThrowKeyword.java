import java.util.Scanner;
// Enga Ellam Error Throw aaganumnu Naama Ninaikkarooma Anga throw use agum
// Where Ever We Want To Throw In tHe Code That Time The "throw" Keyword will help us.


class ThrowKeyword{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int Age = 0;

        try{
            System.out.print("Ener Your Age : ");
            Age = input.nextInt();
            if(Age>=1){
                System.out.println("User Age : "+Age);
            }
            else{
                throw new Exception("\nAge Does Not Accept Nagative Values");
            }
        }
        catch(Exception e){
            System.out.println("Error : "+e);
        }
    }
}