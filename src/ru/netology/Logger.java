package ru.netology;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger instance;
    DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
    Date date = new Date();

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null)
            instance = new Logger();
        return instance;
    }

    protected int num = 1;

    public void log(String msg) {
        System.out.println("[" + dateFormat.format(date) + " " + num++ + "] " + msg);
    }
}
