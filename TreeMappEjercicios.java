package iee.colecciones;

import java.util.*;

public class TreeMappEjercicios {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        //consumen muchos recursos, solo usar en caso indispensable
        Map<String,Integer> carrito= new LinkedHashMap<>();

        carrito.put("Pan", 1);
        carrito.put("Leche", 1);
        carrito.put("Cereales", 1);

        System.out.println("Cantidad de pan " + carrito.putIfAbsent("Pan", 2));
        System.out.println(carrito);
        System.out.println("Cantidad de huevos " + carrito.putIfAbsent("Huevos", 3));
        System.out.println(carrito);
        System.out.println("Total de leche  " + carrito.getOrDefault("Leche", 0));
        System.out.println("Total de agua  " + carrito.getOrDefault("Agua" , 1));
        System.out.println(carrito);

        //cuando interesa el orden
        TreeMap<String,String> agenda= new TreeMap<>();
        agenda.put("Pedro", "639586547980");
        agenda.put("Maria", "545454546565");
        System.out.println(" El telefono  639586547980  existe? " + agenda.containsValue("639586547980"));
        agenda.remove("Pedro", "456454545120");
        System.out.println("Está el telefono 639586547980 ? " +  agenda.containsValue("639586547980"));
        System.out.println(agenda);
        agenda.remove("Pedro");
        System.out.println("Está el telefono 639586547980 ? " +  agenda.containsValue("639586547980"));
        System.out.println(agenda);

        agenda.replace("Manuel", "454212312132");
        System.out.println("El teléfono de Manuel es : " + agenda.getOrDefault("Manuel", "No existe"));

        agenda.replace("Maria","545454546565", "54545216546554" );
        System.out.println(agenda);


        System.out.println("=================================================");
        System.out.println("                    RETO                         ");
        System.out.println("=================================================");

        String cadenaNumeros = "";
        System.out.println("Introduzca una secuencia de números aleatorios de más de 7 dígitos para este texto");
        cadenaNumeros = sc.next();
        char[] caracteres = cadenaNumeros.toCharArray();
        LinkedHashMap<Integer, Integer> paresValor = new LinkedHashMap<>();
        for (int i = 0; i < caracteres.length; i++) {
            Integer numero = Character.getNumericValue(caracteres[i]);
            paresValor.put(numero, paresValor.getOrDefault(numero,0)+1);

        }
        Set listaIterar = paresValor.entrySet();
        Iterator it = listaIterar.iterator();
        while (it.hasNext()) {
            Map.Entry map = (Map.Entry) it.next();
            System.out.println(" El número " + map.getKey() + " Aparece " + map.getValue());
        }


    }
    }

