import java.util.*;
public class Arraylist
{
    public static void main(String[] args)
    {
        ArrayList<String> List1 = new ArrayList<String>();
        // 1. Add() ->
        List1.add("Hima");                         //Add elements in Arraylist
        List1.add("Kavita");
        List1.add("Diksha");
        List1.add("Simran");
        System.out.println(List1);
        List1.add("Abhay");

        System.out.println(List1);                    //Print arraylist

        // 2. Add(paramters) ->
        List1.add(2, "Jasleen")  ;                    //Add element at specific list
        System.out.println(List1);

        // 3. get() ->
        System.out.println(List1.get(0));             //Print element at specific index

        // 4. isEmpty() ->
        System.out.println("List is empty: " + List1.isEmpty());              //Print element at specific index

        // 5. indexOf(paramter) ->
        System.out.println("Index of diksha: " + List1.indexOf("Diksha"));         //Print index of specific  element

        // 6. remove(index) ->
        List1.remove(3);
        System.out.println(List1);                          //Remove the elementvat specific index

        // 7. set(parameters) ->
        List1.set(1, "Kav");
        System.out.println(List1);                         //Replace the element at specific index

        // 8. size() ->
        System.out.println("Size of arraylist: " + List1.size());                  //Print size of arraylist

        // 9. clear() ->
        List1.clear();
        System.out.println(List1);                         //Clear the arraylist

    }
}