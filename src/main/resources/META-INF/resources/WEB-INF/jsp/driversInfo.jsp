<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <link href="webjars/bootstrap/5.3.2/css/bootstrap.min.css" rel="stylesheet" >

        <title>Hello MOM</title>
    </head>
    <body>
        <div class="container">
            <div> Hello from FIA, ${name} </div><hr>
            <h2>Here is drivers info for the season</h2>
            <table class="table">
                <thead>
                    <tr>
                        <th>Driver number</th>
                        <th>Name</th>
                        <th>Team Name </th>
                        <th>Contract End Date </th>
                        <th>Retired</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${drivers}" var="driver">
                        <tr>
                            <td>${driver.driverId}</td>
                            <td>${driver.driverName}</td>
                            <td>${driver.teamName}</td>
                            <td>${driver.contractEndDate}</td>
                            <td>${driver.isRetired}</td>
                            <td><a href="delete-driver?id=${driver.uuid}" class="btn btn-warning">Delete</a></td>
                            <td><a href="update-driver?id=${driver.uuid}" class="btn btn-success">Update</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <a href="new-driver" class="btn btn-success">Add New Driver Info</a>
        </div>
        <script src="webjars/bootstrap/5.3.2/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.7.1/jquery.min.js"></script>
    </body>
</html>