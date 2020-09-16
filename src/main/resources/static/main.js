function show_menu() {
    document.getElementById("2017").classList.toggle("show");
}
function putinmenu() {
    var array = [];
    document.getElementById()
    array.push(FilmService.getFilms);
}
function show_menu2() {
    document.getElementById("box office").classList.toggle("show");
}
// Close the dropdown menu if the user clicks outside of it
window.onclick = function(event) {
    if (!event.target.matches('.dropdownlink')) {
        var dropdowns = document.getElementsByClassName("menuitems");
        var i;
        for (i = 0; i < dropdowns.length; i++) {
            var openDropdown = dropdowns[i];
            if (openDropdown.classList.contains('show')) {
                openDropdown.classList.remove('show');
            }
        }
    }
}

// var gross= new Array();
//
// function grossTotal(){
//     gross.add(document.getElementById("gross").innerHTML.valueOf())
// }

function showGross(){
    //get the table by id

    var gross= new Array();
    //loop through cells adding each gross to the array

    var table = document.getElementById("tbl");

    for (var i = 0, row; row=table.rows[i]; i++) {
        for (var j = 0, col; col = row.cells[j]; j++) {
            if (i>0 && j==4 ){
                gross.push(Number(col.innerHTML.valueOf()));                }
        }
    }
    console.log(gross.length);
    var total = 0;
    for (var k = 0; k < gross.length; k++) {
       total =total + gross[k];
    }
    total = '$' + total;
    // var x = (""+total).split("");
        document.getElementById("totalGross").innerText=total;
}

