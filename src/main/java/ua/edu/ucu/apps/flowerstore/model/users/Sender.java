package ua.edu.ucu.apps.flowerstore.model.users;

public class Sender extends AppUser implements User{
    @Override
    public void update(String status){
        if (status == null){
            this.setStatus("Sended");
        } else{
            this.setStatus(status);
        }
    }
}