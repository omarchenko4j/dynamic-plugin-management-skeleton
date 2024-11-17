package io.github.omarchenko4j.plugin.plugin2;

import io.github.omarchenko4j.plugin.Plugin;
import org.apache.commons.lang3.StringUtils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Plugin2 implements Plugin {

    @Override
    public void execute() {
        var pluginProperties = loadProperties();

        var pluginName = pluginProperties.getProperty("plugin2.name");
        if (StringUtils.isBlank(pluginName)) {
            throw new IllegalStateException("Plugin name cannot be empty");
        }

        System.out.println(pluginName + " executed");
    }

    private Properties loadProperties() {
        var configLocation = "config/plugin2.properties";

        var properties = new Properties();
        try (var is = new FileInputStream(configLocation)) {
            properties.load(is);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties;
    }
}
