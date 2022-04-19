function start(){
    var tb = document.getElementById('idtable')
    var tr = document.createElement('tr')
    var td = document.createElement('td')
    td.innerText = "Fernando"
    tr.appendChild(td)
    td = document.createElement('td')
    td.innerText = "Furtado"
    tr.appendChild(td)
    tb.appendChild(tr)
}