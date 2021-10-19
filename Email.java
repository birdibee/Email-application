package Email;

import java.util.Scanner;

public class Email {
    private String email;
    private String firstname;
    private String lastname;
    private String department;
    private int mailboxcapacity;
    private String alternatemail;
    private String password;

    //constructor to receive the first name and last name
    public Email(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        System.out.println("Email is set for :" + this.firstname + " " + this.lastname);
        this.department = setDepartment();
        System.out.println(" you are hired in the " + department + "department");
        Scanner pass = new Scanner(System.in);
        System.out.println("how long do you want your character to be ?: ");
        int numchar = pass.nextInt();
        String passcode = RandomPassword(numchar);
        System.out.println("your password is: " + passcode);
        emailgen();

    }


    //Ask for department
    private String setDepartment() {
        System.out.print("Enter the department: \n1 for Sales\n2 for development\n3 for accounting");
        Scanner in = new Scanner(System.in);
        int deptchoice = in.nextInt();
        if (deptchoice == 1) {
            return "Sales";
        } else if (deptchoice == 2) {
            return "dev";
        } else if (deptchoice == 3) {
            return "accounting";
        } else {
            return " you have not entered a valid department";
        }

    }

    // generate the password
    private String RandomPassword(int length) {
        String passwordset = "abcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordset.length());
            password[i] = passwordset.charAt(rand);
        }
        return new String(password);
    }

    //Combine String to generate email

    public String emailgen() {
        email = firstname + lastname + "@" + department + ".com";
        System.out.println("your email is:" + email);
        return email;
    }

    //set the mailailbox capacity
    public void setMailboxcapacity(int capacity) {
        this.mailboxcapacity = capacity;
    }

    //set the alternate email
    public void setalternatemail(String altemail) {
        this.alternatemail = altemail;
    }

    //change the password
    public void changePassword(String Password) {
        this.password = password;
    }

    public int getMailboxcapacity() {
        return mailboxcapacity;
    }

    public String getAlternatemail() {
        return alternatemail;
    }
    public String getPassword(){
        return password;
    }
}
