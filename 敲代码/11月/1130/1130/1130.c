#define _CRT_SECURE_NO_WARNINGS//三子棋
#include<stdio.h>
#include<stdlib.h>
#include<time.h>
#include<string.h>
#define maxrow 3
#define  maxlin 3
int interface()	//开始界面
{
	printf("欢迎来到三子棋游戏\n");
	printf("===============\n");
	printf("1.开始游戏\n");
	printf("0.结束游戏\n");
	printf("===============\n");
	printf("请输入你的选择:\n");
}
char arr[maxrow][maxlin];
void checkerboard()//初始化棋盘
{
	for (int row = 0; row < maxrow;row++)
	{
		for (int lin = 0; lin < maxlin;lin++)
		{
		  arr[row][lin] = ' ';
		}
	}
}
void print()//打印棋盘
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
void gamepalyer()//玩家落子
{
	while (1){
		printf("请输入你的棋子坐标:\n");
		int row = 0, lin = 0;
		scanf("%d %d", &row, &lin);
		if (row >= maxrow || row < 0 || lin >= maxlin || lin < 0)
		{
			printf("你的输入有误!\n");
			continue;
		}
	    if (arr[row][lin]  != ' '){
			printf("你输入的地方有子!\n");
			continue;
		}
		arr[row][lin] = 'x';
		break;		
	}
}
void computer()//电脑落子
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
int judge()//判断游戏是否结束
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
//返回'x'为人胜利
//返回'o'为电脑胜利
//返回'q'为和局
//返回' '继续游戏
char CheckGameOver()//判断胜负
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
	//初始化三乘三的棋盘
	while (1){
		system("cls");
		print();
		gamepalyer();//玩家落子 判断游戏是否结束
		winner = CheckGameOver();
		if (winner != ' ')
		{
			break;
		}
		computer();//电脑落子 判断游戏是否结束
		winner = CheckGameOver();
		if (winner != ' ')
		{
			break;
		}
	}
		if (winner=='x')
		{
			system("cls");
			printf("恭喜你赢了一个菜鸡!\n");
			print();
		}
		else if (winner=='o')
		{
			printf("你比菜鸡还菜,竟然输了!\n");
			print();
		}
		else if (winner=='q')
		{
			printf("你和菜鸡一样菜,打平了\n");
			print();
		}
		else{
			printf("出现bug,赶紧跑!!!");
		}
}
int main()
{
	srand((unsigned int)time(0));//随机种子
	while (1){
		interface();
		int choice = 0;
		scanf("%d", &choice);
	   
		if (choice == 1)
		{
			game();
		}
		else if (choice == 0){
			printf("游戏结束!!!\n");
			break;
		}
		else{
			printf("你乱按是开始不了的哦\n");
		}
	}
		system("pause");
		return 0;	
}
