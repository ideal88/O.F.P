package um.ofp.ofp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OfpApplication {

    public static void main(String[] args) {
        //this is grete
        SpringApplication.run(OfpApplication.class, args);
        System.out.println("hello");
    }

}
