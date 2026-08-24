package atv_classe1.java;

public class main {
    public static void main(String[] args) {
        Ponto p = new Ponto();
        System.out.println(String.format("Ponto X: %d y: %d", p.getX(), p.gety()));

        System.out.println(p);
        Ponto p3d = new Ponto3D(1, 2, 3);

        Ponto3D ponto3D = (Ponto3D) p3d;

        System.out.println(String.format("Pontos - X: %d, Y: %d, Z: %d", p3d.getX(), p3d.gety(), ponto3D.getZ()));

        
    }
    
}
