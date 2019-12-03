#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#include<time.h>
#define maxrow 9
#define maxlin 9
#define maxcount 10
int interface()
{
	printf("          ======================\n");//开始界面;
	printf("           欢迎来到扫雷游戏!!!\n");
	printf("           1.game paly!\n");
	printf("           0.game over!\n");
	printf("          ======================\n");
	printf("           选择你的选项:\n");
	int choice = 0;
	scanf("%d", &choice);
	return choice;
}
void initialize(char arr[maxrow][maxlin], char art[maxrow][maxlin])//初始化棋盘;
{

	for (int row = 0; row < maxrow;row++)
	{
		for (int lin = 0; lin < maxlin; lin++)
		{
			arr[row][lin] = '*';
			art[row][lin] = '0';
		}
	}
	srand((unsigned int)time(NULL));//随机种子
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
paint(char arr[maxrow][maxlin])//打印棋盘
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
		printf("请输入你要扫的坐标:");

		scanf("%d %d",row,lin);
		if (*row >= maxrow || *row < 0
			|| *lin >= maxlin || *lin < 0){
			printf("你的输入有误!\n");
			continue;
		}
		if (arr[*row][*lin] != '*')
		{
			printf("此位置已经翻开了!");
			continue;
		}
		break;
	}
}
void update(char arr[maxrow][maxlin], char art[maxrow][maxlin],
		int row, int lin)//判断周围几个雷
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
		}//整数counts转成字符
		arr[row][lin] = counts + '0';
		return counts;
	}
	void game()
	{
		char arr[maxrow][maxlin];
		char art[maxrow][maxlin];
		initialize(arr, art);//初始化棋盘;
		while (1){
			paint(arr);//打印棋盘;
			int row = 0, lin = 0, count = 1;
			palyermine(arr, art, &row, &lin);//玩家输入要下的坐标;
			if (art[row][lin] == '1')//判断该地方地雷数是否有雷;
			{
				paint(arr);
				printf("你踩到雷了,有点菜!!!");
				break;
			}
			count++;
			if (count == maxrow*maxlin - maxcount)
			{
				paint(arr);
				printf("游戏胜利!\n");
				break;
			}
			update(arr, art, row, lin);//判断周围几个雷
			//updown(arr, art, row, lin);//掀开周围空白格子
		}
	}
 int main()
	{
		while (1){
			int choice = interface();//开始界面;
			if (choice == 1){
				game();
				break;
			}
			else if (choice == 0){
				printf("gameover!!\n");
				break;
			}
			else{
				printf("你的输入有误!!!\n");
			}
		}
		system("pause");
		return 0;
	}