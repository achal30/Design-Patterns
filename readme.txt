
Assuming you are in the directory containing this README:

## To clean:
ant -buildfile src/build.xml clean

-----------------------------------------------------------------------
## To compile: 
ant -buildfile src/build.xml all

-----------------------------------------------------------------------
## To run by specifying arguments from command line 
## We will use this to run your code
ant -buildfile src/build.xml run -Darg0=firstarg -Darg1=SECOND -Darg2=THIRD
For example:
ant -buildfile src/build.xml run -Darg0=/import/linux/home1/apatel58/cs542/achal_patel_assign_1/myArrayList/input.txt -Darg1=/import/linux/home1/apatel58/cs542/achal_patel_assign_1/myArrayList/output.txt

-----------------------------------------------------------------------

I have used array as data structure to make new data structure myArrayList.
The time complexity of the array for accessing any element is Big Oh O(1) as with the index u can directly get the element.
The time complexity of the array to insert sort or delete any element is Big Oh O(n) for n elements in array.
The worst case space complexity is O(n).
