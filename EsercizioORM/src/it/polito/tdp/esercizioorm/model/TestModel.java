package it.polito.tdp.esercizioorm.model;

import java.util.List;

public class TestModel {

	public static void main(String[] args) {
		
		Model m = new Model();
		
		int matricola = 146101;
		int result = m.getTotCreditiFromStudente(matricola);
        System.out.println("Tot crediti: "+result);
        
        List<Studente> resultStudenti = m.getStudentiFromCorso("01NBAPG");
	    
        for(Studente s : resultStudenti) {
        	System.out.println(s);
        }
        
        System.out.println("--------------------------------------------------");
        
        List<Corso> resultcorsi = m.getCorsiFromStudente(matricola);
        
        for(Corso c: resultcorsi) {
        	System.out.println(c);
        }
	}

}
