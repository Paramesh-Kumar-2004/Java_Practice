

class Stack_Implements{
    public static void main(String[] args){
        Stack s1 = new Stack();
        s1.push(3);
        s1.push(1);
        s1.push(4);
        s1.push(8);
        s1.push(2004);
        
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
    }
}