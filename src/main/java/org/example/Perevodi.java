package org.example;

import jdk.internal.access.JavaIOFileDescriptorAccess;

import java.time.ZoneId;
import java.util.*;

import static java.time.ZoneId.*;
import static java.util.Map.entry;

public class Perevodi {
    public  void perevodiFirst () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String a = scanner.nextLine();
        System.out.println("А теперь фамилию");
        String b = scanner.nextLine();
        System.out.println("Введите сумму перевода");
        String n = scanner.nextLine();





        System.out.println("Выберите регион");
        String keyOfRegion = scanner.nextLine();
        System.out.println(SHORT_IDS.get(keyOfRegion.toUpperCase()));
        System.out.println("Ваш регион " + keyOfRegion.toUpperCase() );
        System.out.println("Ваше имя " + a);
        System.out.println("Ваша фамилия " + b);
        System.out.println("Сумма перевода " + n);
    }
}
