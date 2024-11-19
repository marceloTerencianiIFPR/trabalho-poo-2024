/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.operacoes;

import com.mycompany.conexao.Conexao;
import com.mycompany.modelo.Usuario;
import java.sql.PreparedStatement;

/**
 *
 * @author Aluno
 */
public class OperacoesUsuario {

    public static void inserir(Usuario usuario) {
        String sql = "INSERT INTO tb_usuario (nome, email, senha) VALUES (?, ?, ?)";
        try {
            PreparedStatement sqlPreparada = Conexao.getConexao().prepareStatement(sql);
            sqlPreparada.setString(1, usuario.getNome());
            sqlPreparada.setString(2, usuario.getEmail());
            sqlPreparada.setString(3, usuario.getSenha());
            sqlPreparada.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
