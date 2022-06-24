package EX1;

/*Nivell 2
- Exercici 1
Crea una classe anomenada "Entrada". Aquesta classe ha de servir per controlar
les diferents excepcions que poden aparèixer en Java a l’hora d’introduir dades
per teclat utilitzant la classe Scanner.

El primer que s’ha de fer és instanciar un objecte de la classe Scanner i a partir
d’aquí, crear mètodes estàtics per llegir els diferents tipus de dades des del
teclat.

 Important

És important que si en algun mètode salta una excepció, la tractem i tornem a
demanar la dada a l’usuari/ària fins que aquesta estigui ben introduïda.
Per exemple: Si introdueix un float amb un punt en lloc d'amb una coma, ha
de mostrar “Error de format”. Fins que l’usuari/ària no introdueix un float
ben format ha de seguir demanant la dada.

Tots els mètodes reben un String amb el missatge que es vol mostrar a
l’usuari/ària, per exemple: “Introdueix la teva edat”, i retornen la dada
oportuna introduïda per l’usuari/ària en cada mètode, per exemple:
un byte amb l’edat de l’usuari/ària.

Mètodes a implantar capturant l’excepció de la classe InputMismatchException:

public static byte llegirByte(String missatge);

public static int llegirInt(String missatge);

public static float llegirFloat(String missatge);

public static double llegirDouble(String missatge);

Mètodes a implantar capturant l’excepció de la classe Exception:

public static char llegirChar(String missatge);

public static String llegirString(String missatge);

public static boolean llegirSiNo(String missatge), si l’usuari/ària introdueix “s”,
 retorna “true”, si l’usuari introdueix “n”, retorna “false”.
* */

public class App {

    //Instancia de un objeto Entry de manera estática para no tener que pasarlo
    //por parámetro en cada método.
    static Entry entry = new Entry();

    public static void main(String[] args) throws Exception {

        String message = "Introduzca su edad";
        System.out.println("Su edad es " + readByte(message));

        message = "Introduzca el año de su nacimiento";
        System.out.println("El año de su nacimiento es " + readInt(message));

        message = "Introduzca el número PI";
        System.out.println("El número PI es " + readFloat(message));

        message = "Ingrese su peso en kilos incluyendo los gramos";
        System.out.println("Su peso es " + readDouble(message));

        message = "Introduzca una letra o un número";
        System.out.println("Ha escrito " + readChar(message));

        message = "Introduzca su nombre, máximo 10 letras";
        System.out.println("Su nombre es " + readString(message));

        message = "San Juan cae en Junio?, conteste (S/N)";
        System.out.println("Su respuesta es: " + readYesNo(message));


    }
    public static byte readByte(String message) {
        return entry.readByte(message);
    }

    public static int readInt(String message){
        return entry.readInt(message);
    }

    public static float readFloat(String message){
        return entry.readFloat(message);
    }

    public static double readDouble(String message){
       return entry.readDouble(message);
    }

    public static char readChar(String message){
        return entry.readChar(message);
    }

    public static String readString(String message){
        return entry.readString(message);
    }

    public static boolean readYesNo(String message){
        return entry.readYesNo(message);
    }
}
