function contar(){
    var inicio = document.getElementById('txti')
    var fim = document.getElementById('txtf')
    var passo = document.getElementById('txtp')
    var resul = document.getElementById('resul')

    if (inicio.value.length == 0 || fim.value.length == 0 || passo.value.length == 0) {
        var txt = '';
        if (inicio.value.length == 0) {
            txt += '-> Insira um valor para o INÍCIO!\n'
        }
        if (fim.value.length == 0) {
            txt += '-> Insira um valor para o FIM!\n'
        }
        if (passo.value.length == 0) {
            txt += '-> Insira um valor para o PASSO!'
        }
        window.alert(txt)
    } else if (Number(inicio.value) == 0 && Number(fim.value) == 0) {
        window.alert(`Os valores de INÍCIO e FIM não podem ser iguais a zero ao mesmo tempo!`)
    } else if (passo.value.length < 0){
        window.alert('[ERRO] Não insira um PASSO negativo!')
    } else {
        if (passo.value == 0){
            window.alert(`-> Passo com valor 0, será considerado valor 1!`)
            var p = 1
        } else {
            var p = Number(passo.value)
        }
        resul.innerHTML = 'Contando: '
        var i = Number(inicio.value)
        var f = Number(fim.value)

        if (i < f) {
            for (let x = i; x <= f; x += p) {
                resul.innerHTML += `${x} \u{1F449}`                
            }
            resul.innerHTML += `\u{1F3C1}`
        } else {
            for (let y = i; y >= f; y -= p) {
                resul.innerHTML += `${y} \u{1F449}`
                
            }
            resul.innerHTML += `\u{1F3C1}`
        }
    }
    
}
