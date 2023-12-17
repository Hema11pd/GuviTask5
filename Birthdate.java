package GuviTask5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Birthdate {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        LocalDate birthDate = LocalDate.parse(date);
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthDate,currentDate);
        System.out.println("Your age is: "+age.getYears()+" years,"+age.getMonths()+" months,and "+age.getDays()+" days");


    }
}

