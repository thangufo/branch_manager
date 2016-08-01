Branch Manager Address Book
===========================
You will need to have gradle installed in your computer

To run all the tests: `gradle test`

Acceptance Criteria
-------------------

1. Address book will hold name and phone numbers of contact entries
2. Users should be able to add new contact entries
3. Users should be able to remove existing contact entries
4. Users should be able to print all contacts in an address book
5. Users should be able to maintain multiple address books
6. Users should be able to print a unique set of all contacts across multiple address books

Classes
-------
1. User: representing branch managers
2. AddressBook: Belong to an user. An user can have multiple AddressBooks
3. Contact: Belong to an AddressBook. An AddressBook can have multiple Contacts

Tests
-----
1. ContactTest: Covers acceptance criteria 1
2. UserTest: Covers acceptance criteria 5,6
3. AddressBookTest: Covers acceptance criteria 2,3,4