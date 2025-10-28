class sample1{
    sample1(){
        System.out.println("Constructor of sample1");
    }
    void display(){
        System.out.println("suji");
    }
}

class sample2 extends sample1{
    sample2(){
        // super();
        System.out.println("Constructor of sample2");
        super.display();
    }
}

class sample{
    public static void main(String args[]){
        // sample1 s=new sample1();
        // s.display();
        sample2 s2 = new sample2();
    }
}