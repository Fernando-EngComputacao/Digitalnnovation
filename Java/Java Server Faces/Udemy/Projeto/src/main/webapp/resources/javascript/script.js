function funcaoErro(data) {
    var mensagem = ''
    for (var x  in data) {
        mensagem += `${x}: ${data[x]} \n`
    }
    alert(mensagem)
}

function funcaoEvent(data) {
    var mensagem = ''
    for (var x  in data) {
        mensagem += `${x}: ${data[x]} \n`
    }
    alert(mensagem)
}