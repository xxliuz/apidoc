package com.zhou.apidoc.Utils;

import com.zhou.apidoc.config.SwaggerConfig;
import io.github.swagger2markup.GroupBy;
import io.github.swagger2markup.Language;
import io.github.swagger2markup.Swagger2MarkupConfig;
import io.github.swagger2markup.builder.Swagger2MarkupConfigBuilder;
import io.github.swagger2markup.markup.builder.MarkupLanguage;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/15 16:19
 * @Description:
 */
public class SwaggerUtils {

    private Swagger2MarkupConfig swagger2MarkupConfig;

    private static final SwaggerUtils INSTANCE = new SwaggerUtils();

    private SwaggerUtils(){
        this.swagger2MarkupConfig = new Swagger2MarkupConfigBuilder()
                .withMarkupLanguage(SwaggerConfig.getMarkupLanguage())
                .withOutputLanguage(SwaggerConfig.getOutputLanguage())
                .withPathsGroupedBy(SwaggerConfig.getPathsGroupedBy())
                .withGeneratedExamples()
                .withBasePathPrefix()
                .build();
    }
    public static SwaggerUtils getInstance(){
        return INSTANCE;
    }

    public Swagger2MarkupConfig getSwagger2MarkupConfig() {
        return swagger2MarkupConfig;
    }

}
