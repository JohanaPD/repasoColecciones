package iee.colecciones;

import java.util.LinkedList;
import java.util.Scanner;

public class EntradaFifo {
static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {


        LinkedList<String> lista = new LinkedList<>();

        System.out.println("Introduzca los alimentos, los que caducan antes primero, para terminar pulse 1");
        boolean entrada= true;
        while (entrada){
        String caducidad=sc.nextLine();
        if(!caducidad.equals("")){
            lista.addFirst(caducidad);
        }else if(caducidad.equals("1")){
            int numero= Integer.parseInt(caducidad);
           if(numero==1) break;
        }
        }
        boolean entrar2 = true;
        while (entrar2) {
            System.out.println("Cocina esto  primero " + lista.pollLast());
            if (lista.isEmpty()) {
                entrar2 = false;
                System.out.println("Te has quedado sin comida");
            }
        }

    }
}
