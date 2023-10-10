<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
    <head>
        <link href="webjars/bootstrap/5.3.2/css/bootstrap.min.css" rel="stylesheet" >
        <title>Add Driver Details</title>
    </head>
    <body>
        <div class="container">
            <h2>Enter driver details</h2>
            <form:errors path="errors" cssClass="text-warning" />
            <form:form class="row g-3" method="post" modelAttribute="newDriverInfo">
              <div class="col-md-6">
                <label for="driverName" class="form-label">Driver name</label>
                <form:input type="text" class="form-control" id="driverName" path="driverName" required="required" />
              </div>
              <div class="col-md-6">
                <label for="teamName" class="form-label">Team name</label>
                <form:input type="text" class="form-control" id="teamName" path="teamName" required="required" />
              </div>
              <div class="col-md-6">
                <label for="contractEndDate" class="form-label">Contract end date</label>
                <form:input type="date" class="form-control" id="contractEndDate" required="required" path="contractEndDate" />
              </div>
              <div class="col-md-4">
                <label for="isRetired" class="form-label">Retired</label>
                <form:select required="required" id="isRetired" path="isRetired" class="form-select">
                  <form:option value="false">No</form:option>
                  <form:option value="true">Yes</form:option>
                </form:select>
              </div>
              <div class="col-md-2">
                <label for="driverId" class="form-label">Driver Number</label>
                <form:input type="number" class="form-control" id="driverId" required="required" path="driverId" />
              </div>
              <div class="col-12">
                <button type="submit" class="btn btn-primary">Add</button>
              </div>
            </form:form>
        </div>
        <script src="webjars/bootstrap/5.3.2/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.7.1/jquery.min.js"></script>
    </body>
</html>