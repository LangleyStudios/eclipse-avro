package avro.extlibrary;

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
	schemaList.add(avro.extlibrary.Book.SCHEMA$);
	schemaList.add(avro.extlibrary.Library.SCHEMA$);
	schemaList.add(avro.extlibrary.Writer.SCHEMA$);
	schemaList.add(avro.extlibrary.Item.SCHEMA$);
	schemaList.add(avro.extlibrary.Lendable.SCHEMA$);
	schemaList.add(avro.extlibrary.CirculatingItem.SCHEMA$);
	schemaList.add(avro.extlibrary.Periodical.SCHEMA$);
	schemaList.add(avro.extlibrary.AudioVisualItem.SCHEMA$);
	schemaList.add(avro.extlibrary.BookOnTape.SCHEMA$);
	schemaList.add(avro.extlibrary.VideoCassette.SCHEMA$);
	schemaList.add(avro.extlibrary.Borrower.SCHEMA$);
	schemaList.add(avro.extlibrary.Person.SCHEMA$);
	schemaList.add(avro.extlibrary.Employee.SCHEMA$);
	schemaList.add(avro.extlibrary.Addressable.SCHEMA$);
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

public avro.extlibrary.Book convertBook(
	org.eclipse.emf.examples.extlibrary.Book input) {

	avro.extlibrary.Book output = new avro.extlibrary.Book();

	output.setPublicationDate(input.getPublicationDate().toString());

	output.setCopies(input.getCopies());

	List<avro.extlibrary.Borrower> borrowersList = new ArrayList<avro.extlibrary.Borrower>();
	for(org.eclipse.emf.examples.extlibrary.Borrower itr : input.getBorrowers()) {
		borrowersList.add(convertBorrower(itr));
	}
	output.setBorrowers(borrowersList);

	output.setTitle(input.getTitle());

	output.setPages(input.getPages());

	output.setCategory(avro.extlibrary.BookCategory.valueOf(input.getCategory().getLiteral()));

	output.setAuthor(convertWriter(input.getAuthor()));


	return output;
}

public avro.extlibrary.Library convertLibrary(
	org.eclipse.emf.examples.extlibrary.Library input) {

	avro.extlibrary.Library output = new avro.extlibrary.Library();

	output.setAddress(input.getAddress());

	output.setName(input.getName());

	List<avro.extlibrary.Writer> writersList = new ArrayList<avro.extlibrary.Writer>();
	for(org.eclipse.emf.examples.extlibrary.Writer itr : input.getWriters()) {
		writersList.add(convertWriter(itr));
	}
	output.setWriters(writersList);

	List<avro.extlibrary.Employee> employeesList = new ArrayList<avro.extlibrary.Employee>();
	for(org.eclipse.emf.examples.extlibrary.Employee itr : input.getEmployees()) {
		employeesList.add(convertEmployee(itr));
	}
	output.setEmployees(employeesList);

	List<avro.extlibrary.Borrower> borrowersList = new ArrayList<avro.extlibrary.Borrower>();
	for(org.eclipse.emf.examples.extlibrary.Borrower itr : input.getBorrowers()) {
		borrowersList.add(convertBorrower(itr));
	}
	output.setBorrowers(borrowersList);

	List<avro.extlibrary.Item> stockList = new ArrayList<avro.extlibrary.Item>();
	for(org.eclipse.emf.examples.extlibrary.Item itr : input.getStock()) {
		stockList.add(convertItem(itr));
	}
	output.setStock(stockList);

	List<avro.extlibrary.Book> booksList = new ArrayList<avro.extlibrary.Book>();
	for(org.eclipse.emf.examples.extlibrary.Book itr : input.getBooks()) {
		booksList.add(convertBook(itr));
	}
	output.setBooks(booksList);

	List<avro.extlibrary.Library> branchesList = new ArrayList<avro.extlibrary.Library>();
	for(org.eclipse.emf.examples.extlibrary.Library itr : input.getBranches()) {
		branchesList.add(convertLibrary(itr));
	}
	output.setBranches(branchesList);

	output.setParentBranch(convertLibrary(input.getParentBranch()));



	return output;
}

public avro.extlibrary.Writer convertWriter(
	org.eclipse.emf.examples.extlibrary.Writer input) {

	avro.extlibrary.Writer output = new avro.extlibrary.Writer();

	output.setAddress(input.getAddress());

	output.setFirstName(input.getFirstName());

	output.setLastName(input.getLastName());

	output.setName(input.getName());

	List<avro.extlibrary.Book> booksList = new ArrayList<avro.extlibrary.Book>();
	for(org.eclipse.emf.examples.extlibrary.Book itr : input.getBooks()) {
		booksList.add(convertBook(itr));
	}
	output.setBooks(booksList);


	return output;
}

