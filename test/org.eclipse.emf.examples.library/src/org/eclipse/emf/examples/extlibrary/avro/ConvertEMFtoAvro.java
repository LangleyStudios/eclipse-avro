package org.eclipse.emf.examples.extlibrary.avro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import net.langleystudios.avro.AvroEMFConverter;

import org.apache.avro.Schema;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.EList;

public class ConvertEMFtoAvro implements AvroEMFConverter {

public Schema getSchema() {
	List<Schema> schemaList = new ArrayList<Schema>();
	schemaList.add(org.eclipse.emf.examples.extlibrary.avro.Book.SCHEMA$);
	schemaList.add(org.eclipse.emf.examples.extlibrary.avro.Library.SCHEMA$);
	schemaList.add(org.eclipse.emf.examples.extlibrary.avro.Writer.SCHEMA$);
	schemaList.add(org.eclipse.emf.examples.extlibrary.avro.Item.SCHEMA$);
	schemaList.add(org.eclipse.emf.examples.extlibrary.avro.Lendable.SCHEMA$);
	schemaList.add(org.eclipse.emf.examples.extlibrary.avro.CirculatingItem.SCHEMA$);
	schemaList.add(org.eclipse.emf.examples.extlibrary.avro.Periodical.SCHEMA$);
	schemaList.add(org.eclipse.emf.examples.extlibrary.avro.AudioVisualItem.SCHEMA$);
	schemaList.add(org.eclipse.emf.examples.extlibrary.avro.BookOnTape.SCHEMA$);
	schemaList.add(org.eclipse.emf.examples.extlibrary.avro.VideoCassette.SCHEMA$);
	schemaList.add(org.eclipse.emf.examples.extlibrary.avro.Borrower.SCHEMA$);
	schemaList.add(org.eclipse.emf.examples.extlibrary.avro.Person.SCHEMA$);
	schemaList.add(org.eclipse.emf.examples.extlibrary.avro.Employee.SCHEMA$);
	schemaList.add(org.eclipse.emf.examples.extlibrary.avro.Addressable.SCHEMA$);
	Schema unionSchema = Schema.createUnion(schemaList);
	return unionSchema;
}

public Object convertEObject(EObject eobject) {
	if(eobject instanceof org.eclipse.emf.examples.extlibrary.Book)
	{
		return convertBook((org.eclipse.emf.examples.extlibrary.Book)eobject);
	}
	if(eobject instanceof org.eclipse.emf.examples.extlibrary.Library)
	{
		return convertLibrary((org.eclipse.emf.examples.extlibrary.Library)eobject);
	}
	if(eobject instanceof org.eclipse.emf.examples.extlibrary.Writer)
	{
		return convertWriter((org.eclipse.emf.examples.extlibrary.Writer)eobject);
	}
	if(eobject instanceof org.eclipse.emf.examples.extlibrary.Item)
	{
		return convertItem((org.eclipse.emf.examples.extlibrary.Item)eobject);
	}
	if(eobject instanceof org.eclipse.emf.examples.extlibrary.Lendable)
	{
		return convertLendable((org.eclipse.emf.examples.extlibrary.Lendable)eobject);
	}
	if(eobject instanceof org.eclipse.emf.examples.extlibrary.CirculatingItem)
	{
		return convertCirculatingItem((org.eclipse.emf.examples.extlibrary.CirculatingItem)eobject);
	}
	if(eobject instanceof org.eclipse.emf.examples.extlibrary.Periodical)
	{
		return convertPeriodical((org.eclipse.emf.examples.extlibrary.Periodical)eobject);
	}
	if(eobject instanceof org.eclipse.emf.examples.extlibrary.AudioVisualItem)
	{
		return convertAudioVisualItem((org.eclipse.emf.examples.extlibrary.AudioVisualItem)eobject);
	}
	if(eobject instanceof org.eclipse.emf.examples.extlibrary.BookOnTape)
	{
		return convertBookOnTape((org.eclipse.emf.examples.extlibrary.BookOnTape)eobject);
	}
	if(eobject instanceof org.eclipse.emf.examples.extlibrary.VideoCassette)
	{
		return convertVideoCassette((org.eclipse.emf.examples.extlibrary.VideoCassette)eobject);
	}
	if(eobject instanceof org.eclipse.emf.examples.extlibrary.Borrower)
	{
		return convertBorrower((org.eclipse.emf.examples.extlibrary.Borrower)eobject);
	}
	if(eobject instanceof org.eclipse.emf.examples.extlibrary.Person)
	{
		return convertPerson((org.eclipse.emf.examples.extlibrary.Person)eobject);
	}
	if(eobject instanceof org.eclipse.emf.examples.extlibrary.Employee)
	{
		return convertEmployee((org.eclipse.emf.examples.extlibrary.Employee)eobject);
	}
	if(eobject instanceof org.eclipse.emf.examples.extlibrary.Addressable)
	{
		return convertAddressable((org.eclipse.emf.examples.extlibrary.Addressable)eobject);
	}
	return null;
}

public Schema getSchema(EObject eobject) {
	if(eobject instanceof org.eclipse.emf.examples.extlibrary.Book)
	{
		return org.eclipse.emf.examples.extlibrary.avro.Book.getClassSchema();
	}
	if(eobject instanceof org.eclipse.emf.examples.extlibrary.Library)
	{
		return org.eclipse.emf.examples.extlibrary.avro.Library.getClassSchema();
	}
	if(eobject instanceof org.eclipse.emf.examples.extlibrary.Writer)
	{
		return org.eclipse.emf.examples.extlibrary.avro.Writer.getClassSchema();
	}
	if(eobject instanceof org.eclipse.emf.examples.extlibrary.Item)
	{
		return org.eclipse.emf.examples.extlibrary.avro.Item.getClassSchema();
	}
	if(eobject instanceof org.eclipse.emf.examples.extlibrary.Lendable)
	{
		return org.eclipse.emf.examples.extlibrary.avro.Lendable.getClassSchema();
	}
	if(eobject instanceof org.eclipse.emf.examples.extlibrary.CirculatingItem)
	{
		return org.eclipse.emf.examples.extlibrary.avro.CirculatingItem.getClassSchema();
	}
	if(eobject instanceof org.eclipse.emf.examples.extlibrary.Periodical)
	{
		return org.eclipse.emf.examples.extlibrary.avro.Periodical.getClassSchema();
	}
	if(eobject instanceof org.eclipse.emf.examples.extlibrary.AudioVisualItem)
	{
		return org.eclipse.emf.examples.extlibrary.avro.AudioVisualItem.getClassSchema();
	}
	if(eobject instanceof org.eclipse.emf.examples.extlibrary.BookOnTape)
	{
		return org.eclipse.emf.examples.extlibrary.avro.BookOnTape.getClassSchema();
	}
	if(eobject instanceof org.eclipse.emf.examples.extlibrary.VideoCassette)
	{
		return org.eclipse.emf.examples.extlibrary.avro.VideoCassette.getClassSchema();
	}
	if(eobject instanceof org.eclipse.emf.examples.extlibrary.Borrower)
	{
		return org.eclipse.emf.examples.extlibrary.avro.Borrower.getClassSchema();
	}
	if(eobject instanceof org.eclipse.emf.examples.extlibrary.Person)
	{
		return org.eclipse.emf.examples.extlibrary.avro.Person.getClassSchema();
	}
	if(eobject instanceof org.eclipse.emf.examples.extlibrary.Employee)
	{
		return org.eclipse.emf.examples.extlibrary.avro.Employee.getClassSchema();
	}
	if(eobject instanceof org.eclipse.emf.examples.extlibrary.Addressable)
	{
		return org.eclipse.emf.examples.extlibrary.avro.Addressable.getClassSchema();
	}
	return null;
}

public org.eclipse.emf.examples.extlibrary.avro.Book convertBook(
	org.eclipse.emf.examples.extlibrary.Book input) {

	org.eclipse.emf.examples.extlibrary.avro.Book output = new org.eclipse.emf.examples.extlibrary.avro.Book();

	output.setPublicationDate(input.getPublicationDate().toString());

	output.setCopies(input.getCopies());

	List<org.eclipse.emf.examples.extlibrary.avro.Borrower> borrowersList = new ArrayList<org.eclipse.emf.examples.extlibrary.avro.Borrower>();
	for(org.eclipse.emf.examples.extlibrary.Borrower itr : input.getBorrowers()) {
		borrowersList.add(convertBorrower(itr));
	}
	output.setBorrowers(borrowersList);

	output.setTitle(input.getTitle());

	output.setPages(input.getPages());

	output.setCategory(org.eclipse.emf.examples.extlibrary.avro.BookCategory.valueOf(input.getCategory().getLiteral()));

	output.setAuthor(convertWriter(input.getAuthor()));


	return output;
}

public org.eclipse.emf.examples.extlibrary.avro.Library convertLibrary(
	org.eclipse.emf.examples.extlibrary.Library input) {

	org.eclipse.emf.examples.extlibrary.avro.Library output = new org.eclipse.emf.examples.extlibrary.avro.Library();

	output.setAddress(input.getAddress());

	output.setName(input.getName());

	List<org.eclipse.emf.examples.extlibrary.avro.Writer> writersList = new ArrayList<org.eclipse.emf.examples.extlibrary.avro.Writer>();
	for(org.eclipse.emf.examples.extlibrary.Writer itr : input.getWriters()) {
		writersList.add(convertWriter(itr));
	}
	output.setWriters(writersList);

	List<org.eclipse.emf.examples.extlibrary.avro.Employee> employeesList = new ArrayList<org.eclipse.emf.examples.extlibrary.avro.Employee>();
	for(org.eclipse.emf.examples.extlibrary.Employee itr : input.getEmployees()) {
		employeesList.add(convertEmployee(itr));
	}
	output.setEmployees(employeesList);

	List<org.eclipse.emf.examples.extlibrary.avro.Borrower> borrowersList = new ArrayList<org.eclipse.emf.examples.extlibrary.avro.Borrower>();
	for(org.eclipse.emf.examples.extlibrary.Borrower itr : input.getBorrowers()) {
		borrowersList.add(convertBorrower(itr));
	}
	output.setBorrowers(borrowersList);

	List<org.eclipse.emf.examples.extlibrary.avro.Item> stockList = new ArrayList<org.eclipse.emf.examples.extlibrary.avro.Item>();
	for(org.eclipse.emf.examples.extlibrary.Item itr : input.getStock()) {
		stockList.add(convertItem(itr));
	}
	output.setStock(stockList);

	List<org.eclipse.emf.examples.extlibrary.avro.Book> booksList = new ArrayList<org.eclipse.emf.examples.extlibrary.avro.Book>();
	for(org.eclipse.emf.examples.extlibrary.Book itr : input.getBooks()) {
		booksList.add(convertBook(itr));
	}
	output.setBooks(booksList);

	List<org.eclipse.emf.examples.extlibrary.avro.Library> branchesList = new ArrayList<org.eclipse.emf.examples.extlibrary.avro.Library>();
	for(org.eclipse.emf.examples.extlibrary.Library itr : input.getBranches()) {
		branchesList.add(convertLibrary(itr));
	}
	output.setBranches(branchesList);

	output.setParentBranch(convertLibrary(input.getParentBranch()));



	return output;
}

public org.eclipse.emf.examples.extlibrary.avro.Writer convertWriter(
	org.eclipse.emf.examples.extlibrary.Writer input) {

	org.eclipse.emf.examples.extlibrary.avro.Writer output = new org.eclipse.emf.examples.extlibrary.avro.Writer();

	output.setAddress(input.getAddress());

	output.setFirstName(input.getFirstName());

	output.setLastName(input.getLastName());

	output.setName(input.getName());

	List<org.eclipse.emf.examples.extlibrary.avro.Book> booksList = new ArrayList<org.eclipse.emf.examples.extlibrary.avro.Book>();
	for(org.eclipse.emf.examples.extlibrary.Book itr : input.getBooks()) {
		booksList.add(convertBook(itr));
	}
	output.setBooks(booksList);


	return output;
}

public org.eclipse.emf.examples.extlibrary.avro.Item convertItem(
	org.eclipse.emf.examples.extlibrary.Item input) {

	org.eclipse.emf.examples.extlibrary.avro.Item output = new org.eclipse.emf.examples.extlibrary.avro.Item();

	output.setPublicationDate(input.getPublicationDate().toString());


	return output;
}

public org.eclipse.emf.examples.extlibrary.avro.Lendable convertLendable(
	org.eclipse.emf.examples.extlibrary.Lendable input) {

	org.eclipse.emf.examples.extlibrary.avro.Lendable output = new org.eclipse.emf.examples.extlibrary.avro.Lendable();

	output.setCopies(input.getCopies());

	List<org.eclipse.emf.examples.extlibrary.avro.Borrower> borrowersList = new ArrayList<org.eclipse.emf.examples.extlibrary.avro.Borrower>();
	for(org.eclipse.emf.examples.extlibrary.Borrower itr : input.getBorrowers()) {
		borrowersList.add(convertBorrower(itr));
	}
	output.setBorrowers(borrowersList);


	return output;
}

public org.eclipse.emf.examples.extlibrary.avro.CirculatingItem convertCirculatingItem(
	org.eclipse.emf.examples.extlibrary.CirculatingItem input) {

	org.eclipse.emf.examples.extlibrary.avro.CirculatingItem output = new org.eclipse.emf.examples.extlibrary.avro.CirculatingItem();

	output.setPublicationDate(input.getPublicationDate().toString());

	output.setCopies(input.getCopies());

	List<org.eclipse.emf.examples.extlibrary.avro.Borrower> borrowersList = new ArrayList<org.eclipse.emf.examples.extlibrary.avro.Borrower>();
	for(org.eclipse.emf.examples.extlibrary.Borrower itr : input.getBorrowers()) {
		borrowersList.add(convertBorrower(itr));
	}
	output.setBorrowers(borrowersList);


	return output;
}

public org.eclipse.emf.examples.extlibrary.avro.Periodical convertPeriodical(
	org.eclipse.emf.examples.extlibrary.Periodical input) {

	org.eclipse.emf.examples.extlibrary.avro.Periodical output = new org.eclipse.emf.examples.extlibrary.avro.Periodical();

	output.setPublicationDate(input.getPublicationDate().toString());

	output.setTitle(input.getTitle());

	output.setIssuesPerYear(input.getIssuesPerYear());


	return output;
}

public org.eclipse.emf.examples.extlibrary.avro.AudioVisualItem convertAudioVisualItem(
	org.eclipse.emf.examples.extlibrary.AudioVisualItem input) {

	org.eclipse.emf.examples.extlibrary.avro.AudioVisualItem output = new org.eclipse.emf.examples.extlibrary.avro.AudioVisualItem();

	output.setPublicationDate(input.getPublicationDate().toString());

	output.setCopies(input.getCopies());

	List<org.eclipse.emf.examples.extlibrary.avro.Borrower> borrowersList = new ArrayList<org.eclipse.emf.examples.extlibrary.avro.Borrower>();
	for(org.eclipse.emf.examples.extlibrary.Borrower itr : input.getBorrowers()) {
		borrowersList.add(convertBorrower(itr));
	}
	output.setBorrowers(borrowersList);

	output.setTitle(input.getTitle());

	output.setMinutesLength(input.getMinutesLength());

	output.setDamaged(input.isDamaged());


	return output;
}

public org.eclipse.emf.examples.extlibrary.avro.BookOnTape convertBookOnTape(
	org.eclipse.emf.examples.extlibrary.BookOnTape input) {

	org.eclipse.emf.examples.extlibrary.avro.BookOnTape output = new org.eclipse.emf.examples.extlibrary.avro.BookOnTape();

	output.setPublicationDate(input.getPublicationDate().toString());

	output.setCopies(input.getCopies());

	List<org.eclipse.emf.examples.extlibrary.avro.Borrower> borrowersList = new ArrayList<org.eclipse.emf.examples.extlibrary.avro.Borrower>();
	for(org.eclipse.emf.examples.extlibrary.Borrower itr : input.getBorrowers()) {
		borrowersList.add(convertBorrower(itr));
	}
	output.setBorrowers(borrowersList);

	output.setTitle(input.getTitle());

	output.setMinutesLength(input.getMinutesLength());

	output.setDamaged(input.isDamaged());

	output.setReader(convertPerson(input.getReader()));

	output.setAuthor(convertWriter(input.getAuthor()));


	return output;
}

public org.eclipse.emf.examples.extlibrary.avro.VideoCassette convertVideoCassette(
	org.eclipse.emf.examples.extlibrary.VideoCassette input) {

	org.eclipse.emf.examples.extlibrary.avro.VideoCassette output = new org.eclipse.emf.examples.extlibrary.avro.VideoCassette();

	output.setPublicationDate(input.getPublicationDate().toString());

	output.setCopies(input.getCopies());

	List<org.eclipse.emf.examples.extlibrary.avro.Borrower> borrowersList = new ArrayList<org.eclipse.emf.examples.extlibrary.avro.Borrower>();
	for(org.eclipse.emf.examples.extlibrary.Borrower itr : input.getBorrowers()) {
		borrowersList.add(convertBorrower(itr));
	}
	output.setBorrowers(borrowersList);

	output.setTitle(input.getTitle());

	output.setMinutesLength(input.getMinutesLength());

	output.setDamaged(input.isDamaged());

	List<org.eclipse.emf.examples.extlibrary.avro.Person> castList = new ArrayList<org.eclipse.emf.examples.extlibrary.avro.Person>();
	for(org.eclipse.emf.examples.extlibrary.Person itr : input.getCast()) {
		castList.add(convertPerson(itr));
	}
	output.setCast(castList);


	return output;
}

public org.eclipse.emf.examples.extlibrary.avro.Borrower convertBorrower(
	org.eclipse.emf.examples.extlibrary.Borrower input) {

	org.eclipse.emf.examples.extlibrary.avro.Borrower output = new org.eclipse.emf.examples.extlibrary.avro.Borrower();

	output.setAddress(input.getAddress());

	output.setFirstName(input.getFirstName());

	output.setLastName(input.getLastName());

	List<org.eclipse.emf.examples.extlibrary.avro.Lendable> borrowedList = new ArrayList<org.eclipse.emf.examples.extlibrary.avro.Lendable>();
	for(org.eclipse.emf.examples.extlibrary.Lendable itr : input.getBorrowed()) {
		borrowedList.add(convertLendable(itr));
	}
	output.setBorrowed(borrowedList);


	return output;
}

public org.eclipse.emf.examples.extlibrary.avro.Person convertPerson(
	org.eclipse.emf.examples.extlibrary.Person input) {

	org.eclipse.emf.examples.extlibrary.avro.Person output = new org.eclipse.emf.examples.extlibrary.avro.Person();

	output.setAddress(input.getAddress());

	output.setFirstName(input.getFirstName());

	output.setLastName(input.getLastName());


	return output;
}

public org.eclipse.emf.examples.extlibrary.avro.Employee convertEmployee(
	org.eclipse.emf.examples.extlibrary.Employee input) {

	org.eclipse.emf.examples.extlibrary.avro.Employee output = new org.eclipse.emf.examples.extlibrary.avro.Employee();

	output.setAddress(input.getAddress());

	output.setFirstName(input.getFirstName());

	output.setLastName(input.getLastName());

	output.setManager(convertEmployee(input.getManager()));


	return output;
}

public org.eclipse.emf.examples.extlibrary.avro.Addressable convertAddressable(
	org.eclipse.emf.examples.extlibrary.Addressable input) {

	org.eclipse.emf.examples.extlibrary.avro.Addressable output = new org.eclipse.emf.examples.extlibrary.avro.Addressable();

	output.setAddress(input.getAddress());


	return output;
}


public EObject convertAvroObject(Object object) {
	if(object instanceof org.eclipse.emf.examples.extlibrary.avro.Book)
	{
		return convertBook((org.eclipse.emf.examples.extlibrary.avro.Book)object);
	}
	if(object instanceof org.eclipse.emf.examples.extlibrary.avro.Library)
	{
		return convertLibrary((org.eclipse.emf.examples.extlibrary.avro.Library)object);
	}
	if(object instanceof org.eclipse.emf.examples.extlibrary.avro.Writer)
	{
		return convertWriter((org.eclipse.emf.examples.extlibrary.avro.Writer)object);
	}
	if(object instanceof org.eclipse.emf.examples.extlibrary.avro.BookOnTape)
	{
		return convertBookOnTape((org.eclipse.emf.examples.extlibrary.avro.BookOnTape)object);
	}
	if(object instanceof org.eclipse.emf.examples.extlibrary.avro.VideoCassette)
	{
		return convertVideoCassette((org.eclipse.emf.examples.extlibrary.avro.VideoCassette)object);
	}
	if(object instanceof org.eclipse.emf.examples.extlibrary.avro.Borrower)
	{
		return convertBorrower((org.eclipse.emf.examples.extlibrary.avro.Borrower)object);
	}
	if(object instanceof org.eclipse.emf.examples.extlibrary.avro.Person)
	{
		return convertPerson((org.eclipse.emf.examples.extlibrary.avro.Person)object);
	}
	if(object instanceof org.eclipse.emf.examples.extlibrary.avro.Employee)
	{
		return convertEmployee((org.eclipse.emf.examples.extlibrary.avro.Employee)object);
	}
	return null;
}

public org.eclipse.emf.examples.extlibrary.Book convertBook(
	org.eclipse.emf.examples.extlibrary.avro.Book input) {

	org.eclipse.emf.examples.extlibrary.Book output = org.eclipse.emf.examples.extlibrary.EXTLibraryFactory.eINSTANCE.createBook();

	try {
		Date publicationDateDate = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(input.getPublicationDate().toString());
		output.setPublicationDate(publicationDateDate);
	} catch(ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	output.setCopies(input.getCopies());
	EList<org.eclipse.emf.examples.extlibrary.Borrower> borrowersList = output.getBorrowers();
	for(org.eclipse.emf.examples.extlibrary.avro.Borrower itr : input.getBorrowers()) {
		borrowersList.add((org.eclipse.emf.examples.extlibrary.Borrower)convertAvroObject(itr));
	}
	output.setTitle(input.getTitle().toString());
	output.setPages(input.getPages());
	output.setCategory(org.eclipse.emf.examples.extlibrary.BookCategory.valueOf(input.getCategory().name()));
	output.setAuthor(convertWriter(input.getAuthor()));

	return output;
}
public org.eclipse.emf.examples.extlibrary.Library convertLibrary(
	org.eclipse.emf.examples.extlibrary.avro.Library input) {

	org.eclipse.emf.examples.extlibrary.Library output = org.eclipse.emf.examples.extlibrary.EXTLibraryFactory.eINSTANCE.createLibrary();

	output.setAddress(input.getAddress().toString());
	output.setName(input.getName().toString());
	EList<org.eclipse.emf.examples.extlibrary.Writer> writersList = output.getWriters();
	for(org.eclipse.emf.examples.extlibrary.avro.Writer itr : input.getWriters()) {
		writersList.add((org.eclipse.emf.examples.extlibrary.Writer)convertAvroObject(itr));
	}
	EList<org.eclipse.emf.examples.extlibrary.Employee> employeesList = output.getEmployees();
	for(org.eclipse.emf.examples.extlibrary.avro.Employee itr : input.getEmployees()) {
		employeesList.add((org.eclipse.emf.examples.extlibrary.Employee)convertAvroObject(itr));
	}
	EList<org.eclipse.emf.examples.extlibrary.Borrower> borrowersList = output.getBorrowers();
	for(org.eclipse.emf.examples.extlibrary.avro.Borrower itr : input.getBorrowers()) {
		borrowersList.add((org.eclipse.emf.examples.extlibrary.Borrower)convertAvroObject(itr));
	}
	EList<org.eclipse.emf.examples.extlibrary.Item> stockList = output.getStock();
	for(org.eclipse.emf.examples.extlibrary.avro.Item itr : input.getStock()) {
		stockList.add((org.eclipse.emf.examples.extlibrary.Item)convertAvroObject(itr));
	}
	EList<org.eclipse.emf.examples.extlibrary.Book> booksList = output.getBooks();
	for(org.eclipse.emf.examples.extlibrary.avro.Book itr : input.getBooks()) {
		booksList.add((org.eclipse.emf.examples.extlibrary.Book)convertAvroObject(itr));
	}
	EList<org.eclipse.emf.examples.extlibrary.Library> branchesList = output.getBranches();
	for(org.eclipse.emf.examples.extlibrary.avro.Library itr : input.getBranches()) {
		branchesList.add((org.eclipse.emf.examples.extlibrary.Library)convertAvroObject(itr));
	}
	output.setParentBranch(convertLibrary(input.getParentBranch()));

	return output;
}
public org.eclipse.emf.examples.extlibrary.Writer convertWriter(
	org.eclipse.emf.examples.extlibrary.avro.Writer input) {

	org.eclipse.emf.examples.extlibrary.Writer output = org.eclipse.emf.examples.extlibrary.EXTLibraryFactory.eINSTANCE.createWriter();

	output.setAddress(input.getAddress().toString());
	output.setFirstName(input.getFirstName().toString());
	output.setLastName(input.getLastName().toString());
	output.setName(input.getName().toString());
	EList<org.eclipse.emf.examples.extlibrary.Book> booksList = output.getBooks();
	for(org.eclipse.emf.examples.extlibrary.avro.Book itr : input.getBooks()) {
		booksList.add((org.eclipse.emf.examples.extlibrary.Book)convertAvroObject(itr));
	}

	return output;
}
public org.eclipse.emf.examples.extlibrary.BookOnTape convertBookOnTape(
	org.eclipse.emf.examples.extlibrary.avro.BookOnTape input) {

	org.eclipse.emf.examples.extlibrary.BookOnTape output = org.eclipse.emf.examples.extlibrary.EXTLibraryFactory.eINSTANCE.createBookOnTape();

	try {
		Date publicationDateDate = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(input.getPublicationDate().toString());
		output.setPublicationDate(publicationDateDate);
	} catch(ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	output.setCopies(input.getCopies());
	EList<org.eclipse.emf.examples.extlibrary.Borrower> borrowersList = output.getBorrowers();
	for(org.eclipse.emf.examples.extlibrary.avro.Borrower itr : input.getBorrowers()) {
		borrowersList.add((org.eclipse.emf.examples.extlibrary.Borrower)convertAvroObject(itr));
	}
	output.setTitle(input.getTitle().toString());
	output.setMinutesLength(input.getMinutesLength());
	output.setDamaged(input.getDamaged());
	output.setReader(convertPerson(input.getReader()));
	output.setAuthor(convertWriter(input.getAuthor()));

	return output;
}
public org.eclipse.emf.examples.extlibrary.VideoCassette convertVideoCassette(
	org.eclipse.emf.examples.extlibrary.avro.VideoCassette input) {

	org.eclipse.emf.examples.extlibrary.VideoCassette output = org.eclipse.emf.examples.extlibrary.EXTLibraryFactory.eINSTANCE.createVideoCassette();

	try {
		Date publicationDateDate = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(input.getPublicationDate().toString());
		output.setPublicationDate(publicationDateDate);
	} catch(ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	output.setCopies(input.getCopies());
	EList<org.eclipse.emf.examples.extlibrary.Borrower> borrowersList = output.getBorrowers();
	for(org.eclipse.emf.examples.extlibrary.avro.Borrower itr : input.getBorrowers()) {
		borrowersList.add((org.eclipse.emf.examples.extlibrary.Borrower)convertAvroObject(itr));
	}
	output.setTitle(input.getTitle().toString());
	output.setMinutesLength(input.getMinutesLength());
	output.setDamaged(input.getDamaged());
	EList<org.eclipse.emf.examples.extlibrary.Person> castList = output.getCast();
	for(org.eclipse.emf.examples.extlibrary.avro.Person itr : input.getCast()) {
		castList.add((org.eclipse.emf.examples.extlibrary.Person)convertAvroObject(itr));
	}

	return output;
}
public org.eclipse.emf.examples.extlibrary.Borrower convertBorrower(
	org.eclipse.emf.examples.extlibrary.avro.Borrower input) {

	org.eclipse.emf.examples.extlibrary.Borrower output = org.eclipse.emf.examples.extlibrary.EXTLibraryFactory.eINSTANCE.createBorrower();

	output.setAddress(input.getAddress().toString());
	output.setFirstName(input.getFirstName().toString());
	output.setLastName(input.getLastName().toString());
	EList<org.eclipse.emf.examples.extlibrary.Lendable> borrowedList = output.getBorrowed();
	for(org.eclipse.emf.examples.extlibrary.avro.Lendable itr : input.getBorrowed()) {
		borrowedList.add((org.eclipse.emf.examples.extlibrary.Lendable)convertAvroObject(itr));
	}

	return output;
}
public org.eclipse.emf.examples.extlibrary.Person convertPerson(
	org.eclipse.emf.examples.extlibrary.avro.Person input) {

	org.eclipse.emf.examples.extlibrary.Person output = org.eclipse.emf.examples.extlibrary.EXTLibraryFactory.eINSTANCE.createPerson();

	output.setAddress(input.getAddress().toString());
	output.setFirstName(input.getFirstName().toString());
	output.setLastName(input.getLastName().toString());

	return output;
}
public org.eclipse.emf.examples.extlibrary.Employee convertEmployee(
	org.eclipse.emf.examples.extlibrary.avro.Employee input) {

	org.eclipse.emf.examples.extlibrary.Employee output = org.eclipse.emf.examples.extlibrary.EXTLibraryFactory.eINSTANCE.createEmployee();

	output.setAddress(input.getAddress().toString());
	output.setFirstName(input.getFirstName().toString());
	output.setLastName(input.getLastName().toString());
	output.setManager(convertEmployee(input.getManager()));

	return output;
}

}
