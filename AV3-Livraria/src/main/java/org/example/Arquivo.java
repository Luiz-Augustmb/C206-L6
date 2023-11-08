package org.example;

import java.io.*;
import java.util.ArrayList;

public class Arquivo{

    //Configurando o método de escrever no Arquivo
    public void escrever (Livro livro){

        //Criando as estruturas que permitirão escrever o arquivo
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        //try catch para possíveis erros
        try{

            //Informamos o nome do arquivo onde queremos armazernar nossas informações
            os = new FileOutputStream("Livros.txt",true);
            //Ponte que transforma de stream para caracteres para stream de bytes
            osw = new OutputStreamWriter(os);
            //Em bw escreveremos a informação que queremos salvar no nosso txt
            bw = new BufferedWriter(osw);

            //Escrevendo uma linha referência
            bw.write("--- Livro ---");
            bw.newLine();
            //Pegando os dados do Produto e escrevendo no arquivo
            bw.write(livro.getNome() + "\n");
            bw.write(livro.getAutor() + "\n");
            bw.write(livro.getEditora() + "\n");
            bw.write(livro.getQtdPaginas() + "\n");


        }catch (Exception e){
            System.out.println("ERRO: " + e);
        }finally {
            try {
                bw.close();
            }catch (Exception e){}
        }

    }

    public ArrayList<Livro> ler(){

        //Classes básias para realizar a leitura de dados de um arquivo
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        //Variável auxiliar para ler as informações
        String linhaLer;

        //Array que vai armazer os Produto encontrados no arquivo
        ArrayList<Livro> arrayLivros = new ArrayList<>();

        try{

            is = new FileInputStream("Livros.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linhaLer = br.readLine(); //Coloca o cursor no inicio do arquivo txt

            //Enquanto tiver informações no txt seguimos lendo as informações
            while (linhaLer != null){

                //Verificando se a string encontrou a flag
                if(linhaLer.contains("--- Livro ---")){

                    //Variavel auxiliar de Produto, que servirá para salver posteriormente o Produto do arquivo
                    Livro aux = new Livro();

                    //Preenchendo as informações do Produto
                    aux.setNome(br.readLine());
                    aux.setAutor(br.readLine());
                    aux.setEditora(br.readLine());
                    aux.setQtdPaginas(Integer.parseInt(br.readLine()));

                    //Colocando o produto no arraylist
                    arrayLivros.add(aux);
                }

                //Voltando a variável novamente ao inicio do arquivo
                linhaLer = br.readLine();
            }

        }catch (Exception e) {
            System.out.println(e);

        } finally {
            try {
                br.close();
            }catch (Exception e){
                System.out.println(e);
            }
        }

        //Retornando o arraylist para a main
        return  arrayLivros;
    }
}