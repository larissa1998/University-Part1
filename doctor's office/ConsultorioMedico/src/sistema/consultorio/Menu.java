/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.consultorio;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import sistema.area.*;
import sistema.classes.Medico;
import sistema.classes.Paciente;

/**
 *
 * @author Larissa Fogaça Mendes
 */
public class Menu {

    ArrayList<Paciente> paciente;
    ArrayList<Medico> medico;

    public void StartMenu() {

        int op = -1;

        Menu con = new Menu();
        con.paciente = new ArrayList<>();
        con.medico = new ArrayList<>();
        do {
            op = Integer.parseInt(JOptionPane
                    .showInputDialog("Escolha uma opção: "
                            + "\n1 - Cadastrar"
                            + "\n2 - Exibir"
                            + "\n3 - Remover por nome"
                            + "\n4 - Realizar operação"
                            + "\n0 - Sair"));

            if (op == 0) {
                System.exit(0);
            } else if (op == 1) {
                con.cadastrar();
            } else if (op == 2) {
                con.consultar();
            } else if (op == 3) {
                con.remover();
            } else if (op == 4) {
                int tipoMed = Integer.parseInt(JOptionPane
                        .showInputDialog("Escolha o tipo de Médico: "
                                + "\n1 - Cardiologista"
                                + "\n2 - Clinico Geral"
                                + "\n3 - Pediatra"));
                for (Medico med : con.medico) {
                    if (tipoMed == 1) {
                        if (med instanceof Cardiologista) {
                            med.operar();
                            break;
                        }
                    } else if (tipoMed == 2) {
                        if (med instanceof ClinicoGeral) {
                            med.operar();
                            break;
                        }
                    } else if (tipoMed == 3) {
                        if (med instanceof Pediatra) {
                            med.operar();
                            break;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Opção Inválida");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (op != 0);

    }

    private void cadastrar() {

        Paciente novoPaciente = null;
        Medico novoMedico = null;

        int pessoas = Integer.parseInt(JOptionPane
                .showInputDialog("Escolha uma opção de cadastro: "
                        + "\n1 -  Paciente"
                        + "\n2 -  Médico"
                        + "\n0 - Sair"));

        if (pessoas == 0) {
            System.exit(0);
        } else if (pessoas == 1) {
            boolean x = true;
            novoPaciente = new Paciente();

            String nome = JOptionPane
                    .showInputDialog("Digite o nome:");
            novoPaciente.setNome(nome);

            String cidade = JOptionPane
                    .showInputDialog("Digite a cidade:");
            novoPaciente.setCidade(cidade);

            String uf = JOptionPane
                    .showInputDialog("Digite o estado:");
            novoPaciente.setUf(uf);

            String endereco = JOptionPane
                    .showInputDialog("Digite o endereço:");
            novoPaciente.setEndereco(endereco);

            String bairro = JOptionPane
                    .showInputDialog("Digite o bairro:");
            novoPaciente.setBairro(bairro);

            String email = JOptionPane
                    .showInputDialog("Digite o email:");
            novoPaciente.setEmail(email);

            while (x) {

                try {

                    double telefone = Double.parseDouble(
                            JOptionPane.showInputDialog("Digite o Telefone:"));
                    novoPaciente.setTelefone(telefone);

                    x = false;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Tipo errado, digite novamente");
                }
            }
            x = true;
            while (x) {

                try {

                    double cpf = Double.parseDouble(
                            JOptionPane.showInputDialog("Digite o CPF:"));
                    novoPaciente.setCpf(cpf);

                    x = false;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Tipo errado, digite novamente");
                }
            }

            x = true;
            while (x) {

                try {

                    double rg = Double.parseDouble(
                            JOptionPane.showInputDialog("Digite o RG:"));
                    novoPaciente.setRg(rg);

                    x = false;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Tipo errado, digite novamente");
                }
            }
            x = true;
            while (x) {

                try {

                    int cep = Integer.parseInt(
                            JOptionPane.showInputDialog("Digite o CEP:"));
                    novoPaciente.setCep(cep);

                    x = false;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Tipo errado, digite novamente");
                }
            }

            String observacoes = JOptionPane
                    .showInputDialog("Digite as observações:");
            novoPaciente.setObservacoes(observacoes);

            paciente.add(novoPaciente);
            JOptionPane.showMessageDialog(null, "Paciente cadastrado com sucesso!");
        } else if (pessoas == 2) {
            boolean x = true;
            int area = Integer.parseInt(JOptionPane.showInputDialog("Tipo do médico: "
                    + "\n1 - Cardiologista"
                    + "\n2 - Clinico Geral"
                    + "\n3 - Pediatra"));
            if(area == 1)
                novoMedico = new Cardiologista();
            else if(area == 2)
                novoMedico = new ClinicoGeral();
            else
                novoMedico = new Pediatra();
            
            
            
            while(x){
            try{
              int crm = Integer.parseInt(
                    JOptionPane.showInputDialog("Digite o CRM do médico:"));
            novoMedico.setCrm(crm);
            
            x = false;
            }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Tipo errado, digite novamente");
            }
            }
           

            String nome = JOptionPane
                    .showInputDialog("Digite o nome do Médico:");
            novoMedico.setNome(nome);

            x = true;
            while (x){
            try{
             double telefone = Double.parseDouble(
                    JOptionPane.showInputDialog("Digite o Telefone:"));
            novoMedico.setTelefone(telefone);
            
            x = false;
            }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Tipo errado, digite novamente");
            }
            }
           

            String email = JOptionPane
                    .showInputDialog("Digite o email:");
            novoMedico.setEmail(email);

            medico.add(novoMedico);
            JOptionPane.showMessageDialog(null, "Médico cadastrado com sucesso!");
        }

    }

    private void consultar() {

        int pessoas = Integer.parseInt(JOptionPane
                .showInputDialog("Escolha uma opção de consulta: "
                        + "\n1 -  Paciente"
                        + "\n2 -  Médico"
                        + "\n0 - Sair"));

        if (pessoas == 0) {
            System.exit(0);
        } else if (pessoas == 1) {
            exibirPaciente();

        } else if (pessoas == 2) {
            exibirMedico();
        } else {
            System.out.println("Digite uma opção válida");
        }
    }

    private void exibirPaciente() {
        String mensagem = "PACIENTES" + "\n----------------------------";

        for (Paciente p : paciente) {
            mensagem += "\n Nome: " + p.getNome() + " \n Telefone: " + p.getTelefone(0) + " \n Observações: " + p.getObservacoes(mensagem) + "\n----------------------------";

        }
        JOptionPane.showMessageDialog(null, mensagem);
    }

    private void exibirMedico() {
        String mensagem = "MÉDICO" + "\n----------------------------";

        for (Medico m : medico) {
            mensagem += "\n CRM: " + m.getCrm() + "\n Nome: " + m.getNome() + " \n Telefone: " + m.getTelefone() + "\n----------------------------";
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }

    private void remover() {

        int pessoas = Integer.parseInt(JOptionPane
                .showInputDialog("Escolha uma opção de remoção: "
                        + "\n1 - Paciente"
                        + "\n2 - Médico"
                        + "\n0 - Sair"));

        if (pessoas == 0) {
            System.exit(0);
        } else if (pessoas == 1) {
            removerPaciente();

        } else if (pessoas == 2) {
            removerMedico();
        } else {
            System.out.println("Digite uma opção válida");
        }
    }

    private void removerPaciente() {
        String nome = JOptionPane
                .showInputDialog("Informe o nome do paciente a ser removido: ");
        boolean removido = false;
        for (int i = 0; i < paciente.size(); i++) {
            Paciente a = paciente.get(i);
            if (a.getNome().equals(nome)) {
                paciente.remove(i);
                removido = true;
            }

        }
        if (removido) {
            JOptionPane
                    .showMessageDialog(null,
                            "Paciente removido com sucesso!");
        } else {
            JOptionPane
                    .showMessageDialog(null, "Paciente não encontrado!");
        }
    }

    private void removerMedico() {
        String nome = JOptionPane
                .showInputDialog("Informe o nome do médico a ser removido: ");
        boolean removido = false;
        for (int i = 0; i < medico.size(); i++) {
            Medico a = medico.get(i);
            if (a.getNome().equals(nome)) {
                medico.remove(i);
                removido = true;
            }

        }
        if (removido) {
            JOptionPane
                    .showMessageDialog(null,
                            "Médico removido com sucesso!");
        } else {
            JOptionPane
                    .showMessageDialog(null, "Médico não encontrado!");
        }
    }
}
