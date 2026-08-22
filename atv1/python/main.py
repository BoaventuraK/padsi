from Login import Login
from LoginEspecial import LoginEspecial

def main():

    login = Login('eduardo', '123')

    login_especial = LoginEspecial('kauan', '132', 'primeiros numeros')

    print(login.verificalogin('carlos', '123'))
    print(login_especial.getDica())

if __name__ == "__main__":
    main()