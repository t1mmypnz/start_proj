package ru.t1mmy.qa.auto.tests;

import org.testng.annotations.Test;
import ru.t1mmy.qa.auto.model.ContactData;

/**
 * Created by t1mmy on 12.03.2017.
 */
public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        app.getNavigationHelper().gotoContactPage();
        app.getContactHelper().selectContact();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("contact", "contact_U", "cba", "mskAAA", "987521", "abSc@mail.ru"));
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().gotoContactPage();
    }
}
