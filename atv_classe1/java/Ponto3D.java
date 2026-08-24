package atv_classe1.java;

public class Ponto3D extends Ponto {
    private int z;

    public Ponto3D(int x, int y, int z){
        super(x, y);
        this.z = z;
    }

    int getZ() {
        return this.z;
    }

    void setZ(int z) {
        this.z = z;
    }
}
