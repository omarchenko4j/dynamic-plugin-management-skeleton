# Right way to implement Dynamic Plugin Management in Java

This skeleton shows how to implement a dynamic plugin management subsystem.

### What does Dynamic Plugin Management mean?

This is a subsystem that can dynamically expand its functionality using plugins.
Plugin aggregates part of some business logic.

### Project structure

- **plugin-core** contains basic abstraction of plugin
- **plugin-1** contains an example of a simple plugin
- **plugin-2** contains an example of plugin with an external configuration file and a dependency library
- **plugin-launcher** contains an entry point to launch plugins

### Getting Started

Build this project using **Maven**
```shell
mvn clean package
```

And run using classpath

on **Windows**:
```shell
java -cp ".\plugin-launcher\target\plugin-launcher-1.0.jar" io.github.omarchenko4j.plugin.launcher.PluginLauncher
java -cp ".\plugin-launcher\target\plugin-launcher-1.0.jar;.\plugin-1\target\plugin-1-1.0.jar" io.github.omarchenko4j.plugin.launcher.PluginLauncher
java -cp ".\plugin-launcher\target\plugin-launcher-1.0.jar;.\plugin-1\target\plugin-1-1.0.jar;.\plugin-2\target\plugin-2-1.0.jar" io.github.omarchenko4j.plugin.launcher.PluginLauncher
```

or **Linux**:
```shell
java -cp "./plugin-launcher/target/plugin-launcher-1.0.jar" io.github.omarchenko4j.plugin.launcher.PluginLauncher
java -cp "./plugin-launcher/target/plugin-launcher-1.0.jar:./plugin-1/target/plugin-1-1.0.jar" io.github.omarchenko4j.plugin.launcher.PluginLauncher
java -cp "./plugin-launcher/target/plugin-launcher-1.0.jar:./plugin-1/target/plugin-1-1.0.jar:./plugin-2/target/plugin-2-1.0.jar" io.github.omarchenko4j.plugin.launcher.PluginLauncher
```

These three launches show how the functionality expands with classpath expansion.
