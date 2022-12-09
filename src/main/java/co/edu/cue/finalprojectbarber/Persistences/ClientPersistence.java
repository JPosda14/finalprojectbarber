package co.edu.cue.finalprojectbarber.Persistences;

import co.edu.cue.finalprojectbarber.model.Client;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class ClientPersistence {
    public static final String RUTE_ARCHIVE_CLIENT = "src/main/java/co/edu/cue/finalprojectbarber/Data/client.txt";

    public void saveclient(HashSet<Client>ListClient)throws IOException{
        String input = "";
        for(Client client: ListClient){
            input+=client.getName()+"/"+client.getEmail()+"/"+client.getPassword()+"/"+client.getNumber()+"\n";

        }
        ArchiveUtil.saveArchive(RUTE_ARCHIVE_CLIENT, input, false);

    }
    public HashSet<Client> chargeClient() throws FileNotFoundException, IOException{
        HashSet<Client>clients=new HashSet<Client>();
        ArrayList<String>input= ArchiveUtil.readArchive(RUTE_ARCHIVE_CLIENT);
        String line ="";
        for(int i=0;i<input.size();i++){
            Client myclient = new Client();
            line= input.get(i);
            myclient.setName(line.split("/")[0]);
            myclient.setPassword(line.split("/")[1]);
            myclient.setEmail(line.split("/")[2]);
            myclient.setNumber(line.split("/")[3]);
            clients.add(myclient);
        }
        return clients;

    }



}
