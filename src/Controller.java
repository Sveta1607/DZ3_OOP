import java.util.List;

public class Controller {
    private StreamService streamService;

    public Controller() {
        this.streamService = new StreamService();
    }

    // Метод для сортировки списка потоков
    public void sortStreams(List<Stream> streams) {
        streamService.sortStreams(streams);
        System.out.println("Потоки отсортированы по количеству групп.");
    }
}