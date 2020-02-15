#include<iostream>
#include<set>
using namespace std;
int main()
{
	cout << "set" << endl;
	set<int,greater<int>> temps = { 1,1,2,5,48,1,64,15 };
	set<int>::iterator i;
	temps.insert(1);
	pair<set<int>::iterator, bool> a = temps.insert(1);
	if (!a.second)
		cout << "插入失败" << endl;
	else
		cout << "插入成功" << endl;
	for (i = temps.begin(); i != temps.end(); ++i)
		cout << *i << " ";
	cout << endl;
















	cout  << endl << endl << endl << "multiset" << endl;
	multiset <int,greater<int>> temp = {1,2,3,4,3,4,2,3,1};
	temp.insert(100);
	temp.erase(2); 
	multiset<int>::iterator it;
	it=temp.find(1);
	if (it != temp.end())
		cout << *it << endl;
	cout << temp.size() << endl;
	for (it = temp.begin(); it != temp.end(); ++it)
		cout << *it<<" ";
	return 0;
}