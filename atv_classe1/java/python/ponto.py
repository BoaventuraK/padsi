class Ponto():
    def __init__(self, x = 0, y = 0):
        self.x = x
        self. y = y

    def set_x(self, x: int):
        self.x = x

    def get_x(self):
        return self.x

    def set_y(self, y: int):
        self.y = y

    def get_y(self):
        return self.y

    def to_string(self):
        return f"Pontos - X: {self.x}, Y:{self.y}"