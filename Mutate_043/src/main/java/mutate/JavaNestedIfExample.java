package mutate;

public class JavaNestedIfExample {

    int age=20;
    int weight=80;
    //applying condition on age and weight
    public String Hello()
    {
        if(age>=18){
            if(weight>50){
                //System.out.println("You are eligible to donate blood");
                return "You are eligible to donate blood";
            }
            else{
                return "You are not eligible to donate blood";
            }}


        return "s";
    }


}