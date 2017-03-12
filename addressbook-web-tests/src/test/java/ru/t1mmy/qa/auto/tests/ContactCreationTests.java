package ru.t1mmy.qa.auto.tests;

import org.testng.annotations.Test;
import ru.t1mmy.qa.auto.model.ContactData;

public class ContactCreationTests extends TestBase{

    @Test
    public void testContactCreation() {
        app.getNavigationHelper().gotoContactPage();
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("contact", "contact_F", "cba", "msk", "987521", "abSc@mail.ru"));
        app.getContactHelper().submitContactCreation();
        app.getNavigationHelper().gotoContactPage();
    }

}
