# Javalab4 by the univerisity of the west indies mona
Date: March 2021

PREAMBLE

This lab aims to provide experience in the use of abstract classes and interfaces. It specifically focuses on the following skills:

Writing and using interfaces and abstract methods

Completing concrete class implementations

Applying the Comparable and Comparator interfaces

THE PROBLEM

The Ministry of Labour plans to upgrade it’s System for Monitoring Labour (SML), while tracking earnings. They are particular interested in the activity of consultants (who may be either local or expatriate) as well as (local) nine-to-five employees (SML protocols currently do not support 9-5 expatriate positions). All local workers are expected to be citizens who have a TRN. All expatriates are expected to be registered and have an active work permit. All consultants are expected to earn from a skill. The SML data architect decides to model all potential workers as persons, with the knowledge that details like date representations and payment calculations will vary across groups. Your job during this lab is to assist the architect by writing one interface and three classes, as well as making adjustments to other classes.

IN-LAB MARKING CRITERIA (PLEASE REVIEW BEFORE STARTING)

Ability fully explain the definition and use of abstract classes and interfaces.(1 mark)

Demonstrable understanding the process of populating an instance of the superclass. (1 mark)

Knowledge of the effect of using the comparable and comparator interfaces (1 mark)

Ability to explain process of implementing customized orderings, including changing from ascending to descending order, and primary/secondary orderings (1 mark)

Coding style and readability. (1 mark)

**A PENALTY OF 1 MARK WILL BE APPLIED FOR ANY OF THE FOLLOWING: **

Omitting specified interfaces or base classes based on the UML diagram(See the PDF)

Figure 1: Simplified UML Class Diagram for SML(See PDF) Figure 1 depicts a simplified model of the classes that are needed to solve this problem. Your specific tasks include creating the RegisteredExpat interface, the LocalResource, LocalConsultant and SectorPayOrder classes, as well as making minor edits to other classes to demonstrate functionality. Note that to reduce risk of crashes you are required to uncomment sections of code that refer to yet unwritten classes, as classes are written.

LAB EXERCISES

Create interface RegisteredExpat. The interface should define one method named getWorkPermit that accepts no arguments, and returns a string.
Modify the ExpatConsultant class to ensure it correctly implements RegisteredExpat along with any other interface it currently implements. The work permit number of an expatriate consultant is obtained by joining the string “WP00” with the id number of the expatriate consultant.
Write class LocalResource which extends the Person class. LocalResource exposes the following public methods:
3a. LocalResource(String date, String sector)- Actions of the constructor include accepting a date in the format “dd/mm/yyyy”, initializing the base class, storing the sector and storing an id as a consecutively increasing integer. Note that the constructor must ensure that the date of birth information is recorded.

3b. getId():Integer - returns the ID of the current instance of LocalResource

3c. getSector():String – returns the sector associated with the current instance of localResource

3d. getTRN():String – returns the trn number of the current instance of LocalResource. The process used to determine the TRN is to add the id to the number 100000000 and then return the string equivalent.

3e. Update the NineToFiver class to ensure it properly extends the LocalResource class

Write class LocalConsultant that extends LocalResource, and implements Citizen and Consultant. LocalConsultant exposes the following public methods:
4a. LocalConsultant(String dob, String sector, double skillPrice, double taxRate)- Saves local instance data – populates superclass data and calculates and saves a permit tax for the instance with a value given by taxRate*skillPrice.

4b. earnFromSkill():double- return the skillPrice for the instance

4c. getContact():String – return the string value obtained by joining the text “LocalConsultant#” with the id associated with the person

4d. getPay():double – returns the value obtained by subtracting the permitTax from the value earned from the skill.

Assume that all paychecks are ready on the day of birth of the worker (ie all people born on the first of a month get paid on the first of a month, people born on the second get paid on the second, and so on). The SML managers want to track the cash flow in the system. Modify the SML driver class at the comment that is labeled “//QUESTION 5” to include the code that will ensure the person list is sorted in ascending order of the day of birth.

Write a comparator for Person named SectorPayOrder that will allow a primary sort in ascending order of sector, and a secondary sort in ascending order of payrate where sectors match.