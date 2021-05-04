package edu.ucb.tdd;

public class Ascensor {

    private Character [][] ascensor = {{'3'},
                                       {'2'},
                                       {'1'}};

    private final int OCUPADO =1;

    public String verificar(String  verificando) throws Exception {
        return "1";
    }


     public String direccion(int x) throws Exception{
        verificarAscensor(x);

         return null;
     }

    private void verificarAscensor(int ascen) throws Exception{
        if(ascen < OCUPADO){
            throw new Exception(ascen+"El ascensor esta ocupado");
        }else{
            System.out.println("El ascensor esta libre");
        }
    }



}
