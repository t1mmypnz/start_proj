package ru.t1mmy.qa.auto;

import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {
        gotoGroupPage();
        initGroupCreation();
        fillGroupForms(new GroupData("ура", "урашеньки", "бугага"));
        submitGroupCreation();
        returnToGroupPage();
    }

}
