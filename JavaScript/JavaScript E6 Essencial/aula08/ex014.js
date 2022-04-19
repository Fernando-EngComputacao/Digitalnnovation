const vetor = ['Verônica','Fernando','Márica','Luzia','João','Bruna']
const array = [1,2,4,6,8,4]

// ForEach 
console.log(`ForEach`);
vetor.forEach((value, index) => {
    console.log(`${index}: ${value}`)
})

// Retorna um novo array, de mesmo tamanho, iterando cada item de um array     - map()
// EX: array.map(value => value * 2)
console.log(`\nMAP\n[${array.map(value => value * 2)}]`)

// Retorna um novo array com todos os elementos de um sub-array concatenados de forma
// recursiva de acordo com a profundidade especificada (depth)                          - flat()
const arrayVetor = [1,2,3,[4,5]]
console.log(`\nFlat\nVetor antes:`, arrayVetor)
var vetorFlat = arrayVetor.flat()
console.log(`Vetor depois:`,vetorFlat)

// Retorna um novo array assim como a função MAP e executa um FLAT de profundidade 1 - flatMap
console.log(`\nFLAPMAP`)
var flapMap = array.flatMap(value => [value*2])
var flapMap2 = array.flatMap(value => [[value*2]])
console.log(`FlapMp 01: `,flapMap)
console.log(`FlapMp 02: `,flapMap2)

// Retorna um ARRAY ITERATOR que contém as chaves para cada elemento do array - keys()
var arrayKeys = array.keys()
console.log(`\nKeys\n`,arrayKeys)

for (let i = 0; i < array.length; i++) {
    console.log(arrayKeys.next())
}

// Retorna um ARRAY ITERATOR que contém os valores para cada elemento do array - values()
var arrayValues = array.values()
console.log(`\nValues\n`,arrayValues)

for (let i = 0; i < array.length; i++) {
    console.log(arrayValues.next())
}

// Retorna um ARRAY ITERATOR que contém os pares chave/valor para cada elemento do array - entries()
var arrayEntries = array.entries()
console.log(`\nEntries\n`, arrayEntries, '\nIdentificação -> value: [index, valor]')

for (let i = 0; i < array.length; i++) {
    console.log(arrayEntries.next())
}

// Retorna o primeiro item de um array que satisfaz a condição   - find()
var arrayFind = array.find(value => value > 2)
console.log(`\nFind\n`,arrayFind)

// Retorna o índice do primeiro item de um array que satisfaz a condição - findIndex()
var arrayFindIndex = array.findIndex(value => value > 2)
console.log(`\nFindIndex\n`,arrayFindIndex)

// Retorna um novo array com todos os elementos que satisfazem a condição   - filter()
var arrayFilter = array.filter(value => value > 2)
console.log(`\nFilter\n`,arrayFilter)

// Retorna o primeiro índice em que um elemento pode ser encontrado no array  -  indexOf()
var arrayIndexOf = array.indexOf(4)
console.log(`\nIndexOf\n`,arrayIndexOf)

// Retorna o último índice em que um elemento pode ser encontrado no array  -  lastIndexOf()
var arrayLastIndexOf = array.lastIndexOf(4)
console.log(`\nLastIndexOf\n`,arrayLastIndexOf)

// Retorna um booleano verificando se determinado elemento existe no array  -  includes()
var arrayIncludes = array.includes(4)
var arrayIncludes2 = array.includes(40)
console.log(`\nIncludes\nO n° 4 existe em [${array}]:`,arrayIncludes, `\nO n° 40 existe em [${array}]: `, arrayIncludes2)

// Retorna um booleano verificando se pelo menos um item de um array satisfaz a condição  -  some()
var arraySome = array.some(value => value % 2 == 0)
console.log(`\nSome\nPelo menos um ítem do vetor [${array}] é par? `,arraySome)

// Retorna um booleano verificando se todos os itens de um array satisfazem a condição  -  every()
var arrayEvery = array.every(value => value % 2 == 0)
console.log(`\nEvery\nTodos os ítens do vetor [${array}] é par?`,arrayEvery)

// Ordena os elementos de um array de acordo com a condição  -  sort()
var arraySort = array.sort()
console.log(`\nSort\n`,arraySort)

// Inverte os elementos de um array  -  reverse()
var arrayReverse = array.reverse()
console.log(`\nReverse\n`,arrayReverse)

// Retorna todos os elementos de um array, separados por um delimitador e retorna uma string  -  join(arg)
var stringJoin = array.join('-')
console.log(`\nJoin\n`,stringJoin)

// Retorna um novo tipo de dado iterando cada posição de um array  -  reduce()
var somaValoresArray = array.reduce((total, value) => total += value, 0)
console.log(`\nReduce\n`,somaValoresArray)

// 