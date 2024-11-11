package ua.edu.ucu.apps.flowerstore.model.users;

public class Receiver extends AppUser implements User{
    @Override
    public void update(String status){
        if (status == null){
            this.setStatus("Received");
        } else{
            this.setStatus(status);
        }
    }
}