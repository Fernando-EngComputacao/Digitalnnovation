function method1(){
    console.log("Method called")
}
var propriedade = 'Propriedade'

var obj = {
    method1,
    method2: function(a=1,b=1) {return a + b},
    method3 (a=1,b=1) {                            // Também é função
        return a+b
    },
    propriedade,
    contexto: 'Contexto'
}

console.log(obj)
