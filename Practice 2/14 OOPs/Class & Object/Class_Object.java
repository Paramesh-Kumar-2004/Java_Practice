
class Car{
    String Name = "";
    int VIN = 0;
    int ModelYear = 0;

    Car(String Name, int VIN, int ModelYear){
        this.Name = Name;
        this.VIN = VIN;
        this.ModelYear = ModelYear;
    }
}


class Class_Object{
    public static void main(String[] args){
        System.out.println("Class & Object");

        Car BMW = new Car("Gran Coupe",482004,2004);
        Car BENZ = new Car("S Class",1234,2025);

        System.out.println("BMW Details  : "+BMW.Name+" "+BMW.VIN+" "+BMW.ModelYear);
        System.out.println("BENZ Details : "+BENZ.Name+" "+BENZ.VIN+" "+BENZ.ModelYear);

    }
}