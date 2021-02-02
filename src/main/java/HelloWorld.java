package guiceplayground;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.joda.time.LocalTime;

public class HelloWorld {

  public static void main(String[] args) {
    Injector injector = Guice.createInjector(
        new LoggerModule()
    );

    injector.getInstance(App.class).start();
  }

}


class AppServer {

  @Inject UsersController userController;

  public void listen(request) {
    // work out hte controller
    userController.show(request)
    //UsersController.new(request).show()

  }

}
