function soma(...args) {
    return args.reduce((acc, value) => acc + value, 0)
}   

console.log(soma(1,2,3,4,5,6,7,8,9))

// OU

const somaArrowFunction = (a=0,b=0, ...rest) => {
    console.log(a,b,rest)
}


somaArrowFunction(1,2,3,4)