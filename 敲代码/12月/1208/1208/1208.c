//#define _CRT_SECURE_NO_WARNINGS
//#include<stdio.h>
//#include<stdlib.h>
//#include<windows.h>
//int Short_division(int a){
//	int count=0;
//	while (a){
//		if (a % 2 == 1)
//		{
//			count++;		
//		}
//		a /= 2;
//	}
//	
//	printf("%d", count);
//	return count;
//}
//int main()
//{
//	int a=0;
//	scanf("%d", &a);
//	Short_division(a);
//	system("pause");
//	return 0;
//}
//int func2(int m, int n)//����int��32λ������m��n�Ķ����Ʊ���У��ж��ٸ�λ(bit)��ͬ
//{
//	int tmp = m^n;
//	int count = 0;
//	while (tmp != 0)
//	{
//		count++;
//		tmp = tmp&(tmp - 1);
//	}
//	return count;
//}
//int main()
//{
//	printf("%d\n", func2(1999, 2299));
//system("pause");
//	return 0;
//}

//#define _CRT_SECURE_NO_WARNINGS
//#include <stdio.h>  
//int main()
//{
//	int num = 0, i = 0;
//	scanf("%d", &num);
//	printf("��������Ϊ��");
//	for (i = 31; i >= 0; i -= 2)  //Ҳ�ǿ���32�Σ�ÿ����������32λ���㣩��ֻ�Ǵ�31λ��ʼ�ƶ�  
//	{
//		printf("%d ", (num >> i) & 1);  //��һ�������ƶ�31λ��1��õ���һλ�����ÿ�α仯2λ�����ɵõ�����λ���  
//	}
//	printf("\n");
//	printf("ż������Ϊ��");
//	for (i = 30; i >= 0; i -= 2)  //�����ƶ�30λ������1���ý����ԭ�����ֵĵڶ�λ������28λ...  
//	{
//		printf("%d ", (num >> i) & 1);  //  
//	}
//	printf("\n");
//	system("pause");
//	return 0;
//}
//#include <stdio.h>
//int i;
//int main()
//{
//	i--;
//	if (i > sizeof(i))
//	{
//		printf(">\n");
//	}
//	else
//	{
//		printf("<\n");
//	}
//	system("pause");
//	return 0;
//}