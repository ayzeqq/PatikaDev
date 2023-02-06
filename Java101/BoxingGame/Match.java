public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeigth;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeigth){
        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeigth=maxWeigth;
    }

    void run1(){
        if(isCheck()){
            while(this.f1.health>0 && this.f2.health>0){
                System.out.println("====YENI ROUND====");
                this.f2.health=this.f1.hit(this.f2);
                if(isWin()){
                    break;
                }
                this.f1.health=this.f2.hit(this.f1);
                if(isWin()){
                    break;
                }
                System.out.println(this.f1.name + " SAGLIK= " + this.f1.health);
                System.out.println(this.f2.name + " SAGLIK= " + this.f2.health);

            }
        }
        else{
            System.out.println("Sikletler uyuşmuyor!");
        }
    }

    void run2(){
        if(isCheck()){
            while(this.f1.health>0 && this.f2.health>0){
                System.out.println("====YENI ROUND====");
                this.f1.health=this.f2.hit(this.f1);
                if(isWin()){
                    break;
                }
                this.f2.health=this.f1.hit(this.f2);
                if(isWin()){
                    break;
                }
                System.out.println(this.f1.name + " SAGLIK= " + this.f1.health);
                System.out.println(this.f2.name + " SAGLIK= " + this.f2.health);

            }
        }
        else{
            System.out.println("Sikletler uyuşmuyor!");
        }
    }

    boolean isCheck(){
        return (this.f1.weight>=this.minWeight && this.f1.weight<=this.maxWeigth && this.f2.weight>=this.minWeight && this.f2.weight<=this.maxWeigth);
    }

    boolean isWin(){
        if(this.f1.health==0){
            System.out.println(this.f2.name + " kazandı.");
            return true;
        }
        if(this.f2.health==0){
            System.out.println(this.f1.name + " kazandı.");
            return true;
        }
        return false;
    }
}
