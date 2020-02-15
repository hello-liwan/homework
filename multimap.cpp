#include<iostream>
#include<algorithm>
#include<map>
using namespace std;
struct student
{
	int ID;
	char name[20];
};
struct temp
{
	int score;
	student infor;
};
multimap<int, student> mp;
temp st;
int main()
{
	char temps[10];
	while (cin >> temps)
	{
		if (temps[0] == 'A')
		{
			cin >> st.infor.ID >> st.infor.name >> st.score;
			mp.insert(make_pair(st.score, st.infor));
		}
		else if (temps[0] == 'Q')
		{
			int scores;
			cin >> scores;
			multimap<int, student>::iterator p = mp.lower_bound(scores);
			if (p != mp.begin())
			{
				--p;
				multimap<int, student>::iterator it = p;
				int use_score = p->first, use_ID = p->second.ID;
				for (; p->first == use_score && p != mp.begin(); --p)
				{
					if (use_ID < p->second.ID)
					{
						use_ID = p->second.ID;
						it = p;
					}
				}
				cout << it->second.ID << " " << it->second.name << " " << it->first << endl;
			}
			else
				cout << "nobady";
		}
		else
			break;
	}	
	multimap<int, student>::iterator i;
	for(i=mp.begin();i!=mp.end();++i)
		cout << i->second.ID << " " << i->second.name << " " << i->first << endl;
	return 0;
}