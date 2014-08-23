/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.eclipse.emf.examples.extlibrary.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Book extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Book\",\"namespace\":\"org.eclipse.emf.examples.extlibrary.avro\",\"fields\":[{\"name\":\"publicationDate\",\"type\":[\"null\",\"string\"]},{\"name\":\"copies\",\"type\":\"int\"},{\"name\":\"borrowers\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Borrower\",\"fields\":[{\"name\":\"address\",\"type\":[\"null\",\"string\"]},{\"name\":\"firstName\",\"type\":\"string\"},{\"name\":\"lastName\",\"type\":\"string\"},{\"name\":\"borrowed\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Lendable\",\"fields\":[{\"name\":\"copies\",\"type\":\"int\"},{\"name\":\"borrowers\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"Borrower\"}]}]}}]}]}}]},{\"name\":\"title\",\"type\":[\"null\",\"string\"]},{\"name\":\"pages\",\"type\":\"int\"},{\"name\":\"category\",\"type\":{\"type\":\"enum\",\"name\":\"BookCategory\",\"symbols\":[\"Mystery\",\"ScienceFiction\",\"Biography\"]}},{\"name\":\"author\",\"type\":{\"type\":\"record\",\"name\":\"Writer\",\"fields\":[{\"name\":\"address\",\"type\":[\"null\",\"string\"]},{\"name\":\"firstName\",\"type\":\"string\"},{\"name\":\"lastName\",\"type\":\"string\"},{\"name\":\"name\",\"type\":[\"null\",\"string\"]},{\"name\":\"books\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"Book\"}]}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence publicationDate;
  @Deprecated public int copies;
  @Deprecated public java.util.List<org.eclipse.emf.examples.extlibrary.avro.Borrower> borrowers;
  @Deprecated public java.lang.CharSequence title;
  @Deprecated public int pages;
  @Deprecated public org.eclipse.emf.examples.extlibrary.avro.BookCategory category;
  @Deprecated public org.eclipse.emf.examples.extlibrary.avro.Writer author;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Book() {}

  /**
   * All-args constructor.
   */
  public Book(java.lang.CharSequence publicationDate, java.lang.Integer copies, java.util.List<org.eclipse.emf.examples.extlibrary.avro.Borrower> borrowers, java.lang.CharSequence title, java.lang.Integer pages, org.eclipse.emf.examples.extlibrary.avro.BookCategory category, org.eclipse.emf.examples.extlibrary.avro.Writer author) {
    this.publicationDate = publicationDate;
    this.copies = copies;
    this.borrowers = borrowers;
    this.title = title;
    this.pages = pages;
    this.category = category;
    this.author = author;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return publicationDate;
    case 1: return copies;
    case 2: return borrowers;
    case 3: return title;
    case 4: return pages;
    case 5: return category;
    case 6: return author;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: publicationDate = (java.lang.CharSequence)value$; break;
    case 1: copies = (java.lang.Integer)value$; break;
    case 2: borrowers = (java.util.List<org.eclipse.emf.examples.extlibrary.avro.Borrower>)value$; break;
    case 3: title = (java.lang.CharSequence)value$; break;
    case 4: pages = (java.lang.Integer)value$; break;
    case 5: category = (org.eclipse.emf.examples.extlibrary.avro.BookCategory)value$; break;
    case 6: author = (org.eclipse.emf.examples.extlibrary.avro.Writer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'publicationDate' field.
   */
  public java.lang.CharSequence getPublicationDate() {
    return publicationDate;
  }

  /**
   * Sets the value of the 'publicationDate' field.
   * @param value the value to set.
   */
  public void setPublicationDate(java.lang.CharSequence value) {
    this.publicationDate = value;
  }

  /**
   * Gets the value of the 'copies' field.
   */
  public java.lang.Integer getCopies() {
    return copies;
  }

  /**
   * Sets the value of the 'copies' field.
   * @param value the value to set.
   */
  public void setCopies(java.lang.Integer value) {
    this.copies = value;
  }

  /**
   * Gets the value of the 'borrowers' field.
   */
  public java.util.List<org.eclipse.emf.examples.extlibrary.avro.Borrower> getBorrowers() {
    return borrowers;
  }

  /**
   * Sets the value of the 'borrowers' field.
   * @param value the value to set.
   */
  public void setBorrowers(java.util.List<org.eclipse.emf.examples.extlibrary.avro.Borrower> value) {
    this.borrowers = value;
  }

  /**
   * Gets the value of the 'title' field.
   */
  public java.lang.CharSequence getTitle() {
    return title;
  }

  /**
   * Sets the value of the 'title' field.
   * @param value the value to set.
   */
  public void setTitle(java.lang.CharSequence value) {
    this.title = value;
  }

  /**
   * Gets the value of the 'pages' field.
   */
  public java.lang.Integer getPages() {
    return pages;
  }

  /**
   * Sets the value of the 'pages' field.
   * @param value the value to set.
   */
  public void setPages(java.lang.Integer value) {
    this.pages = value;
  }

  /**
   * Gets the value of the 'category' field.
   */
  public org.eclipse.emf.examples.extlibrary.avro.BookCategory getCategory() {
    return category;
  }

  /**
   * Sets the value of the 'category' field.
   * @param value the value to set.
   */
  public void setCategory(org.eclipse.emf.examples.extlibrary.avro.BookCategory value) {
    this.category = value;
  }

  /**
   * Gets the value of the 'author' field.
   */
  public org.eclipse.emf.examples.extlibrary.avro.Writer getAuthor() {
    return author;
  }

  /**
   * Sets the value of the 'author' field.
   * @param value the value to set.
   */
  public void setAuthor(org.eclipse.emf.examples.extlibrary.avro.Writer value) {
    this.author = value;
  }

  /** Creates a new Book RecordBuilder */
  public static org.eclipse.emf.examples.extlibrary.avro.Book.Builder newBuilder() {
    return new org.eclipse.emf.examples.extlibrary.avro.Book.Builder();
  }
  
  /** Creates a new Book RecordBuilder by copying an existing Builder */
  public static org.eclipse.emf.examples.extlibrary.avro.Book.Builder newBuilder(org.eclipse.emf.examples.extlibrary.avro.Book.Builder other) {
    return new org.eclipse.emf.examples.extlibrary.avro.Book.Builder(other);
  }
  
  /** Creates a new Book RecordBuilder by copying an existing Book instance */
  public static org.eclipse.emf.examples.extlibrary.avro.Book.Builder newBuilder(org.eclipse.emf.examples.extlibrary.avro.Book other) {
    return new org.eclipse.emf.examples.extlibrary.avro.Book.Builder(other);
  }
  
  /**
   * RecordBuilder for Book instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Book>
    implements org.apache.avro.data.RecordBuilder<Book> {

    private java.lang.CharSequence publicationDate;
    private int copies;
    private java.util.List<org.eclipse.emf.examples.extlibrary.avro.Borrower> borrowers;
    private java.lang.CharSequence title;
    private int pages;
    private org.eclipse.emf.examples.extlibrary.avro.BookCategory category;
    private org.eclipse.emf.examples.extlibrary.avro.Writer author;

    /** Creates a new Builder */
    private Builder() {
      super(org.eclipse.emf.examples.extlibrary.avro.Book.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.eclipse.emf.examples.extlibrary.avro.Book.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.publicationDate)) {
        this.publicationDate = data().deepCopy(fields()[0].schema(), other.publicationDate);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.copies)) {
        this.copies = data().deepCopy(fields()[1].schema(), other.copies);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.borrowers)) {
        this.borrowers = data().deepCopy(fields()[2].schema(), other.borrowers);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.title)) {
        this.title = data().deepCopy(fields()[3].schema(), other.title);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.pages)) {
        this.pages = data().deepCopy(fields()[4].schema(), other.pages);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.category)) {
        this.category = data().deepCopy(fields()[5].schema(), other.category);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.author)) {
        this.author = data().deepCopy(fields()[6].schema(), other.author);
        fieldSetFlags()[6] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Book instance */
    private Builder(org.eclipse.emf.examples.extlibrary.avro.Book other) {
            super(org.eclipse.emf.examples.extlibrary.avro.Book.SCHEMA$);
      if (isValidValue(fields()[0], other.publicationDate)) {
        this.publicationDate = data().deepCopy(fields()[0].schema(), other.publicationDate);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.copies)) {
        this.copies = data().deepCopy(fields()[1].schema(), other.copies);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.borrowers)) {
        this.borrowers = data().deepCopy(fields()[2].schema(), other.borrowers);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.title)) {
        this.title = data().deepCopy(fields()[3].schema(), other.title);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.pages)) {
        this.pages = data().deepCopy(fields()[4].schema(), other.pages);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.category)) {
        this.category = data().deepCopy(fields()[5].schema(), other.category);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.author)) {
        this.author = data().deepCopy(fields()[6].schema(), other.author);
        fieldSetFlags()[6] = true;
      }
    }

    /** Gets the value of the 'publicationDate' field */
    public java.lang.CharSequence getPublicationDate() {
      return publicationDate;
    }
    
    /** Sets the value of the 'publicationDate' field */
    public org.eclipse.emf.examples.extlibrary.avro.Book.Builder setPublicationDate(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.publicationDate = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'publicationDate' field has been set */
    public boolean hasPublicationDate() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'publicationDate' field */
    public org.eclipse.emf.examples.extlibrary.avro.Book.Builder clearPublicationDate() {
      publicationDate = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'copies' field */
    public java.lang.Integer getCopies() {
      return copies;
    }
    
    /** Sets the value of the 'copies' field */
    public org.eclipse.emf.examples.extlibrary.avro.Book.Builder setCopies(int value) {
      validate(fields()[1], value);
      this.copies = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'copies' field has been set */
    public boolean hasCopies() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'copies' field */
    public org.eclipse.emf.examples.extlibrary.avro.Book.Builder clearCopies() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'borrowers' field */
    public java.util.List<org.eclipse.emf.examples.extlibrary.avro.Borrower> getBorrowers() {
      return borrowers;
    }
    
    /** Sets the value of the 'borrowers' field */
    public org.eclipse.emf.examples.extlibrary.avro.Book.Builder setBorrowers(java.util.List<org.eclipse.emf.examples.extlibrary.avro.Borrower> value) {
      validate(fields()[2], value);
      this.borrowers = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'borrowers' field has been set */
    public boolean hasBorrowers() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'borrowers' field */
    public org.eclipse.emf.examples.extlibrary.avro.Book.Builder clearBorrowers() {
      borrowers = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'title' field */
    public java.lang.CharSequence getTitle() {
      return title;
    }
    
    /** Sets the value of the 'title' field */
    public org.eclipse.emf.examples.extlibrary.avro.Book.Builder setTitle(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.title = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'title' field has been set */
    public boolean hasTitle() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'title' field */
    public org.eclipse.emf.examples.extlibrary.avro.Book.Builder clearTitle() {
      title = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'pages' field */
    public java.lang.Integer getPages() {
      return pages;
    }
    
    /** Sets the value of the 'pages' field */
    public org.eclipse.emf.examples.extlibrary.avro.Book.Builder setPages(int value) {
      validate(fields()[4], value);
      this.pages = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'pages' field has been set */
    public boolean hasPages() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'pages' field */
    public org.eclipse.emf.examples.extlibrary.avro.Book.Builder clearPages() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'category' field */
    public org.eclipse.emf.examples.extlibrary.avro.BookCategory getCategory() {
      return category;
    }
    
    /** Sets the value of the 'category' field */
    public org.eclipse.emf.examples.extlibrary.avro.Book.Builder setCategory(org.eclipse.emf.examples.extlibrary.avro.BookCategory value) {
      validate(fields()[5], value);
      this.category = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'category' field has been set */
    public boolean hasCategory() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'category' field */
    public org.eclipse.emf.examples.extlibrary.avro.Book.Builder clearCategory() {
      category = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'author' field */
    public org.eclipse.emf.examples.extlibrary.avro.Writer getAuthor() {
      return author;
    }
    
    /** Sets the value of the 'author' field */
    public org.eclipse.emf.examples.extlibrary.avro.Book.Builder setAuthor(org.eclipse.emf.examples.extlibrary.avro.Writer value) {
      validate(fields()[6], value);
      this.author = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'author' field has been set */
    public boolean hasAuthor() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'author' field */
    public org.eclipse.emf.examples.extlibrary.avro.Book.Builder clearAuthor() {
      author = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    public Book build() {
      try {
        Book record = new Book();
        record.publicationDate = fieldSetFlags()[0] ? this.publicationDate : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.copies = fieldSetFlags()[1] ? this.copies : (java.lang.Integer) defaultValue(fields()[1]);
        record.borrowers = fieldSetFlags()[2] ? this.borrowers : (java.util.List<org.eclipse.emf.examples.extlibrary.avro.Borrower>) defaultValue(fields()[2]);
        record.title = fieldSetFlags()[3] ? this.title : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.pages = fieldSetFlags()[4] ? this.pages : (java.lang.Integer) defaultValue(fields()[4]);
        record.category = fieldSetFlags()[5] ? this.category : (org.eclipse.emf.examples.extlibrary.avro.BookCategory) defaultValue(fields()[5]);
        record.author = fieldSetFlags()[6] ? this.author : (org.eclipse.emf.examples.extlibrary.avro.Writer) defaultValue(fields()[6]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
