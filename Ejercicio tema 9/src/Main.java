public class Main {
    public static void main(String[] args) {
        Cliente Comprador = new Cliente();
        Comprador.credito = 100;
        Comprador.Nombre = "Alex";
        Comprador.Telefono = 300;
        Comprador.Edad = 22;
        System.out.println("sr " + Comprador.Nombre + " su telefono es: " + Comprador.Telefono + " su edad es: " + Comprador.Edad + " y su credito es de $" + Comprador.credito);

        Trabajador Vendedor = new Trabajador();
        Vendedor.Salario = 200;
        Vendedor.Edad = 25;
        Vendedor.Telefono = 301;
        Vendedor.Nombre = "Juan";
        System.out.println("Sr " + Vendedor.Nombre + " su telefono es: " + Vendedor.Telefono + " su edad es: " + Vendedor.Edad + " y su salario es de $" + Vendedor.Salario);
    }

}

class Persona {
    int Edad;
    String Nombre;
    int Telefono;
}

class Cliente extends Persona {
    int credito;
}
class Trabajador extends Persona {
    int Salario;
}