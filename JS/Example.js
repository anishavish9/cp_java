{let i 
for(i=0; i<5; i++) {
    console.log(i)
    document.write(i+"<br>")
}}
//  var i 

// console.log(i)

let season = prompt('Enter season')
if(season === 'rainy') {
    document.write('use umbrella')
}
else if(season === 'summer') {
    document.write('apply sunscream')
}
else if(season === 'winter') {
    document.write('wear sweater')
}
else if(season === 'spring') {
    document.write('Enjoy')
}
else alert('season entered is invalid')