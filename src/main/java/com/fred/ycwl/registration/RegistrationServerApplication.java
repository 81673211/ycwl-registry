package com.fred.ycwl.registration;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *
 * <b>Description:.</b><br> 
 * @author <b>sil.zhou</b>
 * <br><b>ClassName:</b> 
 * <br><b>Date:</b> 2019/4/16 13:42
 */
@SpringBootApplication
@EnableEurekaServer
public class RegistrationServerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(RegistrationServerApplication.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }
}
