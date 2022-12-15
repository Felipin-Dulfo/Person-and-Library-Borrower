package AbstractANDInterface;

public class Borrower extends Person {
    protected String citySocialSecurityNumber;
    protected String modeGoingToLibrary;

    Borrower(String firstName, String middleName, String lastName,int tempGender, int age, double height, double weight, String CSSN, int numModeGoingToLibrary){
        super(firstName, middleName, lastName, age, height, weight);
        if(tempGender==1){
            gender = Gender.FEMALE;
        }
        if(tempGender==2){
            gender = Gender.MALE;
        }

        this.citySocialSecurityNumber = CSSN;

        if(numModeGoingToLibrary==1){
            this.modeGoingToLibrary = "driving";
        }
        if(numModeGoingToLibrary==2){
            this.modeGoingToLibrary = "biking";
        }
        if(numModeGoingToLibrary==3){
            this.modeGoingToLibrary = "walking";
        }
        if(numModeGoingToLibrary==4){
            this.modeGoingToLibrary = "commuting";
        }


    }

    public void goToLibraryToBorrowBook() {
        System.out.println(super.toString()+ " is " + this.modeGoingToLibrary + " to the Library to borrow books.");
    }
}
