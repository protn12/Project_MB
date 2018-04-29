package dao;

import java.util.List;

import model.AgentCommercial;


public interface IAgentCommercial {

		
		List<AgentCommercial> findAll();
	    List<AgentCommercial> findById();
	   void ajoutAgentCommercial(AgentCommercial  agentCommercial);
	   void updateAgentCommercial(AgentCommercial agentCommercial);
	   void deleteAgentCommercial(AgentCommercial agentCommercial);
	 
	
}
