//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("jperez", "jperez@correo.com");
        Usuario u2 = new Usuario("mgomez", "mgomez@correo.com");
        Usuario u3 = new Usuario("cluna", "cluna@correo.com");
        Usuario u4 = new Usuario("rvera", "rvera@correo.com");

        u1.mostrarInfo();
        u2.mostrarInfo();
        u3.mostrarInfo();
        u4.mostrarInfo();

        System.out.println("Total de usuarios: " + Usuario.getTotalUsuarios());
    }
}
