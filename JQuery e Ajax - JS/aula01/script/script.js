function consultaCep(){
var valor = document.getElementById("txtcep")
var cep = Number(valor.value)
var resultado = document.getElementById('resul')
var vetor = []
var txt = [ "UF",'Cidade', "Bairro", "Logradouro",  "Complemento", "DDD", "IBGE", "SIAFI","CEP"]
//vetor = [uf, cidade, bairro, rua, complemento, ddd, ibge, siafi, cep]
//        [0,     1,     2.     3,       4,       5,   6,    7,     8]
    
    $.ajax({
    url: `http://viacep.com.br/ws/${cep}/json/`,
       type: "GET",
       success: function(response){
           vetor.push(response.uf)
           vetor.push(response.localidade)
           vetor.push(response.bairro)
           vetor.push(response.logradouro)
           vetor.push(response.complemento)
           vetor.push(response.ddd)
           vetor.push(response.ibge)
           vetor.push(response.siafi)
           console.log(vetor)
        }
    })
    resultado.innerHTML = ''
    var tabela = document.createElement('table')
    var coluna = document.createElement('tr')
    

    for (let x = 0; x < txt.length; x++) {
        var linha = document.createElement('td')
        linha.text = `${txt[x]}` 
        coluna.appendChild(linha)
    }

    tabela.appendChild(coluna)
    coluna = document.createElement('tr')
    for (let y = 0; y < vetor.length; y++) {
        var linha = document.createElement('td')
        linha.text = `${vetor[x]}` 
        coluna.appendChild(linha)
        
    }
    tabela.appendChild(coluna)
    resultado.innerHTML = tabela

}