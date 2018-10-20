package com.k381;

import java.lang.management.ManagementFactory;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SumServer implements SumServerMBean{

    private static final String DEFAULT_MESSAGE = "sum(%d): %d";
    private String message = DEFAULT_MESSAGE;
    private static Logger logger = Logger.getLogger("Main");

    public void run() throws InterruptedException {
        int sum = 0;

        logExample();
        System.out.println("Starting pid: " + ManagementFactory.getRuntimeMXBean().getName());

        for (int i = 0; i <= 1000; i++) {
            sum = increment(sum, i);
            Thread.sleep(1000);
        }
    }

    private int increment(int sum, int i) {
        sum += i;
        logger.log(Level.INFO, String.format(message, i, sum));
        return sum;
    }

    private void logExample() {
        logger.info("Server started!");
        logger.log(Level.SEVERE, "Can't open file!");
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message=message;
    }
}
