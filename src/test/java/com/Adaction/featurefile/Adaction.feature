Feature: Hotel Booking In Adaction Application
@Smoketest
Scenario Outline: LogIn Functionality

Given user Launch The Application
When user Enter The "<Username>" In Textbox
And user Enter The "<Password>" In Password Textbox
Then user Click On Login Button And It Navigate To The Search Hotel Page 

Examples:
|Username|Password|
|ravi|253|
|Ragu|634|
|Hariprasath|stunnerhari|
@Sanitytest
Scenario: Search Hotel

When user Enter The Location In Location Textbox
And user Enter The Hotel Name In Hotel Select Textbox
And user Enter The Room Type In The Room Type Textbox
And user Enter The No Of Rooms In The Room No Textbox
And user Enter The Checkindate In Checkindate Textbox
And user Enter The Checkoutdate In Checkoutdate Textbox
And user Enter The Adultperroom In Adultperroom Textbox
And user Enter The Childrenperroom In Childrenperroom Textbox
Then user Click On Searchbutton And It Navigate To The Select Hotel Page
@Sanitytest
Scenario: Select Hotel
When user Select The Hotel With Respective Particulars In Select Bullet Icon
Then user Click On Continuebutton And It Navigate To The Book Hotel Page
@Sanitytest
Scenario: Book Conform
When user Enter The First Name In First Name Textbox 
And user Enter The Last Name In Last Name Textbox
And user Enter The Billing Address In Billing Address Textbox
And user Enter The Credit Card No In Creditcard Textbox
And user Enter The Card Type In Card Type Textbox
And user Enter The Expirydate Month In Month Textbox
And user Enter The Expirydate Year In Year Textbox
And user Enter The Cvv Number In Cvv Number Textbox
Then user Click On Book Now Button And It Navigate To Booking Confirmation Page
@Sanitytest
Scenario: Itinerary

Then user Click On My Itinerary Button And It Navigate To Booked Itinerary Page
@Smoketest
Scenario: Logout
Then user Click On Logout Button And It Navigate To The Homepage
 