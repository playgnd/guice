package guiceplayground;

import com.google.inject.AbstractModule;

class LoggerModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(Logger.class).to(StdErrorLogger.class);
  }

}
