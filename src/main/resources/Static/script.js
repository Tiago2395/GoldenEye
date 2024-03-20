//Stop form submit if office location and department aren't chosen
document.getElementById("submit").addEventListener("click", (event) =>{
    let location = document.getElementById("location");
    let department = document.getElementById("department");

    if(location.value === "empty" || department.value==="empty"){
        event.preventDefault();
        alert("You must select an office location and a department");
    }
})

//Activate department select when office location is selected
document.getElementById("location").addEventListener("change", function(){
    let department = document.getElementById("department");
    department.removeAttribute("disabled");
    let options = this.options;
    let optionSelected = options[this.selectedIndex].value;
    resetOptions(department);

    if(optionSelected === "milan"){
        activateOptions(["design", "advertising"], department);
    }

    if(optionSelected === "spain"){
        activateOptions(["research-and-development"], department);
    }

    if(optionSelected === "new-york"){
        activateOptions(["advertising"], department);
    }
})

//Activate possible departments depending of the office location
function activateOptions(departments, options){
    for(let i = 0; i < departments.length; i++){
        for(let j = 1; j < department.length; j++){
            if(departments[i] === department[j].value){
                department[j].removeAttribute("disabled");
            }
        }
    }
}

//Reset departments
function resetOptions(department){
    department.value = "empty";
    let options = department.options;
    for(let i = 1; i < options.length; i++){
        if(options[i].value !== "business"){
            options[i].setAttribute("disabled", true);
        }
    }
}