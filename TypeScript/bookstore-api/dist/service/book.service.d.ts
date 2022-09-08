import { Book } from '../model/book.model';
export declare class BookService {
    private bookModel;
    constructor(bookModel: typeof Book);
    obterTodos(): Promise<Book[]>;
    obterUm(id: number): Promise<Book>;
    cria(book: Book): Promise<void>;
    altera(book: Book): Promise<[number, Book[]]>;
    apagar(id: number): Promise<void>;
}
