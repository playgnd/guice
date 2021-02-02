package guiceplayground;

import java.util.function.Consumer;

class InputListener {

  InputListener() {
    System.out.println("In the constructor of InputListener");
  }

  public void nextInput(Consumer<String> consumer) {
    System.out.println("Listening for next input");
    String input = "first input";
    consumer.accept(input);
  }

}
