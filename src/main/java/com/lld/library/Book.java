package com.lld.library;

import java.util.List;

import com.concept.library.Author;

public abstract class Book {
  private String ISBN;
  private String title;
  private String subject;
  private String publisher;
  private String language;
  private int numberOfPages;
  private List<Author> authors;
}

