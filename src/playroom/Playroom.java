package playroom;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Playroom {
    public List<Toy> toyList;

    /**
     * Конструктор
     * @param toyList
     */
    public Playroom(List<Toy> toyList) {
        this.toyList = toyList;
    }

    /**
     * Метод завантаження іграшок з файлу
     */
    public void loadToysFromFile(List<Toy> toys) {
        // Логіка завантаження іграшок з файлу
    }

    /**
     * Метод сортування іграшок у кімнаті по одному з
     * параметрів
     */
    public void sortToysBy() {
       // Логіка сортування іграшок у кімнаті по одному з параметрів
    }

    /**
     * Метод знаходження іграшок у кімнаті, що відповідають заданому діапазону
     * параметрів
     */
    public void searchToys() {
        //Логіка пошуку іграшок у кімнаті, що відповідають заданому діапазон параметрів
    }

    /**
     * Метод додати іграшку
     */
    public void addToy(){
        // Логіка додавання іграшки до кімнати
    }

    /**
     * Метод видалити іграшку
     */
    public void removeToy(){
        // Логіка видалення іграшки з кімнати
    }

    /**
     * Метод для виведення списку іграшок у кімнаті
     */
    public void displayToys(List<Toy> toyList){
        // Логіка відображення іграшок у кімнаті
    }
}