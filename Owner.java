/**
 * @author Donny (1972027)
 */

import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Owner extends Person{
    private Company company;


    public Owner(Company company){
        compan=company;
    }


    public void  addEmployee(Employee employee) throws ParseException {
        company.employees= Arrays.copyOf(company.employees,company.employees.length+1);
        Scanner sc=new Scanner(System.in);
        System.out.print("Employee first name: ");
        employee.setFirstName(sc.next());
        System.out.print("Employee last name: ");
        employee.setLastName(sc.next());
        System.out.print("Join date(yyyy-mm-dd): ");
        String tgl=sc.next();
        Date date=new SimpleDateFormat("yyyy-MM-dd").parse(tgl);
        employee.setJoinDate(date);
        employee.setId(company.getNextEmployeeid());
        Company.employees[compan.employees.length-1]=newEmployee(employee.getFirstName(),employee.getLastName(),employee.getId(),employee.getJoinDae());
    }

    public void viewAllEmployee(){
        Employee[] isi = compan.getEmployees();
        if (company.employees != null){
            System.out.println("|ID\t  |Name\t |Join Date");
            for(int i = 0; i< isi.length; i++){
                System.out.printf("|"+isi[i].getId());
                System.out.printf("\t|"+isi[i].getFullName());
                System.out.printf("\t|"+isi[i].getJoinDate());
                System.out.println();

            }

        }
        else{
            System.out.println("No Data");
        }
    }
}
