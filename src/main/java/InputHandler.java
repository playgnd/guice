package guiceplayground;

class InputHandler {

  private String input;

  InputHandler(String input) {
    this.input = input;
  }

  public void handle() {
      System.out.println("Received input: " + input);
  }

}

class RequestHandler {

  private Request request;

  RequestHandler(Request request) {
    this.request = request;
  }

  public Response handle() {
    logger.info("Received request" + request.toString());
    Response response = new Response(200, "{hello: 'world'}");
    logger.info("Returning response" + response.toString());
  }

}
