


class ReturnKey{

    // void Does not return anything, int,String,etc... Should return something.

    String GetName(){
        return "VP";
    }

    int Add(int v, int p){
        return v+p;
    }

    static void WithStatic(){
        System.out.println("Function With Static");
    }

    public static void main(String[] args){ // Main Function Start Here

        ReturnKey obj1 = new ReturnKey();
        
        String Name = obj1.GetName();
        System.out.println(Name);

        int VP = obj1.Add(4,8);
        System.out.println(VP);

        System.out.println(obj1.Add(4,8));

        WithStatic();
    }
}