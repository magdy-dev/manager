package manager;

public class Manager {
    private String name;
    private int level;
    private int age;



  void   display(){
      System.out.println("name:_" + name + " level:_" + level + " age:_" + age);
  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
