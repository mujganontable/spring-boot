package jbr.spring.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;

@Order(value = 2)
@SpringBootApplication
public class TuesdayCommandLineRunner implements CommandLineRunner {

  private static final Logger log = LoggerFactory.getLogger(TuesdayCommandLineRunner.class);
  
  @Override
  public void run(String... args) throws Exception {
    log.info("TuesdayCommandLinerRunner run()");
  }

}
