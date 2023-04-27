public class Demo {
    private static Application configurableApplication() {
        Application app;
        IGUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if(osName.contains("linux")) {
            factory = new LinuxFactory();
        } else if(osName.contains("mac")) {
            factory = new MacFactory();
        } else if(osName.contains("windows")) {
            factory = new WinFactory();
        } else {
            throw new RuntimeException("Unknown OS!");
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args){
        Application app = configurableApplication();
        app.paint();
    }
}
