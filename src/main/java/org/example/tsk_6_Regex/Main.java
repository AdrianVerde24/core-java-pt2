package org.example.tsk_6_Regex;

public class Main {


    public static void main(String[] args) {
        System.out.println(UidChecker.uidchecker("orderUUID"));
        System.out.println(UidFinder.uidfinder("test_email@griddynamics.com"));
        System.out.println(UidProvider.uidprovider("orderUUID"));
        System.out.println(FindnumofOrders.findnumoforders("app=edi_adapter_splitter wingtipsTrace=225debfbe6e5fac7 poiFileName=Integration_test_Contract INFO  LogUtils - POI file name: [Integration_test_Contract], total number of orders successfully processed: [2]\n" +
                "\n"));
        System.out.println(deWordFinder.wordStartsWithDe());
    }

}
