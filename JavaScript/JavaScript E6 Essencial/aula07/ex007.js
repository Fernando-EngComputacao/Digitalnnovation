function Pessoa (customProperties){
    return {
        name: `Fernando`,
        lastName: `Furtado`,
        ...customProperties
    }
}

const p = Pessoa({name: `Daniel`, age: 23})
console.log(p);