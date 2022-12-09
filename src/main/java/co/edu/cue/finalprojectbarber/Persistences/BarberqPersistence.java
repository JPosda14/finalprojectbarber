package co.edu.cue.finalprojectbarber.Persistences;

import co.edu.cue.finalprojectbarber.model.Barberq;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class BarberqPersistence {
    public static final String RUTE_ARCHIVE_BARBERQ = "src/main/java/co/edu/cue/finalprojectbarber/Data/baberp.txt";
    public void saveBarberq(HashSet<Barberq> listBarberq)throws IOException{
        String input="";
        for(Barberq barberq:listBarberq){
            input+=barberq.getName()+"/"+barberq.getEmail()+"/"+barberq.getPassword()+"/"+barberq.getEarning()+"\n";
        }
        ArchiveUtil.saveArchive(RUTE_ARCHIVE_BARBERQ,input,false);
    }
    public HashSet<Barberq> chargeEmployee() throws FileNotFoundException, IOException {
        System.out.println("charge");
        HashSet<Barberq> barberqs = new HashSet<Barberq>();
        ArrayList<String> content = ArchiveUtil.readArchive(RUTE_ARCHIVE_BARBERQ);
        String line = "";
        for (int i = 0;i<content.size(); i++) {
            Barberq mybarberq = new Barberq();
            line= content.get(i);
            mybarberq.setName(line.split("/")[0]);
            mybarberq.setEmail(line.split("/")[1]);
            mybarberq.setPassword(line.split("/")[2]);
            mybarberq.setEarning(Double.parseDouble(line.split("/")[3]));
            barberqs.add(mybarberq);
        }
        System.out.println(barberqs);
        return barberqs;

    }
}

