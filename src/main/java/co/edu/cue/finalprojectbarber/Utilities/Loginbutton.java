package co.edu.cue.finalprojectbarber.Utilities;

import co.edu.cue.finalprojectbarber.controller.ModelFactoryController;

public class Loginbutton {
    public Boolean adminLogin(String name, String password, ModelFactoryController mfc){
        if(name.equals(mfc.getBarbergod().getAdminService().getAdmin().getName())&& password.equals(mfc.getBarbergod().getAdminService().getAdmin().getPassword())){
           return true;
        }
        return false;
    }
    public String DefaultL(String name, String password,ModelFactoryController mfc){
        if(mfc.getBarbergod().getLookforobject().getPerson(name,password,mfc.getBarbergod().getClientService().getListClients())!=null){
            return "client";
        }
        if (mfc.getBarbergod().getLookforobject().getPerson(name,password,mfc.getBarbergod().getBarberpService().getListBarberq())!=null){
           return "Barber";
        }
        return "";
    }



}
