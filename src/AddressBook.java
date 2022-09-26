import java.util.ArrayList;

public class AddressBook{

    private ArrayList<BuddyInfo> buddies;

    public AddressBook(){
        this.buddies = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy){
        this.buddies.add(buddy);
    }

    public BuddyInfo removeBuddy(int index){
        if(index >=0 && index < buddies.size()){
            return buddies.remove(index);
        }
        return null;
    }


    public static void main(String [] args){
        BuddyInfo buddy = new BuddyInfo("Chris", "Carleton", "613567");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);


    }


}