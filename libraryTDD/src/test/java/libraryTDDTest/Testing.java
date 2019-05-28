package libraryTDDTest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.qa.libraryTDD.Books;

public class Testing {
	Books book;
	
	@Before
	public void setup() {
		book = new Books("Of Mice and Men");
	}
	
	@Test
	public void test1() {
		Books book2 = new Books("Snow White");
		assertEquals("Not working", "Snow White", book.checkRecords(book2));
	}
}
