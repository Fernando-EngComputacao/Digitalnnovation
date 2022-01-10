let num = [8, 2, 6, 5, 3, 9]

console.log(`O vetor tem ${num.length} posições!`)
console.log(`O primeiro valor do vetor começa em: ${num[0]}\n`)

    console.log(`-> Sem SORT: [${num}]`)
    console.log(`-> Com SORT: [${num.sort()}] \n`)

    console.log(`-> Vetor NORMAL com SORT (ordenado) e sem PUSH (insercao): [${num}]`)
    num.push(10)
    console.log(`-> Vetor NORMAL com SORT (ordenado) e PUSH (insere dados): [${num}] -> PUSH(10)`)