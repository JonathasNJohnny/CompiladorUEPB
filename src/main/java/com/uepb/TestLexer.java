package com.uepb;

import org.antlr.v4.runtime.*;
import java.io.*;

public class TestLexer {
    public static void main(String[] args) throws Exception {
        // Verifica se o caminho do arquivo foi passado como argumento
        String inputFile = args.length > 0 ? args[0] : "input.txt"; // Nome do arquivo de entrada

        try {
            // Lê o arquivo de entrada
            CharStream input = CharStreams.fromFileName(inputFile);

            // Cria o lexer a partir da entrada
            ExprLexer lexer = new ExprLexer(input);

            // Cria um stream de tokens a partir do lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Preenche a lista de tokens
            tokens.fill();  

            // Imprimir todos os tokens gerados
            for (Token token : tokens.getTokens()) {
                System.out.println("Token: " + token.getText() + " Tipo: " + token.getType());
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
        }
    }
}
