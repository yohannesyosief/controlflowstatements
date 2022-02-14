package LinkedListJavaTPoint;
//Linked List can be defined as a collection of objects called nodes that are randomly stored in the  memory
//A node contains two fieldsi.e data stored at that particular address and the pointer which contains the address of the next
//node in the memory
//the last node of the list contains pointer to the null

//uses of Linked List
//..The list is not required to be contiguously present in the memory.The node can reside any where in the memory and linked together
//to make alist.This achieves optimized utilization of space
//..list size is limited to the memory size and doesn't need to be declared in advance
//..Empty node can not be present in the linked list
//..We can store values of primitive types or objects in the singly linked list


//Why use linked list over array
//till now,we were using array data structure to organize the group of elements that are to be stored individually in the memory.
//However,Array has a several advantages and disadvantages which must be known in order to decide the data structure which
//will be used throughout the program

//Arrays contains following limitations
//1.The size must be known in advance before using in the program.
//2.Increasing size of the array is a time taking process.it is almost impossible to expand the size of the array at run time.
//3.All the elements in the array need to be contiguously stored in the memory.inserting any element in the array needs
//shifting of all its predecessors
//Linked list is the data structure which can overcome all the limitations of an array.

//Using linked list is  useful because
//1,It allocates the memory dynamically .All the nodes of linked are non-contiguously stored in the memory and linked together 
//with the help of pointers.
//2.Sizing is no longer  problem since we do not need to define its size at the time of declaration.
//List grows as per the program demand and limited to the available memory space.


//Singly linked list or One way chain
//Singly linked list can be defined as the collection of ordered set of elements.The number of elements may vary according to 
//need of the program.A node in the singly linked list consists of two parts:data part and linked part.data part of the node
//stores actual information that is  to be represented by the node while, the link part of the node stores the address of its 
//immediate successor.

//One way chain or singly linked list can be traversed only in one direction.in other words,we can say that each node contains 
//only next pointer.there we can not traverse the list in the reverse direction.

//Consider an example where the marks obtained by the student in three subjects are stored in the linked list as shown in the figure
//in the above figure,the arrow represents the links.The data part of every node contains the marks obtained by the student in the
//different subject.The last node in the list is identified by the null pointer which is present in the address part of the last node.
//We can have as many elements we  require,in the data part of the list.

//Operation On Singly Linked List
//The are various operations which can be performed on singly linked list.A list of all such operations is given below

//Node Creation
//struct node
// {
// int data;
// struct node*next;
//};
//struct node*head,*ptr;
//ptr=(struct node*)malloc(sizeof(struct node*));

//Insertion
//the insertion into a singly linked list can be performed at different positions.Based on the position of the new node being
//inserted,the insertion is categorized into following categories.
//1.Insertion at beginning--It involves inserting any element at the front of the list.We just need to a few link adjustments to 
//make the new node as the head of the list
//2.Insertion at end of the list--It involves insertion at the last of the linked list.The new node can be inserted as the only
//node in the list or it can be inserted as the last one.different logics are implemented in each scenario
//3.Insertion after specified node--It involves insertion after the specified node of the linked list.We need to skip the desired 
//number of nodes after which the new mode will be inserted.


//Deletion and Traversing
//The deletion of a node from a singly linked list can be performed at different positions.Based on the position of the node being 
//deleted,the operation is categorized into the following categories.
//1.Deletion at beginning--It involves deletion of a node from the beginning of the list.this is the simplest operation among 
//all.It just need a few adjustments in the node pointer
//2.Deletion at the end of the list--It involves deleting the last node of the list.The list can either be empty or full.
//Different logic is implemented for different scenarios.
//3.Deletion after specified node--It involves deleting the node after the specified node in the list.We need to skip the desired 
//number of nodes to reach the node after which the will be deleted.This requires traversing through the list.
//4.Traversing --In traversing,we simply visit each node of the list at least once in order to perform some specific operation on it,
//for example,printing data pat of each node present in the list.
//5.Searching--in searching,we match each elements of the list with the given element.If the element is found on any of the location 
//then location of tha elements is returned otherwise null is returned 

public class BasicConcepts {
	
}
