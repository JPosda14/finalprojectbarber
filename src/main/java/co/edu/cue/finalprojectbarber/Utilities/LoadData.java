package co.edu.cue.finalprojectbarber.Utilities;

import co.edu.cue.finalprojectbarber.controller.ModelFactoryController;
import java.io.IOException;

public class LoadDataFXML {
    public void loadata(ModelFactoryController mfc) {
        try {
            mfc.getBarbergod().getAdminService().setAdmin(mfc.getBarbergod().getAdminPersistence().sendadmin());

        } catch (IOException ioException) {
        }
    }}
