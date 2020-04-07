package com.cybertek.tests.day_14_test_base_props_drivers;

import com.cybertek.base.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTests extends TestBase {
    /*
    got to practice website
    click on file upload link
    upload a file
    click submit
    verify title name is displayed in next page
     */

    @Test
    public void fileUploadTest() {
        String url = ConfigurationReader.getProperty("url");
        driver.get(url);

        WebElement file_upload = driver.findElement(By.linkText("File Upload"));
        file_upload.click();

        WebElement fileInput = driver.findElement(By.id("file-upload"));
        fileInput.sendKeys("/Users/EdilbekBrowne/Desktop/my_file.txt");

        WebElement submit = driver.findElement(By.id("file-submit"));
        submit.click();

        WebElement uploadedFiles = driver.findElement(By.id("uploaded-files"));
        Assert.assertEquals(uploadedFiles.getText(),"my_file.txt");





    }
}
