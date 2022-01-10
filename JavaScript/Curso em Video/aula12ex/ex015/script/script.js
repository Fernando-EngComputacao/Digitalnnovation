function carregar() {
    var msg = window.document.getElementById('msg')
    var img = window.document.getElementById('imagem')
    var tempo = window.document.getElementById('tempo')
    var data = new Date
    var hora = data.getHours()

    msg.innerHTML = `Agora são ${hora} horas.`

    if (hora >= 0 && hora < 12) {
        img.src = "imagens/manha.png"
        document.body.style.background = "#8ea861"
        tempo.innerHTML = "Hora da manhã"
    } else if (hora >= 12 && hora < 18) {
        img.src = "imagens/tarde.png"
        document.body.style.background = "#cc7331"
        tempo.innerHTML = "Hora da tarde"
    } else {
        img.src = "imagens/noite.png"
        document.body.style.background = "#2b2b4d"
        tempo.innerHTML = "Hora da noite"
    }
}