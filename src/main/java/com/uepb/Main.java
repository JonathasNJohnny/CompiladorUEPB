package com.uepb;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.*;

import com.uepb.ExprParser;
import com.uepb.ExprLexer;

public class Main {
    public static void main(String[] args) {
        // Verifica se o caminho do arquivo foi passado como argumento
        String inputFile = args.length > 0 ? args[0] : "input.txt";

        try {
            // Lê o arquivo de entrada
            CharStream input = CharStreams.fromFileName(inputFile);

            // Cria o lexer a partir do stream de entrada
            ExprLexer lexer = new ExprLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Cria o parser a partir dos tokens
            ExprParser parser = new ExprParser(tokens);

            // Chama o método 'prog' (ou o nome correto conforme sua gramática)
            ParseTree tree = parser.prog();  // ou parser.prog()

            // Exibe a árvore gerada
            System.out.println(tree.toStringTree(parser));

            // Cria uma instância do seu listener
            ExprListenerImpl listener = new ExprListenerImpl();

            // Cria o walker e faz o percurso da árvore utilizando o listener
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(listener, tree);

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        } catch (RecognitionException e) {
            System.err.println("Erro de sintaxe: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
        }
    }
}
