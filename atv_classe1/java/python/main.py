from ponto import Ponto
from ponto3d import Ponto3D

def main():
    p = Ponto()
    p3D = Ponto3D(1,2,3)

    print(p.to_string())

    print(f"Ponto 3D - X:{p3D.get_x()}, Y:{p3D.get_y()}, Z:{p3D.get_z()}")

if __name__ == "__main__":
    main()