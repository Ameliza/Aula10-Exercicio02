public class Principal {

    public static void main(String[] args) {
        Tempo t = new Tempo(15, 9, 18);
        //System.out.println(t.alteraHorario(12, 45, 32));
        //System.out.println(t.alteraHora(1));
        //System.out.println(t.alteraMinuto(0));
        //System.out.println(t.alteraSegundo(0));
        System.out.println("Horário: " + t.toString());
        Tempo a = new Tempo(15, 9, 18);
        System.out.println("Diferença de horário em segundos: " + t.diferenca(a));
        //System.out.println("Horário em segundos: " + t.tempoSegundos());
    }

}
