package com.learningcity.coil.service;

import com.learningcity.coil.model.Widget;

import java.util.Properties;

/**
 * Created by Yohan on 2/21/14.
 */
public class SimpleWidgetService implements WidgetService {
    @Override
    public Widget create(Properties properties) {
        Widget widget = new Widget();
        widget.setName(properties.getProperty("name"));
        return widget;
    }
}
