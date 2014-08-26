package com.drillmap.saml.contollers;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.stereotype.Component;

/**
 * Created by hmohamed on 8/26/14.
 */
@Component
public class AppEmbeddedServletContainer implements EmbeddedServletContainerCustomizer {

    private String contextPath = "/samlgate";
    private int port = 9091;


    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setContextPath(getContextPath());
        container.setPort(getPort());
    }

    public String getContextPath() {
        return (contextPath==null)? "":contextPath;
    }
    public void setContextPath(String contextPath) {
        this.contextPath = contextPath;
    }
    public int getPort() {
        return port;
    }
    public void setPort(int port) {
        this.port = port;
    }
}