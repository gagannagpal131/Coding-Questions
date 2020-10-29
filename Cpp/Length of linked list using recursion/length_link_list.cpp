#include<iostream>

using namespace std;

struct node{
    int data;
    node *next;
};

class linked_list{

public:
    node *start;
    linked_list(){

        start = NULL;
    }

    void insert_data(int data){

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

        cout<<"\nlength is "<<length(start);


    }

    void traverse_list(){

    if(start == NULL){
        cout<<"list is empty";
    }else{
        node *new_node = new node;
        new_node = start;

        while(new_node != NULL){
            cout<<new_node->data<<"<-";
            new_node = new_node->next;

        }

    }

    }

    int length(node *temp){

      if (temp->next == NULL){
            return 1;

        } else {

                return (1 + length(temp->next));

        }

    }


};

int main(){

    linked_list ob;
    int ch, data;

    while(1){
        cout<<"\nenter your choice\n";
        cin>>ch;

        switch(ch){
            case 1: cout<<"enter the value to be inserted\n";
                    cin>>data;
                    ob.insert_data(data);
                    break;

            case 2: ob.traverse_list();
                    break;

            case 3: exit(0);
                    break;

            default: cout<<"wrong choice";


        }
    }
