
function consultaCep(){
var valor = document.getElementById("txtcep")
var cep = Number(valor.value)
var resultado = document.getElementById('resul')
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