package lesson1;

public class Human implements Actionable{

    private int run;
    private int jump;

    public Human(int run, int jump){
     this.jump = jump;
      this.run = run;
    }

    @Override
    public boolean jump(int dist) {
        if (dist <= jump) {
            System.out.println("human jump " + dist + " m");
        } else {
            System.out.println("human not jump " + dist + " m");
        }
        return false;
    }

    @Override
    public boolean run(int dist) {
      //  System.out.println("Human run " + dist + " m");
        return false;
    }


   }

