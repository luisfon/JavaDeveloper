package basicos;


public class Cadenas
{

    public static void main(String []arg)
    {
        //1.-SECUENCIAS DE ESCAPES( print,println,\n,\t)

        //no hay espacios entre cada palabra

        System.out.print("mi codigo");
        System.out.print("en java");
        System.out.println("me gusta");
        System.out.println("-----------------");

       //el mismo codigo pero con println marcando asi los espacios

        System.out.println("mi codigo");
        System.out.println("en java");
        System.out.println("me gusta");
        System.out.println("-----------------");

        //otra manera de dar espacios es con el simbolo \n

        System.out.print("mi codigo\n");
        System.out.print("en java\n");
        System.out.print("me gusta\n");
        System.out.print("-----------------\n");

        //anotar todo en una sola linea

        System.out.print("mi codigo\nen java\nme gusta\n");

        System.out.println("-------------------\n");

        //asignamos espacio con tabulador
        System.out.print("luis\t");
        System.out.print("luis\t");

        System.out.print("\n");

        System.out.println("----------------------\n");

        //imprime texto entre comillas ("hola") \"

        System.out.println("mi nombre es:\"luis\" ");

        System.out.println("------------------------\n");

        //printf->datos con formato (%s es para string)

        System.out.printf("%s\n%s\n",
                "mi primer","hola mundo en java");


        /*

\n -----> Nueva Linea.
\t -----> Tabulador.
\r -----> Retroceso de Carro(teclea enter).
\f -----> siguiente de Pagina.
\b -----> Borrado a la Izquierda.
\\ -----> El carácter barra inversa ( \ ).
\' -----> El carácter prima simple ( ' ).
\" -----> El carácter prima doble o bi-prima ( " ).

         */


    }

}
