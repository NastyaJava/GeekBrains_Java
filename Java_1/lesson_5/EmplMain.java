public class EmplMain {
    static public void main(String[] args){
        Employee[] staff = new Employee[5];
        staff[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com"
                               , "892312312", 30000, 30);
        staff[1] = new Employee("Daenerys Targaryen", "Mother of Dragons", "dany@mailbox.com"
                               , "123456789", 10000000, 22);
        staff[2] = new Employee("Bilbo Baggins", "Burglar", "baggins@mailbox.com"
                               , "987654321", 1000, 131);
        staff[3] = new Employee("Sam Winchester", "Hunter", "demon@mailbox.com"
                               , "892979556", 0, 37);
        staff[4] = new Employee("Albus Dumbledore", "Headmaster", "phoenix@mailbox.com"
                               , "8937646453", 15000, 115);

        for( int i = 0; i < staff.length; i++ ){
            if( staff[i].age > 40 ){
                staff[i].infoAboutPerson();
                System.out.println("----------------------");
            }
        }
    }
}
