let temprature = prompt('Enter temprature')
let inFarenhiet = tofarenhiet(temprature)
document.write('in farenheit '+inFarenhiet+'F')

function tofarenhiet(temprature) {
    return (9/5)*temprature+32
}


function changeText(text) {
    document.write('Welcom to java script')
}
