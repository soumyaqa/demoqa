package com.demoqa.utils;

import java.util.logging.Logger;

/**
 * Created by New on 4/22/2017.
 */
public class Log {
    private static Logger log = Logger.getLogger(Log.class.getName());

    public static void info(String msg){
        log.info(msg);
    }

    public static void warn(String msg){
        log.warning(msg);
    }

    public static void error(String msg){
        log.severe(msg);
    }
}
