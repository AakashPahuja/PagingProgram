# PagingProgram
You may either use the on-campus server, or the following free online Linux terminal, which is very convenient: http://www.webminal.org/
[Note: The only differences in this terminal is that we need to use the nano editor (such as: nano myscript.sh, and to run scripts, we use the bash command, such as: bash myscript.sh]
(1) Check which shell we are using:
echo $SHELL

(2) Create and run a simple script.
Using the nano editor to create a file:
nano myscript.sh

Sample code:
#!/bin/sh
echo "Today is: " `date`

Change permissions for file
chmod 755 myscript.sh

Run script
bash myscript.sh

(3) Create a script that will input 3 positional (command-line) arguments from the user that indicates a mathematical operation (add, sub, mult, div, mod) and two values, runs the calculation, and displays the result. If the user enters an incorrect operation, an error message should be displayed. Sample interaction could be:
bash calc.sh mod 12 10
Result: 2
(4) Write a script that will accept file names as input and your script should only display the files with a .html extension. 

(5) Write a script that will accept a file name as input and your script will display the word count and line count for that file.
