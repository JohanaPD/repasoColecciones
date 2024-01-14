package iee.colecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class ArayListEjemplo {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numeroInicial;
        int numeroFinsl;
        int multiploRango;
        ArrayList<Integer> multiplosFinal = new ArrayList<>();
        System.out.println("Introduzca el número inicial");
        numeroInicial = sc.nextInt();
        System.out.println("El final de la busqueda");
        numeroFinsl = sc.nextInt();
        System.out.println("Los multiplos de que número");
        multiploRango = sc.nextInt();

        for (int i = numeroInicial; i <= numeroFinsl; i++) {
            if (i % multiploRango == 0) {
                multiplosFinal.add(i);
            } else {
                multiplosFinal.add(0);
            }
        }

        for (int i = 0; i < multiplosFinal.size(); i++) {
            System.out.println(multiplosFinal.get(i));
        }
    }


}

