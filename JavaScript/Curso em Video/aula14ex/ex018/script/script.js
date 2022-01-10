function tabuada() {
    let numero = document.getElementById('txtn')
    let tab = document.getElementById('seltab')

    if (numero.value.length == 0) {
        window.alert('Por favor, digite um número!')
    } else {
        let n = Number(numero.value)
        let aux = 1
        tab.innerHTML = ''
        while (aux <= 10) {
            let item = document.createElement('option')
            item.text = `${n} x ${aux} = ${n*aux}`
            tab.appendChild(item)
            tab.value = `tab${aux}`
            aux++;
        }
    }
}