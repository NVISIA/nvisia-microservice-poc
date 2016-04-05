import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.core.ConsoleAppender
import ch.qos.logback.core.status.OnConsoleStatusListener;

statusListener(OnConsoleStatusListener)

def appenderList = ["CONSOLE"]
def consoleAppender = true;

if (consoleAppender) {
    appender("CONSOLE", ConsoleAppender) {
        encoder(PatternLayoutEncoder) {
            pattern = "%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n"
        }
    }
}
logger("com.elsevier.eols", DEBUG)

// Change debug level here, valid values are INFO, DEBUG, WARN or ERROR
root(INFO, appenderList)