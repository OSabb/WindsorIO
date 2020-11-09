<?php
    session_start();
    $_SESSION['state'] = 0;
?>

<html>
  <head>
    <title>WindsorIO</title>
    <!--Responsive Web Design-->
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <link rel="stylesheet" href="http://zhou16g.myweb.cs.uwindsor.ca/bootstrap.min.css">
    <script src="http://zhou16g.myweb.cs.uwindsor.ca/jquery.min.js"></script>
    <script src="http://zhou16g.myweb.cs.uwindsor.ca/bootstrap.min.js"></script>
    <!--Customization-->
    <link rel="stylesheet" href="../css/full.css">
    <link rel="stylesheet" href="../css/index.css">
  </head>
  <body>
    <header class="jumbotron text-left">
      <h1>WindsorIO</h1>
    </header>
    <section class="text-center py-3">
      <h3>Open Dataset Portal</h3>
      <p>If you would like to access/upload files in the portal <a href="#">click here</a>.</p>
      <form action="authenticate.php" method="post">
        <div class="form-group">
          <label for="uname">Username</label>
          <input type="text" id="uname" name="username" class="form-control"><br>
          <label for="pword">Password</label>
          <input type="password" id="pword" name="password" class="form-control"><br>
          <input type="submit" class="form-control">
        </div>
      </form>
    </section>
    <footer class="page-footer font-small">
      <div class="footer-copyright text-left p-2">Developers: Julia, Darius, Moose, Omar</div>
    </footer>
  </body>
</html>