<?php

$dbhost='localhost';
$dbusuario='pma';
$dbpass='';
$dbase='tareas';
$conesion=mysqli_connect($dbhost, $dbusuario, $dbpass, $dbase);

mysqli_query($conexion, "SET NAMES 'utf8'");
?>