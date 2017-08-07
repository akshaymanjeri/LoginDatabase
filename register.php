<?php
$mysql_host='localhost';
$mysql_user='root';
$mysql_db='employee';
$conn=mysqli_connect($mysql_host, $mysql_user, "",$mysql_db);
$name=$_POST["name"];
$age=$_POST["age"];
$stmt="INSERT INTO `list` (`name`, `age`) VALUES ('$name', '$age');";
$result=mysqli_query($conn ,$stmt);
echo "Employee added";
?>