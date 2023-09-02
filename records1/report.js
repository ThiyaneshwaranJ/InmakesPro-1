$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/reportpurpose.feature");
formatter.feature({
  "name": "To Register and validate the login of facebook application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "The project of creation of  new account in FB",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Enduser has to launch the chrome browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "test.enduser_has_to_launch_the_chrome_browser_and_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enduser has to launch the url of facebook application",
  "keyword": "When "
});
formatter.match({
  "location": "test.enduser_has_to_launch_the_url_of_facebook_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enduser has to click the create new account button",
  "keyword": "And "
});
formatter.match({
  "location": "test.enduser_has_to_click_the_create_new_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enduser has to enter the firstname in firstname box",
  "rows": [
    {
      "cells": [
        "firstname",
        "inmakes"
      ]
    },
    {
      "cells": [
        "secondname",
        "framework"
      ]
    },
    {
      "cells": [
        "thirdname",
        "datadriven"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "test.enduser_has_to_enter_the_firstname_in_firstname_box(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Surname in Surname box",
  "keyword": "And "
});
formatter.match({
  "location": "test.enter_the_Surname_in_Surname_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enduser has to enter the mobileno or email in that textbox",
  "keyword": "And "
});
formatter.match({
  "location": "test.enduser_has_to_enter_the_mobileno_or_email_in_that_textbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enduser has to enter the new password in new password box",
  "rows": [
    {
      "cells": [
        "password",
        "password1",
        "password2",
        "password3"
      ]
    },
    {
      "cells": [
        "testng",
        "datadriven",
        "junit",
        "sql"
      ]
    },
    {
      "cells": [
        "jira",
        "tcp",
        "vtam",
        "cics"
      ]
    },
    {
      "cells": [
        "jcl",
        "jes",
        "ipl",
        "parmlib"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "test.enduser_has_to_enter_the_new_password_in_new_password_box(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enduser has to close the chrome browser",
  "keyword": "Then "
});
formatter.match({
  "location": "test.enduser_has_to_close_the_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
});