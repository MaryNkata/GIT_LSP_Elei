package org.howard.edu.lsp.exam.problem51;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestLogger {

    @Test
    public void testDisplayLog() {
        Logger logger = Logger.getInstance();
        logger.logMessage("Test Message");
        assertEquals("Log:\nTest Message\n", logger.displayLog());
    }

    @Test
    public void testLoggerInstances() {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        assertSame(logger1, logger2);
    }
}
