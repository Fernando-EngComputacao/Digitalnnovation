let loggedIn = false

function callIfAuthenticated(fn) {
    return !!loggedIn && fn()
}

function soma(a, b){
    return a + b
}

console.log(callIfAuthenticated(()=>soma(5,7)))
loggedIn = true
console.log(callIfAuthenticated(()=>soma(5,7)))
loggedIn = false
console.log(callIfAuthenticated(()=>soma(5,7)))