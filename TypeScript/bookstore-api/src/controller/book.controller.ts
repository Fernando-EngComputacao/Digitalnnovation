/* eslint-disable prettier/prettier */
import { Body, Controller, Delete, Get, Param, Post, Put } from "@nestjs/common";
import { Book } from "../model/book.model";
import { BookService } from "../service/book.service";

@Controller('book')
export class BookController {

   constructor(private bookService: BookService){}

    @Get()
    async obterTodos(): Promise<Book[]> {
        return this.bookService.obterTodos();
    }

    @Get(':id')
    async obterUm(@Param() params ): Promise<Book> {
        return this.bookService.obterUm(params.id);
    }

    @Post()
    async criar(@Body() book: Book){
        this.bookService.cria(book);
    }

    @Put()
    async altera(@Body() book: Book): Promise<[number, Book[]]> {
        return this.bookService.altera(book);
    }
    
    @Delete(':id')
    async deleta(@Param() params) {
        this.bookService.apagar(params.id);
    }
}