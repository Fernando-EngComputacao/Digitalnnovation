import { Produto } from "../model/produto.model";
import { ProdutoService } from "../service/produto.service";
export declare class ProdutoController {
    private produtoService;
    constructor(produtoService: ProdutoService);
    obterTodos(): Produto[];
    obterUm(params: any): Produto;
    criar(produto: Produto): void;
    altera(produto: Produto): Produto;
    deleta(params: any): void;
}
