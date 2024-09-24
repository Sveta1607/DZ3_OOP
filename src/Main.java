import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем несколько учебных групп
        StudyGroup group1 = new StudyGroup("Группа 1");
        StudyGroup group2 = new StudyGroup("Группа 2");
        StudyGroup group3 = new StudyGroup("Группа 3");

        // Создаем несколько потоков
        Stream stream1 = new Stream();
        stream1.addGroup(group1);
        stream1.addGroup(group2);

        Stream stream2 = new Stream();
        stream2.addGroup(group1);

        Stream stream3 = new Stream();
        stream3.addGroup(group1);
        stream3.addGroup(group2);
        stream3.addGroup(group3);

        // Добавляем потоки в список
        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);
        streams.add(stream3);

        // Выводим потоки до сортировки
        System.out.println("До сортировки:");
        streams.forEach(System.out::println);

        // Создаем контроллер и сортируем потоки
        Controller controller = new Controller();
        controller.sortStreams(streams);

        // Выводим потоки после сортировки
        System.out.println("После сортировки:");
        streams.forEach(System.out::println);
    }
}