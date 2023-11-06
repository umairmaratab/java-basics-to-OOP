import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Runner10 {
  public static void main(String[] args) {
    Logger logger = LoggerFactory.getLogger(Runner10.class);

    logger.info("A message with the info level");
    logger.warn("warning level message ...");
  }
}
