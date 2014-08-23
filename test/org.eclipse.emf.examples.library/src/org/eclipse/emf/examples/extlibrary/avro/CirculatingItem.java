/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.eclipse.emf.examples.extlibrary.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class CirculatingItem extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CirculatingItem\",\"namespace\":\"org.eclipse.emf.examples.extlibrary.avro\",\"fields\":[{\"name\":\"publicationDate\",\"type\":[\"null\",\"string\"]},{\"name\":\"copies\",\"type\":\"int\"},{\"name\":\"borrowers\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Borrower\",\"fields\":[{\"name\":\"address\",\"type\":[\"null\",\"string\"]},{\"name\":\"firstName\",\"type\":\"string\"},{\"name\":\"lastName\",\"type\":\"string\"},{\"name\":\"borrowed\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Lendable\",\"fields\":[{\"name\":\"copies\",\"type\":\"int\"},{\"name\":\"borrowers\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"Borrower\"}]}]}}]}]}}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence publicationDate;
  @Deprecated public int copies;
  @Deprecated public java.util.List<org.eclipse.emf.examples.extlibrary.avro.Borrower> borrowers;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public CirculatingItem() {}

  /**
   * All-args constructor.
   */
  public CirculatingItem(java.lang.CharSequence publicationDate, java.lang.Integer copies, java.util.List<org.eclipse.emf.examples.extlibrary.avro.Borrower> borrowers) {
    this.publicationDate = publicationDate;
    this.copies = copies;
    this.borrowers = borrowers;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return publicationDate;
    case 1: return copies;
    case 2: return borrowers;
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

  /** Creates a new CirculatingItem RecordBuilder */
  public static org.eclipse.emf.examples.extlibrary.avro.CirculatingItem.Builder newBuilder() {
    return new org.eclipse.emf.examples.extlibrary.avro.CirculatingItem.Builder();
  }
  
  /** Creates a new CirculatingItem RecordBuilder by copying an existing Builder */
  public static org.eclipse.emf.examples.extlibrary.avro.CirculatingItem.Builder newBuilder(org.eclipse.emf.examples.extlibrary.avro.CirculatingItem.Builder other) {
    return new org.eclipse.emf.examples.extlibrary.avro.CirculatingItem.Builder(other);
  }
  
  /** Creates a new CirculatingItem RecordBuilder by copying an existing CirculatingItem instance */
  public static org.eclipse.emf.examples.extlibrary.avro.CirculatingItem.Builder newBuilder(org.eclipse.emf.examples.extlibrary.avro.CirculatingItem other) {
    return new org.eclipse.emf.examples.extlibrary.avro.CirculatingItem.Builder(other);
  }
  
  /**
   * RecordBuilder for CirculatingItem instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CirculatingItem>
    implements org.apache.avro.data.RecordBuilder<CirculatingItem> {

    private java.lang.CharSequence publicationDate;
    private int copies;
    private java.util.List<org.eclipse.emf.examples.extlibrary.avro.Borrower> borrowers;

    /** Creates a new Builder */
    private Builder() {
      super(org.eclipse.emf.examples.extlibrary.avro.CirculatingItem.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.eclipse.emf.examples.extlibrary.avro.CirculatingItem.Builder other) {
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
    }
    
    /** Creates a Builder by copying an existing CirculatingItem instance */
    private Builder(org.eclipse.emf.examples.extlibrary.avro.CirculatingItem other) {
            super(org.eclipse.emf.examples.extlibrary.avro.CirculatingItem.SCHEMA$);
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
    }

    /** Gets the value of the 'publicationDate' field */
    public java.lang.CharSequence getPublicationDate() {
      return publicationDate;
    }
    
    /** Sets the value of the 'publicationDate' field */
    public org.eclipse.emf.examples.extlibrary.avro.CirculatingItem.Builder setPublicationDate(java.lang.CharSequence value) {
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
    public org.eclipse.emf.examples.extlibrary.avro.CirculatingItem.Builder clearPublicationDate() {
      publicationDate = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'copies' field */
    public java.lang.Integer getCopies() {
      return copies;
    }
    
    /** Sets the value of the 'copies' field */
    public org.eclipse.emf.examples.extlibrary.avro.CirculatingItem.Builder setCopies(int value) {
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
    public org.eclipse.emf.examples.extlibrary.avro.CirculatingItem.Builder clearCopies() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'borrowers' field */
    public java.util.List<org.eclipse.emf.examples.extlibrary.avro.Borrower> getBorrowers() {
      return borrowers;
    }
    
    /** Sets the value of the 'borrowers' field */
    public org.eclipse.emf.examples.extlibrary.avro.CirculatingItem.Builder setBorrowers(java.util.List<org.eclipse.emf.examples.extlibrary.avro.Borrower> value) {
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
    public org.eclipse.emf.examples.extlibrary.avro.CirculatingItem.Builder clearBorrowers() {
      borrowers = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public CirculatingItem build() {
      try {
        CirculatingItem record = new CirculatingItem();
        record.publicationDate = fieldSetFlags()[0] ? this.publicationDate : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.copies = fieldSetFlags()[1] ? this.copies : (java.lang.Integer) defaultValue(fields()[1]);
        record.borrowers = fieldSetFlags()[2] ? this.borrowers : (java.util.List<org.eclipse.emf.examples.extlibrary.avro.Borrower>) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
