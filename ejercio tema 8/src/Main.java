public class Main {

public static void main (String[] args){

    persona Andres = new persona();
    Andres.SetEdad(18);
    Andres.SetNombre("Andres");
    Andres.SetTelefono(301);

    System.out.println("Mi nombre es: " + Andres.GetNombre());
    System.out.println("Mi edad es: " + Andres.GetEdad());
    System.out.println("Mi numero de telefono es: " + Andres.GetTelefono());


    }

}



class persona {
    private int Edad;
    private String Nombre;
    private int Telefono;



    public void SetEdad (int Edad) {
        this.Edad = Edad;
    }
    public int GetEdad () {
        return this.Edad;
    }

    public void SetNombre (String Nombre){
        this.Nombre = Nombre;
    }
    public String GetNombre () {
        return this.Nombre;
    }
    public void SetTelefono (int Telefono) {
        this.Telefono = Telefono;
    }
    public int GetTelefono () {
        return this.Telefono;
    }

}