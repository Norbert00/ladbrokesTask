package logger;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/*
    The class contains logger settings to avoid duplication of the code
 */

public class StepLogger {

    private static Logger logger = LogManager.getRootLogger();

    public static void setLoggerInfo(String newInfo) {
        logger.info(newInfo);
    }

}
