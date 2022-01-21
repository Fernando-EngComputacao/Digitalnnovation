const students = [
    {
        name: `Fernando`,
        grade: 10
    },
    {
        name: `Letícia`,
        grade: 5
    },
    {
        name: `Mariana`,
        grade: 7
    }
]

function getApprovedStudents(studentsList) {
    return studentsList.filter(estudante =>  estudante.grade >= 6)
}

console.log(`Alunos Aprovados`)
console.log(getApprovedStudents(students))

console.log('\nLista de Alunos')
console.log(students)