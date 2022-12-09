package co.edu.cue.finalprojectbarber.Persistences;

import co.edu.cue.finalprojectbarber.model.Admin;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class AdminPersistence {
    public static final String RUTE_ARCHIVE_ADMIN = "src/main/java/co/edu/cue/finalprojectbarber/Data/admin.txt";

    public void saveAdmin(Admin admin) throws IOException{
        String inputs= admin.getName()+"/"+admin.getEmail()+"/"+admin.getPassword()+"\n";
        ArchiveUtil.saveArchive(RUTE_ARCHIVE_ADMIN, inputs, false);
    }
    public Admin sendadmin() throws FileNotFoundException, IOException {
        ArrayList<String> input = ArchiveUtil.readArchive(RUTE_ARCHIVE_ADMIN);
        String line = "";
        Admin admin = new Admin();
        for (int i = 0; i < input.size(); i++) {
            line= input.get(i);
            admin.setName(line.split("/")[0]);
            admin.setEmail(line.split("/")[1]);
            admin.setPassword(line.split("/")[2]);
        }
        return admin;
    }
}


