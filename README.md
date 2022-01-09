# TO DO

1. A window to select the program that will be executed. You can display the  
   list of possible programs as a ListView. Each item of the ListView is the string  
   representation of a possible program (IStmt).

2. The main window that displays the following information:

a. the number of PrgStates as a TextField

b. the HeapTable as a TableView with two columns: address and Value

c. the Out as a ListView

d. the FileTable as a ListView

e. the list of PrgState identifiers as a ListView

f. a Table View with two columns: variable name and Value, which displays the  
SymTable of the PrgState whose ID has been selected from the list described
at `e.`

g. a List View which displays the ExeStack of the PrgState whose ID has been  
selected from the list described at `e.` First element of the ListView is  
a string represenatation of the top of ExeStack, the second element of the  
ListView represents the second element from the ExeStack and so on.

h. A button "Run one step" that runs oneStepForAllPrg (you have to design and  
implement the handler of this button based on the previous method allStep  
After each run the displayed information is updated. You may want to write a  
service which wraps the repository and signals any change of the list of  
PrgStates.


# Requirements

You must extend the JAVA project from the assignment A6. Please implement in  
JavaFX a GUI for your interpreter from the assignment A6. The GUI must support  
the following
operations:
1. A window to select the program that will be executed. You can display the  
   list of possible programs as a ListView. Each item of the ListView is the string  
   representation of a possible program (IStmt).

2. The main window that displays the following information:

a. the number of PrgStates as a TextField

b. the HeapTable as a TableView with two columns: address and Value

c. the Out as a ListView

d. the FileTable as a ListView

e. the list of PrgState identifiers as a ListView

f. a Table View with two columns: variable name and Value, which displays the  
SymTable of the PrgState whose ID has been selected from the list described
at `e.`

g. a List View which displays the ExeStack of the PrgState whose ID has been  
selected from the list described at `e.` First element of the ListView is  
a string represenatation of the top of ExeStack, the second element of the  
ListView represents the second element from the ExeStack and so on.

h. A button "Run one step" that runs oneStepForAllPrg (you have to design and  
implement the handler of this button based on the previous method allStep  
After each run the displayed information is updated. You may want to write a  
service which wraps the repository and signals any change of the list of  
PrgStates.