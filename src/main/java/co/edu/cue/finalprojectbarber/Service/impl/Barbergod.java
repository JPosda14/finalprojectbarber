package co.edu.cue.finalprojectbarber.Service.impl;


import co.edu.cue.finalprojectbarber.Utilities.*;
import co.edu.cue.finalprojectbarber.Persistences.*;
import co.edu.cue.finalprojectbarber.controller.*;
import co.edu.cue.finalprojectbarber.Validations.*;

public class Barbergod {
    private final AdminHomeController adminHomeController;
    private final AdminPersistence adminPersistence;
    private final adminServiceimpl adminService;
    private final LoadData loadDataFXML;
    private final Loginbutton loginbutton;
    private final LoginController loginController;
    private final LoadScenes loadScenes;
    private final barberpServiceimpl barberpService;
    private final BarberqPersistence barberqPersistence;
    private final ClientPersistence clientPersistence;
    private final clientServiceimpl clientService;
    private final Lookforobject lookforobject;
    private final Alerts alerts;
    private final ClientHomeController clientHomeController;
    private final ShowInputs showInputs;
    private final VoidValidator voidValidator;
    private final Doublecount doublecount;
    private final DoubleValidator doubleValidator;
    private final EmailValidator emailValidator;
    private final BarberHomeController barberHomeController;
    private final DataColumn dataColumn;
    private final TransObservList transObservList;
    private final PrepareColumn prepareColumn;
    private final EliminateInputs eliminateInputs;
    private final FilterTime filterTime;
    private final TimeConverter timeConverter;
    private final AdjustData adjustData;
    private final quoteServiceimpl quoteServiceimpl;
    private final BarberMyQuotesController barberMyQuotesController;
    private final ClientMyQuotesController clientMyQuotesController;
    private final CutServiceimpl cutServiceimpl;
    private final QuotePersistence quotePersistence;
    private final SelectValidator selectValidator;
    private final ClientQuoteController clientQuoteController;
    private final ClientQuoteModalController clientQuoteModalController;
    private final LimitLister limitLister;


public Barbergod() {

    this.adminPersistence = new AdminPersistence();
    this.adminService = new adminServiceimpl();
    this.loadDataFXML = new LoadData(this);
    this.loginbutton = new Loginbutton();
    this.loginController = new LoginController();
    this.adminHomeController = new AdminHomeController();
    this.loadScenes=new LoadScenes();
    this.barberpService=new barberpServiceimpl(this);
    this.barberqPersistence=new BarberqPersistence();
    this.clientPersistence=new ClientPersistence();
    this.clientService=new clientServiceimpl();
    this.lookforobject=new Lookforobject();
    this.alerts=new Alerts();
    this.clientHomeController=new ClientHomeController();
    this.showInputs=new ShowInputs();
    this.voidValidator=new VoidValidator();
    this.doublecount=new Doublecount();
    this.doubleValidator=new DoubleValidator();
    this.emailValidator=new EmailValidator();
    this.barberHomeController=new BarberHomeController();
    this.dataColumn=new DataColumn(this);
    this.transObservList=new TransObservList(this);
    this.prepareColumn=new PrepareColumn();
    this.eliminateInputs=new EliminateInputs();
    this.timeConverter=new TimeConverter();
    this.filterTime=new FilterTime(this);
    this.adjustData=new AdjustData(this);
    this.quoteServiceimpl=new quoteServiceimpl(this);
    this.barberMyQuotesController=new BarberMyQuotesController();
    this.clientMyQuotesController=new ClientMyQuotesController();
    this.cutServiceimpl=new CutServiceimpl(this);
    this.quotePersistence=new QuotePersistence(this);
    this.selectValidator=new SelectValidator(this);
    this.clientQuoteController=new ClientQuoteController();
    this.clientQuoteModalController=new ClientQuoteModalController();
    this.limitLister=new LimitLister(this);


}


    public adminServiceimpl getAdminService(){return adminService;}
    public AdminPersistence getAdminPersistence(){return adminPersistence;}

    public LoadData getLoadDataFXML() {return loadDataFXML;}
    public Loginbutton getLoginbutton() {return loginbutton;}
    public LoginController getLoginController() {return loginController;}
    public AdminHomeController getAdminHomeController(){return adminHomeController;}
    public LoadScenes getLoadScenes() {return loadScenes;}

    public barberpServiceimpl getBarberpService() {return barberpService;}

    public BarberqPersistence getBarberqPersistence() {return barberqPersistence;}

    public ClientPersistence getClientPersistence() {return clientPersistence;}

    public clientServiceimpl getClientService() {return clientService;}

    public Lookforobject getLookforobject() {return lookforobject;}

    public Alerts getAlerts() {return alerts;}

    public ClientHomeController getClientHomeController() {return clientHomeController;}

    public ShowInputs getShowInputs() {return showInputs;}

    public VoidValidator getVoidValidator() {return voidValidator;}

    public Doublecount getDoublecount() {return doublecount;}

    public DoubleValidator getDoubleValidator() {return doubleValidator;}

    public EmailValidator getEmailValidator() {return emailValidator;}

    public BarberHomeController getBarberHomeController() {return barberHomeController;}

    public DataColumn getDataColumn() {return dataColumn;}

    public TransObservList getTransObservList() {return transObservList;}

    public PrepareColumn getPrepareColumn() {return prepareColumn;}

    public EliminateInputs getEliminateInputs() {return eliminateInputs;}

    public FilterTime getFilterTime() {return filterTime;}

    public TimeConverter getTimeConverter() {return timeConverter;}

    public AdjustData getAdjustData() {return adjustData;}

    public quoteServiceimpl getQuoteServiceimpl() {return quoteServiceimpl;}

    public BarberMyQuotesController getBarberMyQuotesController() {return barberMyQuotesController;}

    public ClientMyQuotesController getClientMyQuotesController() {return clientMyQuotesController;}

    public CutServiceimpl getCutServiceimpl() {return cutServiceimpl;}

    public QuotePersistence getQuotePersistence() {return quotePersistence;}

    public SelectValidator getSelectValidator() {return selectValidator;}

    public ClientQuoteController getClientQuoteController() {return clientQuoteController;}

    public ClientQuoteModalController getClientQuoteModalController() {return clientQuoteModalController;}

    public LimitLister getLimitLister() {return limitLister;}
}



