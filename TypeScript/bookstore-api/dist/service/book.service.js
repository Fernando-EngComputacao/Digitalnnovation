"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var __param = (this && this.__param) || function (paramIndex, decorator) {
    return function (target, key) { decorator(target, key, paramIndex); }
};
Object.defineProperty(exports, "__esModule", { value: true });
exports.BookService = void 0;
const common_1 = require("@nestjs/common");
const sequelize_1 = require("@nestjs/sequelize");
const book_model_1 = require("../model/book.model");
let BookService = class BookService {
    constructor(bookModel) {
        this.bookModel = bookModel;
    }
    async obterTodos() {
        return this.bookModel.findAll();
    }
    async obterUm(id) {
        return this.bookModel.findByPk(id);
    }
    async cria(book) {
        this.bookModel.create(book);
    }
    async altera(book) {
        return this.bookModel.update(book, {
            returning: true,
            where: {
                id: book.id
            }
        });
    }
    async apagar(id) {
        const book = await this.obterUm(id);
        book.destroy();
    }
};
BookService = __decorate([
    (0, common_1.Injectable)(),
    __param(0, (0, sequelize_1.InjectModel)(book_model_1.Book)),
    __metadata("design:paramtypes", [Object])
], BookService);
exports.BookService = BookService;
//# sourceMappingURL=book.service.js.map