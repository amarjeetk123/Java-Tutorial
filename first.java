class first{
    public static void main (String args[]){
        fun();
      second r = new second();
      r.fun2(10,20);
    }

    public static void fun(){
        System.out.println("Amarjeet Kumar");
    }
}

class second{
    void fun2(int a, int b){
        System.out.println("Samarth Kumar");
        System.out.println(a+b);
        
    }
}