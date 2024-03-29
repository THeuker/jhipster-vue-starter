package com.mycompany.myapp.technical.infrastructure.secondary.liquibase;

import static org.assertj.core.api.Assertions.assertThat;

import com.mycompany.myapp.IntegrationTest;
import liquibase.integration.spring.SpringLiquibase;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

@IntegrationTest
class LiquibaseConfigurationIT {

  @Nested
  @IntegrationTest(properties = { "application.liquibase.async=true" })
  class Async {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    void shouldGetLiquibaseAsync() {
      SpringLiquibase springLiquibase = (SpringLiquibase) applicationContext.getBean("liquibase");

      assertThat(springLiquibase).isNotNull();
    }
  }

  @Nested
  @IntegrationTest(properties = { "application.liquibase.async=false" })
  class Sync {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    void shouldGetLiquibaseSync() {
      SpringLiquibase springLiquibase = (SpringLiquibase) applicationContext.getBean("liquibase");

      assertThat(springLiquibase).isNotNull();
    }
  }
}
