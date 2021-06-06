import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jBase {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("SampleLogger");
        logger.info("Something went wrong");
        LogExampleOther.main();
    }
}

@Slf4j
class LogExampleOther {
    public static void main(String... args) {
        log.error("Something else is wrong here");
    }
}