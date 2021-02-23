# ICSI-213-Project1
Code creates an empty bag and populates the bag with items from a .txt file. Then the array can be manipulated.

The problems I am running into is whenever I input the items from the text file they dont read into an array. I am trying to get a get method setup to return a value at a given index and the program is not returning anything. I cannot figure out how to create one array and then implement the items from the file into the array to then manipulate the array using other methods.

When trying to read the data from the .txt file with a while loop and inserting the data into the array the array is not being populated with the items from the file. When I print out the input it is only printing the indexes rather than the items that should be at those indexes.

My main question is how do I properly insert the data from the file to the array that I initialized in the constructor method.

Another question I have is how do I use that one array from the constuctor method across all the methods in the class without having to make a new array for each element. I also can't pass the array into the method as a parameter it has to be able to be used by doing for example list.get(index I) to be able to pull that object.
