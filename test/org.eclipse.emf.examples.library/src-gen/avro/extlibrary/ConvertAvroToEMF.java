package avro.extlibrary;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.EList;

public class ConvertAvroToEMF {

public static EObject convertAvroObject(Object object) {
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

public static org.eclipse.emf.examples.extlibrary.Book convertBook(
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
public static org.eclipse.emf.examples.extlibrary.Library convertLibrary(
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
public static org.eclipse.emf.examples.extlibrary.Writer convertWriter(
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
public static org.eclipse.emf.examples.extlibrary.BookOnTape convertBookOnTape(
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
public static org.eclipse.emf.examples.extlibrary.VideoCassette convertVideoCassette(
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
public static org.eclipse.emf.examples.extlibrary.Borrower convertBorrower(
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
public static org.eclipse.emf.examples.extlibrary.Person convertPerson(
	avro.extlibrary.Person input) {

	org.eclipse.emf.examples.extlibrary.Person output = org.eclipse.emf.examples.extlibrary.EXTLibraryFactory.eINSTANCE.createPerson();

	output.setAddress(input.getAddress().toString());
	output.setFirstName(input.getFirstName().toString());
	output.setLastName(input.getLastName().toString());

	return output;
}
public static org.eclipse.emf.examples.extlibrary.Employee convertEmployee(
	avro.extlibrary.Employee input) {

	org.eclipse.emf.examples.extlibrary.Employee output = org.eclipse.emf.examples.extlibrary.EXTLibraryFactory.eINSTANCE.createEmployee();

	output.setAddress(input.getAddress().toString());
	output.setFirstName(input.getFirstName().toString());
	output.setLastName(input.getLastName().toString());
	output.setManager(convertEmployee(input.getManager()));

	return output;
}

}
