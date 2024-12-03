/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.operacoes;

import com.mycompany.conexao.Conexao;
import com.mycompany.modelo.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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

    public static Usuario buscarPorEmail(String email) {
        String sql = "SELECT * FROM tb_usuario WHERE email = ?";
        Usuario usuario = null;
        try {
            PreparedStatement sqlPreparada = Conexao.getConexao().prepareStatement(sql);
            sqlPreparada.setString(1, email);
            ResultSet resultado = sqlPreparada.executeQuery();

            while (resultado.next()) {
                usuario = new Usuario();
                usuario.setId(resultado.getInt("id_usuario"));
                usuario.setNome(resultado.getString("nome"));
                usuario.setEmail(resultado.getString("email"));
                usuario.setSenha(resultado.getString("senha"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return usuario;
    }
}
