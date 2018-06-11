package com.mycompany.strategyexperiment.dao.experiment;

import com.mycompany.strategyexperiment.dao.experiment.buscar.BuscarCampus;
import com.mycompany.strategyexperiment.dao.experiment.buscar.BuscarComentario;
import com.mycompany.strategyexperiment.dao.experiment.buscar.BuscarDepartamento;
import com.mycompany.strategyexperiment.dao.experiment.salvar.SalvarCampus;
import com.mycompany.strategyexperiment.dao.experiment.salvar.SalvarComentario;
import com.mycompany.strategyexperiment.dao.experiment.salvar.SalvarDepartamento;

/**
 *
 * @author gabri
 */
public class FactoryBuscarSalvarDAO {
       public AbstractSalvarBuscarDAO salvarBuscarDAO(BuscarSalvarDAOEnum salvarBuscarDaoEnum){
        switch(salvarBuscarDaoEnum){
            case COMENTARIO:
                return new ComentarioSalvarBuscarDAO(new SalvarComentario(), new BuscarComentario());
                
            case CAMPUS:
                return new CampusSalvarBuscarDAO(new SalvarCampus(), new BuscarCampus());
            
            case DEPARTAMENTO:
                return new DepartamentoSalvarBuscarDAO(new SalvarDepartamento(), new BuscarDepartamento());
            
            default:
                return null;
        }
    }
}
