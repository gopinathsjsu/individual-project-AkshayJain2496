# ShoppingCartJava

## CMPE 202 Individual Assignment
Name: Akshay  Jain <br/>
SJSU ID: 015260245

## Prerequisities to run the code <br/>

Install  Java, Maven and JDK  in your system and set the path variables appropriately.

## Steps to run the code

1. Clone the repository and navigate to the Inventory folder <br/>
2. Paste the "Input.csv" inside the Indiviual_project_202 folder
3. Run the command - mvn compile <br/>
4. Run the command - mvn clean install <br/>
5. Run the command - mvn -X clean install exec:java -Dexec.mainClass="com.Indiviual_project_202.ReadCsv" -Dexec.args="Input.csv"
6. You will be able to see the outputs generated in Indiviual_project_202\src\main\resources\input
