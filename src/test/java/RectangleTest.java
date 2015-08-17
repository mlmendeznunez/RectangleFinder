import org.junit.*;
import static org.junit.Assert.*;
import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class RectangleTest {
    //unit tests

	   @Test public void newRectangle_setsLength() {
	   Rectangle testRectangle = new Rectangle(2, 2); 
	   assertEquals(2, testRectangle.getLength()); 
		} 
	   @Test public void newRectangle_setsWidth() {
	   Rectangle testRectangle = new Rectangle(2, 2); 
	   assertEquals(2, testRectangle.getWidth()); 
		}
		@Test
		public void isSquare_whenNotASquare_false() {
  		Rectangle testRectangle = new Rectangle(2, 4);
  		assertEquals(false, testRectangle.isSquare());
		}
		@Test
		public void isSquare_allSidesEqual_true() {
  		Rectangle testRectangle = new Rectangle(2, 2);
  		assertEquals(true, testRectangle.isSquare());
		}
}   