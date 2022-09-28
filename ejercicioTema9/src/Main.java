//Crea una clase Persona con las siguientes variables:
// La edad
// El nombre
// El teléfono
// Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la
// variable credito solo para esa clase.
// Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre
// y el credito, tienes que darles valor y mostrarlas por pantalla.
// Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable
// salario que solo tenga la clase Trabajador


public class Main {

    public static void main (String[] args){

        Cliente cliente = new Cliente();
                cliente.nombre="Maximiliano Bruna";
                cliente.edad=29;
                cliente.telefono="2612528292";
                cliente.credito= 10000;

                System.out.println(cliente.nombre);
                System.out.println(cliente.edad);
                System.out.println(cliente.telefono);
                System.out.println(cliente.credito);


    }
}


class Persona{
    int edad;
    String nombre;
    String telefono;
}

class Cliente extends Persona{
    int credito;
}
class Trabajador extends Persona{
    int Salario;
}
