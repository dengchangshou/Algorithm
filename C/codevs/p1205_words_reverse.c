#include <stdio.h>
#include <string.h>
int main(){
	char s[200];
	scanf("%[^\n]", s);
	int i;
	for(i = strlen(s) - 1; i >= 0; i--){
		if(s[i] == ' ' || i == 0){
			int j = i;
			if(i != 0) j++;
			while(s[j] != ' ' && s[j] != '\0'){
				printf("%c", s[j]);
				j++;
			}
			if(i != 0) printf(" ");			
		}
	}
	return 0;
}