public class Main {

    public static void main(String[] args) {
        Fighter f1=new Fighter("A", 10, 85, 100, 50);
        Fighter f2=new Fighter("B", 10, 85, 85, 50);

        Match m1=new Match(f1, f2, 85, 100);
        double chance=Math.random();
        if(chance<0.51){
            m1.run1();
        }
        else{
            m1.run2();
        }
    }
}
//www.patika.dev
