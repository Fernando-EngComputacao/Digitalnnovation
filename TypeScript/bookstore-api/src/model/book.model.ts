/* eslint-disable prettier/prettier */

import { Column, DataType, Model, Table } from "sequelize-typescript";

@Table
export class Book extends Model<Book> {
    //atributos
    @Column({type: DataType.STRING(60), allowNull: false})
    codigo: string;
    @Column({type: DataType.STRING, allowNull: false})
    nome: string;
    @Column({type: DataType.DECIMAL(10,2), allowNull: false})
    preco: number;
    
}