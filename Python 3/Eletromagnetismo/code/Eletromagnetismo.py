from matplotlib.patches import Rectangle
import numpy as py
import matplotlib.pyplot as plotar

# Considere a [lambda = 1 / (9 *10^9)] e [k = 9 * 10^9]
# Assim: lambda = q * L  =>  lambda = q * 1  => lambda = q = 1 / (9 *10^9)
# Por fim: k * lambda = 1
def CampoE(posicao, valorX, valorY):
    denoComum = ((valorX + posicao[0]) ** 2 + valorY ** 2) ** 0.5
    denoComum2 = ((valorX + posicao[1]) ** 2 + valorY ** 2) ** 0.5

    equacaoX = ((1 / denoComum) - (1 / denoComum2))
    equacaoY = (-1 / valorY) * (((valorX + posicao[0]) / denoComum) - ((valorX + posicao[1]) / denoComum2))

    return equacaoX, equacaoY


nAmostrax, nAmostray = 30, 30
valorX = py.linspace(-1, 1, nAmostrax)
valorY = py.linspace(-1, 1, nAmostray)
emX, emY = py.meshgrid(valorX, valorY)

# Campo Elétrico
vetorPos = [(-0.5, 0.5)]
DirEx, DirEy = CampoE(vetorPos[0], valorX=emX, valorY=emY)
graficoFig = plotar.figure()
tela = graficoFig.add_subplot(111)

gradiente = 50 * (py.log(py.hypot(DirEx, DirEy)))
tela.streamplot(valorX, valorY, DirEx, DirEy,
                color=gradiente,
                linewidth=0.5,
                cmap=plotar.cm.ocean,
                density=1, arrowstyle='-|>',
                arrowsize=1.275)
tela.add_artist(Rectangle((-0.5, 0), 1, 0.047, color='#181D6E'))
tela.set_xlabel('$Abscissas (x)$')
tela.set_ylabel('$Ordenadas (y)$')
tela.set_xlim(-1, 1)
tela.set_ylim(-1, 1)
tela.set_aspect('equal')

# apresentar na tela o gráfico
plotar.show()
