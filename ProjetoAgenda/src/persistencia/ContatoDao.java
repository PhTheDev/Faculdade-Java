/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelos.Contato;
import modelos.Telefone;

public class ContatoDao implements modelos.Icrud {
    
    @Override
    public void incluir(String nome, Telefone telefone, String email, String endereco) throws Exception {
        // Converte os componentes do telefone para string
        String ddi = Integer.toString(telefone.getDdi());
        String ddd = Integer.toString(telefone.getDdd());
        String numero = Integer.toString(telefone.getNumero());

        // Concatena as partes do número de telefone com um espaço entre elas
        String tel = ddi + " " + ddd + " " + numero;

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("agenda.csv", true))){
            bw.write(nome.toUpperCase() + ";" + tel + ";" + email + ";" + endereco);
            bw.newLine();
        } catch (Exception erro) {
            throw new Exception("Contato - Incluir - erro ao abrir o arquivo!");
        }
    }


    @Override
    public void excluir(Contato contato) throws Exception {
        // Lê todos os contatos do arquivo CSV
        ArrayList<String> linhas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("agenda.csv"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                linhas.add(linha);
            }
        } catch (Exception erro) {
            throw new Exception("Contato - Excluir - erro ao abrir o arquivo!");
        }

        // Converte os componentes do telefone para string
        String ddi = Integer.toString(contato.getTelefone().getDdi());
        String ddd = Integer.toString(contato.getTelefone().getDdd());
        String numero = Integer.toString(contato.getTelefone().getNumero());

        // Concatena as partes do número de telefone com um espaço entre elas
        String tel = ddi + " " + ddd + " " + numero;

        // Cria a string do contato a ser excluído
        String contatoStr = contato.getNomeCompleto().toUpperCase() + ";" + tel + ";" + contato.getEmail() + ";" + contato.getEndereco();

        // Remove o contato da lista
        linhas.remove(contatoStr);

        // Reescreve o arquivo CSV com os contatos restantes
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("agenda.csv", false))) {
            for (String linha : linhas) {
                bw.write(linha);
                bw.newLine();
            }
        } catch (Exception erro) {
            throw new Exception("Contato - Excluir - erro ao reescrever o arquivo!");
        }
    }


    @Override
    public void listar(DefaultTableModel model) throws Exception{
        try (BufferedReader br = new BufferedReader(new FileReader("agenda.csv"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] contato = linha.split(";");
                if (contato.length == 4) {
                    model.addRow(new Object[] {contato[0], contato[1], contato[2], contato[3]});
                } else {
                    throw new Exception("Erro no ContatoDao - Listar - linha do CSV não tem o número correto de campos!");
                }
            }
        } catch (FileNotFoundException e) {
            throw new Exception("Erro no ContatoDao - Listar - arquivo não encontrado!");
        } catch (IOException e) {
            throw new Exception("Erro no ContatoDao - Listar - erro ao ler o arquivo!");
        }
    }

    @Override
    public void consultar(String nome, DefaultTableModel model) throws Exception {
        // Lê todos os contatos do arquivo CSV
        ArrayList<String> linhas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("agenda.csv"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                linhas.add(linha);
            }
        } catch (Exception erro) {
            throw new Exception("Contato - Consultar - erro ao abrir o arquivo!");
        }

        // Procura o contato pelo nome
        for (String linha : linhas) {
            String[] contatoData = linha.split(";");
            if (contatoData[0].equalsIgnoreCase(nome)) {
                // Se o contato for encontrado, adiciona os detalhes do contato à JTable
                model.addRow(new Object[] {contatoData[0], contatoData[1], contatoData[2], contatoData[3]});
                return;
            }
        }

        // Se o contato não for encontrado, lança uma exceção
        throw new Exception("Contato não encontrado");
    }



}
