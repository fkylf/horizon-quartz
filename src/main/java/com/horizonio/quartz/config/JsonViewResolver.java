package com.horizonio.quartz.config;

import com.alibaba.fastjson.support.spring.FastJsonJsonView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

public class JsonViewResolver implements ViewResolver {

    @Override
    public View resolveViewName(String viewName, Locale locale) throws Exception {
        FastJsonJsonView view = new FastJsonJsonView();
//        MappingJackson2JsonView view = new MappingJackson2JsonView();
//        view.setPrettyPrint(true);
        return view;
    }

}