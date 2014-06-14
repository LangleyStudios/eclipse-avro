/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.eclipse.emf.examples.extlibrary.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Library extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Library\",\"namespace\":\"org.eclipse.emf.examples.extlibrary.avro\",\"fields\":[{\"name\":\"address\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"writers\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Writer\",\"fields\":[{\"name\":\"address\",\"type\":\"string\"},{\"name\":\"firstName\",\"type\":\"string\"},{\"name\":\"lastName\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"books\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Book\",\"fields\":[{\"name\":\"publicationDate\",\"type\":\"string\"},{\"name\":\"copies\",\"type\":\"int\"},{\"name\":\"borrowers\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Borrower\",\"fields\":[{\"name\":\"address\",\"type\":\"string\"},{\"name\":\"firstName\",\"type\":\"string\"},{\"name\":\"lastName\",\"type\":\"string\"},{\"name\":\"borrowed\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Lendable\",\"fields\":[{\"name\":\"copies\",\"type\":\"int\"},{\"name\":\"borrowers\",\"type\":{\"type\":\"array\",\"items\":\"Borrower\"}}]}}}]}}},{\"name\":\"title\",\"type\":\"string\"},{\"name\":\"pages\",\"type\":\"int\"},{\"name\":\"category\",\"type\":{\"type\":\"enum\",\"name\":\"BookCategory\",\"symbols\":[\"Mystery\",\"ScienceFiction\",\"Biography\"]}},{\"name\":\"author\",\"type\":\"Writer\"}]}}}]}}},{\"name\":\"employees\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Employee\",\"fields\":[{\"name\":\"address\",\"type\":\"string\"},{\"name\":\"firstName\",\"type\":\"string\"},{\"name\":\"lastName\",\"type\":\"string\"},{\"name\":\"manager\",\"type\":\"Employee\"}]}}},{\"name\":\"borrowers\",\"type\":{\"type\":\"array\",\"items\":\"Borrower\"}},{\"name\":\"stock\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Item\",\"fields\":[{\"name\":\"publicationDate\",\"type\":\"string\"}]}}},{\"name\":\"books\",\"type\":{\"type\":\"array\",\"items\":\"Book\"}},{\"name\":\"branches\",\"type\":{\"type\":\"array\",\"items\":\"Library\"}},{\"name\":\"parentBranch\",\"type\":\"Library\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence address;
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public java.util.List<org.eclipse.emf.examples.extlibrary.avro.Writer> writers;
  @Deprecated public java.util.List<org.eclipse.emf.examples.extlibrary.avro.Employee> employees;
  @Deprecated public java.util.List<org.eclipse.emf.examples.extlibrary.avro.Borrower> borrowers;
  @Deprecated public java.util.List<org.eclipse.emf.examples.extlibrary.avro.Item> stock;
  @Deprecated public java.util.List<org.eclipse.emf.examples.extlibrary.avro.Book> books;
  @Deprecated public java.util.List<org.eclipse.emf.examples.extlibrary.avro.Library> branches;
  @Deprecated public org.eclipse.emf.examples.extlibrary.avro.Library parentBranch;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Library() {}

  /**
   * All-args constructor.
   */
  public Library(java.lang.CharSequence address, java.lang.CharSequence name, java.util.List<org.eclipse.emf.examples.extlibrary.avro.Writer> writers, java.util.List<org.eclipse.emf.examples.extlibrary.avro.Employee> employees, java.util.List<org.eclipse.emf.examples.extlibrary.avro.Borrower> borrowers, java.util.List<org.eclipse.emf.examples.extlibrary.avro.Item> stock, java.util.List<org.eclipse.emf.examples.extlibrary.avro.Book> books, java.util.List<org.eclipse.emf.examples.extlibrary.avro.Library> branches, org.eclipse.emf.examples.extlibrary.avro.Library parentBranch) {
    this.address = address;
    this.name = name;
    this.writers = writers;
    this.employees = employees;
    this.borrowers = borrowers;
    this.stock = stock;
    this.books = books;
    this.branches = branches;
    this.parentBranch = parentBranch;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return address;
    case 1: return name;
    case 2: return writers;
    case 3: return employees;
    case 4: return borrowers;
    case 5: return stock;
    case 6: return books;
    case 7: return branches;
    case 8: return parentBranch;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: address = (java.lang.CharSequence)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: writers = (java.util.List<org.eclipse.emf.examples.extlibrary.avro.Writer>)value$; break;
    case 3: employees = (java.util.List<org.eclipse.emf.examples.extlibrary.avro.Employee>)value$; break;
    case 4: borrowers = (java.util.List<org.eclipse.emf.examples.extlibrary.avro.Borrower>)value$; break;
    case 5: stock = (java.util.List<org.eclipse.emf.examples.extlibrary.avro.Item>)value$; break;
    case 6: books = (java.util.List<org.eclipse.emf.examples.extlibrary.avro.Book>)value$; break;
    case 7: branches = (java.util.List<org.eclipse.emf.examples.extlibrary.avro.Library>)value$; break;
    case 8: parentBranch = (org.eclipse.emf.examples.extlibrary.avro.Library)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'address' field.
   */
  public java.lang.CharSequence getAddress() {
    return address;
  }

  /**
   * Sets the value of the 'address' field.
   * @param value the value to set.
   */
  public void setAddress(java.lang.CharSequence value) {
    this.address = value;
  }

  /**
   * Gets the value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'writers' field.
   */
  public java.util.List<org.eclipse.emf.examples.extlibrary.avro.Writer> getWriters() {
    return writers;
  }

  /**
   * Sets the value of the 'writers' field.
   * @param value the value to set.
   */
  public void setWriters(java.util.List<org.eclipse.emf.examples.extlibrary.avro.Writer> value) {
    this.writers = value;
  }

  /**
   * Gets the value of the 'employees' field.
   */
  public java.util.List<org.eclipse.emf.examples.extlibrary.avro.Employee> getEmployees() {
    return employees;
  }

  /**
   * Sets the value of the 'employees' field.
   * @param value the value to set.
   */
  public void setEmployees(java.util.List<org.eclipse.emf.examples.extlibrary.avro.Employee> value) {
    this.employees = value;
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
   * Gets the value of the 'stock' field.
   */
  public java.util.List<org.eclipse.emf.examples.extlibrary.avro.Item> getStock() {
    return stock;
  }

  /**
   * Sets the value of the 'stock' field.
   * @param value the value to set.
   */
  public void setStock(java.util.List<org.eclipse.emf.examples.extlibrary.avro.Item> value) {
    this.stock = value;
  }

  /**
   * Gets the value of the 'books' field.
   */
  public java.util.List<org.eclipse.emf.examples.extlibrary.avro.Book> getBooks() {
    return books;
  }

  /**
   * Sets the value of the 'books' field.
   * @param value the value to set.
   */
  public void setBooks(java.util.List<org.eclipse.emf.examples.extlibrary.avro.Book> value) {
    this.books = value;
  }

  /**
   * Gets the value of the 'branches' field.
   */
  public java.util.List<org.eclipse.emf.examples.extlibrary.avro.Library> getBranches() {
    return branches;
  }

  /**
   * Sets the value of the 'branches' field.
   * @param value the value to set.
   */
  public void setBranches(java.util.List<org.eclipse.emf.examples.extlibrary.avro.Library> value) {
    this.branches = value;
  }

  /**
   * Gets the value of the 'parentBranch' field.
   */
  public org.eclipse.emf.examples.extlibrary.avro.Library getParentBranch() {
    return parentBranch;
  }

  /**
   * Sets the value of the 'parentBranch' field.
   * @param value the value to set.
   */
  public void setParentBranch(org.eclipse.emf.examples.extlibrary.avro.Library value) {
    this.parentBranch = value;
  }

  /** Creates a new Library RecordBuilder */
  public static org.eclipse.emf.examples.extlibrary.avro.Library.Builder newBuilder() {
    return new org.eclipse.emf.examples.extlibrary.avro.Library.Builder();
  }
  
  /** Creates a new Library RecordBuilder by copying an existing Builder */
  public static org.eclipse.emf.examples.extlibrary.avro.Library.Builder newBuilder(org.eclipse.emf.examples.extlibrary.avro.Library.Builder other) {
    return new org.eclipse.emf.examples.extlibrary.avro.Library.Builder(other);
  }
  
  /** Creates a new Library RecordBuilder by copying an existing Library instance */
  public static org.eclipse.emf.examples.extlibrary.avro.Library.Builder newBuilder(org.eclipse.emf.examples.extlibrary.avro.Library other) {
    return new org.eclipse.emf.examples.extlibrary.avro.Library.Builder(other);
  }
  
  /**
   * RecordBuilder for Library instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Library>
    implements org.apache.avro.data.RecordBuilder<Library> {

    private java.lang.CharSequence address;
    private java.lang.CharSequence name;
    private java.util.List<org.eclipse.emf.examples.extlibrary.avro.Writer> writers;
    private java.util.List<org.eclipse.emf.examples.extlibrary.avro.Employee> employees;
    private java.util.List<org.eclipse.emf.examples.extlibrary.avro.Borrower> borrowers;
    private java.util.List<org.eclipse.emf.examples.extlibrary.avro.Item> stock;
    private java.util.List<org.eclipse.emf.examples.extlibrary.avro.Book> books;
    private java.util.List<org.eclipse.emf.examples.extlibrary.avro.Library> branches;
    private org.eclipse.emf.examples.extlibrary.avro.Library parentBranch;

    /** Creates a new Builder */
    private Builder() {
      super(org.eclipse.emf.examples.extlibrary.avro.Library.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.eclipse.emf.examples.extlibrary.avro.Library.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.address)) {
        this.address = data().deepCopy(fields()[0].schema(), other.address);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.writers)) {
        this.writers = data().deepCopy(fields()[2].schema(), other.writers);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.employees)) {
        this.employees = data().deepCopy(fields()[3].schema(), other.employees);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.borrowers)) {
        this.borrowers = data().deepCopy(fields()[4].schema(), other.borrowers);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.stock)) {
        this.stock = data().deepCopy(fields()[5].schema(), other.stock);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.books)) {
        this.books = data().deepCopy(fields()[6].schema(), other.books);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.branches)) {
        this.branches = data().deepCopy(fields()[7].schema(), other.branches);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.parentBranch)) {
        this.parentBranch = data().deepCopy(fields()[8].schema(), other.parentBranch);
        fieldSetFlags()[8] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Library instance */
    private Builder(org.eclipse.emf.examples.extlibrary.avro.Library other) {
            super(org.eclipse.emf.examples.extlibrary.avro.Library.SCHEMA$);
      if (isValidValue(fields()[0], other.address)) {
        this.address = data().deepCopy(fields()[0].schema(), other.address);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.writers)) {
        this.writers = data().deepCopy(fields()[2].schema(), other.writers);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.employees)) {
        this.employees = data().deepCopy(fields()[3].schema(), other.employees);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.borrowers)) {
        this.borrowers = data().deepCopy(fields()[4].schema(), other.borrowers);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.stock)) {
        this.stock = data().deepCopy(fields()[5].schema(), other.stock);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.books)) {
        this.books = data().deepCopy(fields()[6].schema(), other.books);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.branches)) {
        this.branches = data().deepCopy(fields()[7].schema(), other.branches);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.parentBranch)) {
        this.parentBranch = data().deepCopy(fields()[8].schema(), other.parentBranch);
        fieldSetFlags()[8] = true;
      }
    }

    /** Gets the value of the 'address' field */
    public java.lang.CharSequence getAddress() {
      return address;
    }
    
    /** Sets the value of the 'address' field */
    public org.eclipse.emf.examples.extlibrary.avro.Library.Builder setAddress(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.address = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'address' field has been set */
    public boolean hasAddress() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'address' field */
    public org.eclipse.emf.examples.extlibrary.avro.Library.Builder clearAddress() {
      address = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public java.lang.CharSequence getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public org.eclipse.emf.examples.extlibrary.avro.Library.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'name' field */
    public org.eclipse.emf.examples.extlibrary.avro.Library.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'writers' field */
    public java.util.List<org.eclipse.emf.examples.extlibrary.avro.Writer> getWriters() {
      return writers;
    }
    
    /** Sets the value of the 'writers' field */
    public org.eclipse.emf.examples.extlibrary.avro.Library.Builder setWriters(java.util.List<org.eclipse.emf.examples.extlibrary.avro.Writer> value) {
      validate(fields()[2], value);
      this.writers = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'writers' field has been set */
    public boolean hasWriters() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'writers' field */
    public org.eclipse.emf.examples.extlibrary.avro.Library.Builder clearWriters() {
      writers = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'employees' field */
    public java.util.List<org.eclipse.emf.examples.extlibrary.avro.Employee> getEmployees() {
      return employees;
    }
    
    /** Sets the value of the 'employees' field */
    public org.eclipse.emf.examples.extlibrary.avro.Library.Builder setEmployees(java.util.List<org.eclipse.emf.examples.extlibrary.avro.Employee> value) {
      validate(fields()[3], value);
      this.employees = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'employees' field has been set */
    public boolean hasEmployees() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'employees' field */
    public org.eclipse.emf.examples.extlibrary.avro.Library.Builder clearEmployees() {
      employees = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'borrowers' field */
    public java.util.List<org.eclipse.emf.examples.extlibrary.avro.Borrower> getBorrowers() {
      return borrowers;
    }
    
    /** Sets the value of the 'borrowers' field */
    public org.eclipse.emf.examples.extlibrary.avro.Library.Builder setBorrowers(java.util.List<org.eclipse.emf.examples.extlibrary.avro.Borrower> value) {
      validate(fields()[4], value);
      this.borrowers = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'borrowers' field has been set */
    public boolean hasBorrowers() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'borrowers' field */
    public org.eclipse.emf.examples.extlibrary.avro.Library.Builder clearBorrowers() {
      borrowers = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'stock' field */
    public java.util.List<org.eclipse.emf.examples.extlibrary.avro.Item> getStock() {
      return stock;
    }
    
    /** Sets the value of the 'stock' field */
    public org.eclipse.emf.examples.extlibrary.avro.Library.Builder setStock(java.util.List<org.eclipse.emf.examples.extlibrary.avro.Item> value) {
      validate(fields()[5], value);
      this.stock = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'stock' field has been set */
    public boolean hasStock() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'stock' field */
    public org.eclipse.emf.examples.extlibrary.avro.Library.Builder clearStock() {
      stock = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'books' field */
    public java.util.List<org.eclipse.emf.examples.extlibrary.avro.Book> getBooks() {
      return books;
    }
    
    /** Sets the value of the 'books' field */
    public org.eclipse.emf.examples.extlibrary.avro.Library.Builder setBooks(java.util.List<org.eclipse.emf.examples.extlibrary.avro.Book> value) {
      validate(fields()[6], value);
      this.books = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'books' field has been set */
    public boolean hasBooks() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'books' field */
    public org.eclipse.emf.examples.extlibrary.avro.Library.Builder clearBooks() {
      books = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'branches' field */
    public java.util.List<org.eclipse.emf.examples.extlibrary.avro.Library> getBranches() {
      return branches;
    }
    
    /** Sets the value of the 'branches' field */
    public org.eclipse.emf.examples.extlibrary.avro.Library.Builder setBranches(java.util.List<org.eclipse.emf.examples.extlibrary.avro.Library> value) {
      validate(fields()[7], value);
      this.branches = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'branches' field has been set */
    public boolean hasBranches() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'branches' field */
    public org.eclipse.emf.examples.extlibrary.avro.Library.Builder clearBranches() {
      branches = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'parentBranch' field */
    public org.eclipse.emf.examples.extlibrary.avro.Library getParentBranch() {
      return parentBranch;
    }
    
    /** Sets the value of the 'parentBranch' field */
    public org.eclipse.emf.examples.extlibrary.avro.Library.Builder setParentBranch(org.eclipse.emf.examples.extlibrary.avro.Library value) {
      validate(fields()[8], value);
      this.parentBranch = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'parentBranch' field has been set */
    public boolean hasParentBranch() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'parentBranch' field */
    public org.eclipse.emf.examples.extlibrary.avro.Library.Builder clearParentBranch() {
      parentBranch = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    public Library build() {
      try {
        Library record = new Library();
        record.address = fieldSetFlags()[0] ? this.address : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.writers = fieldSetFlags()[2] ? this.writers : (java.util.List<org.eclipse.emf.examples.extlibrary.avro.Writer>) defaultValue(fields()[2]);
        record.employees = fieldSetFlags()[3] ? this.employees : (java.util.List<org.eclipse.emf.examples.extlibrary.avro.Employee>) defaultValue(fields()[3]);
        record.borrowers = fieldSetFlags()[4] ? this.borrowers : (java.util.List<org.eclipse.emf.examples.extlibrary.avro.Borrower>) defaultValue(fields()[4]);
        record.stock = fieldSetFlags()[5] ? this.stock : (java.util.List<org.eclipse.emf.examples.extlibrary.avro.Item>) defaultValue(fields()[5]);
        record.books = fieldSetFlags()[6] ? this.books : (java.util.List<org.eclipse.emf.examples.extlibrary.avro.Book>) defaultValue(fields()[6]);
        record.branches = fieldSetFlags()[7] ? this.branches : (java.util.List<org.eclipse.emf.examples.extlibrary.avro.Library>) defaultValue(fields()[7]);
        record.parentBranch = fieldSetFlags()[8] ? this.parentBranch : (org.eclipse.emf.examples.extlibrary.avro.Library) defaultValue(fields()[8]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}