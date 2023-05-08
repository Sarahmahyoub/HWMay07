package HwApril29;



public class HW2 {



   String createEmail (String name1, String name2, String email) {

       return name1+name2+email;
    }

    public static void main(String[] args) {

        HW2 address1 =new HW2();
        String name1="sarah";
        String name2="mahyoub";
        String email="@gmail.com";
        String newEmail= address1.createEmail(name1,name2,email);
        System.out.println(newEmail);


}



    }


