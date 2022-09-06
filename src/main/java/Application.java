import animals.Kotik;

public class Application {
     public static boolean compareVoice(Kotik k1, Kotik k2) {
        if (k1.getVoice().equals(k2.getVoice())) {
            System.out.println("Котики говорят одинаково");
            return true;
        }
        System.out.println("Котики говорят по разному");
        return false;

    }
    public static void main(String[] args) {
        Kotik k1 = new Kotik("Kot","may",2,1000);
        Kotik k2= new Kotik();
        k2.setName("Iris");
        k2.setVoice("may");
        k2.setSatiety(2);
        k2.setWeight(1000);
        for(String activityRecord:k1.liveAnotherDay()){
            System.out.println(activityRecord);
        }
        System.out.println("Котик по имени "+k1.getName()+" весит "+ k1.getWeight()+" грамм");
        compareVoice(k1 ,k2);
        System.out.println("В процессе выполнения программы было создано " + Kotik.getCount()+ " котика(ов).");



    }
}
