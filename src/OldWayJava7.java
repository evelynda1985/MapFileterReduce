import java.util.List;

public class OldWayJava7 {

    public Integer getAgeAverage(List<Person> people){
        Integer sum = 0;
        Integer count = 0;
        Integer average = 0;
        for (Person person : people){
            if(person.getAge() > 20){
                sum += person.getAge();
                count ++;
            }
        }
        if(count > 0){
            average = sum / count;
        }
        return  average;
    }


}
