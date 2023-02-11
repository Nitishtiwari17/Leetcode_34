package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int arr[]={1,3,5,5,5,6,7,8};
        int target=5;
        ArrayList<Long> list= new ArrayList<>();
        long first=-1;
        long last=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                first=mid;
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        low=0;
        high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                last=mid;
                low=mid+1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        list.add(first);
        list.add(last);
        System.out.println(list);
    }
}
