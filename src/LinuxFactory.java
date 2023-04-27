public class LinuxFactory implements IGUIFactory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new LinuxCheckBox();
    }
    
}
