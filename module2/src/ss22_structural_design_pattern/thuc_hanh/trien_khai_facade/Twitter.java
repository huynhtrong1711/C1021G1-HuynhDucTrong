package ss22_structural_design_pattern.thuc_hanh.trien_khai_facade;

import ss22_structural_design_pattern.thuc_hanh.trien_khai_facade.SocialShare;

public class Twitter implements SocialShare {
    private String message;


    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void share() {
        System.out.println("Chia sẽ lên Twitter: " + this.message);

    }
}
