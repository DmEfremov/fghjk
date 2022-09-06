package animals;

public class Kotik {
    private static int count;
    private static final int METHODS = 5;
    private String name;
    private String voice;
    private int satiety;
    private int weight;

    public Kotik(String name, String voice, int satiety, int weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        Kotik.count += 1;
    }

    public Kotik() {

        Kotik.count += 1;
    }

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void eat(int satiety) {
        this.satiety += satiety;
    }

    public void eat(int satiety, String brand) {
        this.satiety += satiety;
    }

    public void eat() {
        this.eat(2, "kitkat");

    }


    public boolean play() {
        if (satiety > 0) {
            satiety -= 1;
            return true;
        }
        return false;
    }

    public boolean sleep() {
        if (satiety > 0) {
            satiety -= 1;
            return true;
        }
        return false;
    }

    public boolean wash() {
        if (satiety > 0) {
            satiety -= 1;
            return true;
        }
        return false;
    }

    public boolean walk() {
        if (satiety > 0) {
            satiety -= 1;
            return true;
        }
        return false;
    }

    public boolean hunt() {
        if (satiety > 0) {
            satiety -= 1;
            return true;
        }
        return false;
    }


    public String[] liveAnotherDay() {
        String[] activityRecords = new String[24];

        for (int i = 0; i < 24; i++) {
            boolean activitySuccess = false;

            activityRecords[i] = String.valueOf(i) + " - ";
            switch ((int) (Math.random() * METHODS) + 1) {
                case 1:
                    activitySuccess = this.play();
                    activityRecords[i] += "играл";
                    break;
                case 2:
                    activitySuccess = this.hunt();
                    activityRecords[i] += "охотился";
                    break;
                case 3:
                    activitySuccess = this.walk();
                    activityRecords[i] += "гулял";
                    break;
                case 4:
                    activitySuccess = this.wash();
                    activityRecords[i] += "умывался";
                    break;
                case 5:
                    activitySuccess = this.sleep();
                    activityRecords[i] += "спал";
                    break;

            }

            if (!activitySuccess) {

                this.eat();
                activityRecords[i] = String.valueOf(i) + " - ";
                activityRecords[i] += "ел";
            }

        }


        return activityRecords;
    }


   


}
