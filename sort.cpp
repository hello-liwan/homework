#include<iostream>
#include<algorithm>
using namespace std;
struct score {
	char name[20];
	double chinese, english;
	bool operator<(const score& a)
		const {
		return chinese>a.chinese;
	}
};
struct score stu[3];
int main()
{
	for (int i = 0; i < 3; i++)
	{
		cin >> stu[i].name >> stu[i].chinese >> stu[i].english;
	}
	sort(stu, stu + 3);
	for (int i = 0; i < 3; i++)
	{
		cout<< stu[i].name << stu[i].chinese << stu[i].english << endl;
	}
	return 0;
}
