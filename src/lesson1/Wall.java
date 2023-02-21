package lesson1;

public class Wall implements Obstacles {
    private int heigth;
    public Wall(int heigth){
        this.heigth = heigth;
    }

    @Override
    public boolean makeIt(Actionable a) {
        return a.jump(heigth);
    }
}

