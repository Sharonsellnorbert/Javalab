#include<stdio.h>
void main(){
int rt[50],bt[50],wt[50],tat[50],tq,l,proc[50],f=0,tot=0,tot_tat=0,tot_wt=0;
printf("Enter the number of Processes\n");
scanf("%d",&l);
printf("Enter the Time Quantum");
scanf("%d",&tq);
for(int i=0;i<l;i++){
printf("Enter the process Name and the Burst Time\n");
scanf("%d",&proc[i]);
scanf("%d",&bt[i]);
rt[i]=bt[i];
}
while(f!=l){
for(int i=0;i<l;i++){
if(rt[i]>tq){
tot=tot+tq;
rt[i]=rt[i]-tq;
}
else if(rt[i]==0){
continue;
}
else{
tot=tot+rt[i];
rt[i]=0;
tat[i]=tot;
wt[i]=tot-bt[i];
f++;
}
}
}
printf("PROCESS\tBurst Time\tWaiting Time\tTurn Around Time\n");
for(int i=0;i<l;i++){
printf("%d\t%d\t\t%d\t\t%d\n",proc[i],bt[i],wt[i],tat[i]);
tot_wt=tot_wt+wt[i];
tot_tat=tot_tat+tat[i];
}
printf("Average Waiting Time is %f\n",(float)tot_wt/(float)l);
printf("Average Turn Around Time is %f\n",(float)tot_tat/(float)l);
}




















































































                                                



