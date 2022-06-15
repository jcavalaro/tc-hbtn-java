import java.io.*;

import java.util.*;
@SuppressWarnings(value="unchecked")
public class SerializarEstudantes<Estudante> {
    private String nomeArquivo;

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<Estudante> estudantes){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream(getNomeArquivo());
            oos = new ObjectOutputStream(fos);
            oos.writeObject(estudantes);
            oos.close();
        }catch (IOException e){
            System.out.println("Nao foi possivel serializar");
        }
    }

    public List<Estudante> desserializar(){
        List<Estudante> estudantes = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try{
            fis = new FileInputStream(getNomeArquivo());
            ois = new ObjectInputStream(fis);
            estudantes = (List<Estudante>)ois.readObject();
            ois.close();
            fis.close();
        }catch(IOException | ClassNotFoundException e){
            System.out.println("Nao foi possivel desserializar");
        }
       return estudantes;
    }

    public SerializarEstudantes() { }

    public SerializarEstudantes(String nomeArquivo) {
        setNomeArquivo(nomeArquivo);
    }
}
