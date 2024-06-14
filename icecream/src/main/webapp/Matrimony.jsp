<%@ page  isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Matrimony Registration Form</title>
    <style>
        .form-group {
            margin-bottom: 15px;
        }
        label {
            display: block;
            margin-bottom: 5px;
        }
        input, select, textarea {
            width: 100%;
            padding: 8px;
            box-sizing: border-box;
        }
    </style>
</head>
<body>
    <h2>Matrimony Registration Form</h2>
    <form action="go" method="post">
        <div class="form-group">
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required>
        </div>

        <div class="form-group">
            <label for="age">Age:</label>
            <input type="number" id="age" name="age" required>
        </div>

        <div class="form-group">
            <label for="gender">Gender:</label>
            <select id="gender" name="gender" required>
                <option value="">Select</option>
                <option value="male">Male</option>
                <option value="female">Female</option>
                <option value="other">Other</option>
            </select>
        </div>

        <div class="form-group">
            <label for="marital_status">Marital Status:</label>
            <select id="marital_status" name="maritalStatus" required>
                <option value="">Select</option>
                <option value="single">Single</option>
                <option value="married">Married</option>
                <option value="divorced">Divorced</option>
                <option value="widowed">Widowed</option>
            </select>
        </div>

        <div class="form-group">
            <label for="religion">Religion:</label>
            <input type="text" id="religion" name="religion" required>
        </div>

        <div class="form-group">
            <label for="job">Job:</label>
            <input type="text" id="job" name="job" required>
        </div>

        <div class="form-group">
            <label for="qualification">Qualification:</label>
            <input type="text" id="qualification" name="qualification" required>
        </div>

        <div class="form-group">
            <label for="lookingFor">Looking for:</label>
            <select id="lookingFor" name="lookingFor" required>
                <option value="">Select</option>
                <option value="Boy">Single</option>
                <option value="Girl">Married</option>
            </select>
        </div>

        <div class="form-group">
            <input type="submit" value="send"></input>
        </div>
    </form>
</body>
</html>
