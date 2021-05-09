#include <iostream>

using namespace std;

class Dog {
private:
	string dogName;
	string dogBreed;
	int dogAge;

	void init(string name, string breed, int age) {
		dogName = name;
		dogBreed = breed;
		dogAge = age;
	}

public:
	void getName() {
		cout << "The dogs name is" + dogName << endl;
	}

	void getBreed() {
		cout << "The dogs breed is" + dogBreed << endl;
	}

	int getAge() {
		return dogAge;
	}

	void bark() {
		cout << "WAFFFFF!";
	}
};
