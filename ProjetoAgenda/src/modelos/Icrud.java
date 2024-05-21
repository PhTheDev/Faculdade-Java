/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelos;

import javax.swing.table.DefaultTableModel;

public interface Icrud {
    public void incluir(String nome, Telefone telefone, String email, String endereco) throws Exception;
    public void excluir(Contato contato) throws Exception;
    public void listar(DefaultTableModel model) throws Exception;
    public void consultar(String nome, DefaultTableModel model) throws Exception;
}
