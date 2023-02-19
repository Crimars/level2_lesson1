package lesson1;

public class Human implements Actionable{

    private int run = 10;
    private int jump = 3;

    public Human(int run, int jump){
     this.jump = jump;
      this.run = run;
    }

    @Override
    public void jump(int dist) {
        if (dist <= jump) {
            System.out.println("human jump " + dist + " m");
        } else {
            System.out.println("human not jump " + dist + " m");
        }
    }

    @Override
    public void run(int dist) {
      //  System.out.println("Human run " + dist + " m");
    }


   }

