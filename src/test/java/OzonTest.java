import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class OzonTest {
    @Test
    public void openPage(){
        Selenide.open("https://www.ozon.ru/");
        Selenide.sleep(1000);
        $(byXpath("//a[contains(text(),'Электроника')]")).shouldBe(Condition.visible);
        $(byXpath("//a[contains(text(),'Акции')]")).shouldBe(Condition.visible);
    }
}
