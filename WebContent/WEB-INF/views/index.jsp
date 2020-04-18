<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
  <h2>BAYILIK ON BASVURU FORMU</h2>
  <h3><a href="new" class="btn btn-info active" role="button">Yeni Uye</a></h3>
  <table class="table table-bordered">
    <thead>
 
  
<tr>
<th>No</th>
<th>Ad</th>
<th>Soyad</th>
<th>TC Kimlik</th>
<th>Adres</th>
<th>Telefon</th>
<th>Email</th>
<th>Dogum Tarihi</th>
<th>Perakende ticareti ile ugrastiniz mi?</th>
<th>Lokumcu Baba'yi tercih etmenizin sebebi nedir?</th>
<th>Hangi il/ilce/Semt icin lokumcu baba isletmeciligi dusunuyorsunuz?</th>
<th>Yatirim miktariniz nedir?</th>
<th>Eklemek istedikleriniz</th>
<th> </th>

</tr>
  </thead>
    <tbody>
<c:forEach items="${listContact}" var = "contact" varStatus="status">

<tr>
<td>${status.index + 1}</td>
<td>${contact.name}</td>
<td>${contact.surname}</td>
<td>${contact.tc}</td>
<td>${contact.address}</td>
<td>${contact.phone}</td>
<td>${contact.email}</td>
<td>${contact.date}</td>
<td>${contact.iscommers}</td>
<td>${contact.ischoice}</td>
<td>${contact.county}</td>
<td>${contact.amount}</td>
<td>${contact.notes}</td>



<td>

<a href="delete?id=${contact.id}" class="btn btn-danger active" role="button">Sil</a>

</td>
</tr>
</c:forEach>
</tbody>
</table>
</div>

</body>
</html>