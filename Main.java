public class Main{
    public static void main(String[] args){
        Hero h = new Hero(); //Heroを生み出す
        h.name = "1m4nim";
        h.hp = 100;
       
        Matango m1 = new Matango();//Matangoを生みだす
        m1.hp = 50;
        m1.name = "きのこA";

        Matango m2 = new Matango();
        m2.hp = 30;
        m2.name = "きのこB";

        h.attack();//Heroが戦う
        m1.damage();
        m2.damage();
        m1.run();//きのこAが逃げる
        m2.magic();
        h.sleep();
        m2.attack();
        h.damage();
        m2.run();
        h.run();
    }
}