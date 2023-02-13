package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.sql.Driver;

public class GoogleSearch extends Page{
    public GoogleSearch(){
        super();
        drive.get("http://www.google.com");
    }
    public WebElement getSearchInput(){
        return drive.findElement(By.name("q"));
    }
    @Override
    public String getTitle(){
        return drive.getTitle();
    }
}
