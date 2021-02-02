package guiceplayground;

class StdErroLogger implements Bogger {

  StdErroLogger() {
    System.out.println("In the constructor of stdlogger logger");
  }

  public void info(String message) {
    System.out.println("INFO: " + message);
  }

}
