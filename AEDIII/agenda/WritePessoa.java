package agenda;

import java.io.*;

public class WritePessoa {

        public static void main(String[]args)throws IOException {

            Pessoa[] vetor = readVetorPessoa();

            try{
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.dat"));
                out.writeInt(vetor.length);

                for (Pessoa pessoa : vetor){
                    out.writeObject(pessoa);
                }

            }catch (IOException e){
                System.out.println("ERRO de E/S\n");
            }

        }

        private static Pessoa[] consoleReadPessoa(int numElem)throws IOException{
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int id;
            String nome;
            Pessoa[] vet = new Pessoa[numElem];
            for (int i=0;i<numElem;i++){
                System.out.println("\nEntre com os dados da "+(i+1)+"a pessoa");
                System.out.print("ID: ");
                id=Integer.parseInt(in.readLine());
                System.out.print("Nome: ");
                nome = in.readLine();
                vet[i]=new Pessoa(id,nome);

            }
            return vet;
        }
        private static Pessoa[] readVetorPessoa() throws IOException {
            Pessoa[] vet = new Pessoa[5];
            vet[0] = new Pessoa(10, "Maria Cláudia Santos");
            vet[1] = new Pessoa(11, "Ana Paula Souza");
            vet[2] = new Pessoa(15, "João Fernando Silva");
            vet[3] = new Pessoa(17, "Pedro Cardoso Queiroz");
            vet[4] = new Pessoa(21, "Beatriz Miranda de Oliveira");
            return vet;
        }
    }



