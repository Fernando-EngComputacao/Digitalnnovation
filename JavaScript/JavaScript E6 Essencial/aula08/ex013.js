var vetor = [1, 5, 9, 15, 85, 23]

// Adiciona um ou mais elementos no FINAL do array e retorna o tamanho do novo array
vetor.push(21)
console.log(`Tamanho do vetor ${vetor.push(50)} e vetor: [${vetor}]`)

// Remove o ÚLTIMO elemento de um array e retorna o elemento removido
const itemRemovido = vetor.pop()
console.log(`\nÍtem removido ${itemRemovido} e vetor: [${vetor}]`)

// Adiciona um ou mais elementos no INÍCIO do do array e retorna o tamanho do novo vetor
const itemAdicionadoInicio = vetor.unshift(51)
console.log(`\nTamanho do vetor ${itemAdicionadoInicio} e vetor: [${vetor}]`)

// Remove o primeiro elemento de um array e retorna o elemento removido
const itemRemovidoInicio = vetor.shift(51)
console.log(`\nÍtem removido ${itemRemovidoInicio} e vetor: [${vetor}]`)

// Concatena um  ou mais arrays retornando um novo array
var vetor2 = ['Fernando', 'Souza', 'Furtado']
var vetorContatenado = vetor.concat(vetor2)
console.log(`\nVetor concatenado: [${vetorContatenado}]`)

// Retorna um novo array 'fatiando' o array de acordo com o início e fim
var array = [1,2,3,4,5]
console.log(`\nSlice\nVetor Original: [${array}]`)
console.log(array.slice(0,2))
console.log(array.slice(2))
console.log(array.slice(-3))

// Altera um array adicionando novos elementos enquanto remove elementos antigos
console.log(`\nSplice\nVetor Original: [${array}]`)
console.log(`Retorno do  Splice [${array.splice(2)}] e formado do vetor resultante: [${array}]`)
console.log(`Retorno do  Splice [${array.splice(0,0,'First')}] e formado do vetor resultante: [${array}]`)
// OBS.: vetor.splice(não coloque nada, na posição 0, adicione 'valor') --> Exemplo acima

//