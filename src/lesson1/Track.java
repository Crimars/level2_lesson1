package lesson1;

public class Track implements Obstacles {
private int dist;
public Track(int dist){
    this.dist = dist;
}

   @Override
    public boolean makeIt(Actionable a) {
        return a.run(dist);
    }
}
