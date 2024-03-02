import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // a. Создание списка публикаций
        List<PublicatieTiparita> publicatii = new ArrayList<>();
        
        // b. Создание объектов и заполнение списка
        PublicatieTiparita revista1 = new Revista("Revista1", 50, "Наука");
        PublicatieTiparita carte1 = new Carte("Книга1", 200, "Автор1");
        PublicatieTiparita manual1 = new Manual("Учебник1", 150, "Автор2", "Математика");
        PublicatieTiparita carte2 = new Carte("Книга2", 300, "Автор3");
        
        publicatii.add(revista1);
        publicatii.add(carte1);
        publicatii.add(manual1);
        publicatii.add(carte2);

        // c. Вывод публикаций, которые содержат введенный с клавиатуры критерий
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите критерий для фильтрации: ");
        String criteriu = scanner.nextLine();
        PublicatieTiparita.filtreazaPublicatiiDupaCriteriu(publicatii, criteriu);

        // d. Сравнение объекта класса-потомка с объектами из списка
        PublicatieTiparita publicatieComparata = new Manual("Учебник2", 100, "Автор4", "Физика");
        System.out.println("Сравнение объекта с публикациями из списка:");
        for (PublicatieTiparita publicatie : publicatii) {
            if (publicatie.equals(publicatieComparata)) {
                System.out.println("Совпадает: " + publicatie);
            } else {
                System.out.println("Не совпадает: " + publicatie);
            }
        }
    }
}
