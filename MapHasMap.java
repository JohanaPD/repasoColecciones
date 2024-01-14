package iee.colecciones;

import java.util.*;

public class MapHasMap {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // no hereda de colecction, no puede almacenar tipos básicos,
        // El orden de los pares en HashMap no es importante
        Map<String, Integer> notas = new HashMap<>();
        notas.put("Maria", 7);
        notas.put("Antonio", 9);
        notas.put("Luis", 10);
        notas.put("Ana", 8);
        notas.put("Andrés", 5);
        notas.put("Teresa", 10);
        System.out.println("La nota de Antonio es : " + notas.get("Antonio"));
        System.out.println("Es alumna María ? : " + notas.containsKey("Maria"));

        double suma = 0;
        for (Integer nota : notas.values()) {
            suma += nota;
        }
        System.out.println("La media de notas del curso es de : " + suma / notas.size());
        Set lista = notas.entrySet();
        Iterator iterator = lista.iterator();
        while (iterator.hasNext()) {
            Map.Entry claves = (Map.Entry) iterator.next();
            System.out.println("La nota de " + claves.getKey() + " es de : " + claves.getValue());
        }
//Reto
        System.out.println("=================================================");
        System.out.println("                    RETO                         ");
        System.out.println("=================================================");

        String cadenaNumeros = "";
        System.out.println("Introduzca una secuencia de números aleatorios de más de 7 dígitos para este texto");
        cadenaNumeros = sc.next();
        char[] caracteres = cadenaNumeros.toCharArray();
        HashMap<Integer, Integer> paresValor = new HashMap<>();
        for (int i = 0; i < caracteres.length; i++) {
          Integer numero = Character.getNumericValue(caracteres[i]);
            Integer aparece = 0;
            for (int j = 0; j < caracteres.length; j++) {
                if (numero.equals(Character.getNumericValue(caracteres[j]))) {
                    aparece++;
                }
            }
            if (!paresValor.containsKey(numero)) {
                paresValor.put(numero, aparece);
            }
        }
        Set listaIterar = paresValor.entrySet();
        Iterator it = listaIterar.iterator();
        while (it.hasNext()) {
            Map.Entry map = (Map.Entry) it.next();
            System.out.println(" El número " + map.getKey() + " Aparece " + map.getValue());
        }


    }
}
