package iee.colecciones;

import java.io.OptionalDataException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UsandoHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> indexUser = new HashMap<>();

        String[] nombres={"Elvira", "Antonio", "Maria", "Teresa", "Ricardo"};
        for (int i = 0; i <nombres.length ; i++) {
            indexUser.put(i, nombres[i]);
        }
        System.out.println(indexUser);
        System.out.println(indexUser.containsKey(nombres.length-1));

        System.out.println("Set entry ");
        Set entry = indexUser.entrySet();
        Iterator it= entry.iterator();

        while (it.hasNext()){
            Map.Entry me= (Map.Entry) it.next();
            System.out.println("Key is :"+ me.getKey() + " &  values: " + me.getValue());
        }


    }
}
