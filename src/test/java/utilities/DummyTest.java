//package utilities;
//
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.util.List;
//
//public class DummyTest {
//
//    public static void main(String[] args) {
//
//        List<User> list =
//        User user = new User();
//
//        user.setFirstName("Ibrahim");
//        user.setLastname("Kalin");
//        user.username("Ibrahimkalin");
//
//        User user2 = new User();
//        user2.setFirstName("Mahmut");
//        user2.setLastName("Can");
//        user.username("Mahmutcan");
//
//        String filename = "C:\\Users\\kudik\\IdeaProjects\\LINNBANK\\src\\test\\resources\\test_data\\CustomerInformation.txt";
//
//        saveAllCustomer(filename,user);
//
//
//    }
//    public static void saveAllCustomer(String filename, User user){
//        try{
//            BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));
//
//            writer.append(user.getFirstName()+",");
//            writer.append(user.getLastName()+",");
//            writer.append(user.getUsername()+",")+"\n";
//
//            writer.close();
//
//        }
//    }
//}
