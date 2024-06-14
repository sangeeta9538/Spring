<%@ page  isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 140vh;
            background-color: #f0f0f0;

        }

        h2 {
            text-align: center;
        }

        form {
            background-color: #fff;
            padding: 10px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 400px;
        }

        label {
            display: block;
            margin-bottom: 5px;
        }

        input, textarea {
            width: 100%;
            padding: 8px;
            margin-bottom: 5px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            width: 100%;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }

        .error {
            color: red;
            font-size: 0.9em;
            margin-top: -10px;
            margin-bottom: 20px;
        }
        h2 {
            text-align: center;
        }
    </style>


</head>

<body>

    <form action="call" method="post" id="contactForm" onsubmit="return validateForm()">
   <center><Strong><span style="color:blue">${msg}</span></Strong></center>
            <h2>Contact Form</h2>

        <label for="name">Name:</label>
        <input type="text" id="name" name="name"><br>
        <span id="nameError" class="error"></span><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" disabled><br>
        <span id="emailError" class="error"></span><br>

        <label for="contact">Contact Number:</label>
        <input type="text" id="contact" name="contact"><br>
         <span class="error" id="contactError"></span><br>

        <label for="comments">Comments:</label>
        <textarea id="comments" name="comments" rows="4" cols="50" disabled></textarea><br>
        <span id="commentsError" class="error"></span><br>

        <input type="submit" value="Submit">
    </form>

    <script>
        document.addEventListener('DOMContentLoaded', function() {
            const nameInput = document.getElementById('name');
            const emailInput = document.getElementById('email');
            const commentsInput = document.getElementById('comments');
            const nameError = document.getElementById('nameError');
            const emailError = document.getElementById('emailError');
            const commentsError = document.getElementById('commentsError');
            const form = document.getElementById('contactForm');

            nameInput.addEventListener('input', function() {
                if (nameInput.value.length < 3) {
                    nameError.textContent = 'Name must be at least 3 characters long.';
                    emailInput.disabled = true;
                } else {
                    nameError.textContent = '';
                    emailInput.disabled = false;
                }
            });

            emailInput.addEventListener('input', function() {
                if (emailInput.value.length > 30) {
                    emailError.textContent = 'Email must be at most 30 characters long.';
                    commentsInput.disabled = true;
                } else {
                    emailError.textContent = '';
                    commentsInput.disabled = false;
                }
            });

            commentsInput.addEventListener('input', function() {
                if (commentsInput.value.length > 300) {
                    commentsError.textContent = 'Comments must be at most 300 characters long.';
                } else {
                    commentsError.textContent = '';
                }
            });

            form.addEventListener('submit', function(event) {
                let valid = true;

                if (nameInput.value.length < 3) {
                    nameError.textContent = 'Name must be at least 3 characters long.';
                    valid = false;
                }

                if (emailInput.value.length > 30) {
                    emailError.textContent = 'Email must be at most 30 characters long.';
                    valid = false;
                }

                if (commentsInput.value.length > 300) {
                    commentsError.textContent = 'Comments must be at most 300 characters long.';
                    valid = false;
                }

                if (!valid) {
                    event.preventDefault();
                }
            });
        });
    </script>
</body>
</html>
