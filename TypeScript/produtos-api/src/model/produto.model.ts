/* eslint-disable prettier/prettier */

export class Produto {
    //atributos
    id: number;
    codigo: string;
    nome: string;
    preco: number;

    //constructor
    constructor(codigo: string, nome: string, preco:number){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }


}