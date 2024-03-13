package com.example.demo.ex1.config;
import java.lang.String;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class appConfig {
    @Value("${App.name}")
    public String AppName;
    @Value("${app.version}")
    public String AppVersion;
    public appConfig(){

    }
    public appConfig(String appName, String appVersion) {
        AppName = appName;
        AppVersion = appVersion;
    }
    public String getAppName() {
        return AppName;
    }
    public void setAppName(String appName) {
        AppName = appName;
    }
    public String getAppVersion() {
        return AppVersion;
    }
    public void setAppVersion(String appVersion) {
        AppVersion = appVersion;
    }
    
}
