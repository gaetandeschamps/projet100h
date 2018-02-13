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
    
};

function checkTime(i) 
{
    if (i < 10) 
    {
        i = "0" + i ;  // ajout d'un zéro devant les nombres < 10
    }
    return i;
};

function TypeFormulaireTEA(button)
{
 var message;
 if(button.value=="membre")
 {
    message="Formulaire d'un membre";
 }
 if(button.value=="inscription")
 {
    message="Formulaire d'inscription";
 }
 if (button.value=="ancienMembre") 
 {
    message="Formulaire Ancien Membre"
 }
 var typeFormulaire=document.getElementById('formulaireClient');
 typeFormulaire.innerHTML=message;
};

function CreerEvenement(){
        document.getElementById("suite").style.display = "block";
        document.getElementById("suite2").style.display = "block";
        document.getElementById("suite3").style.display = "block";
        document.getElementById("suite4").style.display = "block";
        document.getElementById("suite5").style.display = "block";
        document.getElementById("suite6").style.display = "block";
        document.getElementById("suite7").style.display = "block";

};

function OnClick(){
    alert("Merci, votre évènement est créé.");
};

function NouveauClientNormal(input){
    if (input.value=="HEI") {
        document.getElementById("cotisant").style.display = "inline";
    } else if(input.value!="HEI"){
        document.getElementById("cotisant").style.display= "none";
    }

};

function PrixAPayer(){
    var txt;
    if(document.getElementById("Couple").checked){
        txt = document.getElementById("montant");
        txt.value="1.50 €";
        }else if(document.getElementById("seul").checked){
        txt=document.getElementById("montant");
        txt.value="2.00 €";
    }
};

function ValiderNormal(){
    alert("Merci ! Votre entrée a été enregistrée.");
};
