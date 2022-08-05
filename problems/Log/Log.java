package Log;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Log {
    public Logger logger;
    FileHandler fh;

    public Log(String fileName) throws SecurityException, IOException {
        fh = new FileHandler(fileName,true);
        logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
    }
}