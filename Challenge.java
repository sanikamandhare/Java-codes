class Challenge {
    public static void main(String args[]){
    String str = "programmer@gmail.com";

    /*boolean str2=str.matches(".*gmail.*");
    System.out.println(str2);*/

    int str2= str.indexOf("@");

    String username = str.substring(0,str2);
    System.out.println("Username: "+username);

    String domainName = str.substring(str2, str.length());
    System.out.println("Domain name: "+domainName);


    }
}
