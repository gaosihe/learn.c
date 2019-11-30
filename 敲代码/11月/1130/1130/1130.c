#define _CRT_SECURE_NO_WARNINGS//������
#include<stdio.h>
#include<stdlib.h>
#include<time.h>
#include<string.h>
#define maxrow 3
#define  maxlin 3
int interface()	//��ʼ����
{
	printf("��ӭ������������Ϸ\n");
	printf("===============\n");
	printf("1.��ʼ��Ϸ\n");
	printf("0.������Ϸ\n");
	printf("===============\n");
	printf("���������ѡ��:\n");
}
char arr[maxrow][maxlin];
void checkerboard()//��ʼ������
{
	for (int row = 0; row < maxrow;row++)
	{
		for (int lin = 0; lin < maxlin;lin++)
		{
		  arr[row][lin] = ' ';
		}
	}
}
void print()//��ӡ����
{
	printf("\n+---+---+---+\n");
	for (int row = 0; row < maxrow; row++)
	{
		for (int lin = 0; lin < maxlin; lin++)
		{
			printf("|  %c", arr[row][lin]);
		}printf("| ");
		printf("\n+---+---+---+\n");
	}
}
//{
//	for (int row = 0; row < maxrow; row++){
//		printf("| %c | %c | %c |\n", arr[row][0], arr[row][1], arr[row][2]);
//		if (row != maxrow- 1){
//			printf("|---|---|---|\n");
//		}
//	}
//}
void gamepalyer()//�������
{
	while (1){
		printf("�����������������:\n");
		int row = 0, lin = 0;
		scanf("%d %d", &row, &lin);
		if (row >= maxrow || row < 0 || lin >= maxlin || lin < 0)
		{
			printf("�����������!\n");
			continue;
		}
	    if (arr[row][lin]  != ' '){
			printf("������ĵط�����!\n");
			continue;
		}
		arr[row][lin] = 'x';
		break;		
	}
}
void computer()//��������
{
	while (1)
	{
		int row = rand() % maxrow;
		int lin = rand() % maxlin;
			if (arr[row][lin] != ' '){
				continue;
			}
				arr[row][lin] = 'o';
			break;
		}
}	
int judge()//�ж���Ϸ�Ƿ����
{
	for (int row = 0; row < maxrow;row++)
	{
		for (int lin = 0; lin < maxlin;lin++)
		{if (arr[row][lin]==' ')
		{
			return 0;
		}
		}
	}
	return 1;
}
//����'x'Ϊ��ʤ��
//����'o'Ϊ����ʤ��
//����'q'Ϊ�;�
//����' '������Ϸ
char CheckGameOver()//�ж�ʤ��
{
	for (int row = 0; row < maxrow; row++)
	{
		if (arr[row][0] == arr[row][1] && arr[row][0] == arr[row][2])
		{
			return arr[row][0];
		}
	}
	for (int lin = 0; lin < maxlin; lin++)
	{
		if (arr[0][lin] == arr[1][lin] && arr[0][lin] == arr[2][lin])
		{
			return arr[0][lin];
		}
	}
	if (arr[0][0]==arr[1][1]&&arr[0][0]==arr[2][2])
	{
		return arr[0][0];
	}
	if (arr[2][0] == arr[1][1] && arr[2][0] == arr[0][2])
	{
		return arr[2][0];
	}
	if (judge())
	{
		return 'q';
	}
	return ' ';
}
void game()
{
	char winner = ' ';
	checkerboard();
	//��ʼ��������������
	while (1){
		system("cls");
		print();
		gamepalyer();//������� �ж���Ϸ�Ƿ����
		winner = CheckGameOver();
		if (winner != ' ')
		{
			break;
		}
		computer();//�������� �ж���Ϸ�Ƿ����
		winner = CheckGameOver();
		if (winner != ' ')
		{
			break;
		}
	}
		if (winner=='x')
		{
			system("cls");
			printf("��ϲ��Ӯ��һ���˼�!\n");
			print();
		}
		else if (winner=='o')
		{
			printf("��Ȳ˼�����,��Ȼ����!\n");
			print();
		}
		else if (winner=='q')
		{
			printf("��Ͳ˼�һ����,��ƽ��\n");
			print();
		}
		else{
			printf("����bug,�Ͻ���!!!");
		}
}
int main()
{
	srand((unsigned int)time(0));//�������
	while (1){
		interface();
		int choice = 0;
		scanf("%d", &choice);
	   
		if (choice == 1)
		{
			game();
		}
		else if (choice == 0){
			printf("��Ϸ����!!!\n");
			break;
		}
		else{
			printf("���Ұ��ǿ�ʼ���˵�Ŷ\n");
		}
	}
		system("pause");
		return 0;	
}
