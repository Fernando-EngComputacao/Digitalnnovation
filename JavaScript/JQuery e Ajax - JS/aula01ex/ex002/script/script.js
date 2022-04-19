
function consultaCep(){
var aux = document.getElementById("txtcep")
var valor = ((String(aux.value).replace(" ", ".")).replace(".","")).replace("-","")
console.log(`->O VALOR é [${valor}], do tipo ${typeof(valor)} e pode virar ${typeof(Number(valor))}`)
var cep = Number(valor)
var resultado = document.getElementById('resul')
console.log(`CEP: ${typeof(valor)} - ${typeof(Number(valor))} - CEP: ${Number(valor.value)}`)
var p = document.createElement('h4')
var txt = ``
resultado.innerHTML = ``

    $.ajax({
    url: `http://viacep.com.br/ws/${cep}/json/`,
       type: "GET",
       success: function(response){
           if (!(response.logradouro).length == 0) {
               txt += `${response.logradouro}, `
           } 
           if (!(response.complemento).length == 0){
               txt += `${response.complemento}, `
           }
           if (!(response.bairro).length == 0) {
               txt += `${response.bairro}, `
           }
           if (!(response.localidade).length == 0) {
               txt += `${response.localidade}`
           }
           if (!(response.uf).length == 0) {
               txt += `-${response.uf}`
           }
           if (!(response.cep).length == 0) {
               txt += ` | CEP: ${response.cep}`
           }
           p.innerText = txt
           resultado.appendChild(p)
           valor.focus()
        }
    })
}