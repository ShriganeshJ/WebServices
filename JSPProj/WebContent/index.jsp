<%@page import="java.time.LocalDate"%>
<html>
<h1> Welcome to JSP</h1>


<h1> Sscriptlet Tag :It is local it's inside jspService Method <!-- (<%= 10+20 %>>) --> </h1>

<% LocalDate date = LocalDate.now(); %>

<div>Today's Date is <% out.println(date); %> </div>

<h1>Expression Tag: To evaluate the given expression and add to display the generated result on the browser <!-- (<%= 10+20 %>>) --></h1>

<h6>The expression Tag::</h6>
<%= 10+20 %><br>
<%= 10*20 %><br>
<%= 10/20 %><br>


<h1>Declaration Tag: The code that goes to JSE class as outside code of _jspService(--) <!-- (<%!  %>>) --> </h1>

<%!

static String a="My Name Is ";

public String getFullName()
{

return a+"Raja";



}


%>

<!-- call  decleration tag  -->

<%=getFullName() %>



</html>