package week8;

public class practice33 {
    //phone number, address, activity of hotel


    public static String getPhoneNumber() {
        String phoneNumber = "02-1234-5678";
        return phoneNumber;
    }

    public static String getAddress() {
        return "Melbourne";
    }

    public static String getActivities() {
        return "etc";
    }
    public static void main(String[] args) {
        //return, 반환값값
        String contactNumber = getPhoneNumber();
        System.out.println("hotel number: " + contactNumber);

        String address = getAddress();
        System.out.println("hotel address: " + address);

        System.out.println("hotel activities: " + getActivities());
    }
}
