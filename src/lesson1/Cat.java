package lesson1;

public class Cat implements Actionable{
    private int run;
    private int jump;

    public Cat(int run, int jump){
        this.jump = jump;
        this.run = run;}


    @Override
    public boolean jump(int dist) {
            if (dist <= jump) {
                System.out.println("cat jump " + dist + " m");
            } else {
                System.out.println("cat not jump " + dist + " m");
            }
        return false;
    }

    @Override
    public boolean run(int dist) {
        if (dist <= run) {
            System.out.println("cat run " + dist + " m");
        } else {
            System.out.println("cat not run " + dist + " m");
    }
        return false;
    }
}
