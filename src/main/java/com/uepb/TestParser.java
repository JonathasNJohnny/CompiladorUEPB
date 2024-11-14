package com.uepb;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.*;

public class TestParser {
    public static void main(String[] args) {
        // Verifica se o caminho do arquivo foi passado como argumento
        String inputFile = args.length > 0 ? args[0] : "input.txt"; // Nome do arquivo de entrada

        try {
            // Lê o arquivo de entrada
            CharStream input = CharStreams.fromFileName(inputFile);

            // Cria o lexer a partir da entrada
            ExprLexer lexer = new ExprLexer(input);

            // Cria um stream de tokens a partir do lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Cria o parser a partir do stream de tokens
            ExprParser parser = new ExprParser(tokens);

            // Chama o método de parsing, por exemplo, o método 'prog' (método inicial definido na gramática)
            ParseTree tree = parser.prog();

            // Exibe a árvore gerada pelo parser
            System.out.println(tree.toStringTree(parser));  // Mostra a árvore de análise (parse tree)

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
        }
    }
}
