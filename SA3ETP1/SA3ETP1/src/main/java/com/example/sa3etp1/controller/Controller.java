package com.example.sa3etp1.controller;
import com.example.sa3etp1.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Controller {

    private ClienteRepository clienteRepository;
    private List<Cliente> clientes = new ArrayList<>();
    private int matricula = 0;

    public Cliente findCliente(String nome){
        List<Cliente> cliente = (List<Cliente>) clienteRepository.findAll();
        for(Cliente cliente : cliente){
            if(cliente.getNome().equals(nome)){
                return cliente;
            }
        }

        return null;
    }

    public Cliente addCliente(String nome, String endereco, String modalidade){
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setEndereco(endereco);
        cliente.setModalidade(modalidade);
        matricula++;
        cliente.setMatricula(matricula);
        clienteRepository.save(cliente);
        return cliente;
    }

    public void removeCliente(String nome){
        Cliente cliente = findCliente(nome);
        clienteRepository.delete(cliente);
    }

    public Cliente editCliente(String nome, String endereco){
        Cliente cliente = findCliente(nome);
        cliente.setendereco(endereco);
        enderecoRepository.save(endereco);
        return cliente;
    }
    public Cliente editCliente(String nome, String modalidade){
        Cliente cliente = findCliente(nome);
        cliente.setmodalidade(modalidade);
        modalidadeRepository.save(modalidade);
        return cliente;
    }
    public Cliente editCliente(String nome){
        Cliente cliente = findCliente(nome);
        cliente.setnome(nome);
        nomeRepository.save(nome);
        return cliente;
    }
    public List<cliente> listAll(){
        return (List<CLiente>)clienteRepository.findAll();
    }

    public ClienteRepository getClienteRepository() {
        return clienteRepository;
    }

    public void setClienteRepository(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
}