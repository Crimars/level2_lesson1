package lesson1;

public class Robot  implements Actionable {

    private int run = 20;
    private int jump = 8;

    public Robot(int run, int jump) {
        this.jump = jump;
        this.run = run;
    }

    @Override
    public void jump(int dist) {
        if (dist <= jump) {
            System.out.println("robot jump " + dist + " m");
        } else {
            System.out.println("robot not jump " + dist + " m");
        }
    }

        @Override
        public void run( int dist){
            if (dist <= run) {
                System.out.println("robot run " + dist + " m");
            } else {
                System.out.println("robot not run " + dist + " m");
            }


        }
    }
