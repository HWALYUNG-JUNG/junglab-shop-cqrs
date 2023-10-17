package junglabshopcqrs.common;

import io.cucumber.spring.CucumberContextConfiguration;
import junglabshopcqrs.CustomercenterApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { CustomercenterApplication.class })
public class CucumberSpingConfiguration {}
