class phoneClient {
    
    public static void main(String[] args) {
        

        Phone nokiaPhone=new Phone();

        SmartPhone iPhone=new SmartPhone(Os.ios);


        Phone demoPhone=new SmartPhone(Os.Android);

        demoPhone.call();


        nokiaPhone.call();
        iPhone.call();
    }
}
