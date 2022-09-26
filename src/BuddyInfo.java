public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo(String buddyName, String buddyAddress, String buddyNumber){
        name = buddyName;
        address = buddyAddress;
        phoneNumber = buddyNumber;
    }

    /**
     Return buddy's name
     */
    public String getName() {
        return name;
    }

    /**
     Return buddy's address
     */
    public String getAddress() {
        return address;
    }

    /**
     Return buddy's phone number
     */

    public String getPhoneNumber() {
        return phoneNumber;
    }




    public static void main(String[] args) {
        BuddyInfo buddy1 = new BuddyInfo("Homer","123 Colonel By Drive", "45678978");
        System.out.println("Hello " + buddy1.getName() + "!");


    }


}
