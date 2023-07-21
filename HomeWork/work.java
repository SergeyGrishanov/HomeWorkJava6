
//     1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//     2. Создать множество ноутбуков.

//     3. Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.

//     4. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:

// 1 - ОЗУ

// 2 - Объем ЖД

// 3 - Операционная система

// 4 - Цвет …

//     Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//     Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;


public class work {
    public static void main(String[] args) throws Exception {
        NoteBook laptop1 = new NoteBook("Lenovo IdealPad 5", 8, 256, "Windows 11", "синий", 15.6);
        NoteBook laptop2 = new NoteBook("Honor MagicBook 16", 16, 512, "без ОС", "серый", 16.1);
        NoteBook laptop3 = new NoteBook("Apple MacBook Air 13", 8, 256, "MacOs", "золотистый", 13.3);
        NoteBook laptop4 = new NoteBook("HP 250 G7", 4, 1024, "без ОС", "черный", 15.6);
        NoteBook laptop5 = new NoteBook("Xiomi RedmiBook 15", 8, 256, "Windows 11", "серый", 14.6);
       
        Set<NoteBook> unicNoteBook = new HashSet<NoteBook>();
        unicNoteBook.add(laptop1);
        unicNoteBook.add(laptop2);
        unicNoteBook.add(laptop3);
        unicNoteBook.add(laptop4);
        unicNoteBook.add(laptop5);
       
        System.out.printf("Всего уникалных ноутбуков: %d \n", unicNoteBook.size());
        Map<Integer, String> mapCrit = new HashMap<>();
        mapCrit.put(1, "объем оперативной памяти");
        mapCrit.put(2, "объем накопителя");
        mapCrit.put(3, "ОС");
        mapCrit.put(4, "цвет");
        mapCrit.put(5, "диагональ");
       
        System.out.println();
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите желаемые характеристики: 1. объем оперативной памяти: ");
            int ramUser = sc.nextInt();
            System.out.println("объем накопителя: ");
            int storUser = sc.nextInt();
            System.out.println("диагональ");
            double digUser = sc.nextDouble();
            for(NoteBook lap: unicNoteBook) {
                    if ((lap.getRam() == ramUser) && (lap.getStorageCap() == storUser)  && lap.getDiagonal() >= digUser) {
                        System.out.println(lap.toString());
                    }
                }
                sc.close();
            }
}        
                             
       
        
    
  

        
        
    
    
