#include<iostream>
#include<vector>
#include<algorithm>
#include<iomanip>
using namespace std;
int main()
{
	vector<double> number={12,54,2,84,1,154,65};
	vector<double>::iterator it;
	number.push_back(20);
	sort(number.begin(), number.end());
	for (int i = 0; i < number.size(); i++)
	{
		cout << left << setw(8) << number[i];
	}
	cout << endl;
	reverse(number.begin(), number.end());
	number.pop_back();
	for (it = number.begin(); it != number.end(); ++it)
	{
		cout << left << setw(8) << *it;
	}
	cout << endl;
	//另一只遍历
	for (double & i : number) {
		cout << i;
	}
	return 0;
}
