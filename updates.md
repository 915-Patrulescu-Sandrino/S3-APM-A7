DATE\_FORMAT=`YYYY.MM.DD [~]HH:MM[:SS]

# A? changes
## DATE\_FORMAT
1. feature 1
- step 1
- step 2
2. feature 2
...


# A7 changes
## 2022.01.11 23:02
1. moved logs from Interpreter.java to `updates.md`
2. removed comments of old main() from Interpreter.java
3. Added a way to keep track of the original Statement of the latest ProgramState set to a Repository instance
- add: void IRepository.setNewProgram(ProgramState)
- add: IStatement IRepository.getLatestOriginalStatement()
    - add: private IStatement Repository.latestOriginalStatement
    - add: public void Repository.setNewProgram(ProgramState)
    - add: public IStatement Repository.getLatestOriginalStatement()
- add: public void Interpreter.setNewProgram(IStatement)
4. ProgramSelectionController
- changed: private ListView<IStatement> programsListListView to private ListView<Interpreter> interpretersListView
- add: private void interpretersSetUp() to prepare the interpretors for initialize()
- call interpreterSetUp() inside initialize() in order to set them up
- replace `public void handleLoadButtonAction(ActionEvent)` with calling setOnAction() on LoadButton inside initialize()
- 

...

## 2022.01.11 23:02 (update the date) 
1. run-time erros after finishing ProgramSelectionController
- the selection mode the the intepretersListView was set before adding the interpreters to the ListView
- in the interpretersSetUp() the interpreters were being added to the local interpretersList, but not to the
interpretersList of the class's (ProgramSelectionController) instance field
- almost the same thing as above, but for the repository and with the difference that now I was only adding them to the instance's
field, which wasn't initialized, so NullPointerException (i'm sooo dumb)
- i'm not "sooo dumb", i'm "Dumb Dumb", the instance's fields for the repository and interpreter list are still not initialized, thus
null
- "Cannot invoke "javafx.scene.control.ListView.setItems(javafx.collections.ObservableList)" because "this.interpreterListView" is null; at view.ProgramSelectionController.initialize(ProgramSelectionController.java:79)" - the name of the ListView inside the class didn't match with the one in the .fxml file
2. other noticed problems:
- the ListView of interpreters shows addreses to Interpreter instance, since no toString function exists for this class, but I figuredout earlier that that would happen so I dealt with it, I just need to uncomment the toString() for the Interpreter class



# A5 changes:
## 2021.11.22 21:15
      - added ProgramState.prettyPrintFunctional(String, String), but it prints the outList first
      - added a RunMultipleCommand whose constructor receives as arguments a map of commands
      - added GarbageCollector.getAddressesFromSymbolTable(Collection<Value>, IHeap<Integer, Value>) which goes in depth for every RefValue found in the SymbolTable



# A4 changes:
## 2021.11.16 ~23:54
      - clearing the log file is now done inside the program, in the logProgramState method from repository
      - CompoundStatement.toString no longer prints brackets "()



# A3 changes:
## 2021.11.13 ~01:20:00
      Fixed:
      - referencing null pointer inside readFileStatement.execute() by checking the result of BufferedReader.nextLine()

 2021.11.13 01:23:00
      Fixed:
      - improper logProgramStatement Handling for right interpreter arguments (added break; in the switch for passing arguments)


