#include<iostream>

using namespace std;

struct node{
    int data;
    node *next;
};

node* insert_data(int data, node *start){

        if(start == NULL){

            start = new node;
            start->data  = data;
            start->next = NULL;
        } else{

            node *new_node = new node;
            new_node->data  = data;
            new_node ->next = start;
            start = new_node;
        }

        return start;
    }

void traverse_list(node *start){

    if(start == NULL){
        cout<<"list is empty";
    } else{
        node *new_node = new node;
        new_node = start;

        while(new_node != NULL){
            cout<<new_node->data<<"<-";
            new_node = new_node->next;

            }

        }

    }

void merge_list (node *list1, node *list2){

node *temp1 = NULL, *temp2 = NULL;


while(list1 != NULL){

  temp2 = list2;

  while(1){


        if((list1 -> data < temp2 -> data) && (temp2 == list2)){

           cout<<"case:1\n";
           temp1 = list1;
           list1 = list1 -> next;
           temp1 -> next = temp2;
           list2 = temp1;
           break;


        } else if((list1 -> data >= temp2 -> data) && (temp2 -> next == NULL)){

              cout<<"case 3\n";
              temp1 = list1;
              list1 = list1 -> next;
              temp2 -> next = temp1;
              temp2 = temp1;
              temp2 -> next = NULL;
              break;

            } else if((list1 -> data >= temp2 -> data) &&(list1 -> data < temp2 -> next -> data )){

                    cout<<"case:2\n";
                    temp1 = list1;
                    list1 = list1 -> next;
                    temp1 -> next = temp2 -> next;
                    temp2 -> next = temp1;
                    break;

                  } else temp2 = temp2 -> next;


      }

}

  cout<<"After merging two sorted linked lists\n";
  traverse_list(list2);

}


int main(){

    int ch, data;
    //list1 is the head node of linked list 1
    //list2 is the head node of linked list 2
    node *list1 = NULL, *list2 = NULL;

    while(1){
        cout<<"\nenter your choice\n";
        cout<<"1.insert data into 1st linked list\n";
        cout<<"2.insert data into 2nd linked list\n";
        cout<<"3.traverse 1st linked list\n";
        cout<<"4.traverse 2nd linked list\n";
        cout<<"5.merge two sorted linked lists\n";
        cout<<"6.exit\n";

        cin>>ch;

        switch(ch){
            case 1: cout<<"enter the value to be inserted in list 1\n";
                    cin>>data;
                    list1 = insert_data(data, list1);
                    break;

            case 2: cout<<"enter the value to be inserted in list 2\n";
                    cin>>data;
                    list2 = insert_data(data, list2);
                    break;

            case 3: cout<<"traverse 1st list\n";
                    traverse_list(list1);
                    break;


            case 4: cout<<"traverse 2st list\n";
                    traverse_list(list2);
                    break;

            case 5: merge_list(list1, list2);
                    break;

            case 6: exit(0);


            default: cout<<"wrong choice";


        }
    }

}
