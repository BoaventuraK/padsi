class Login:

    def __init__(self, user, senha):
        self.user = user
        self.senha  = senha

    def getUser(self):
        return self.user

    def getSenha(self):
        return self.senha

    def verificalogin(self, user, senha):
        return self.getSenha == senha and self.getUser == user
 
