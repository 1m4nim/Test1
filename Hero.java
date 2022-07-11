public class Hero{
    String name;
    int hp;
    
    public void sleep(){
        this.hp += 3;
        System.out.println(this.name + "は眠って回復した！");
    }
    public void attack(){
        System.out.println(this.name + "は攻撃した！");
    } 
    public void run(){
        System.out.println(this.name +"は逃げた！");
        System.out.println(this.name + "の最終HPは" + this.hp + "でした");
    }

    public void damage(){
        this.hp -= 10;
        System.out.println(this.name + "は攻撃された！");
    }
}