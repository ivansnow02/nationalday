public class Action {
    public static void main(String[] args) {
        Gate gate = new Gate();
        NationalDay nationalday = new NationalDay();
        gate.gatestate(nationalday.islockdown);
        System.out.println(nationalday.name + nationalday.lockdown());
        String epidemic;
        epidemic = UrlUtils.sendGet("https://lab.isaaclin.cn/nCoV/api/area", "province=江苏省");
        System.out.println(epidemic);
    }
}
// https://lab.isaaclin.cn/nCoV/api/area?province=%E6%B1%9F%E8%8B%8F%E7%9C%81