public class NationalDay {
    boolean islockdown = true;
    String name = "国庆";

    public String lockdown(){
        if (this.islockdown)
            return "你被封在学校里了";
        else
            return "你可以回家团聚了";
    }
}
