
import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Url: ");
        String URL=sc.nextLine();

        String protocol=URL.substring(0, URL.indexOf(":"));

        if (protocol.equals("http"))
        {
            System.out.println("The protocol is hypertext transfer protocol");
        }
        else if (protocol.equals("https"))
        {
            System.out.println("The protocol is hypertext transfer protocol secure");
        }
        else if (protocol.equals("ftp"))
        {
            System.out.println("The protocol is File transfer protocol");
        }
        else if (protocol.equals("http"))
        {
            System.out.println("The protocol is hypertext transfer protocol");
        }

        String ext = URL.substring(URL.lastIndexOf(".")+1);

        if (ext.equals("com"))
        {
            System.out.println("It is commercial website");
        }
        else if (ext.equals("org"))
        {
            System.out.println("It is organisational website");
        }
        else if (protocol.equals("net"))
        {
            System.out.println("It is network website");
        }
        else if (protocol.equals("biz"))
        {
            System.out.println("it is buiseness website");
        }

         sc.close();
    }
}
