package com.example.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page {
    protected WebDriver drive;

    public Page(){
        drive = new ChromeDriver();
    }

    public String getTitle(){
        return drive.getTitle();
    }
}
