<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
    <head>
        <link href="webjars/bootstrap/5.3.2/css/bootstrap.min.css" rel="stylesheet" >
        <title>Add Driver Details</title>
    </head>
    <body>
        <div class="container">
            <h2>Enter driver details</h2>
            <form class="row g-3" method="post">
              <div class="col-md-6">
                <label for="driverName" class="form-label">Driver name</label>
                <input type="text" class="form-control" id="driverName" name="driverName" required placeholder="Carlos Sainz" />
              </div>
              <div class="col-md-6">
                <label for="teamName" class="form-label">Team name</label>
                <input type="text" class="form-control" id="teamName" name="teamName" required placeholder="Scuderia Ferrari F1 Racing Team" />
              </div>
              <div class="col-md-6">
                <label for="contractEndDate" class="form-label">Contract end date</label>
                <input type="date" class="form-control" id="contractEndDate" required name="contractEndDate" />
              </div>
              <div class="col-md-4">
                <label for="isRetired" class="form-label">Retired</label>
                <select required id="isRetired" name="isRetired" class="form-select">
                  <option selected value="false">No</option>
                  <option value="true">Yes</option>
                </select>
              </div>
              <div class="col-md-2">
                <label for="driverId" class="form-label">Driver Number</label>
                <input type="number" class="form-control" id="driverId" required name="driverId" placeholder="55" />
              </div>
              <div class="col-12">
                <button type="submit" class="btn btn-primary">Add</button>
              </div>
            </form>
        </div>
        <script src="webjars/bootstrap/5.3.2/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.7.1/jquery.min.js"></script>
    </body>
</html>