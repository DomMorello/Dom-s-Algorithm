// #include <stdio.h>
// #include <string.h>
// #include <stdlib.h>

// int ft_strlen(char *s)
// {
//     int len = 0;

//     while (s[len])
//         len++;
//     return len;
// }

// int main(void)
// {
//     char *binaryinit[8] = {"0", "1", "10", "11", "100", "101", "110", "111"};
//     char *binary[8] = {"000", "001", "010", "011", "100", "101", "110", "111"};
//     char input[335];

//     scanf("%s", input);
//     int len = ft_strlen(input);
//     for (int i = 0; i < len; i++)
//     {
//         if (i == 0)
//             printf("%s", binaryinit[input[i] - '0']);
//         else
//             printf("%s", binary[input[i] - '0']);
//     }
//     printf("\n");
//     return 0;
// }

// 파이썬으로 풀어본 코드를 그대로 c로 옮겨봤는데 런타임에러가 뜬다 백준에서; 