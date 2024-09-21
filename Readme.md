# Getting Started

## Links
* [Compiler Web Site](https://vyridian.github.io/vxlisp)
* [Compiler Repository](https://github.com/Vyridian/vxlisp)
* [Docs](https://github.com/Vyridian/vxlisp/tree/main/docs)

## Installation

1. Create a folder to hold vxlisp projects. (e.g. vxprojects)

2. Copy the [vxlisp](https://github.com/Vyridian/vxlisp) folder into it.

3. Copy this vxlisp-helloworld folder into it.

## Compile the code for JavaScript

1. Open a commnd prompt.

2. Change directories to the vxlisp-helloworld/batches folder.

3. Run the runbuildjs batch file.

## Examine your code

1. If you generated documentation, it will be in your {project}/build/doc folder. (e.g. vxlisp-helloworld/build/doc)

2. If you generated JavaScript, it will be in your {project}/build/js folder. (e.g. vxlisp-helloworld/build/js)

3. If you generated Java, it will be in your {project}/build/java folder. (e.g. vxlisp-helloworld/build/java)

4. If you generated C++, it will be in your {project}/build/cpp folder. (e.g. vxlisp-helloworld/build/cpp)

5. If you generated CSharp, it will be in your {project}/build/csharp folder. (e.g. vxlisp-helloworld/build/csharp)

6. If you generated Kotlin, it will be in your {project}/build/kotlin folder. (e.g. vxlisp-helloworld/build/kotlin)

## View Documentation or JavaScript Run or JavaScript test suite

1. Run the built in Webserver by opening a terminal and running the vxlisp-helloworld/batches/runwebserver batch file

2. Open http://localhost:8081/

* Docs - build/doc/doc.html
* JavaScript - public/runjs.html
* JavaScript Test - public/testjs.html

3. When you are done, return to the running terminal and press ctl-c to terminate the webserver.

## Run the Java Code

* Prerequisites - You must hava Java and Gradle installed.

* Open a terminal and change directories to vxlisp-helloworld/build/java.

* Test - If you want to run test suite:

1. At the command prompt run: ./runtest OR .gradlew test

* Run - If you want run a program set up by vxlisp:

2. At the command prompt run: ./runapp or .gradlew run
