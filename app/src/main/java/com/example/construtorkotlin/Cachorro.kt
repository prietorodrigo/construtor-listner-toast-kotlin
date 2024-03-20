package com.example.construtorkotlin

class Cachorro {
    private var nome: String = ""
    private var raca: String = ""
    private var idade: Int = 0
    private var cor: String = ""

    constructor(nome: String, raca: String, idade: Int, cor: String) {
        this.nome = nome
        this.raca = raca
        this.idade = idade
        this.cor = cor
    }

    constructor() {
    }

    // Métodos Getters y Setters
    fun getNome(): String {
        return nome
    }

    fun setNome(nome: String) {
        this.nome = nome
    }

    fun getRaca(): String {
        return raca
    }

    fun setRaca(raca: String) {
        this.raca = raca
    }

    fun getIdade(): Int {
        return idade
    }

    fun setIdade(idade: Int) {
        this.idade = idade
    }

    fun getCor(): String {
        return cor
    }

    fun setCor(cor: String) {
        this.cor = cor
    }
}