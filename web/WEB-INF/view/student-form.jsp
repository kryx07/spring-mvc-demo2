<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>

<form:form action="processForm" modelAttribute="student">

    First name:
    <br>
    <form:input path="firstName"/>

    <br><br>

    Last name
    <br>
    <form:input path="lastName"/>

    <br><br>

    Country
    <br>
    <%--<form:select path="country">
        <form:option value="Brazil" label="Brazil"/>
        <form:option value="China" label="China"/>
        <form:option value="Poland" label="Poland"/>


    </form:select>--%>

    <form:select path="country">
        <form:options items="${student.countryOptions}"/>

    </form:select>

    <br><br>

    <input type="submit" value="Submit">

    <br><br>

    Favourite Language:
    <br>
    Java <form:radiobutton path="favouriteLanguage" value="Java"/>
    Ruby <form:radiobutton path="favouriteLanguage" value="Ruby"/>
    C# <form:radiobutton path="favouriteLanguage" value="C#"/>
    C++ <form:radiobutton path="favouriteLanguage" value="C++"/>

</form:form>

</body>
</html>