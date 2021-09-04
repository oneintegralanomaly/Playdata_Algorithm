#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{	
	int t = 0;
	int a = 0;
	int b = 0;
	int sum = 0;

	scanf("%d", &t);

	for (int i = 0; i < t; i++)
	{
		scanf("%d", &a);
		scanf("%d", &b);

		sum = a + b;

		printf("%d \n", sum);

	}

	return 0;
}