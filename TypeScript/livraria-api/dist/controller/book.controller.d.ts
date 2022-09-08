import { Book } from "../model/book.model";
import { BookService } from "../service/book.service";
export declare class BookController {
    private bookService;
    constructor(bookService: BookService);
    obterTodos(): Promise<Book[]>;
    obterUm(params: any): Promise<Book>;
    criar(book: Book): Promise<void>;
    altera(book: Book): Promise<[number, Book[]]>;
    deleta(params: any): Promise<void>;
}
