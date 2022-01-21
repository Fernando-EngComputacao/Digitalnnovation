const woman = [
    {
        name: `Maria`,
        grade: 20
    },
    {
        name: `Juliana`,
        grade: 25
    },
    {
        name: `Maria Lícia`,
        grade: 15
    }
]

function getCatchWoman(womanList) {
    return womanList.filter(women => women.grade <= 20)
}

console.log(`Todas as Women`)
console.log(woman)

console.log('\nWomen catched')
console.log(getCatchWoman(woman))