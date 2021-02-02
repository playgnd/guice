package guiceplayground;

import com.google.inject.Inject;

class App {

  @Inject InputListener inputListener;
  @Inject Logger logger;

  App() {
    System.out.println("In the constructor of App");
  }

  public void start() {
    logger.info("App has started!");
    inputListener.nextInput((input) -> {
      Move move moveFactory.createFromString(input);
      game.nextMove(move)
      inputHandler.handle(input);
      new InputHandler(input).handle();
    });
  }

}


server.start();

public void start() {
  logger.info("App starting..");
  httpListener.listen((request -> {
    return new RequestHandler(request).handle();
  });
  logger.info("App shutting down.");
}


class HttpListener {

  public void listen(Consumer<Request> consumer) {
    tcpListener.listen((packet) -> {
      tcpToHttpTransformer.next(packet, (requst, response) -> {
        response.send(consumer.accept(request));
      })
    });
  }

}
