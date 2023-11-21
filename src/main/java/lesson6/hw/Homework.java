package ru.gb.lesson6.hw;

public class Homework {

  /**
   * Класс документ - описывает структуру документа.
   *
   * Нужно спроектировать систему отчетов, которая будет формировать отчеты для документа.
   *
   * 1. Формирование PDF-файла (потенциально может быть несколько типом разметки PDF-файла).
   * 2. Формирование JSON-файла с полями документа.
   * 3. Формирование XML-файла с полями документа.
   * 4. ... потенциально могут добавляться разные типы отчетов.
   *
   * После реализации задать себе 2 вопроса и прикрепить их к сданной ДЗ:
   * 1. Насколько сложно добавить поддержку нового типа отчета?
   * 2. Как будет выглядеть проект, если в нем будет 1000+ типов отчетов?
   *
   *
   */

  static class ReportService {

    public byte[] createReport(Document document, String reportType) {
      // reportType = {"pdf-1", "json", "xml", ...}
      throw new UnsupportedOperationException();
    }

  }

  static class Document {
    private long id;
    private String number;
    // ...
  }

}
