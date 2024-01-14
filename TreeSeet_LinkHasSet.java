package iee.colecciones;

import java.util.*;

public class TreeSeet_LinkHasSet {
    //conjuntos ordenados TreeSet, mas lento que HashSet, requiere la interfaz comparator
    //LinkedHasSet mantiene el orden de inserción,
    //No aceptan duplicados  TreeSet -- ordenado /7 LinkedHashSet orden de Inserción
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        SortedSet<Integer> numeros = new TreeSet<>();
        Random random = new Random();

        for (int i = 0; i < 7; i++) {
            int numeroAleatorio = random.nextInt(101);
            if (!numeros.contains(numeroAleatorio)) {
                numeros.add(numeroAleatorio);
                System.out.println(numeroAleatorio);
            }
        }
        System.out.println("Números ordenados " + numeros);
        String listado = "Perro Gato león Dinosaurio";
        System.out.println("Listado de nombres :  " + listado);
        Set<String> conjunto = Set.of(listado.split(" "));
        TreeSet<String> nombres = new TreeSet<>(conjunto);
        String primero = nombres.first();
        String ultimo = nombres.last();
        System.out.println("El primer nombre es : " + primero);
        System.out.println("El siguiente nombre es : " + nombres.higher(primero));
        System.out.println("El ultimo nombre es : " + ultimo);
        System.out.println("El anterior nombre es : " + nombres.lower(ultimo));

        System.out.println(nombres);
//LinkedHashSet

        String[] listadoNombres = {"Mario", "Beatríz", "Ines del Alma mía"};
        System.out.println("Listado de nombres : \t\t\t" + Arrays.toString(listadoNombres));
        LinkedHashSet<String> nombresLinked = new LinkedHashSet<>(5);
        nombresLinked.add(null);
        nombresLinked.add(null);
        System.out.println(nombresLinked);
        nombresLinked.remove(null);
        System.out.println(nombresLinked);
        nombresLinked.addAll(Arrays.asList(listadoNombres));
        System.out.println("Nombres por orden de inscripción LinkedHashSet " + nombresLinked);
        TreeSet<String> nombresOrdenados= new TreeSet<>(nombresLinked);
        System.out.println("con TreeSet se ordenan alfabéticamente : " + nombresOrdenados);

        //Reto
        LinkedHashSet<Integer> numerosIntroducidos= new LinkedHashSet<>(5);
        int contador=0;
        while(true){
            System.out.println("Introduzca números del 1 al 5 : ");
            int numero= sc.nextInt();
            if(numero<=5 && !numerosIntroducidos.contains(numero)){
                numerosIntroducidos.add(numero);
            }else{
                System.out.println("El número es  mayor que 5 o ya fue introducido");
            }
                contador= numerosIntroducidos.size();

            if(contador==5){
                break;
            }
        }
        System.out.println(numerosIntroducidos);

    }


}
