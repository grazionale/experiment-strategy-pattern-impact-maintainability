package com.mycompany.strategyexperiment.dao.experiment;

import com.mycompany.strategyexperiment.dao.experiment.buscar.BuscarPauta;
import com.mycompany.strategyexperiment.dao.experiment.excluir.ExcluirPauta;
import com.mycompany.strategyexperiment.dao.experiment.salvar.SalvarPauta;

/**
 *
 * @author gabri
 */
public class FactoryBuscarSalvarExcluirDAO {
        public AbstractSalvarBuscarExcluirDAO salvarBuscarExcluirDAO(BuscarSalvarExcluirDAOEnum salvarBuscarExcluirDaoEnum){
        switch(salvarBuscarExcluirDaoEnum){
            case PAUTA:
                return new PautaSalvarBuscarExcluirDAO(new SalvarPauta(), new BuscarPauta(), new ExcluirPauta());
            
            default:
                return null;
        }  
    }
}
