<?php
    session_start();
    if ($_SESSION['state'] != 1) {
        $_SESSION['state'] = 0;
        header('Location:index.php');
    }
?>

<html>
  <head>
    <title>Average User View</title>
    <!--Responsive Web Design-->
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <link rel="stylesheet" href="http://zhou16g.myweb.cs.uwindsor.ca/bootstrap.min.css">
    <script src="http://zhou16g.myweb.cs.uwindsor.ca/jquery.min.js"></script>
    <script src="http://zhou16g.myweb.cs.uwindsor.ca/bootstrap.min.js"></script>
    <!--Customization-->
    <link rel="stylesheet" href="../css/full.css">
    <link rel="stylesheet" href="../css/temp.css">
    <script src="../js/user.js"></script>
  </head>
  <body>
    <header class="jumbotron text-left">
      <h1>WindsorIO: User View</h1>
    </header>
    <section>
      <h2>City of Windsor Job Posting</h2>
      <div id="sub">
        <label for="sort">Sort by: </label>
        <select name="attr" id="sort" onchange="display(value)">
          <option value="Title">Title</option>
          <option value="Category">Category</option>
          <option value="Link">Link</option>
        </select><br>
        <a href="../files/jobposting.csv" download>CSV Download</a>
      </div>
      <p id="display"></p>
    </section>
    <footer class="page-footer font-small">
      <div class="footer-copyright text-left p-2">Developed by Darius</div>
    </footer>
  </body>
</html>