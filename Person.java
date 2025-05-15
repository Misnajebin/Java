class Person{
    int age;
    String name;
    Person(String name,int age){
        this.age=age;
        this.name=name;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
    public static void main(String[] args) {
    //    creating array of objects for the class person
     Person p[]=new Person[3];
    //  initialise object
    p[0]=new Person("abc",50);
    p[1]=new Person("def",60);
    p[2]=new Person("hij",90);
    // accessing elements
    // for(Person p1:p){
    //     p1.display();
    // }
    for(int i=0;i<3;i++){
        p[i].display();
    }
    }
}