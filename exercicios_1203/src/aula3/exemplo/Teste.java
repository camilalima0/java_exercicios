/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula3.exemplo;

/**
 *
 * @author marti
 */
public class Teste {

    public static void main(String[] args) {
        Animal animais[] = {
            new Animal(),
            new Cachorro(),
            new CachorroPequeno(),
            new CachorroGrande(),
            new Gato(),
            new GatoPobre(),
            new GatoRico()
        };
        for (int i = 0; i < animais.length; i++) {
            animais[i].faz();
        }
        

        
    }
}
