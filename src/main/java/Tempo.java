import com.sun.xml.internal.ws.util.StringUtils;

public class Tempo {

    private int hora;
    private int minuto;
    private int segundo;


    /**
     * Construtor que requer 3 parâmetros que são passados pelo usuário
     * @param hr hora desejada
     * @param min minuto desejado
     * @param seg segundo desejado
     */
    public Tempo(int hr, int min, int seg){
        this();

        if((hr >= 0 && hr <= 23) && (min >= 0 && min <= 59) && (seg >= 0 && seg <= 59)){ //Se o valor for válido
            hora = hr;
            minuto = min;
            segundo = seg;
        }
    }

    /**
     * Construtor que requer 2 parâmetros que são passados pelo usuário
     * @param hr hora desejada
     * @param min minutos desejados
     */
    public Tempo(int hr, int min){
        this(); //Se a hora ou os minutos não forem válidos

        if((hr >= 0 && hr <= 23) && (min >= 0 && min <= 59)){ //Se o valor for válido
            hora = hr;
            minuto = min;
        }
    }

    /**
     * Construtor que requer 1 parâmetro que é passado pelo usuário
     * @param hr hora desejada
     */
    public Tempo(int hr){
        this(); //Se a hora não for válida

        if((hr >= 0 && hr <= 23)){ //Se o valor for válido
            hora = hr;
        }
    }

    /**
     * Construtor utilizado como padrão ou quando os parâmetros passados pelo usuário forem inválidos
     */
    public Tempo(){
        hora = 0;
        minuto = 0;
        segundo = 0;
    }

    /**
     * Altera apenas a hora
     * @param hr hora desejada
     * @return true, quando a hora foi alterada, ou false, quando não foi alterada por ser igual a atual ou inválida
     */
    public boolean alteraHora(int hr){ //altera apenas a hora
        if((hora != hr) && (hr >= 0 && hr <= 23)){
            this.hora = hr;
            return true;
        }
        else{ //Se o horário não foi alterado, retorna false
            return false;
        }
    }

    /**
     * Altera apenas os minutos
     * @param min minutos desejados
     * @return true, quando os minutos forem alterados, ou false, quando não forem alterados por serem iguais aos atuais ou inválidos
     */
    public boolean alteraMinuto(int min){ //altera apenas os minutos
        if((minuto != min) && (min >= 0 && min <= 59)){
            this.minuto = min;
            return true;
        }
        else{ //Se o horário não foi alterado, retorna false
            return false;
        }
    }

    /**
     * Altera apenas os segundos
     * @param seg segundos desejados
     * @return true, quando os segundos forem alterados, ou false, quando não forem alterados por serem iguais aos atuais ou inválidos
     */
    public boolean alteraSegundo(int seg){ //altera apenas os segundos
        if((segundo != seg) && (seg >= 0 && seg <= 59)){
            this.segundo = seg;
            return true;
        }
        else{ //Se o horário não foi alterado, retorna false
            return false;
        }
    }

    /**
     * Altera o horário
     * @param hr hora desejada
     * @param min minutos desejados
     * @param seg segundos desejados
     * @return true, quando o horário foi alterado, ou false, quando não foi alterado por ser igual ao atual ou inválido
     */
    public boolean alteraHorario(int hr, int min, int seg){ //altera hora, minuto e segundo
        if(((hora != hr) || (minuto != min) || (segundo != seg)) && (hr >= 0 && hr <= 23) && (min >= 0 && min <= 59) && (seg >= 0 && seg <= 59)){
            this.hora = hr;
            this.minuto = min;
            this.segundo = seg;
            return true;
        }
        else{ //Se o horário não foi alterado, retorna false
            return false;
        }
    }


    //********* COMO FAZER? ***********
    public long diferenca(Tempo tempo){ //retorna a diferença entre o tempo passado como parâmetro e o tempo do objeto em questão
        return Math.abs(tempo.tempoSegundos() - this.tempoSegundos());
    }

    /**
     * Transforma o tempo em segundos
     * @return os segundos
     */
    public long tempoSegundos(){ //retorna o tempo em segundos
        return (hora*3600 + minuto*60 + segundo);
    }

    /**
     * Transforma o tempo em string separada por ':'
     * @return uma string com o formato hr:min:seg
     */
    public String toString(){
        String tempo;
        if(hora < 10){
            tempo = "0" + hora + ":";
        }
        else{
            tempo = hora + ":";
        }
        if(minuto < 10){
            tempo += "0" + minuto + ":";
        }
        else{
            tempo += minuto + ":";
        }
        if(segundo < 10){
            tempo += "0" + segundo;
        }
        else{
            tempo += segundo;
        }
        return tempo;
    }
}
