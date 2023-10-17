package junglabshopcqrs.common;

import io.cucumber.spring.CucumberContextConfiguration;
import junglabshopcqrs.InventoryApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { InventoryApplication.class })
public class CucumberSpingConfiguration {}
