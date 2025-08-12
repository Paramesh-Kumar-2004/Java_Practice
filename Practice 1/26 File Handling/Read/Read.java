import java.io.FileReader;


// FileReader : It read letter by letter in int format. Ending -1, it means all letters are over, no more letters
// BufferReader : It read line by line in String format. Ending null,  it means all lines are over, no more lines



class Read{
    public static void main(String[] args){

        try{
            FileReader fs = new FileReader("Output.txt");
            // int c = fs.read();
            // System.out.println((char)c+" "+c);
            // c = fs.read();
            // System.out.println((char)c+" "+c);
            // // etc.... upto -1 
            
            int c = fs.read();
            while(c != -1){
                System.out.print((char)c);
                c = fs.read();
            }
            fs.close();
        }
        catch(Exception e){
            System.out.println("Error : "+e);
        }

    }
}