
class Vehicle{
    private String type = "";
    private String Name = "";
    private int Model_Year = 0;

    Vehicle(String Name, int Model_Year,String type){
        this.type = type;
        this.Name = Name;
        this.Model_Year = Model_Year;
    }

    void getData(){
        System.out.println("Vehicle Details : ");
        System.out.println("Vehicle type : "+type);
        System.out.println("Vehicle Name : "+Name);
        System.out.println("Model Year   : "+Model_Year);
    }
}

class car extends Vehicle{
    car(String Name,int Model_Year,String type){
        super(Name,Model_Year,type);
    }

    void showDetails(){
        getData();
    }
}

class Single_Inheritance{
    public static void main(String[] args){
        System.out.println("Single Inheritance");
        car car1 = new car("BMW",2004,"Car");
        car1.showDetails();

        car car2 = new car("BENZ",2004,"Car");
        car2.showDetails();


    }
}