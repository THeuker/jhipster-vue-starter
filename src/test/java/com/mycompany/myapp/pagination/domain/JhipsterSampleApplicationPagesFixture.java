package com.mycompany.myapp.pagination.domain;

import com.mycompany.myapp.pagination.domain.JhipsterSampleApplicationPage.JhipsterSampleApplicationPageBuilder;
import java.util.List;

public final class JhipsterSampleApplicationPagesFixture {

  private JhipsterSampleApplicationPagesFixture() {}

  public static JhipsterSampleApplicationPage<String> page() {
    return pageBuilder().build();
  }

  public static JhipsterSampleApplicationPageBuilder<String> pageBuilder() {
    return JhipsterSampleApplicationPage.builder(List.of("test")).currentPage(2).pageSize(10).totalElementsCount(21);
  }
}
