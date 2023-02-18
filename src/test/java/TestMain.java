import com.koblizek.commons4j.Colored;

import java.awt.*;
import java.lang.management.ClassLoadingMXBean;
import java.lang.management.ManagementFactory;

public class TestMain {
    public static void main(String[] args) {
        ManagementFactory.getClassLoadingMXBean().getLoadedClassCount()
    }
}