public avro.extlibrary.Item convertItem(
	org.eclipse.emf.examples.extlibrary.Item input) {

	avro.extlibrary.Item output = new avro.extlibrary.Item();

	output.setPublicationDate(input.getPublicationDate().toString());


	return output;
}

public avro.extlibrary.Lendable convertLendable(
	org.eclipse.emf.examples.extlibrary.Lendable input) {

	avro.extlibrary.Lendable output = new avro.extlibrary.Lendable();

	output.setCopies(input.getCopies());

	List<avro.extlibrary.Borrower> borrowersList = new ArrayList<avro.extlibrary.Borrower>();
	for(org.eclipse.emf.examples.extlibrary.Borrower itr : input.getBorrowers()) {
		borrowersList.add(convertBorrower(itr));
	}
	output.setBorrowers(borrowersList);


	return output;
}

public avro.extlibrary.CirculatingItem convertCirculatingItem(
	org.eclipse.emf.examples.extlibrary.CirculatingItem input) {

	avro.extlibrary.CirculatingItem output = new avro.extlibrary.CirculatingItem();

	output.setPublicationDate(input.getPublicationDate().toString());

	output.setCopies(input.getCopies());

	List<avro.extlibrary.Borrower> borrowersList = new ArrayList<avro.extlibrary.Borrower>();
	for(org.eclipse.emf.examples.extlibrary.Borrower itr : input.getBorrowers()) {
		borrowersList.add(convertBorrower(itr));
	}
	output.setBorrowers(borrowersList);


	return output;
}

public avro.extlibrary.Periodical convertPeriodical(
	org.eclipse.emf.examples.extlibrary.Periodical input) {

	avro.extlibrary.Periodical output = new avro.extlibrary.Periodical();

	output.setPublicationDate(input.getPublicationDate().toString());

	output.setTitle(input.getTitle());

	output.setIssuesPerYear(input.getIssuesPerYear());


	return output;
}

public avro.extlibrary.AudioVisualItem convertAudioVisualItem(
	org.eclipse.emf.examples.extlibrary.AudioVisualItem input) {

	avro.extlibrary.AudioVisualItem output = new avro.extlibrary.AudioVisualItem();

	output.setPublicationDate(input.getPublicationDate().toString());

	output.setCopies(input.getCopies());

	List<avro.extlibrary.Borrower> borrowersList = new ArrayList<avro.extlibrary.Borrower>();
	for(org.eclipse.emf.examples.extlibrary.Borrower itr : input.getBorrowers()) {
		borrowersList.add(convertBorrower(itr));
	}
	output.setBorrowers(borrowersList);

	output.setTitle(input.getTitle());

	output.setMinutesLength(input.getMinutesLength());

	output.setDamaged(input.isDamaged());


	return output;
}

