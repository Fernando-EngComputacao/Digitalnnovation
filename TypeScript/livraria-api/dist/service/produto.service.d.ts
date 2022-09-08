import { Produto } from '../model/produto.model';
export declare class ProdutoService {
    produtos: Produto[];
    obterTodos(): Produto[];
    obterUm(id: number): Produto;
    cria(produto: Produto): void;
    altera(produto: Produto): Produto;
    apagar(id: number): void;
}
