/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraytest;

public class BubbleSort {
    void BubbleSort(int arr[])
    {
        int n =arr.length;
        
        for(int i=0;i<n-1;i++)
            for(int j=0;j<n-1;j++)
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    
                }
    }
    public static void main(String[] args) {
      
        int numbers[] ={8,3,1,4,5,11,7,2,17,13};
        
        BubbleSort bs = new BubbleSort();
        
        bs.BubbleSort(numbers);
        
        int n = numbers.length;
        
        for(int i=0;i<n;i++)
            
        
        
        
        System.out.println(numbers[i]);
        System.out.println();    
        
    }
    
}
