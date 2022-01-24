const multiply = (...args) => args.reduce((aux, value) => aux * value, 1)

const sum = (...rest) => multiply(...rest)

console.log(sum(5, 5, 1, 2))