public class Campo {
    private char simbolo;
    
    public Campo(){
        this.simbolo = ' ';

    }
    public char getSimbulo(){
        return this.simbolo;
    }
    public void setSimbulo(char simbulo){
        if(this.simbolo==' '){  
            this.simbolo=simbulo;
        }else{
             System.out.print("Campo Usado");

        }


    }
}
