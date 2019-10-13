package aproject.acrawler;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class
})
@ComponentScan(basePackages = {"aproject.acrawler"})
@MapperScan({"aproject.acrawler.dao"})
public class AcrawlerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AcrawlerApplication.class, args);
    }

}
