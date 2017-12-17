package functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionTRExample {
    public static void main(String[] args) {
        Function<Employee, String> funcEmpToString = (Employee e) -> e.getName();
        Function<String,String> initialFunction=(String s)->"For every name, sout this string :D!!!";
        List<Employee> employeeList = Arrays.asList(new Employee("Tom Jones", 45),
                new Employee("Harry Major", 22),
                new Employee("Marcin ", 23),
                new Employee("Malgosia", 18));
        List<String> empNameList = convertEmpListToNamesList(employeeList, funcEmpToString.andThen(initialFunction));
        empNameList.forEach(System.out::println);
    }

    public static List<String> convertEmpListToNamesList(List<Employee> employees,
                                                         Function<Employee, String> funcEmptToString) {

        List<String> empNameList = new ArrayList<>();
        for (Employee e :
                employees) {
            empNameList.add(funcEmptToString.apply(e));
        }
        return empNameList;
    }

}
