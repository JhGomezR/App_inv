package comm.javaB;

import comm.Investigador;
import comm.java.InvestigadorFacade;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.annotation.PostConstruct;

@ManagedBean(name = "investigadorController")
@ViewScoped
public class InvestigadorController extends AbstractController<Investigador> {

    @EJB
    private InvestigadorFacade ejbFacade;

    /**
     * Initialize the concrete Investigador controller bean. The
     * AbstractController requires the EJB Facade object for most operations.
     */
    @PostConstruct
    @Override
    public void init() {
        super.setFacade(ejbFacade);
    }

    public InvestigadorController() {
        // Inform the Abstract parent controller of the concrete Investigador Entity
        super(Investigador.class);
    }

}
