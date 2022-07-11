public class Matango{
    int hp;
    String name;

    public void attack(){
        System.out.println(this.name + "が攻撃してきた！");
    }
    public void magic(){
        System.out.println(this.name + "は魔法の粉をかけてきた！");
    }
    public void run(){
        System.out.println(this.name + "は逃げた！");
    }
    public void damage(){
        this.hp -= 20;
        System.out.println(this.name + "は攻撃された！");
    }
}