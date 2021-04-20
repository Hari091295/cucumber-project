$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adaction.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adaction Application",
  "description": "",
  "id": "hotel-booking-in-adaction-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "LogIn Functionality",
  "description": "",
  "id": "hotel-booking-in-adaction-application;login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"\u003cUsername\u003e\" In Textbox",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"\u003cPassword\u003e\" In Password Textbox",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On Login Button And It Navigate To The Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adaction-application;login-functionality;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 11,
      "id": "hotel-booking-in-adaction-application;login-functionality;;1"
    },
    {
      "cells": [
        "ravi",
        "253"
      ],
      "line": 12,
      "id": "hotel-booking-in-adaction-application;login-functionality;;2"
    },
    {
      "cells": [
        "Ragu",
        "634"
      ],
      "line": 13,
      "id": "hotel-booking-in-adaction-application;login-functionality;;3"
    },
    {
      "cells": [
        "Hariprasath",
        "stunnerhari"
      ],
      "line": 14,
      "id": "hotel-booking-in-adaction-application;login-functionality;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "LogIn Functionality",
  "description": "",
  "id": "hotel-booking-in-adaction-application;login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"ravi\" In Textbox",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"253\" In Password Textbox",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On Login Button And It Navigate To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 6404499000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ravi",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Textbox(String)"
});
formatter.result({
  "duration": 80920000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "253",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Textbox(String)"
});
formatter.result({
  "duration": 59157700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_Login_Button_And_It_Navigate_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 810167700,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "LogIn Functionality",
  "description": "",
  "id": "hotel-booking-in-adaction-application;login-functionality;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"Ragu\" In Textbox",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"634\" In Password Textbox",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On Login Button And It Navigate To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 766996900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ragu",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Textbox(String)"
});
formatter.result({
  "duration": 76213100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "634",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Textbox(String)"
});
formatter.result({
  "duration": 77507000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_Login_Button_And_It_Navigate_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 607029500,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "LogIn Functionality",
  "description": "",
  "id": "hotel-booking-in-adaction-application;login-functionality;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"Hariprasath\" In Textbox",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"stunnerhari\" In Password Textbox",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On Login Button And It Navigate To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 558289500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hariprasath",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Textbox(String)"
});
formatter.result({
  "duration": 77660600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "stunnerhari",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Textbox(String)"
});
formatter.result({
  "duration": 63421200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_Login_Button_And_It_Navigate_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 2401602000,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Search Hotel",
  "description": "",
  "id": "hotel-booking-in-adaction-application;search-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@Sanitytest"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "user Enter The Location In Location Textbox",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user Enter The Hotel Name In Hotel Select Textbox",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Enter The Room Type In The Room Type Textbox",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Enter The No Of Rooms In The Room No Textbox",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Enter The Checkindate In Checkindate Textbox",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Enter The Checkoutdate In Checkoutdate Textbox",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Enter The Adultperroom In Adultperroom Textbox",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user Enter The Childrenperroom In Childrenperroom Textbox",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user Click On Searchbutton And It Navigate To The Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Location_In_Location_Textbox()"
});
formatter.result({
  "duration": 138860500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Hotel_Name_In_Hotel_Select_Textbox()"
});
formatter.result({
  "duration": 142198200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Room_Type_In_The_Room_Type_Textbox()"
});
formatter.result({
  "duration": 157674300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_No_Of_Rooms_In_The_Room_No_Textbox()"
});
formatter.result({
  "duration": 152332100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Checkindate_In_Checkindate_Textbox()"
});
formatter.result({
  "duration": 66523700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Checkoutdate_In_Checkoutdate_Textbox()"
});
formatter.result({
  "duration": 78321200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Adultperroom_In_Adultperroom_Textbox()"
});
formatter.result({
  "duration": 63493900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Childrenperroom_In_Childrenperroom_Textbox()"
});
formatter.result({
  "duration": 60359700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_Searchbutton_And_It_Navigate_To_The_Select_Hotel_Page()"
});
formatter.result({
  "duration": 1374662900,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Select Hotel",
  "description": "",
  "id": "hotel-booking-in-adaction-application;select-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@Sanitytest"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "user Select The Hotel With Respective Particulars In Select Bullet Icon",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "user Click On Continuebutton And It Navigate To The Book Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Hotel_With_Respective_Particulars_In_Select_Bullet_Icon()"
});
formatter.result({
  "duration": 61240700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_Continuebutton_And_It_Navigate_To_The_Book_Hotel_Page()"
});
formatter.result({
  "duration": 1588969200,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Book Conform",
  "description": "",
  "id": "hotel-booking-in-adaction-application;book-conform",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@Sanitytest"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "user Enter The First Name In First Name Textbox",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "user Enter The Last Name In Last Name Textbox",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user Enter The Billing Address In Billing Address Textbox",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user Enter The Credit Card No In Creditcard Textbox",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Enter The Card Type In Card Type Textbox",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user Enter The Expirydate Month In Month Textbox",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user Enter The Expirydate Year In Year Textbox",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user Enter The Cvv Number In Cvv Number Textbox",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user Click On Book Now Button And It Navigate To Booking Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_First_Name_In_First_Name_Textbox()"
});
formatter.result({
  "duration": 74232600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Last_Name_In_Last_Name_Textbox()"
});
formatter.result({
  "duration": 69133000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Billing_Address_In_Billing_Address_Textbox()"
});
formatter.result({
  "duration": 74330100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Credit_Card_No_In_Creditcard_Textbox()"
});
formatter.result({
  "duration": 66531200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Card_Type_In_Card_Type_Textbox()"
});
formatter.result({
  "duration": 120036700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Expirydate_Month_In_Month_Textbox()"
});
formatter.result({
  "duration": 122936800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Expirydate_Year_In_Year_Textbox()"
});
formatter.result({
  "duration": 126534000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Cvv_Number_In_Cvv_Number_Textbox()"
});
formatter.result({
  "duration": 65104900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_Book_Now_Button_And_It_Navigate_To_Booking_Confirmation_Page()"
});fformatter.result({
  "duration": 5069962300,
  "status": "passed"
});
formatter.scenario({
  "line": 43,
  "name": "Itinerary",
  "description": "",
  "id": "hotel-booking-in-adaction-application;itinerary",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 42,
      "name": "@Sanitytest"
    }
  ]
});
formatter.step({
  "line": 45,
  "name": "user Click On My Itinerary Button And It Navigate To Booked Itinerary Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Click_On_My_Itinerary_Button_And_It_Navigate_To_Booked_Itinerary_Page()"
});fformatter.result({
  "duration": 5463963900,
  "status": "passed"
});
formatter.scenario({
  "line": 47,
  "name": "Logout",
  "description": "",
  "id": "hotel-booking-in-adaction-application;logout",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 46,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 48,
  "name": "user Click On Logout Button And It Navigate To The Homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Click_On_Logout_Button_And_It_Navigate_To_The_Homepage()"
});
formatter.result({
  "duration": 608934200,
  "status": "passed"
});
});