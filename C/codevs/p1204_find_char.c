#include <stdio.h>
int main(){
	char s1[100], s2[100];
	scanf("%s %s", &s1, &s2);
	int i = 0;
	while(1){
		int local = i;
		if(s1[i] != s2[0]){
			i++;
		}
		else{
			int j = 1;
			while(s2[j] != '\0'){
				i++;
				if(s1[i] == s2[j]) {
					j++;
					continue;
				}
				else break;
			}
			if(s2[j] == '\0'){
				printf("%d", local + 1);
				break;
			}
		}
	}
	return 0;
}