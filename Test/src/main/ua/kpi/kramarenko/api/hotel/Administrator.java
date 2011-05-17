package ua.kpi.kramarenko.api.hotel;

import ua.kpi.kramarenko.api.hotel.beans.Client;
import ua.kpi.kramarenko.api.hotel.logic.AdministratorLogic;


public interface Administrator extends Client {

	public AdministratorLogic logic = null; //TODO
	public Client getClient();	
	public boolean checkAdminRights();
	
}
