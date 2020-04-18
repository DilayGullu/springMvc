<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
   
  
<title>YENI UYE KAYDI</title>
</head>
<body>

<form:form action="save" method="post" modelAttribute="contact" >

<div class="container">
  <h2> YENI YUYE KAYDI</h2>
  <form:hidden path="id"/>
  <form action="/action_page.php">
  
    <div class="form-group">
      <label for="name">Ad:</label>
      <input type="text" class="form-control" id="name"  name="name">
    </div>
    
  <div class="form-group">
      <label for="surname">Soyad:</label>
      <input type="text" class="form-control" id="surname"  name="surname">
    </div>
    
  <div class="form-group">
      <label for="tc">TC:</label>
      <input type="text" class="form-control" id="tc"  name="tc">
    </div>
    
 <div class="form-group">
      <label for="address">Adres:</label>
      <input type="text" class="form-control" id="address"  name="address">
    </div>
    
  <div class="form-group">
      <label for="phone">Telefon: (05#########)</label>
      <input type="text" class="form-control" id="phone"  name="phone">
    </div>
    
 <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="email"  name="email">
    </div>
    
  <div class="form-group">
      <label for="date">Dogum Tarihi:</label>
      <input type="date" class="form-control" id="date"  name="date" >
      
    </div>
    
    <div class="form-group">
  <label for="iscommers">Perakende ticareti ile ugrastiniz mi?:</label>
  <select class="form-control" id="iscommers" name="iscommers">
    <option>Evet</option>
    <option>Hayir</option>
  </select>
 </div>
 
   <div class="form-group">
      <label for="ischoice">Lokumcu Baba'yi tercih etmenizin sebebi nedir?:</label>
      <input type="text" class="form-control" id="ischoice"  name="ischoice">
    </div>
    
   <div class="form-group">
      <label for="county">Hangi il/ilce/Semt icin lokumcu baba isletmeciligi dusunuyorsunuz?:</label>
      <input type="text" class="form-control" id="county"  name="county">
    </div>
    
  <div class="form-group">
      <label for="amount">Yatirim miktariniz nedir?:</label>
      <input type="text" class="form-control" id="amount"  name="amount">
    </div>
    
  <div class="form-group">
      <label for="notes">Eklemek istedikleriniz:</label>
       <textarea class="form-control" rows="3" id="notes" name="notes"></textarea>
    </div>

      <button type="submit" class="btn btn-info   btn-block active">Ekle</button>
      
</form>
</div>
</form:form>

</body>
</html>