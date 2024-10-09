package uz.click.appiumautotests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// аннотация @SpringBootApplication является основным строительным блоком в приложениях Spring Boot,
// который объединяет конфигурацию, автоматическую настройку и поиск компонентов.
@SpringBootApplication
public class ClickUpAppiumAutotestsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClickUpAppiumAutotestsApplication.class, args);
	}
}