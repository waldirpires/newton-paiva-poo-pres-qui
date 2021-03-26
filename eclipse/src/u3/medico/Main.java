package qui.u3.medico;

public class Main {

    public static void main(String[] args) {

        var medico = new Medico("0001");
        
        var oftalmo = new Oftalmologista("0002", "0001-O");
        
        var cardio = new Cardiologista("0003", "0004-C");
        
        var clinico = new ClinicoGeral("0004");
        
        var dentista = new Dentista("0001-D");
        
        medico.vestir();
        medico.atender();
        
        oftalmo.vestir();
        oftalmo.atender();
        
        cardio.vestir();
        cardio.atender();
        
        clinico.vestir();
        clinico.atender();
        clinico.tirarFerias();
        
        dentista.vestir();
        dentista.atender();
        
        // transformando um clinico em médico
        Medico medico3 = clinico;

        // transformando um dentista em médico
        //Medico medico2 = dentista;
        
        Medico medico4 = oftalmo;
        medico4.atender();
        //medico4.getCro();
        
    }

}
