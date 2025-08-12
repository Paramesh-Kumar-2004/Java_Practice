import java.io.FileWriter;

// FileWriter Library Is Checked Error. (Default)
// We Should Handle The Errors.(try,catch)


class Write{

    public static void main(String[] args){
        
        try{
            // For Normal Text File
            FileWriter fw = new FileWriter("Output.txt",true);
            fw.write("VP\n\n");
            fw.write("The Text Was Written By Java, FileWriter...");
            fw.append(" Testing Append\n\n"); // Append Means in Object we should means true
            
            // // For Python File
            // FileWriter fw = new FileWriter("Print.py");
            // fw.write("vp = 'VP'\n\n");
            // fw.write("print(vp)");

            fw.close();
            System.out.println("Success");
        }
        catch(Exception e){
            System.out.println("Error : "+e);
        }
    }
}