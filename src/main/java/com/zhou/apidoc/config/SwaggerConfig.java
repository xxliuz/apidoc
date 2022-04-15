package com.zhou.apidoc.config;

import io.github.swagger2markup.GroupBy;
import io.github.swagger2markup.Language;
import io.github.swagger2markup.markup.builder.MarkupLanguage;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/15 14:41
 * @Description:
 */
@Configuration
@ConfigurationProperties(prefix = "swagger2markup")
public class SwaggerConfig {

    private static MarkupLanguage markupLanguage;

    private static boolean generatedExamplesEnabled;

    private static Language outputLanguage;

    private static boolean inlineSchemaEnable;

    private static GroupBy pathsGroupedBy;

    public static MarkupLanguage getMarkupLanguage() {
        return markupLanguage;
    }

    public synchronized void setMarkupLanguage(MarkupLanguage markupLanguage) {
        this.markupLanguage = markupLanguage;
    }

    public static boolean isGeneratedExamplesEnabled() {
        return generatedExamplesEnabled;
    }

    public synchronized void setGeneratedExamplesEnabled(boolean generatedExamplesEnabled) {
        this.generatedExamplesEnabled = generatedExamplesEnabled;
    }

    public static Language getOutputLanguage() {
        return outputLanguage;
    }

    public synchronized void setOutputLanguage(Language outputLanguage) {
        this.outputLanguage = outputLanguage;
    }

    public static boolean isInlineSchemaEnable() {
        return inlineSchemaEnable;
    }

    public synchronized void setInlineSchemaEnable(boolean inlineSchemaEnable) {
        this.inlineSchemaEnable = inlineSchemaEnable;
    }

    public static GroupBy getPathsGroupedBy() {
        return pathsGroupedBy;
    }

    public synchronized void setPathsGroupedBy(GroupBy pathsGroupedBy) {
        this.pathsGroupedBy = pathsGroupedBy;
    }
}
