/* eslint-disable prettier/prettier */
import { Injectable } from '@nestjs/common';
import { InjectModel } from '@nestjs/sequelize';
import { Book } from '../model/book.model';

@Injectable()
export class BookService {
  
  constructor(
    @InjectModel(Book)
    private bookModel: typeof Book
  ) {}

  async obterTodos(): Promise<Book[]> {
    return this.bookModel.findAll();
  }

  async obterUm(id: number): Promise<Book> {
    return this.bookModel.findByPk(id);
  }

  async cria(book: Book) {
    this.bookModel.create(book);
  }

  async altera(book: Book): Promise<[number, Book[]]> {
    return this.bookModel.update(book, {
      returning: true,
      where: {
        id: book.id
      }
    });
  }

  async apagar(id: number) {
    const book: Book = await this.obterUm(id);
    book.destroy();
  }
}
