public class Action {
    public static void main(String[] args) {
        Gate gate = new Gate();
        NationalDay nationalday = new NationalDay();
        gate.gatestate(nationalday.islockdown);
        System.out.println(nationalday.name + nationalday.lockdown());
    }
}