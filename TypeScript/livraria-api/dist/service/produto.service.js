"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
Object.defineProperty(exports, "__esModule", { value: true });
exports.ProdutoService = void 0;
const common_1 = require("@nestjs/common");
const produto_model_1 = require("../model/produto.model");
let ProdutoService = class ProdutoService {
    constructor() {
        this.produtos = [
            new produto_model_1.Produto('Livro 01', 'Livro POO', 25.5),
            new produto_model_1.Produto('Livro 02', 'Livro DB', 32.6),
            new produto_model_1.Produto('Livro 03', 'Livro TS', 29.95),
        ];
    }
    obterTodos() {
        return this.produtos;
    }
    obterUm(id) {
        return this.produtos[id];
    }
    cria(produto) {
        this.produtos.push(produto);
    }
    altera(produto) {
        return produto;
    }
    apagar(id) {
        this.produtos.pop();
    }
};
ProdutoService = __decorate([
    (0, common_1.Injectable)()
], ProdutoService);
exports.ProdutoService = ProdutoService;
//# sourceMappingURL=produto.service.js.map