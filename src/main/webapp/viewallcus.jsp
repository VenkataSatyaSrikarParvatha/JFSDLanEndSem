<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View All Customer</title>
</head>
<body>
    Total Customer = <c:out value="${count}"></c:out>
    <h3>View All Customer</h3>
    <table>
        <tr>

            <th>ID</th>
            <th>NAME</th>
            <th>EMAIL</th>
            <th>Phone Number</th>
            <th>Address</th>
            <th>Date of Birth</th>
        </tr>
        <c:forEach items="${cuslist}" var="std">
            <tr>
                <td><c:out value="${std.id}"/></td>
                <td><c:out value="${std.name}"/></td>
                <td><c:out value="${std.email}"/></td>
                <td><c:out value="${std.phno}"/></td>
                <td><c:out value="${std.address}"/></td>
                <td><c:out value="${std.dob}"/></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
