function startTime() 
{
    var today = new Date();     // récupération de l'heure client
    var h = today.getHours();   // extraction de l'heure
    var m = today.getMinutes(); // extraction des minutes
    var s = today.getSeconds(); // extraction des secondes
    var day = today.getDate();
    var month = today.getMonth()+1  ;
    var year = today.getFullYear();

    h = checkTime(h);           // appel de la fonction ci-dessous
    m = checkTime(m);           // pour
    s = checkTime(s);           // formattage de l'affichage : ajout d'un zéro
    day = checkTime(day);
    month = checkTime(month);
    year = checkTime(year);

    document.getElementById('date').innerHTML =  "<h3>"+ day + "/" + month + "/" + year+"</h3>";
    document.getElementById('txt').innerHTML =  "<h3>"+h + ":" + m + ":" + s + " " +"</h3>";    
    var t = setTimeout(startTime, 1000);  // rappel de la fonction toutes les secondes
    
}

function checkTime(i) 
{
    if (i < 10) 
    {
        i = "0" + i ;  // ajout d'un zéro devant les nombres < 10
    }
    return i;
}
