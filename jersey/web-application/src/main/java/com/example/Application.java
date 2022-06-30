package com.example;

import com.example.controller.ExampleController;
import java.net.URI;
import org.eclipse.jetty.server.Server;
import org.glassfish.jersey.jetty.JettyHttpContainerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class Application {

  private static final String BASE_URL = "http://localhost:8080";

  public static Server createServer() {
    final ResourceConfig config = new ResourceConfig();
    config.register(ExampleController.class);

    final Server server = JettyHttpContainerFactory.createServer(URI.create(BASE_URL), config);

    return server;
  }

  public static void main(String[] args) {
    try {
      final Server server = createServer();
      server.start();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
