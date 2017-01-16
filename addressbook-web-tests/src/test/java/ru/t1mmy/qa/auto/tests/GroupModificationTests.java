package ru.t1mmy.qa.auto.tests;

import org.testng.annotations.Test;
import ru.t1mmy.qa.auto.model.GroupData;

/**
 * Created by t1mmy on 16.01.2017.
 */
public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification(){
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForms(new GroupData("ололо", "урашеньки", "бугага"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();
    }
}
