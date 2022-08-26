public class Medic extends Hero{
    private double healPoints;

    public double getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(double healPoints) {
        this.healPoints = healPoints;
    }

    public Medic(int health, int damage, double healPoints) {
        super(health, damage);
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность: Heal Points");
    }

    public String increaseExperience(){
        double tenPercent = (((10 * healPoints) / 100) + healPoints);
        return "Heal Points: " + healPoints + " увеличелся на 10% стало: " + tenPercent;
    }

    public String info (){
        return super.info() + " " +  this.healPoints;
    }
}
