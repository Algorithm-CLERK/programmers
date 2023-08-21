#include <vector>
#include <iostream>
using namespace std;

//�迭�� ���ڰ����� ����Ƚ�� ���
int numMap[200000];

//���Ϳ� Number����ü(���ڰ�, ����Ƚ��)�� Ű&��� ���·� �ľ��� �� �ֵ��� ����
struct Number {
    int id;
    int cnt;
};
vector<Number>numbers;

int solution(vector<int> nums)
{
    //���ڵ��� �� ���� ���� ������ 1 ����
    for (int i = 0; i < nums.size(); i++) {
        numMap[nums[i]]++;
    }
    //��ü ������ �� �ִ� ���ڵ� �߿��� 1�� �̻� ������ ��� numbers�� Ű&��� ���·� ���
    for (int i = 0; i < 200001; i++) {
        if (numMap[i] != 0) {
            numbers.push_back({ i,numMap[i] });
        }

    }

    int answer;

    //������ ���ڵ��� ������ ��������/2���� ũ�ų� ���� ��� ���� ������ŭ �ִٰ� �� �� ������ ���� ��쿡�� ������ ���ڵ��� �� ���� ��� �̰� ����Ǵ� �༮�� ����
    if (numbers.size() >= nums.size() / 2) {
        answer = nums.size() / 2;
    }
    else {
        answer = numbers.size();
    }

    return answer;
}