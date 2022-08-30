/* eslint-disable prettier/prettier */
import { Body, Controller, Delete, Get, Param, Post, Put } from "@nestjs/common";
import { Produto } from "../model/produto.model";

@Controller('produtos')
export class ProdutoController {

    produtos: Produto[] = [
        new Produto("Livro 01", "Livro POO", 25.50),
        new Produto("Livro 02", "Livro DB", 32.60),
        new Produto("Livro 03", "Livro TS", 29.95),
    ];

    @Get()
    obterTodos(): Produto[] {
        return this.produtos;
    }

    @Get(':id')
    obterUm(@Param() params ): string {
        return `Retorna os dados do produto ${params.id}`;
    }

    @Post()
    criar(@Body() produto): string{
        console.log(produto);
        return 'Produto Criado.';
    }

    @Put()
    altera(@Body() produto): string {
        console.log(produto);
        return 'Produto alterado';
    }
    
    @Delete(':id')
    deleta(@Param() params): string {
        return `Apaga o produto ${params.id}`;
    }

}