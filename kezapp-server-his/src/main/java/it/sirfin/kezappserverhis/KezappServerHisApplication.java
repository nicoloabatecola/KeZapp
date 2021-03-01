package it.sirfin.kezappserverhis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"it.sirfin.kezappserverhis"})
@EnableJpaRepositories(basePackages = {"it.sirfin.kezappserverhis.repository"})
@EntityScan(basePackages = {"it.sirfin.kezappserverhis.model"})
public class KezappServerHisApplication {

    public static void main(String[] args) {
        SpringApplication.run(KezappServerHisApplication.class, args);
    }

}
