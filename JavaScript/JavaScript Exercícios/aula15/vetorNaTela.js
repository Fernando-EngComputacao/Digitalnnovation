let num = [8, 2, 6, 5, 3, 9]
let pos = 0
num.sort()

console.log(`*Vetor: [${num}]`)
console.log(`*O vetor há ${num.length} posições!*\n`)

num.forEach(aux => {
    console.log(`(${aux}) -> Vetor[${pos}]`)
    pos++
});

