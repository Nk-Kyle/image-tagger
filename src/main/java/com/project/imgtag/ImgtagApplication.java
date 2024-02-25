package com.project.imgtag;

import com.project.imgtag.model.Image;
import com.project.imgtag.repository.ImageRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class ImgtagApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImgtagApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(ImageRepository repository) {
		return args -> {
			List<String> tags = Arrays.asList("TagOne", "TagTwo");
			Image image = new Image(
					"Test",
					tags
			);
			repository.insert(image);

		};
	}

}
