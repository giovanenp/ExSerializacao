package br.com.exemplo1;

import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    String path = "./arquivo.txt";
    ManipuladorArquivo.leitor(path);
    ManipuladorArquivo.escritor(path);
  }
}
