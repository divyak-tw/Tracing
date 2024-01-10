package com.logging.structured;

import com.thoughtworks.tracing.config.LoggingAspect;
import com.thoughtworks.tracing.config.TracingConfig;
import config.trace.TraceConfig;
import org.springframework.boot.SpringApplication;
//import org.springframework.boot.actuate.autoconfigure.observation.ObservationAutoConfiguration;
//import org.springframework.boot.actuate.autoconfigure.tracing.MicrometerTracingAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({TraceConfig.class, TracingConfig.class, LoggingAspect.class})
public class StructuredLoggingPocApplication {

    public static void main(String[] args) {
        SpringApplication.run(StructuredLoggingPocApplication.class, args);
    }

}
