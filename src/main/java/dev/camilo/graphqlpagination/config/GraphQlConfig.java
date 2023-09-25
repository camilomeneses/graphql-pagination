package dev.camilo.graphqlpagination.config;

import graphql.scalars.ExtendedScalars;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.graphql.GraphQlSourceBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.graphql.execution.RuntimeWiringConfigurer;

@Configuration
@Slf4j
public class GraphQlConfig {
  @Bean
  public RuntimeWiringConfigurer runtimeWiringConfigurer() {
    return wiringBuilder -> wiringBuilder
        .scalar(ExtendedScalars.Date)
        .scalar(ExtendedScalars.Url);
  }

  @Bean
  GraphQlSourceBuilderCustomizer inspectionCustomizer() {
    return source -> source.inspectSchemaMappings(report -> log.info(report.toString()));
  }
}
