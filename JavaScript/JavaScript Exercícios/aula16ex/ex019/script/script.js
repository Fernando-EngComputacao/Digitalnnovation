var vetor = []

function acao() {
    var resul = document.getElementById('idResul')
    var sel = document.getElementById('seltab')
    var valor = document.getElementById('txtn')
    var txtInput = document.getElementById('txtn')

    resul.innerHTML = ''

    if (valor.value.length == 0) {
        window.alert("Digite um valor!")
    } else if (valor.value < 1 || valor.value > 100) {
        window.alert("Digite um valor dentro do intervalo solicitado!")
    } else {
        if (vetor.includes(valor.value)) {
            window.alert("Valor já inserido!")
        } else {
            sel.innerHTML = ''
            vetor.push(valor.value)

            for (let x = 0; x < vetor.length; x++) {
                var item = document.createElement('option')
                item.text = `Valor ${vetor[x]} adicionado`
                sel.appendChild(item)
            }
        }
    }
    txtInput.value = ''
    txtInput.focus()
}

function finalizar() {
    if (vetor.length == 0) {

    } else {
        var resul = document.getElementById('idResul')
        var sel = document.getElementById('seltab')
        var tmh = vetor.length
        var soma = 0
        var max = Math.max(...vetor)
        var min = Math.min(...vetor)

        for (let x = 0; x < vetor.length; x++) {
            soma += Number(vetor[x])
        }

        resul.innerHTML = `<br>O tamanho do vetor é ${tmh}<br>`
        resul.innerHTML += `A soma de todos os valores é ${soma}<br>`
        resul.innerHTML += `A média de todos os valores é ${(soma / tmh).toFixed(2)} <br>`
        resul.innerHTML += `O maior valor é ${max}<br>`
        resul.innerHTML += `O menor valor é ${min}<br>`

        vetor = []
        sel.innerHTML = ''
        var option = document.createElement('option')
        option.text = `Digite um número acima`
        sel.appendChild(option)
    }
}