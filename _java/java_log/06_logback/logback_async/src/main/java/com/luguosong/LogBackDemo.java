package com.luguosong;

import ch.qos.logback.classic.LoggerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author luguosong
 */
public class LogBackDemo {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(LogBackDemo.class);

        //日志记录
        for (int i = 0; i < 100; i++) {
            logger.error("error错误信息");
            logger.warn("warn警告信息");
            logger.info("info关键信息");
            logger.debug("debug详细信息");
            logger.trace("trace追踪信息");
        }

        //模拟业务逻辑
        for (int i = 0; i < 100; i++) {
            System.out.println("-----------------------");
        }

        //防止异步日志未写完控制台就关闭了
        LoggerContext factory = (LoggerContext) LoggerFactory.getILoggerFactory();
        factory.stop();
    }
}
