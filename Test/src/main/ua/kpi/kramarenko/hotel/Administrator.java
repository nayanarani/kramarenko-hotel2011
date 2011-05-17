package ua.kpi.kramarenko.hotel;

import ua.kpi.kramarenko.hotel.beans.Client;
import ua.kpi.kramarenko.hotel.logic.AdministratorLogic;


public interface Administrator extends Client {

	public AdministratorLogic logic = null; //TODO
	public Client getClient();	
	public boolean checkAdminRights();
	
}
