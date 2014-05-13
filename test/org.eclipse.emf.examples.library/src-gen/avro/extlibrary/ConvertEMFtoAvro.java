package avro.extlibrary;


import java.util.ArrayList;
import java.util.List;

import org.apache.avro.Schema;
import org.eclipse.emf.ecore.EObject;

public class ConvertEMFtoAvro {

public static Schema getUnionSchema() {
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

public static Object convertEObject(EObject eobject) {
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

public static avro.extlibrary.Book convertBook(
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

public static avro.extlibrary.Library convertLibrary(
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

public static avro.extlibrary.Writer convertWriter(
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

public static avro.extlibrary.Item convertItem(
	org.eclipse.emf.examples.extlibrary.Item input) {

	avro.extlibrary.Item output = new avro.extlibrary.Item();

	output.setPublicationDate(input.getPublicationDate().toString());


	return output;
}

public static avro.extlibrary.Lendable convertLendable(
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

public static avro.extlibrary.CirculatingItem convertCirculatingItem(
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

public static avro.extlibrary.Periodical convertPeriodical(
	org.eclipse.emf.examples.extlibrary.Periodical input) {

	avro.extlibrary.Periodical output = new avro.extlibrary.Periodical();

	output.setPublicationDate(input.getPublicationDate().toString());

	output.setTitle(input.getTitle());

	output.setIssuesPerYear(input.getIssuesPerYear());


	return output;
}

public static avro.extlibrary.AudioVisualItem convertAudioVisualItem(
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

public static avro.extlibrary.BookOnTape convertBookOnTape(
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

public static avro.extlibrary.VideoCassette convertVideoCassette(
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

public static avro.extlibrary.Borrower convertBorrower(
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

public static avro.extlibrary.Person convertPerson(
	org.eclipse.emf.examples.extlibrary.Person input) {

	avro.extlibrary.Person output = new avro.extlibrary.Person();

	output.setAddress(input.getAddress());

	output.setFirstName(input.getFirstName());

	output.setLastName(input.getLastName());


	return output;
}

public static avro.extlibrary.Employee convertEmployee(
	org.eclipse.emf.examples.extlibrary.Employee input) {

	avro.extlibrary.Employee output = new avro.extlibrary.Employee();

	output.setAddress(input.getAddress());

	output.setFirstName(input.getFirstName());

	output.setLastName(input.getLastName());

	output.setManager(convertEmployee(input.getManager()));


	return output;
}

public static avro.extlibrary.Addressable convertAddressable(
	org.eclipse.emf.examples.extlibrary.Addressable input) {

	avro.extlibrary.Addressable output = new avro.extlibrary.Addressable();

	output.setAddress(input.getAddress());


	return output;
}


}
