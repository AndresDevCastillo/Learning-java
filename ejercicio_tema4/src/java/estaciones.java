
 class Estaciones {
    public static void main(String[] args) {
        //Item 1 if
        int numeroIf=2;
        if(numeroIf>0){
            System.out.println("numeroIf es positivo");
        }
        else{
            System.out.println("numeroIf es negativo");
        }

        //Item 2 while
        int numeroWhile=1;
        while(numeroWhile<3){
            numeroWhile++;
            System.out.println("Valor de numeroWhile: "+numeroWhile);
        }

        //Item 3 do-while
        do {
            numeroWhile++;
            System.out.println("Valor de numeroWhile en do-while: "+numeroWhile);
        } while (numeroWhile<3);

        //Item 4 for
        int numeroFor;
        for(numeroFor=0; numeroFor<=3; numeroFor++){
            System.out.println("Valor numeroFor: "+numeroFor);
        }

        //Item 4 switch
        String estacion="Otoño";
        switch(estacion){
            case "Primavera":
                System.out.println("Estamos en la estación: "+estacion);
                break;
            case "Otoño":
                System.out.println("Estamos en la estación: "+estacion);
                break;
            case "Invierno":
                System.out.println("Estamos en la estación: "+estacion);
                break;
            case "Verano":
                System.out.println("Estamos en la estación: "+estacion);
                break;
            default:
                System.out.println("No es una estación");
                break;
        }
    }
}