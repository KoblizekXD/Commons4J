import com.koblizek.commons4j.time.DateFormatter;
import static com.koblizek.commons4j.time.DateFormatter.*;

public class TestMain {
    public static void main(String[] args) {
        System.out.println(new DateFormatter(":", day(2), month(2), year(4)));
    }
}
