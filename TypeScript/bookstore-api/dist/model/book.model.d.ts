import { Model } from "sequelize-typescript";
export declare class Book extends Model<Book> {
    codigo: string;
    nome: string;
    preco: number;
}
