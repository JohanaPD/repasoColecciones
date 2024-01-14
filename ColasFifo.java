package iee.colecciones;

import java.util.*;

public class ColasFifo {
    //El primero que entra, primero que sale
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        //ArrayDeque
        Queue<String> meses = new ArrayDeque<>();
        meses.add("Enero");
        meses.add("Febrero");
        meses.add("Marzo");
        meses.add("Abril");
        meses.add("Mayo");
        meses.add("Junio");
        meses.offer("Julio");
        meses.offer("Agosto");
        meses.offer("Septiembre");
        meses.offer("Octubre");
        meses.offer("Noviembre");
        meses.offer("Diciembre");

        while (!meses.isEmpty()) {
            System.out.println(meses.remove());

        }

        //Colection Quee
        System.out.println("\n");
        Queue<String> myColector = new LinkedList<>();
        myColector.add("Collection");
        myColector.add("List");
        myColector.add("Set");
        myColector.add("SortedSet");
        myColector.add("Map");

        String recive = "";
        Iterator<String> runner = myColector.iterator();
        while (runner.hasNext()) {
            recive = runner.next();
            if (recive.charAt(0) == 'S') {
                runner.remove();
            } else {
                System.out.println(recive);
            }
        }
//Queue prioridad
        System.out.println("\n");
        Queue<Billete> pasajeros = new PriorityQueue<>();
        pasajeros.add(new Billete("Elena", 1));
        pasajeros.add(new Billete("Pedro", 3));
        pasajeros.add(new Billete("Marcos", 2));
        pasajeros.add(new Billete("Jesús", 1));
        pasajeros.add(new Billete("Luisa", 4));
        pasajeros.add(new Billete("Esther", 5));
        System.out.println("El primero en en¡mbarcar es : " + pasajeros.poll());
        System.out.println("El resto de pasajeros");

        while (!pasajeros.isEmpty()){
            System.out.println(pasajeros.remove());
        }

        //Reto
        System.out.println("\n");

        int numeroBolas;
        int tiempo;

        Queue<Integer> bolasArray = new ArrayDeque<>();
        System.out.println("Introduzca el número de bolas");
        numeroBolas = sc.nextInt();
        System.out.println("El tiempo que da al lago");
        tiempo = sc.nextInt();

        for (int i = 1; i <numeroBolas ; i++) {
            bolasArray.offer(i); //Añade las bola
        }
        while (bolasArray.size()>1){
            for (int i = 1; i <tiempo ; i++) {
                int bolaTirada= bolasArray.poll();//Elimina la bola
                System.out.println("La ultima bola tirada " + bolaTirada);
                bolasArray.offer(bolaTirada); //la añade de nuevo
            }
            int ultimaBola= bolasArray.poll();//coge la ultima bola real de cada bucle y es la que de verdad se elimina

            System.out.println("Ultima bola : " + ultimaBola);
        }
        System.out.println("Queda la bola ; " + bolasArray.peek());
        sc.close();

    }
}
