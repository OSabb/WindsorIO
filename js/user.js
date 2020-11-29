var arr;
var txt = "";

fetch('../files/jobposting.json')
  .then(function(response) {
    return response.json();
  })
  .then(function(data) {
    arr = data;
    
    for (var i = 0; i < arr.length; i++) {
      txt += "<b>Title:</b> " + arr[i].Title + "<br>";
      txt += "<b>Category:</b> " + arr[i].Category + "<br>";
      txt += "<b>Contact:</b> " + arr[i].Contact + "<br>";
      txt += "<b>Description:</b> " + arr[i].Description + "<br>";
      txt += "<b>Link:</b> " + arr[i].Link + "<br><br>";
    }
    document.getElementById("display").innerHTML = txt;
  })

function display(value) {
  txt = "";
  
  arr.sort(function(a,b) {return (a[value] > b[value])?1:(a[value] < b[value])?-1:0;})
  for (var i = 0; i < arr.length; i++) {
    txt += "<b>Title:</b> " + arr[i].Title + "<br>";
    txt += "<b>Category:</b> " + arr[i].Category + "<br>";
    txt += "<b>Contact:</b> " + arr[i].Contact + "<br>";
    txt += "<b>Description:</b> " + arr[i].Description + "<br>";
    txt += "<b>Link:</b> " + arr[i].Link + "<br><br>";
  }
  document.getElementById("display").innerHTML = txt;
}