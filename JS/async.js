//asyn example
function async() {
    setTimeout(() =>{
        document.write('one'+'<br>')
    }, 3000)
    document.write('two'+'<br>')
    document.write('three')
}

async()