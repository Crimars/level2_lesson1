package lesson1;
/*1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
   Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
   2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять
   соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль
   (успешно пробежал, не смог пробежать и т.д.).
    3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.*/
public class Main {
    public static void main(String[] args) {
        Actionable[] action = {
                new Human(6, 12),
                new Cat(2, 10),
                new Robot(1, 25)
        };
        Obstacles[] obstacles ={
                new Wall(12),
                new Track(35)
        };
        for (Actionable a : action){
            for (Obstacles b : obstacles) {
            if (b.makeIt(a));
            break;
            }
        }
    }
}


        /*for (Actionable a : action){
            a.jump();
            a.run();*/


        /*Human human = new Human();
        testRun(human, 5);

        Cat cat = new Cat();
        testRun(cat, 15);

        Robot robot = new Robot();
        testRun(robot,0 );



        public static void testRun(Actionable b, int dist){
            b.run(dist);*/


