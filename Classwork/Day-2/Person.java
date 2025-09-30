import java.util.*;
public class Person implements Comparable<Person>{
    int height;
    int age;
    String name;

    Person(int height,int age,String name) {
        this.height=height;
        this.age=age;
        this.name=name;
    }
    @Override
    public String toString(){
        return "[name=" +name +", height="+ height +",age="+ age +"]";
    }
    @Override
    public int compareTo(Person other){
        if(this.height < other.height) return -1;
        if(this.height > other.height) return 1;
        else return 0;

    }
    

    public static void main(String[] args){

        Person p1=new Person(1,30,"Aparna");
        Person p2=new Person(170,20,"Kuldeep");
        Person p3=new Person(170,20,"Ankit");
        Person p4=new Person(168,28,"Palak");
        Person p5=new Person(111,29,"Manasvi");
        
        List<Person> l=new ArrayList<>();
        l.add(p1);
        l.add(p2);
        l.add(p3);
        l.add(p4);
        l.add(p5);

        // isme yhi humko likhna pdega 
        // Collections.sort(l,(a,b)-> a.height-b.height);
        // for(int i=0;i<l.size();i++){
        //     System.out.println(l.get(i).toString());
        // }

        // ye humne phle hi likh dia hai compareto method isliye seedhe chl rha hai (comparable se)
        // Person[] arr={p1,p2,p3,p4,p5};
        // Arrays.sort(arr);
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }

        // ye comparator se hai
        Person[] arr={p1,p2,p3,p4,p5};
        Arrays.sort(arr,new MyComparator());
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }





    }
}

class MyComparator implements Comparator<Person>{
    @Override
    public int compare(Person o1,Person o2){
        if(o1.age<o2.age) return -1;
        else if(o1.age>o2.age) return 1;
        else{
            if(o1.height < o2.height) return -1;
            else if(o1.height>o2.height) return 1;
            else{
                return o1.name.compareTo(o2.name);
            }
        }
    }
}
