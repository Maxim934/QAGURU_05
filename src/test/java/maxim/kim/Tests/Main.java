package maxim.kim.Tests;

import org.junit.jupiter.api.Test;

import static maxim.kim.Tests.TestData.*;

public class Main extends TestBase{
    @Test
    public void fillFields(){
        registrationPage.openPage()
                .fillName(firstName)
                .fillSurname(secondName)
                .chooseGender()
                .fillEmail(email)
                .fillNumber(mobilePhone)
                .setBirthDate(day, month,year)
                .setSubject()
                .setHobbie()
                .uploadImage("src/test/resources/img.png")
                .setAdress(address)
                .chooseStateAndCity()
                .checkResultsValue("Student Name", firstName + " " + secondName)
                .checkResultsValue("Student Email", email)
                .checkResultsValue("Gender", "Male")
                .checkResultsValue("Mobile", mobilePhone)
                .checkResultsValue("Date of Birth", day + " " + month + "," + year)
                .checkResultsValue("Picture", "img.png")
                .checkResultsValue("Address", address);


    }

}
