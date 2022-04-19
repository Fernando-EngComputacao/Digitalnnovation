var elemento = document.getElementById('idtable')
var tr = document.createElement('tr')
var td = document.createElement('td')
var input = document.getElementById('txtcep')
var lcep = document.getElementById('idH3')
var tl = document.getElementById('tbtitulo')
let a = 1

function consultaCep() {
    var valor = document.getElementById("txtcep")
    var cep = Number(valor.value)
    var resultado = document.getElementById('resul')
    // resultado.innerHTML = ``

    $.ajax({
        url: `http://viacep.com.br/ws/${cep}/json/`,
        type: "GET",
        success: function (response) {
            criaTabela(response)
        }
    })
}

function criaTabela(response) {
    if (a != 1) {
        tl.innerHTML = `ENDEREÇOS`
        lcep.innerHTML = `Lista de CEPs`
    } else {
        tl.innerHTML = `ENDEREÇO`
    }
    tr = document.createElement('tr')
    elementos(`Logradouro`, response.logradouro)
    elementos(`Complemento`, response.complemento)
    elementos(`Bairro`, response.bairro)
    elementos(`Cidade`, response.localidade)
    elementos(`UF`, response.uf)
    elementos(`CEP`, response.cep)
    elemento.appendChild(tr)
    input.focus
    a = 0
}

function elementos(texto, variavel) {
    if (variavel.length == 0) {
        variavel = `- `
    }
    td = document.createElement('td')
    td.setAttribute('id', 'idTdStrong')
    td.innerText = `${texto}`
    tr.appendChild(td)
    td = document.createElement('td')
    td.innerText = variavel
    tr.appendChild(td)
}

function limpar() {
    elemento.innerHTML = ``
    lcep.innerHTML = `Lista de CEP`
    tl.innerHTML = `Insira um CEP`

}