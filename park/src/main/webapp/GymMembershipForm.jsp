<%@ page  isELIgnored="false"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gym Membership Form</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .error {
            color: red;
            font-size: 0.9em;
        }
    </style>
</head>
<body>

   <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <h2 class="text-center" style="color:green">Gym Membership Form</h2>
                <form action="gym" id="gymForm" onsubmit="return validateForm()" method="POST">

                        <span style="color:red;">
                                 <c:forEach items = "${errors}" var="objectError">
                                 ${objectError.defaultMessage} </br>
                                 </c:forEach>
                                 </span>
                    <div class="form-group">
                        <label for="name">Name:</label>
                        <input type="text" class="form-control" id="name" name="name" value="${gymDto.name}">
                        <span id="nameError" class="error"></span>
                    </div>
                    <div class="form-group">
                        <label for="currentWeight">Current Weight:</label>
                        <input type="number" class="form-control" id="currentWeight" name="currentWeight" value="${gymDto.currentWeight}">
                        <span id="currentWeightError" class="error"></span>
                    </div>
                    <div class="form-group">
                        <label for="desiredWeight">Desired Weight:</label>
                        <input type="number" class="form-control" id="desiredWeight" name="desiredWeight" value="${gymDto.desiredWeight}">
                        <span id="desiredWeightError" class="error"></span>
                    </div>
                    <div class="form-group">
                        <label for="phone">Phone Number:</label>
                        <input type="tel" class="form-control" id="phone" name="phone" value="${gymDto.phone}">
                        <span id="phoneError" class="error"></span>
                    </div>
                    <div class="form-group">
                        <label for="trainer">Do you need a personal trainer?</label>
                        <select class="form-control" id="trainer" name="trainer">
                            <option value="" ${gymDto.trainer==null ? 'selected' : ''}>Select an option</option>
                            <option value="yes" ${gymDto.trainer eq 'yes' ? 'selected' : ''}>Yes</option>
                            <option value="no" ${gymDto.trainer eq 'no' ? 'selected' : ''}>No</option>
                        </select>
                        <span id="trainerError" class="error"></span>
                    </div>
                    <div class="text-center">
                        <button type="submit" class="btn btn-primary">Submit</button>
                    </div>
                </form>
            </div>
        </div>
    </div>

    <script>
        function validateForm() {
            let valid = true;

            // Clear previous error messages
            document.getElementById("nameError").textContent = "";
            document.getElementById("currentWeightError").textContent = "";
            document.getElementById("desiredWeightError").textContent = "";
            document.getElementById("phoneError").textContent = "";
            document.getElementById("trainerError").textContent = "";

            // Validate name
            const name = document.getElementById("name").value;
            if (name.trim() === "") {
                document.getElementById("nameError").textContent = "Name is required.";
                valid = false;
            }

            // Validate current weight
            const currentWeight = document.getElementById("currentWeight").value;
            if (currentWeight.trim() === "" || isNaN(currentWeight) || currentWeight <= 0) {
                document.getElementById("currentWeightError").textContent = "Valid current weight is required.";
                valid = false;
            }

            // Validate desired weight
            const desiredWeight = document.getElementById("desiredWeight").value;
            if (desiredWeight.trim() === "" || isNaN(desiredWeight) || desiredWeight <= 0) {
                document.getElementById("desiredWeightError").textContent = "Valid desired weight is required.";
                valid = false;
            }

            // Validate phone number
            const phone = document.getElementById("phone").value;
            const phonePattern = /^\d{10}$/;
            if (!phonePattern.test(phone)) {
                document.getElementById("phoneError").textContent = "Valid 10-digit phone number is required.";
                valid = false;
            }

            // Validate trainer selection
            const trainer = document.getElementById("trainer").value;
            if (trainer === "") {
                document.getElementById("trainerError").textContent = "Please select if you need a personal trainer.";
                valid = false;
            }

            return valid;
        }
    </script>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
