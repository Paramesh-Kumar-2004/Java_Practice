
class Animal{
    String DefaultName = "Default";
    public String PublicName = "Public";
    protected String ProtectedName = "Protected";
    private String PrivateName = "Private";

    void PrivateDisplay(){
        System.out.println("Private Display In Side The Class : \nName : "+PrivateName);
    }
}


class AccessModifiers{
    public static void main(String args[]){
        System.out.println("\nAccess Modifiers\n");
        System.out.println("Public : Access From Anywhere");
        System.out.println("Private : Can Be Accessed Only Inside The Class.");
        System.out.println("Protected : \n1. Accesible within the same packages. \n2. It is accessible from other package only throuh a subclass\n");
        

        Animal obj1 = new Animal();
        obj1.PrivateDisplay();
        System.out.println("Name : "+obj1.ProtectedName);
        System.out.println("Name : "+obj1.DefaultName);
    }
}