package atv1.java;

public class Main {

    public static void main(String[] args) {
        Login login = new Login("eduardo", "123");

        System.out.println(login.verificaLogin("carlos", "123"));

        LoginEspecial loginEspecial = new LoginEspecial("kauan", "123", "3 primeiros números");

        System.out.println(loginEspecial.getDica());
    }
    
}
