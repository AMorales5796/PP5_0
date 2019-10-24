public class Dog
{
    private String name;
    private int age;
    private String breed;
    private int weight; //in pounds

    public Dog()
    {
        name = "";
        age = 0;
        breed = "";
        weight = 0;
    }//default constructor
    public Dog(String name, int age, String breed, int weight)
    {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.weight = weight;
    }
    //full constructor
    public String getName()
    {
        return name;
    }
    //Getter for name
    public void setName(String name)
    {
        this.name = name;
    }
    //Setter for name
    public int getAge()
    {
        return age;
    }
    //Getter for age
    public void setAge(int age)
    {
        this.age = age;
    }
    //Setter for age
    public String getBreed()
    {
        return breed;
    }
    //Getter for breed
    public void setBreed(String breed)
    {
        this.breed = breed;
    }
    //Setter for breed
    public int getWeight()
    {
        return weight;
    }
    //Getter for weight
    public void setWeight(int weight)
    {
        this.weight = weight;
    }
    //Setter for weight
    public String toString(String name, int age, String breed, int weight)
    {
        String output;
        output = "Name: " + name;
        output += "\nAge: " + age;
        output += "\nBreed: " + breed;
        output += "\nWeight: " + weight;
        return output;
    }
}//end of class
