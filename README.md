
# WESTERN GOVERNOR UNIVERSITY
## D287 – JAVA FRAMEWORKS

C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.

File name: mainscreen.html

Line: 14 Changed ‘My Bike Shop’ to ‘Bender’s Robot Emporium’

Line: 19 Changed ‘Shop’ to ‘Robot Shop’

Line: 21 Changed‘Parts’ to ‘Robot Parts’

Line: 53 Changed‘Products’ to ‘Robot Products’

D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
File name: aboutpage.html

Line: 36 Added ‘About’ title to aboutpage.html

Line: 39 Added ‘About Bender’s Robot Emporium’ header to aboutpage.html

Line: 40 - 45 Added 3 about page paragraphs to aboutpage.html

Line: 47 - 48 Added link to home page (mainscreen.html)

File name: mainscreen.html

Line 89 Added link to aboutpage.html

E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

File name: Bootstrapdata.java

Line 11: Added import ArrayList.

Line 39 - 63: Added newParts ArrayList and branch to only add one of each product and part to repositories.

Lines: 83- 131 Added 5 new parts with prices, company name, part name and inventory available.

Lines: 145 - 154 Added 5 new products with product name, price, and inventory available.

File Name: OutsourcedPart Repository

Line: 15 Added findByName method.

F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:

File name: mainscreen.html

Line 85 - 88: Added Buy Now button to product list.

File Name: FailureController

Lines 6 - 12 Added Failure Controller to lead to Failure Page.

File Name: SuccessController

Lines 6 - 12 Added Success Controller to lead to Successful purchase page.

File Name: failure.html

Lines: 1 - 13 Added a failure page if the purchase encounters an error.

File Name: success.html

Lines: 1 - 13 Add a success page to declare the purchase a success.

File Name ProductRepository

Line 20: Added findByName method.

File Name: BuyProductController

Lines: 1 - 53 Added BuyProduct Controller to interface with the Buy Now button and reduce the inventory by 1 on a successful purchase.

G. Modify the parts to track maximum and minimum inventory by doing the following:

File name: Part.java

Line: 31 - 34 Added minInv integer and maxInv integer.

Lines: 44, 48 - 49, 53, 58 - 59 Added minInv and maxInv to the constructors.

Lines: 94 -106 Added Setters and Getters for minInv and maxInv.

Lines: 136 Added Method to check min and max inventory.

File Name: BootStrapData

Lines: 56- 57 Added minInv and maxInv to part list.

Lines: 89, 90, 99, 100, 109, 110, 119, 120, 129, 130: Added minInv and maxInv values to the sample inventory.

File Name: InHousePartForm

Lines: 24 - 28 Added text fields for Min and Max inventory.

File Name: OutsourcePartForm

Lines: 25 - 29 Added text fields for Min and Max inventory.

File Name: Application.properties

Line: 6 Changed the file name to mirror the file name change elsewhere.

File Name: InHousePart.java

Lines: 20 - 21 Added Override to check inventory levels are within minInv and maxInv values and throw an error is there aren’t.

File Name: OutsourcedPart.java

Lines: 28 - 21 Added Override to check inventory levels are within minInv and maxInv values and throw an error is there aren’t.

File Name: AddInhousePartController

Lines: 37 Added Override to check inventory levels are within minInv and maxInv values and throw an error is there aren’t.

Lines: 39 - 52, 62 - 67 Added logic to enforce min/max inventory.

File Name: AddOutsourcedPartController

Lines: 35 Added Override to check inventory levels are within minInv and maxInv values and throw an error is there aren’t.

Lines: 40 - 54, 66 - 69 Added logic to enforce min/max inventory.

H. Add validation for between or at the maximum and minimum fields. The validation must include the following:

File Name: EnufPartsValidator

Lines: 36 - 40 Added Max inventory constraint.

File Name: AddOutsourcePartController

Lines: 56 - 64 Updated code to include new Min/Max constraint messages.

File Name: AddInhousePartController

Lines 54 - 62 Updated code to include new Min/Max constraint messages.

I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

File Name: PartTest.java

Lines: 160 - 176 Added a minInv and a maxInv unit test.

J.  Remove the class files for any unused validators in order to clean your code.

File Name: MainScreenController

Lines: 5 - 6 Removed unused Validators

File Name: BootStrapData.java

Lines: 4, 9 - 12 Removed unused Validators

File Name: AddPartController

Lines: 6, 12 Removed unused Validators

File Name: AddInhousePartController

Lines: 4, 7 - 8 Removed unused Validators

File Name: AddOutsourcedPartController

Lines: 3 Removed unused Validators