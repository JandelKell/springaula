package com.example.demo;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class TesteGoogle {

    private void pesquisarPor(final String pesquisa){
        System.setProperty("webdriver.chrome.driver", "D:\\beckaup\\Documents\\spring aula\\chromedriver.exe");
        GoogleSearch page = new GoogleSearch();
        assertEquals("Google",page.getTitle());
        WebElement campoPesquisado = page.getSearchInput();
        campoPesquisado.clear();
        campoPesquisado.sendKeys(pesquisa);
        campoPesquisado.submit();
        assertTrue(page.getTitle().startsWith(pesquisa));
    }
    @Test
    void test_pesquisarPor_LetsCode() {
        pesquisarPor("LetsCode!");
    }
}