public avro.extlibrary.BookOnTape convertBookOnTape(
	org.eclipse.emf.examples.extlibrary.BookOnTape input) {

	avro.extlibrary.BookOnTape output = new avro.extlibrary.BookOnTape();

	output.setPublicationDate(input.getPublicationDate().toString());

	output.setCopies(input.getCopies());

	List<avro.extlibrary.Borrower> borrowersList = new ArrayList<avro.extlibrary.Borrower>();
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

public avro.extlibrary.VideoCassette convertVideoCassette(
	org.eclipse.emf.examples.extlibrary.VideoCassette input) {

	avro.extlibrary.VideoCassette output = new avro.extlibrary.VideoCassette();

	output.setPublicationDate(input.getPublicationDate().toString());

	output.setCopies(input.getCopies());

	List<avro.extlibrary.Borrower> borrowersList = new ArrayList<avro.extlibrary.Borrower>();
	for(org.eclipse.emf.examples.extlibrary.Borrower itr : input.getBorrowers()) {
		borrowersList.add(convertBorrower(itr));
	}
	output.setBorrowers(borrowersList);

	output.setTitle(input.getTitle());

	output.setMinutesLength(input.getMinutesLength());

	output.setDamaged(input.isDamaged());

	List<avro.extlibrary.Person> castList = new ArrayList<avro.extlibrary.Person>();
	for(org.eclipse.emf.examples.extlibrary.Person itr : input.getCast()) {
		castList.add(convertPerson(itr));
	}
	output.setCast(castList);


	return output;
}

public avro.extlibrary.Borrower convertBorrower(
	org.eclipse.emf.examples.extlibrary.Borrower input) {

	avro.extlibrary.Borrower output = new avro.extlibrary.Borrower();

	output.setAddress(input.getAddress());

	output.setFirstName(input.getFirstName());

	output.setLastName(input.getLastName());

	List<avro.extlibrary.Lendable> borrowedList = new ArrayList<avro.extlibrary.Lendable>();
	for(org.eclipse.emf.examples.extlibrary.Lendable itr : input.getBorrowed()) {
		borrowedList.add(convertLendable(itr));
	}
	output.setBorrowed(borrowedList);


	return output;
}

public avro.extlibrary.Person convertPerson(
	org.eclipse.emf.examples.extlibrary.Person input) {

	avro.extlibrary.Person output = new avro.extlibrary.Person();

	output.setAddress(input.getAddress());

	output.setFirstName(input.getFirstName());

	output.setLastName(input.getLastName());


	return output;
}

public avro.extlibrary.Employee convertEmployee(
	org.eclipse.emf.examples.extlibrary.Employee input) {

	avro.extlibrary.Employee output = new avro.extlibrary.Employee();

	output.setAddress(input.getAddress());

	output.setFirstName(input.getFirstName());

	output.setLastName(input.getLastName());

	output.setManager(convertEmployee(input.getManager()));


	return output;
}

public avro.extlibrary.Addressable convertAddressable(
	org.eclipse.emf.examples.extlibrary.Addressable input) {

	avro.extlibrary.Addressable output = new avro.extlibrary.Addressable();

	output.setAddress(input.getAddress());


	return output;
}


public EObject convertAvroObject(Object object) {
	if(object instanceof avro.extlibrary.Book)
	{
		return convertBook((avro.extlibrary.Book)object);
	}
	if(object instanceof avro.extlibrary.Library)
	{
		return convertLibrary((avro.extlibrary.Library)object);
	}
	if(object instanceof avro.extlibrary.Writer)
	{
		return convertWriter((avro.extlibrary.Writer)object);
	}
	if(object instanceof avro.extlibrary.BookOnTape)
	{
		return convertBookOnTape((avro.extlibrary.BookOnTape)object);
	}
	if(object instanceof avro.extlibrary.VideoCassette)
	{
		return convertVideoCassette((avro.extlibrary.VideoCassette)object);
	}
	if(object instanceof avro.extlibrary.Borrower)
	{
		return convertBorrower((avro.extlibrary.Borrower)object);
	}
	if(object instanceof avro.extlibrary.Person)
	{
		return convertPerson((avro.extlibrary.Person)object);
	}
	if(object instanceof avro.extlibrary.Employee)
	{
		return convertEmployee((avro.extlibrary.Employee)object);
	}
	return null;
}

public org.eclipse.emf.examples.extlibrary.Book convertBook(
	avro.extlibrary.Book input) {

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
	for(avro.extlibrary.Borrower itr : input.getBorrowers()) {
		borrowersList.add((org.eclipse.emf.examples.extlibrary.Borrower)convertAvroObject(itr));
	}
	output.setTitle(input.getTitle().toString());
	output.setPages(input.getPages());
	output.setCategory(org.eclipse.emf.examples.extlibrary.BookCategory.valueOf(input.getCategory().name()));
	output.setAuthor(convertWriter(input.getAuthor()));

	return output;
}
public org.eclipse.emf.examples.extlibrary.Library convertLibrary(
	avro.extlibrary.Library input) {

	org.eclipse.emf.examples.extlibrary.Library output = org.eclipse.emf.examples.extlibrary.EXTLibraryFactory.eINSTANCE.createLibrary();

	output.setAddress(input.getAddress().toString());
	output.setName(input.getName().toString());
	EList<org.eclipse.emf.examples.extlibrary.Writer> writersList = output.getWriters();
	for(avro.extlibrary.Writer itr : input.getWriters()) {
		writersList.add((org.eclipse.emf.examples.extlibrary.Writer)convertAvroObject(itr));
	}
	EList<org.eclipse.emf.examples.extlibrary.Employee> employeesList = output.getEmployees();
	for(avro.extlibrary.Employee itr : input.getEmployees()) {
		employeesList.add((org.eclipse.emf.examples.extlibrary.Employee)convertAvroObject(itr));
	}
	EList<org.eclipse.emf.examples.extlibrary.Borrower> borrowersList = output.getBorrowers();
	for(avro.extlibrary.Borrower itr : input.getBorrowers()) {
		borrowersList.add((org.eclipse.emf.examples.extlibrary.Borrower)convertAvroObject(itr));
	}
	EList<org.eclipse.emf.examples.extlibrary.Item> stockList = output.getStock();
	for(avro.extlibrary.Item itr : input.getStock()) {
		stockList.add((org.eclipse.emf.examples.extlibrary.Item)convertAvroObject(itr));
	}
	EList<org.eclipse.emf.examples.extlibrary.Book> booksList = output.getBooks();
	for(avro.extlibrary.Book itr : input.getBooks()) {
		booksList.add((org.eclipse.emf.examples.extlibrary.Book)convertAvroObject(itr));
	}
	EList<org.eclipse.emf.examples.extlibrary.Library> branchesList = output.getBranches();
	for(avro.extlibrary.Library itr : input.getBranches()) {
		branchesList.add((org.eclipse.emf.examples.extlibrary.Library)convertAvroObject(itr));
	}
	output.setParentBranch(convertLibrary(input.getParentBranch()));

	return output;
}
public org.eclipse.emf.examples.extlibrary.Writer convertWriter(
	avro.extlibrary.Writer input) {

	org.eclipse.emf.examples.extlibrary.Writer output = org.eclipse.emf.examples.extlibrary.EXTLibraryFactory.eINSTANCE.createWriter();

	output.setAddress(input.getAddress().toString());
	output.setFirstName(input.getFirstName().toString());
	output.setLastName(input.getLastName().toString());
	output.setName(input.getName().toString());
	EList<org.eclipse.emf.examples.extlibrary.Book> booksList = output.getBooks();
	for(avro.extlibrary.Book itr : input.getBooks()) {
		booksList.add((org.eclipse.emf.examples.extlibrary.Book)convertAvroObject(itr));
	}

	return output;
}
public org.eclipse.emf.examples.extlibrary.BookOnTape convertBookOnTape(
	avro.extlibrary.BookOnTape input) {

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
	for(avro.extlibrary.Borrower itr : input.getBorrowers()) {
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
	avro.extlibrary.VideoCassette input) {

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
	for(avro.extlibrary.Borrower itr : input.getBorrowers()) {
		borrowersList.add((org.eclipse.emf.examples.extlibrary.Borrower)convertAvroObject(itr));
	}
	output.setTitle(input.getTitle().toString());
	output.setMinutesLength(input.getMinutesLength());
	output.setDamaged(input.getDamaged());
	EList<org.eclipse.emf.examples.extlibrary.Person> castList = output.getCast();
	for(avro.extlibrary.Person itr : input.getCast()) {
		castList.add((org.eclipse.emf.examples.extlibrary.Person)convertAvroObject(itr));
	}

	return output;
}
public org.eclipse.emf.examples.extlibrary.Borrower convertBorrower(
	avro.extlibrary.Borrower input) {

	org.eclipse.emf.examples.extlibrary.Borrower output = org.eclipse.emf.examples.extlibrary.EXTLibraryFactory.eINSTANCE.createBorrower();

	output.setAddress(input.getAddress().toString());
	output.setFirstName(input.getFirstName().toString());
	output.setLastName(input.getLastName().toString());
	EList<org.eclipse.emf.examples.extlibrary.Lendable> borrowedList = output.getBorrowed();
	for(avro.extlibrary.Lendable itr : input.getBorrowed()) {
		borrowedList.add((org.eclipse.emf.examples.extlibrary.Lendable)convertAvroObject(itr));
	}

	return output;
}
public org.eclipse.emf.examples.extlibrary.Person convertPerson(
	avro.extlibrary.Person input) {

	org.eclipse.emf.examples.extlibrary.Person output = org.eclipse.emf.examples.extlibrary.EXTLibraryFactory.eINSTANCE.createPerson();

	output.setAddress(input.getAddress().toString());
	output.setFirstName(input.getFirstName().toString());
	output.setLastName(input.getLastName().toString());

	return output;
}
public org.eclipse.emf.examples.extlibrary.Employee convertEmployee(
	avro.extlibrary.Employee input) {

	org.eclipse.emf.examples.extlibrary.Employee output = org.eclipse.emf.examples.extlibrary.EXTLibraryFactory.eINSTANCE.createEmployee();

	output.setAddress(input.getAddress().toString());
	output.setFirstName(input.getFirstName().toString());
	output.setLastName(input.getLastName().toString());
	output.setManager(convertEmployee(input.getManager()));

	return output;
}

}
