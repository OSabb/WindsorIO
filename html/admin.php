<?php
    session_start();
    if ($_SESSION['state'] != 3) {
        $_SESSION['state'] = 0;
        header('Location:index.php');
    }
?>

<html>
  <head>
    <title>System Admin View</title>
    <!--Responsive Web Design-->
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <link rel="stylesheet" href="http://zhou16g.myweb.cs.uwindsor.ca/bootstrap.min.css">
    <script src="http://zhou16g.myweb.cs.uwindsor.ca/jquery.min.js"></script>
    <script src="http://zhou16g.myweb.cs.uwindsor.ca/bootstrap.min.js"></script>
    <!--Customization-->
    <link rel="stylesheet" href="../css/full.css">
    <link rel="stylesheet" href="../css/temp.css">
  </head>
  <body>
    <header class="jumbotron text-left">
      <h1>WindsorIO: Admin View</h1>
    </header>
    <section>
      <h4>This webpage is underdevelopment, please comeback later</h4>
    </section>
    <footer class="page-footer font-small">
      <div class="footer-copyright text-left p-2">Developers: Julia, Darius, Moose, Omar</div>
    </footer>
  </body>
</html>