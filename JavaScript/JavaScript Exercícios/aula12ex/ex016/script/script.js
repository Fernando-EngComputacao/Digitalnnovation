function verificar(){
    var data = new Date()
    var ano = data.getFullYear()
    var fano = document.getElementById('txtano')
    var resul = document.querySelector('div#resul')

    if (fano.value.length == 0 || fano.value > ano) {
        window.alert('[ERRO] Verifique os dados e tente novamente.')
    } else {
        var fsex = document.getElementsByName('radsex')
        var idade = ano - Number(fano.value)
        var genero = ''
        var img = document.createElement('img')
        img.setAttribute('id', 'imagem')

        if (fsex[0].checked) {
            genero = 'Homem'
            homem(idade, img)

        } else if (fsex[1].checked) {
            genero = 'Mulher'
            mulher(idade, img)
        }
        // resul.style.textAlign = 'center'
        resul.innerHTML = `Detectamos <b>${genero}</b> com <b>${idade}</b> anos.`
        resul.appendChild(img)
    }
}


function homem(idade, img){
    if (idade >= 0 && idade < 5) {
        img.setAttribute('src','imagens/bebemenino.png')
    } else if (idade < 10){
        img.setAttribute('src', 'imagens/menino.png')
    } else if (idade < 22) {
        img.setAttribute('src', 'imagens/rapaz.png')
    } else if (idade < 50) {
        img.setAttribute('src', 'imagens/homem.png')
    } else {
        img.setAttribute('src', 'imagens/velho.png')
    }
}

function mulher(idade, img){
    if (idade >= 0 && idade < 5) {
        img.setAttribute('src','imagens/bebemenina.png')
    } else if (idade < 10){
        img.setAttribute('src', 'imagens/menina.png')
    } else if (idade < 22) {
        img.setAttribute('src', 'imagens/moca.png')
    } else if (idade < 50) {
        img.setAttribute('src', 'imagens/mulher.png')
    } else {
        img.setAttribute('src', 'imagens/idosa.png')
    }
}