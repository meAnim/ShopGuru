<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<style type="text/css">
			<%@include file="../css/bootstrap/bootstrap.min.css" %>
		    <%@include file="../css/main.css" %> 
		</style>
		
		<title>ShopGuru App</title>
	</head>
	<body>
		<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
		  <a class="navbar-brand" href="/ShopGuru">ShopGuru App</a>
		  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
		    <span class="navbar-toggler-icon"></span>
		  </button>
		  <div class="collapse navbar-collapse" id="navbarsExampleDefault">
		    <ul class="navbar-nav mr-auto">
		      
		    </ul>
		    <form class="form-inline my-2 my-lg-0">
		    <a class="nav-link" href="/ShopGuru/register">
			      <button class="btn btn-outline-success my-2 my-sm-0" type="button">Sign up</button>
			  </a>
		    </form>
		  </div>
		</nav>
		<form class="form-signin" style="width:300px; margin:100px auto;" action="/ShopGuru/login" method="post" >
		  <b style="color:red;">${SPRING_SECURITY_LAST_EXCEPTION.message}</b> 
		  <div class="text-center mb-4">
		    <h1 class="h3 mb-3 font-weight-normal">Log In</h1>
		  </div>
		  