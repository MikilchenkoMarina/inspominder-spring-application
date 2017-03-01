<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="springForm" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Inspominder</title>
    <link href="<c:url value="/resources/css/myCustom.css" />" rel="stylesheet">
</head>
<br>
<h1><s:message code="inspominder.register"/></h1>

<a href="?mylocale=en">English </a> | <a href="?mylocale=de">German </a>

<springForm:form method="POST" commandName="user">

    <springForm:label path="firstName" cssErrorClass="error">
        <s:message code="inspominder.firstName"/>
    </springForm:label>
    <springForm:input path="firstName" cssErrorClass="error"/>
    <springForm:errors path="firstName" cssClass="error"/> </br>

    <springForm:label path="lastName" cssErrorClass="error">
        <s:message code="inspominder.lastName"/>
    </springForm:label>
    <springForm:input path="lastName" cssErrorClass="error"/>
    <springForm:errors path="lastName" cssClass="error"/> </br>

    <springForm:label path="userName" cssErrorClass="error">
        <s:message code="inspominder.userName"/>
    </springForm:label>
    <springForm:input path="userName" cssErrorClass="error"/>
    <springForm:errors path="userName" cssClass="error"/> </br>

    <springForm:label path="password" cssErrorClass="error">
        <s:message code="inspominder.password"/>
    </springForm:label>
    <springForm:input path="password" cssErrorClass="error"/>
    <springForm:errors path="password" cssClass="error"/> </br>

    <springForm:button>
        <s:message code="inspominder.register"/>
    </springForm:button>

</springForm:form>
</body>
</html>
