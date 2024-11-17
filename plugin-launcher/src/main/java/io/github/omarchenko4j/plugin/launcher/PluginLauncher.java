package io.github.omarchenko4j.plugin.launcher;

import io.github.omarchenko4j.plugin.Plugin;
import java.util.ServiceLoader;

public class PluginLauncher {

    public static void main(String[] args) {
        System.out.println("Plugin launcher started");

        var plugins = ServiceLoader.load(Plugin.class);
        for (var plugin : plugins) {
            plugin.execute();
        }

        System.out.println("Plugin launcher finished");
    }
}
