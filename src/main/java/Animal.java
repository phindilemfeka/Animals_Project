 class Animal {
    private String name;
    void setName(String name){

        if (name.equals("Rax") || name.equals("Stormy") )
        {
            this.name=name;
            }
        }

    void eat() {
        System.out.println(name+" eats");
    }

    public void sounds() {
      System.out.println("sound");

    }
}




