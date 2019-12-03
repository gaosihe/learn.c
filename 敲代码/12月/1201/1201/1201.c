#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#include<time.h>
#define maxrow 9
#define maxlin 9
#define maxcount 10
int interface()
{
	printf("          ======================\n");//��ʼ����;
	printf("           ��ӭ����ɨ����Ϸ!!!\n");
	printf("           1.game paly!\n");
	printf("           0.game over!\n");
	printf("          ======================\n");
	printf("           ѡ�����ѡ��:\n");
	int choice = 0;
	scanf("%d", &choice);
	return choice;
}
void initialize(char arr[maxrow][maxlin], char art[maxrow][maxlin])//��ʼ������;
{

	for (int row = 0; row < maxrow;row++)
	{
		for (int lin = 0; lin < maxlin; lin++)
		{
			arr[row][lin] = '*';
			art[row][lin] = '0';
		}
	}
	srand((unsigned int)time(NULL));//�������
	int i=maxcount;
	while (i>0){
		int row=rand() %maxrow;
		int lin=rand() % maxlin ;
		if (art[row][lin]=='1'){
			continue;
		}
		art[row][lin] = '1';
		i--;
	}
}
paint(char arr[maxrow][maxlin])//��ӡ����
{
	int i = 0;
	printf(" ");
	for (i = 0; i < maxrow; i++)
	{
		printf("  %d", i);
	}
	printf("\n");
	for (int row = 0, j=0; row < maxrow,j<maxrow; row++,j++)
	{
		printf("%d  ", j);
		for (int lin = 0; lin < maxlin; lin++)
		{
			printf("%c  ", arr[row][lin]);
		}
		printf("\n");
	}
}
void palyermine(char arr[maxrow][maxlin], char art[maxrow][maxlin], int* row, int* lin)
{
	while (1){
		printf("��������Ҫɨ������:");

		scanf("%d %d",row,lin);
		if (*row >= maxrow || *row < 0
			|| *lin >= maxlin || *lin < 0){
			printf("�����������!\n");
			continue;
		}
		if (arr[*row][*lin] != '*')
		{
			printf("��λ���Ѿ�������!");
			continue;
		}
		break;
	}
}
void update(char arr[maxrow][maxlin], char art[maxrow][maxlin],
		int row, int lin)//�ж���Χ������
	{
		int counts=0;
		for (int r = row - 1; r <= row + 1; r++)
		{
			for (int c = lin - 1; c <= lin + 1; c++)
			{
				if (r < 0 || r >= maxrow || c < 0 || c >= maxlin)
				{
					continue;
				}
				if (art[r][c] == '1'){
					counts++;
				}
			}
		}//����countsת���ַ�
		arr[row][lin] = counts + '0';
		return counts;
	}
	void game()
	{
		char arr[maxrow][maxlin];
		char art[maxrow][maxlin];
		initialize(arr, art);//��ʼ������;
		while (1){
			paint(arr);//��ӡ����;
			int row = 0, lin = 0, count = 1;
			palyermine(arr, art, &row, &lin);//�������Ҫ�µ�����;
			if (art[row][lin] == '1')//�жϸõط��������Ƿ�����;
			{
				paint(arr);
				printf("��ȵ�����,�е��!!!");
				break;
			}
			count++;
			if (count == maxrow*maxlin - maxcount)
			{
				paint(arr);
				printf("��Ϸʤ��!\n");
				break;
			}
			update(arr, art, row, lin);//�ж���Χ������
			//updown(arr, art, row, lin);//�ƿ���Χ�հ׸���
		}
	}
 int main()
	{
		while (1){
			int choice = interface();//��ʼ����;
			if (choice == 1){
				game();
				break;
			}
			else if (choice == 0){
				printf("gameover!!\n");
				break;
			}
			else{
				printf("�����������!!!\n");
			}
		}
		system("pause");
		return 0;
	}