package org.example;

public class ManagerFactory {

    public static IManager getManager(int index){
        if(index == 1){
            return new LlinkedListManager();
        }
        else{
            return new NullManager();
        }
    }
}
