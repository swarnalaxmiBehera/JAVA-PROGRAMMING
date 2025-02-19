# include<stdio.h>
int main(){
    int num=1;
    while (num<=1000){
        printf("\n%d",num);
        num=num*2+1;
    }


    int first_term=5;
    int diff=1;
    int term=first_term;
    int n=10;
    for(int i=2;i<=n;i++){
        term+=diff;
        diff+=2;
    }
    printf("\n\n\ntenth term=%d",term);
    return 0;
}