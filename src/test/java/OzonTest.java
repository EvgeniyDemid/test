import com.codeborne.selenide.Selenide;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class OzonTest {
    @Test
    public void openPage(){
        Selenide.open("https://www.ozon.ru/");
        Assert.assertEquals(23,24);
    }
}
