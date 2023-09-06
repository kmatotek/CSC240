[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-718a45dd9cf7e7f842a935f5ebbe5719a5e09af4491e668f4dbf3b35d5cca122.svg)](https://classroom.github.com/online_ide?assignment_repo_id=11646174&assignment_repo_type=AssignmentRepo)
# Homework 0 - Testing

[![Points badge](../../blob/badges/.github/badges/points.svg)](../../actions)

This is a simple assignment to make sure that GitHub classroom is working for you, and so that you can familiarize yourself with autograding.
## Table of contents:
   - [Part 1 looking at feedback](#part-1-looking-at-feedback)
   - [Part 2 making the test work](#part-2-making-the-test-work)
   - [Part 3 reading the script](#part-3-reading-the-test-script)
   - [Part 4 adding a test])#[part-4-adding a test]
   - [Part 5 making test 2 work](#part-5-making-test-2-work)
   


## Part 1 looking at feedback

1. ***Just Read*** all steps of part 1 **before** *doing* 2.
2. Click the icon/badge above that says "Points 0/1"
3. Click the top workflow run.
4. Click the box that says "Autograding" inside.
5. Click "Run WCU-CS-CooperLab/autofeedback-s@v1.0"
6. You should see the output of the one test called Hello.
   - the beginning of the test should have Hello in blue
   - the end of the test will have failed - Hello and then an error message saying what was expected and what was acthual
   - `%0A` is a symbol for a newline or a carriage return, so you can just think of it as blank space.
     
## Part 2 making the test work

- Step 1: Edit the file called [HomeworkZero.java](HomeworkZero.java)
- Step 2: Add the code `System.out.println("Hello, GitHub!");` to the main method.
- Step 3: Commit the code with a message "fixed the output"

When the steps are complete, the points badge above should say 1/1.

- Step 4: review the autograding workflow for your latest commit.


## Part 3 reading the test script

All of the homework assignments will have test cases that are like the one you just explored.
The file for this assignment, [autograding.json](.github/classroom/autograding.json) looks like this:

```json
{
  "tests": [
    {
      "name": "Hello",
      "setup": "javac HomeworkZero.java",
      "run": "java HomeworkZero",
      "input": "",
      "output": "Hello, GitHub!",
      "comparison": "included",
      "timeout": 10,
      "points": 1
    }
  ]
}
```


There are 8 parts of a test:

1. **name:**  the name of the test (it should be unique from all other names in this file.
2. **setup:** this is the command that is run before running the program. In our case, we are compiling the file to be run.
3. **run:** this is the command that is run to run the program
4. **input:** this is a string that is sent to standard input (this can be accessed from a `new Scanner(System.in)`
5. **output:** this is a string (or pattern) that is expected as output to stdout from the program.
6. **comparison:** this is how the expected value from above is compared to the output. *included* means that the expected text can be anywhere in the output, and an exact match including case is expected; *regex* means that the expected text is a regular expression that must be matched at least once in the output from the program; *exact* means that the output has to exactly match the output from the program.
7. **timeout:** this is the time in seconds that the test will wait before it cancels the test and the test fails.
8. **points:** this is the number of points designated for the test. All points are set to 1 for each test, so the number will just inform you how many tests passed.

In the next Part we'll add a new test and then write code to pass the test.

## Part 4 adding a test

Open the [autograding.json](.github/classroom/autograding.json) file. Click the pencil to edit it.

Then you'll need to add a comma after the inner `}` before the `]`.  
Then add a newline.

The bottom of your file should look like this before:

```
      "points": 1
    }
  ]
}
```

and this after:

```
      "points": 1
    },
    
  ]
}
```


Then you'll copy the below code and place it on the newline:

```json
    {
      "name": "Test 2",
      "setup": "javac Pass.java",
      "run": "java Pass",
      "input": "",
      "output": "passes",
      "comparison": "included",
      "timeout": 10,
      "points": 1
    }
```

The bottom of the file should start like this before:

```
      "points": 1
    },
    
  ]
}
```

and look like this after:

```
      "points": 1
    },
    {
      "name": "Test 2",
      "setup": "javac Pass.java",
      "run": "java Pass",
      "input": "",
      "output": "passes",
      "comparison": "included",
      "timeout": 10,
      "points": 1
    }
  ]
}
```

## Part 5 making test 2 work

- Step 1: Make a new file called [Pass.java](Pass.java)
- Step 2: Make a class called pass with a main method that includes the code `System.out.println("The duck passes the boat in the ocean!");` 
- Step 3: Commit the code with a message "first"

When the steps are complete, the points badge above should say 2/2.

- Step 4: review the autograding workflow for your latest commit.
