package com.zhou.apidoc;

import com.zhou.apidoc.Service.OutputAdocService;
import com.zhou.apidoc.Utils.SwaggerUtils;
import com.zhou.apidoc.config.PathConfig;
import io.github.swagger2markup.GroupBy;
import io.github.swagger2markup.Language;
import io.github.swagger2markup.Swagger2MarkupConfig;
import io.github.swagger2markup.Swagger2MarkupConverter;
import io.github.swagger2markup.builder.Swagger2MarkupConfigBuilder;
import io.github.swagger2markup.markup.builder.MarkupLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

@SpringBootApplication
public class ApidocApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(ApidocApplication.class, args);
	}

	@Autowired
    private OutputAdocService outputAdocService;
    @Override
    public void run(ApplicationArguments args) throws Exception {
	    outputAdocService.outputAdoc();

    }
}
