<%@ page  isELIgnored="false"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!doctype html>
    <html lang="en">
      <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    </head>
    </html>

</head>
<body>
    <!-- Just an image -->
<nav class="navbar navbar-light bg-light" >
    <a class="navbar-brand" href="#">
      <img src="https://www.x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" width="60" height="50" alt="">
      <a class="navbar-brand" href="index.jsp" >home</a>
</a>
  </nav>
   <div class="container-fluid">
<header class="text-center">
<h2>Team Registration</h2>
<span style="color:red;">
         <c:forEach items = "${errors}" var="objectError">
         ${objectError.defaultMessage} </br>
         </c:forEach>
         ${teamDto}
         </span>
</header>
<section class="container my-2 bg-light w-50 text-dark p-2">

    <form action="team" method="POST" >
       <center><Strong><span style="color:blue">${msg}</span></Strong></center>

        <div class="col-md-12">
            <label for="validationTeam" class="form-label">Team Name</label>
            <input type="text" name="teamName" class="form-control" value= "${teamDto.teamName}" id="validationTeam">
            <span id="teamError" class="text-danger"></span><br>

          </div>
          <div class="col-md-12">
            <label for="validationCoach" class="form-label">Coach name</label>
            <input type="text" name="coachName" class="form-control"  value= "${teamDto.coachName}" id="validationCoach">
            <span id="coachError" class="text-danger"></span><br>
          </div>


        <div class="col-md-12">
          <label for="validationEmail" class="form-label">Email</label>
          <input type="email" name="email" class="form-control"  value= "${teamDto.email}" id="validationEmail">
          <span id="emailError" class="text-danger"></span><br>
        </div>
        <div class="col-md-12">
          <label for="validationPassword" class="form-label">Password</label>
          <input type="password" name="password" class="form-control"  value= "${teamDto.password}" id="validationPassword">
          <span id="passwordError" class="text-danger"></span><br>
        </div>
        <div class="col-12">
          <label for="validationPlayer1" class="form-label">Player1</label>
          <input type="text" name="player1" class="form-control"  value= "${teamDto.player1}" id="validationPlayer1">
          <span id="player1Error" class="text-danger"></span><br>

        </div>
        <div class="col-12">
          <label for="validationPlayer2" class="form-label">Player2</label>
          <input type="text" name="player2" class="form-control"  value= "${teamDto.player2}" id="validationPlayer2">
          <span id="player2Error" class="text-danger"></span><br>
        </div>
        <div class="col-md-6">
          <label for="validationCity" class="form-label">City</label>
          <input type="text" name="city" class="form-control"  value= "${teamDto.city}" id="validationCity">
          <span id="cityError" class="text-danger"></span><br>
        </div>
        <div class="col-md-6">
          <label for="validationState" class="form-label">State</label>
          <select id="validationState" name="state" class="form-select">
          <option ${teamDto.state==null ? 'selected' : ''} value="0">Choose State</option>
            <option value="Karnataka" ${teamDto.state eq 'Karnataka' ? 'selected' : ''}>Karnataka</option>
            <option value="TamilNadu" ${teamDto.state eq 'TamilNadu' ? 'selected' : ''}>TamilNadu</option>
            <option value="kerala" ${teamDto.state eq 'kerala' ? 'selected' : ''}>Kerala</option>
            <option value="Maharashtra" ${teamDto.state eq 'Maharashtra' ? 'selected' : ''}>Maharashtra</option>
            <option value="AndraPradesh" ${teamDto.state eq 'AndraPradesh' ? 'selected' : ''}>AndraPradesh</option>
            <option value="Odissa" ${teamDto.state eq 'Odissa' ? 'selected' : ''}>Odissa</option>
          </select>
          <span id="stateError" class="text-danger"></span><br>

        </div>
        <div class="col-12">
                  <div class="form-check">
         <label>
                    <input type="radio" name="gender" value="male" ${teamDto.gender eq 'male' ? 'checked' : ''}>
                    Male
                </label><br>
                <label>
                    <input type="radio" name="gender" value="female" ${teamDto.gender eq 'female' ? 'checked' : ''}>
                    Female
                </label><br>
                 </div>
                        </div><br>
        <div class="col-12">
          <div class="form-check">
            <input class="form-check-input" name="checkbox" type="checkbox" ${teamDto.checkbox eq 'yes' ? 'checked' : ''} value="yes" id="validationCheck">
            <label class="form-check-label" for="validationCheck">
              Checkbox
            </label>
            <span id="checkError" class="text-danger"></span><br>
          </div>
        </div>
        <div class="col-12">
          <button type="submit" class="btn btn-primary" id="submit">Sign in</button>
        </div>
      </form>
   </section>
</body>
</html>