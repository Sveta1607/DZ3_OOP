import java.util.Collections;
import java.util.List;

public class StreamService {
    // Метод сортировки потоков
    public void sortStreams(List<Stream> streams) {
        Collections.sort(streams, new StreamComparator());
    }
}