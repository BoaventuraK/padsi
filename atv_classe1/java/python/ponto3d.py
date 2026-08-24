from ponto import Ponto

class Ponto3D(Ponto):
    def __init__(self, x=0, y=0, z=0):
        super().__init__(int(x), int(y))
        self.z = z

    def get_z(self):
        return self.z

    def set_z(self, z: int):
        self.z = z