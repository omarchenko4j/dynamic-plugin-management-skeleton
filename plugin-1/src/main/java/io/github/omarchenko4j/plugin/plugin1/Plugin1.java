package io.github.omarchenko4j.plugin.plugin1;

import io.github.omarchenko4j.plugin.Plugin;

public class Plugin1 implements Plugin {

    @Override
    public void execute() {
        System.out.println("Plugin 1 executed");
    }
}
