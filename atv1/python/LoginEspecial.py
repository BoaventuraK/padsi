from Login import Login

class LoginEspecial(Login):
    def __init__(self, user, senha, dica):
        super().__init__(user, senha)
        self.dica = dica

    def getDica(self):
        return 'dica: '+ self.dica