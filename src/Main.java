import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>(generateClients());

        while (!queue.isEmpty()) {
            Person person = queue.poll();
            System.out.println(person.name + " " + person.surname + ", вы прокатились на карусели!");
            person.tickets--;
            System.out.println("У вас осталось билетов: " + person.tickets);
            System.out.println();
            if (person.tickets > 0) {
                queue.add(person);
            }
        }

        }
    public static List<Person> generateClients() {
        return List.of (
                new Person("Вова", "Иванов", 4),
                new Person("Ира", "Филатова", 2),
                new Person("Света", "Петрова", 6),
                new Person("Игорь", "Акопян", 3));
    }
}