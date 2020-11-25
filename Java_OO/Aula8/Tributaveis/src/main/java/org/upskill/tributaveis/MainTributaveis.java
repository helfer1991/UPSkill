package org.upskill.tributaveis;

public class MainTributaveis {

    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("22-33-CC", 1000, "vermelho");
        Veiculo v2 = new Veiculo("44-55-DD", 2500, Cores.AZUL);
        Veiculo v3 = new Veiculo("11-22-BB", 1400, Veiculo.VERDE);
        
        Moradia m1 = new Moradia("Rua do Bocage", 90, Moradia.CINZENTO);
        System.out.println(m1);
        
        Object[] arr = new Object[10];
        arr[0] = v1;
        arr[1] = v2;
        arr[3] = v3;
        arr[4] = m1;
        
        Cores c;
        c = v1;
        c = m1;
        
        Cores[] tributaveis = new Cores[10]; // ou declarar este tipo de array como Tributavel
        tributaveis[0] = v1;
        tributaveis[1] = v2;
        tributaveis[2] = v3;
        tributaveis[3] = m1;
        
        float imposto = 0;
        for(Cores obj : tributaveis) {
            if(obj != null) {
                imposto += ((Tributavel) obj).calcularImposto();
            }
        }
        System.out.println(imposto);
        
        System.out.println(getImposto(v1));
    }
    
    public static float getImposto(Tributavel obj) {
        return obj.calcularImposto();
    }
}