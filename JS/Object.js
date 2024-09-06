const person = {
    firstname : 'Ajay',
    lastname : 'Sharma',
    age : 23 ,
    fullname : function() {
        return this.firstname + ' ' +this.lastname
    }
}
document.write(person.fullname())