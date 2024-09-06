function callback() {
    document.write('Callback function')
}

function getCallback() {
    setTimeout(()=>{
        callback()},3000
    )
}

getCallback()