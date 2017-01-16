package ru.t1mmy.qa.auto.tests;

import org.testng.annotations.Test;
import ru.t1mmy.qa.auto.model.GroupData;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForms(new GroupData("ура", "урашеньки", "бугага"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();
    }

}
