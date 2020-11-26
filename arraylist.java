package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static ArrayList<String> name = new ArrayList<>();
    static ArrayList<Integer> age = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);



    public static void main(String[] args) {

        System.out.println(" PICK 4 CHOICES ");
        int choice;
        end:
        while (true) {
            System.out.println("****************");
            System.out.println("1.Add");
            System.out.println("2.Delete");
            System.out.println("3.update the entry");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            System.out.println("****************");
            System.out.println(" ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Add");
                    add();
                    break;
                case 2:
                    System.out.println("Delete");
                    delete();
                    break;
                case 3:
                    System.out.println("update ");
                    update();
                    break;
                case 4:
                    System.out.println("Display");
                    display();
                    break;
                case 5:
                    System.out.println("Exit");
                    break end;
                default:
                    System.out.println("Invalid Input");
                    break;


            }


        }
    }

static void add()
{
    System.out.println("Enter the name: ");
    name.add(sc.next());
    System.out.println("Enter the age: ");
    age.add(sc.nextInt());
    System.out.println(" Name and age added Successfully!");
}

static void delete()
{
    System.out.println(" Remove the name: ");
    String del= sc.next();
    if(name.contains(del))
    {
        name.remove(del);
        System.out.println(del+" successfully removed!");
    }
    else
    {
        System.out.println("There is no  existing name "+del+" in the list");
    }


}
static void update()
{
    System.out.println(" Enter index  you wish to update: ");
    int num = sc.nextInt();
    System.out.println(" Enter the updated name: ");
    String up= sc.next();
    System.out.println(" Enter updated age: ");
    int edad = sc.nextInt();
    name.set(num,up);
    age.set(num,edad);
    System.out.println("The name and aga successfully updated!");
    System.out.println(name);
    System.out.println(age);
}

static void display()
{
    System.out.println("Your list");
    for (int x = 0; x<name.size(); x++)
    {
        System.out.println(name.get(x)+ " is" + age.get(x));
    }
}
}
