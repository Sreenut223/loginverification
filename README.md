✅ 1. Create Dynamic Web Project
Open Eclipse.
Go to File > New > Dynamic Web Project.
Enter project name (e.g., LoginValidation).
Select Target Runtime (Tomcat).
Click Finish.


✅ 2. Create a JSP Page Instead of HTML
Right-click on WebContent → New → HTML File (e.g., index.html).

✅ 3. Create Servlet Package and Class
Create a package (e.g., com.tap) inside Java Resources > src.
Create a servlet class (e.g., lservlet) inside the package.
Extend HttpServlet and override service() method.

✅ 4. Add Login Logic
Check if the entered password matches the expected one.
Use HttpSession to store and track login attempt count for each user.
Forward error messages back to the login page using RequestDispatcher.

✅ 5. Configure web.xml
create servlet mapping and servlet in the web.xml

✅ 6. Run the Project
Right-click the project → Run As > Run on Server.
Choose Tomcat and click Finish.

✅ 7. Test Functionality
On correct password: user is greeted with a welcome message.
On wrong password: error appears inside the login box.
After 3 wrong attempts: attempts completed is shown.

                                                                                                                -𝓢𝓻𝓮𝓮𝓷𝓲𝓿𝓪𝓼𝓾𝓵𝓾 𝓡𝓮𝓭𝓭𝔂
                                                                                                                       9491558730
