//#define _CRT_SECURE_NO_WARNINGS
//  
//#include <stdio.h>
//#include <stdlib.h>
//#include <time.h>
//#include <windows.h>
//
//void getNum(int src[])
//{
//	int pool[10] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//	srand((unsigned)time(NULL));
//
//	int tmp;
//	int i;
//	for (i = 0; i < 4; i++)
//	{
//		tmp = rand() % 10;
//		while (1)
//		{ 
//			if (pool[tmp] != -1)
//			{ 
//				src[i] = pool[tmp];
//				pool[tmp] = -1;
//				break;
//			}
//			
//			tmp++;
//			if (tmp == 10)
//			{
//				tmp = 0;
//			}
//		}
//	}
//}
//
//int printArray(int arr[], int n)
//{
//	int i;
//	for (i = 0; i < n; i++)
//	{
//		printf("%d ", arr[i]);
//	}
//	putchar('\n');
//}
//
//int printAB(int guess[], int src[])
//{
//	int i, j;
//	int countA = 0, countB = 0;
//
//	for (i = 0; i < 4; i++)
//	{
//		for (j = 0; j < 4; j++)
//		{
//			if (guess[i] == src[j])
//			{
//				countB++;
//				break;
//			}
//		}
//	}
//
//	for (i = 0; i < 4; i++)
//	{
//		if (guess[i] == src[i])
//		{
//			countA++;
//		}
//	}
//
//	printf("%dA%dB\n", countA, countB - countA);
//
//	if (countA == 4)
//	{
//		return 1;
//	}
//	return 0;
//}
//
//int main()
//{
//	int src[4];
//	int guess[4];
//
//	getNum(src);
//	//printArray(src, 4);
//	int i, j;
//	for (i = 1; i <= 8; i++)
//	{ 
//		printf("��%d�Σ�", i);
//		for (j = 0; j < 4; j++)
//		{
//			scanf("%d", &guess[j]);
//		}
//
//		if (printAB(guess, src))
//		{
//			printf("��Ӯ�ˣ�\n");
//			return 0;
//		}
//	}
//
//	printf("�����ˣ�\n���ǣ�");
//	printArray(src, 4);
//	system("pause");
//	return 0;
//}
//#define _CRT_SECURE_NO_WARNINGS//�ݹ����n^k
//#include <stdio.h>
//#include <stdlib.h>
//float Power(float n, int k) {
//	if (k == 0) {
//		return 1;
//	}
//	else if (k == 1) {
//		return n;
//	}
//	else {
//		return n * Power(n, k - 1);
//	}
//}
//int main() {
//	int n, k;
//	scanf("%d %d", &n, &k);
//	printf("%f", Power(n, k));
//	system("pause");
//	return 0;
//}
//#define _CRT_SECURE_NO_WARNINGS//����һ���Ǹ����������������������֮�ͣ�
//#include<stdio.h>
//#include<stdlib.h>
//int DigitSum(n)
//{ 
//	if (n< 10)
//	{
//		return n;
//	}
//	return n % 10 + DigitSum(n / 10);
//}
//
//int main()
//{
//	int n;
//	printf("������һ����:");
//	scanf("%d", &n);
//	printf("�����ÿһλ��Ϊ%d", DigitSum(n));
// system("pause");
// return 0;
//}
//#include<stdio.h>
//void reverse_string(char * string) {
//	int len = strlen(string) - 1;
//	char tmp;
//	if (len > 0) {
//		tmp = *string;
//		*string = *(string + len);
//		*(string + len) = '\0';
//		reverse_string(string + 1);
//		*(string + len) = tmp;
//	}
//}
//void main() {
//	char str[] = { "abcdefg" };
//	printf("ԭ�ַ���Ϊ:%s\n", str);
//	reverse_string(str);
//	printf("ת�����ַ���Ϊ:%s\n", str);
//	system("pause");
//}
//#define _CRT_SECURE_NO_WARNINGS//�ݹ�ͷǵݹ�ֱ�ʵ��strlen
//#include<stdio.h>
//#include<stdlib.h>
//int len(char *arr)
//{
//	int count=0;
//
//	while(*arr!='\0')
//	{
//		count++;
//		*arr++;
//	}return count;
//}
//int lens(char *arr)
//{
//	if(*arr == '\0'){
//		return 0;
//	}
//	return 1+lens(arr + 1);
//}
//int main()
//{
//	char arr[] = "asdasdasd";
//	printf("%d\n", len(arr));
//	printf("%d\n", lens(arr));
// system("pause");
// return 0;
//}
#define _CRT_SECURE_NO_WARNINGS//�ݹ鷽ʽʵ�ִ�ӡһ��������ÿһλ
#include<stdio.h>
#include<stdlib.h>
int printint(int a)
{
	if (a> 9)
	{
		printint(a / 10);
	}
	printf("%d ", a % 10);
}
int main()
{
	int a;
	scanf("%d", &a);
	printint(a);
 system("pause");
 return 0;
}