#include <vector>
#include <iostream>
using namespace std;

//배열에 숫자값들의 등장횟수 기록
int numMap[200000];

//벡터에 Number구조체(숫자값, 등장횟수)를 키&밸류 형태로 파악할 수 있도록 저장
struct Number {
    int id;
    int cnt;
};
vector<Number>numbers;

int solution(vector<int> nums)
{
    //숫자들이 몇 번씩 나올 때마다 1 증가
    for (int i = 0; i < nums.size(); i++) {
        numMap[nums[i]]++;
    }
    //전체 등장할 수 있는 숫자들 중에서 1번 이상 등장한 경우 numbers에 키&밸류 형태로 기록
    for (int i = 0; i < 200001; i++) {
        if (numMap[i] != 0) {
            numbers.push_back({ i,numMap[i] });
        }

    }

    int answer;

    //등장한 숫자들이 제공된 숫자조합/2보다 크거나 같은 경우 뽑을 개수만큼 있다고 할 수 있지만 작은 경우에는 등장한 숫자들을 한 번씩 모두 뽑고 재사용되는 녀석이 존재
    if (numbers.size() >= nums.size() / 2) {
        answer = nums.size() / 2;
    }
    else {
        answer = numbers.size();
    }

    return answer;
}