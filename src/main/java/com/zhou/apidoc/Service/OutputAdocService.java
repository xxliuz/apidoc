package com.zhou.apidoc.Service;

import com.zhou.apidoc.Utils.SwaggerUtils;
import com.zhou.apidoc.config.PathConfig;
import io.github.swagger2markup.Swagger2MarkupConfig;
import io.github.swagger2markup.Swagger2MarkupConverter;
import org.springframework.stereotype.Service;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/15 16:47
 * @Description:
 */
@Service
public class OutputAdocService {

    public void outputAdoc(){
        try {
            URL remoteSwaggerFile =  new URL(PathConfig.getRemoteDirectory());
            Path outputDirectory = Paths.get(PathConfig.getOutputDirectory());
            Swagger2MarkupConfig config = SwaggerUtils.getInstance().getSwagger2MarkupConfig();
            Swagger2MarkupConverter.from(remoteSwaggerFile)
                    .withConfig(config)
                    .build()
                    .toFile(outputDirectory);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
