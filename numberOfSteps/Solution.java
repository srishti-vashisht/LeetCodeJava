import java.util.Scanner;
public class NoOfSteps 
{    
    public static void main(String[] args) 
    {        
        Scanner sc = new Scanner(System.in);        
        int n = sc.nextInt();        
        int[] a = new int[n];        
        int[] b = new int[n];        
        int steps = 0;        
        for(int i=0;i<n;i++)
          {            
            a[i]=sc.nextInt();        
          }        
        for(int i=0;i<n;i++)
            {            
            b[i]=sc.nextInt();        
            }        
        for(int i=0;i<n-1;i++)        
            {            
                if(a[i]<a[i+1])            
                {                
                    int k=a[i];                
                    a[i]=a[i+1];                
                    a[i+1]=k;                
                    k=b[i];                
                    b[i]=b[i+1];                
                    b[i+1]=k;            
                }        
            }        
            for(int i=0;i<n-1;i++)        
            {            
                 while(a[n-1]!=a[i]) 
                 
                 {                
                     if(a[i]<=0)                
                     {                    
                         System.out.println("-1");                                               System.exit(0);        
                     }                
                     if(a[n-1]<a[i]) 
                     {                    
                         a[i] = a[i] - b[i];                    
                         steps++;                    
                     }                                          
                     if(a[n-1]>a[i])                
                     {                    
                        a[n-1]=a[n-1]-b[n-1];                                                   steps++;                
                     }            
                 }        
            }        
            System.out.println(steps);    
            
        }
    
    }