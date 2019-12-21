#include<stdio.h>
#include<malloc.h>
struct student
{
	char name[10];
	struct student* next;
};
struct student* Input();
void Output(struct student* );
void Insert(struct student* );
void Delete(struct student*);
int main()
{
	struct student* tpr;
	tpr = Input();
	printf("\n**************************\n");
	printf("录入的学生信息\n");
	Output(tpr);
	printf("\n**************************\n");
	Insert(tpr);
	printf("\n**************************\n");
	printf("插入后的学生信息\n");
	Output(tpr);
	printf("\n**************************\n");
	Delete(tpr);
	printf("\n**************************\n");
	printf("删除后的学生信息\n");
	Output(tpr);
	return 0;
}
struct student* Input()
{
	struct student* hand, * end, * temp;
	char choice;
	hand = (struct student*)malloc(sizeof(struct student));
	end = hand;
	do
	{
		temp = (struct student*)malloc(sizeof(struct student));
		printf("请输入学生的姓名：");
		scanf("%s", temp->name);
		getchar();
		end->next = temp;
		end = temp;
		printf("是否继续输入");
		choice = getchar();
	} while (choice == 'Y');
	end->next = NULL;
	return hand;
}
void Output(struct student* tpr)
{
	do
	{
		tpr = tpr->next;
		printf("%s\n", tpr->name);

	} while (tpr->next);
}
void Insert(struct student* hand)
{
	int position;
	struct student* end, * insert;	
	insert = (struct student*)malloc(sizeof(struct student));
	printf("请输入插入学生的姓名");
	scanf("%s",insert->name);
	printf("请输入插入的位置");
	scanf("%d", &position); 
	end = hand;
	while (position > 1)
	{
		end = end->next;
		position--;
	}
	insert->next = end->next;
	end->next = insert;
}
void Delete(struct student* hand)
{
	int choice;
	struct student* delete, * temp;
	delete = hand;
	printf("请输入删除学生信息的位置");
	scanf("%d", &choice);
	while (choice > 1)
	{
		delete = delete->next;
		choice--;
	}
	temp = delete->next;
	delete->next = delete->next->next;
	free(temp);
}







