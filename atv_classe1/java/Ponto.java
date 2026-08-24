package atv_classe1.java;

public class Ponto {
    protected int x;
    protected int y;

    public Ponto(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Ponto() {
        this(0, 0);
    }

    public Ponto(int x) {
        this(x, 0);
    }

    public int getX(){
        return this.x;
    }

    public int gety(){
        return this.y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public String toString(){
        return String.format("X: %d, Y: %d", x, y);
    }

}
