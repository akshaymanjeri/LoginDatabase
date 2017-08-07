<?php
$mysql_host='localhost';
$mysql_user='root';
$mysql_db='employee';
$conn=mysqli_connect($mysql_host, $mysql_user, "",$mysql_db);
$username=$_POST["username"];
$pass=$_POST["password"];
$mysql_qry="SELECT * FROM users WHERE username like '$username' and password like '$pass';";
$result=mysqli_query($conn ,$mysql_qry);
if(mysqli_num_rows($result) > 0) {
echo "login success !!!!! Welcome user";
}
else {
echo "login not success";
}
?>