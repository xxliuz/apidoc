package com.zhou.apidoc.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/15 16:39
 * @Description:
 */
@Configuration
@ConfigurationProperties(prefix = "path")
public class PathConfig {

     private static String outputDirectory;
     private static String remoteDirectory;

    public static String getOutputDirectory() {
        return outputDirectory;
    }

    public synchronized void setOutputDirectory(String outputDirectory) {
        this.outputDirectory = outputDirectory;
    }

    public static String getRemoteDirectory() {
        return remoteDirectory;
    }

    public synchronized void setRemoteDirectory(String remoteDirectory) {
        this.remoteDirectory = remoteDirectory;
    }
}
