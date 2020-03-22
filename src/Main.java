import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Ana", "Agredo", 15);
        Person person2 = new Person("Sara", "Agredo", 45);
        Person person3 = new Person("Sara", "Agredo", 35);
        Person person4 = new Person("Diana", "Sanchez", 35);
        Person person5 = new Person("Isabela", "Santodomingo", 55);
        Person person6 = new Person("Juan", "Valdez", 75);

        List<Person> people = new ArrayList(Arrays.asList(person1,
                                                           person2,
                                                           person3,
                                                           person4,
                                                           person5,
                                                           person6));

        List<Integer> ages = new ArrayList(Arrays.asList(person1.getAge(),
                                                         person2.getAge(),
                                                         person3.getAge(),
                                                         person4.getAge(),
                                                         person5.getAge(),
                                                         person6.getAge()));

        List<Integer> agesPart1 = new ArrayList(Arrays.asList(person1.getAge(),
                                                              person2.getAge(),
                                                              person3.getAge()));

        List<Integer> agesPart2 = new ArrayList(Arrays.asList(person4.getAge(),
                                                              person5.getAge(),
                                                              person6.getAge()));

        OldWayJava7 oldWayJava7 = new OldWayJava7();
        System.out.println("old way in Java -> " + oldWayJava7.getAgeAverage(people));


        Reduction reduction = new Reduction();
        reduction.getSumElements(ages);
        reduction.getSumElementsParallelo(agesPart1, agesPart2);
        reduction.getMaxElementParallelo(agesPart1, agesPart2);

    }
}
