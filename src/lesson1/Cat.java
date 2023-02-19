package lesson1;

public class Cat implements Actionable{
    private int run = 15;
    private int jump = 5;

    public Cat(int run, int jump){
        this.jump = jump;
        this.run = run;}


    @Override
    public void jump(int dist) {
            if (dist <= jump) {
                System.out.println("cat jump " + dist + " m");
            } else {
                System.out.println("cat not jump " + dist + " m");
            }
        }

    @Override
    public void run(int dist) {
        if (dist <= run) {
            System.out.println("cat run " + dist + " m");
        } else {
            System.out.println("cat not run " + dist + " m");
    }
    }
}
