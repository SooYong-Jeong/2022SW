#include <stdio.h>
#include <stdlib.h>  
#include <time.h>  

int main()
{
    srand((unsigned)time(NULL));        
    int numbers[6] = { 0, 0, 0, 0, 0, 0 };
    for (int i = 1; i < 1001; i++)
    {
        int num = rand() % 6 + 1;
        switch (num)
        {
        case 1:  
            numbers[0]++;
            break;
        case 2:   
            numbers[1]++;
            break;
        case 3:     
            numbers[2]++;
            break;
        case 4:     
            numbers[3]++;
            break;
        case 5:   
            numbers[4]++;
            break;
        case 6: 
            numbers[5]++;
        default:
            break;
        }
        if (i % 100 == 0)
        {
            for (int j = 0; j < 6; j++)
            {
                printf("%d ", numbers[j]);
            }
        printf("\n");
        }
    
    }
    return 0;

}