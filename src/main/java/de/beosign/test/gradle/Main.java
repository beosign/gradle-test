package de.beosign.test.gradle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ecyrd.speed4j.StopWatch;
import com.ecyrd.speed4j.StopWatchFactory;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    private static StopWatchFactory stopWatchFactory = StopWatchFactory.getInstance("loggingFactory");

    public static void main(String[] args) throws InterruptedException {
        LOGGER.info("Start");

        StopWatch sw = stopWatchFactory.getStopWatch("main");
        sw.start();

        Thread.sleep(1000);
        sw.stop();

    }

    public static StopWatchFactory getStopWatchFactory() {
        return stopWatchFactory;
    }
}
