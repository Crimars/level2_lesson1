package lesson1;

public class Robot  implements Actionable {

    private int run;
    private int jump;

    public Robot(int run, int jump) {
        this.jump = jump;
        this.run = run;
    }

    @Override
    public boolean jump(int dist) {
        if (dist <= jump) {
            System.out.println("robot jump " + dist + " m");
        } else {
            System.out.println("robot not jump " + dist + " m");
        }
        return false;
    }

        @Override
        public boolean run(int dist){
            if (dist <= run) {
                System.out.println("robot run " + dist + " m");
            } else {
                System.out.println("robot not run " + dist + " m");
            }


            return false;
        }
    }
