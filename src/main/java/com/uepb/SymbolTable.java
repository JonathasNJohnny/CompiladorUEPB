package com.uepb;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {

    // Mapa para armazenar variáveis e seus valores
    private final Map<String, Integer> symbols = new HashMap<>();

    // Método para adicionar uma nova variável
    public void addVar(String varName, int value) {
        symbols.put(varName, value);
    }

    // Método para atualizar o valor de uma variável existente
    public void updateVar(String varName, int value) {
        symbols.put(varName, value);
    }

    // Método para obter o valor de uma variável
    public Integer getVar(String varName) {
        return symbols.get(varName);
    }

    // Verifica se a variável existe na tabela
    public boolean containsVar(String varName) {
        return symbols.containsKey(varName);
    }
}
