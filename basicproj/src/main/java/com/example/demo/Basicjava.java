package com.example.demo;

public class Basicjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/* Translator two types:
 * Compiler: Understand source code..to communicate to this, program/tool/binary file name is "javac"
 * JVM: once complied now byte code generated, that byte code is understandble through JVM, its main
 * work to convert byte code to executable code. eg: through Java command/program/ binary
 * 
 */

/*
 * ==============================================================================
 * STATIC vs. INSTANCE DATA: The Memory Allocation Model
 * ==============================================================================
 *
 * 1. STATIC DATA (Sharable / Class-Level Data)
 * - Example: Discount rate, company name, constant values.
 * - Memory: The JVM allocates memory for this data once when the Class is loaded.
 * - Key Concept: It's "Common data" shared by ALL instances (objects) of the class.
 *
 * 2. NON-STATIC / INSTANCE DATA (Individual / Object-Level Data)
 * - Example: ATM PIN, account balance, object-specific ID.
 * - Memory: Memory is allocated only when a new Object is explicitly created 
 * using the 'new' keyword.
 * - Key Concept: It's "Individual data." Each object gets its own unique copy.
 *
 * In short: Static memory is provided by the JVM upon class loading; 
 * Non-Static memory must be explicitly requested via object creation.
 *
 *-----------------------------------------------------------------------------------
 * ________________Sharable Data (Static)____________________
 * Type: Class Data (prefixed with the static keyword).
 * Sharing: Sharable. Only a single copy of this data exists, and it is shared by all objects of that class.
 * Example: A bank's interest rate or a company's name (CompanyName.get()), or a discount percentage. If one object changes the static discount, the change is instantly reflected for all other objects.
 * Memory Allocation: The JVM allocates memory for static variables when the class is loaded into the Method Area (or static memory area). No object creation is required.
 *--------------------------------------------------------------------------------------------------------------------------------
 *
 *________________NON-Sharable Data (NON-Static)____________________
 * Type: Instance Data (no static keyword)..
 * Sharing: Non-Sharable/Individual. Each object gets its own separate copy of the data.
 * Example: An individual's ATM PIN, account balance, or name. Changing the PIN for one account does not affect the PIN of another account.
 * Memory Allocation: The JVM allocates memory for instance variables only when a user explicitly requests memory by using the new keyword to create an object (e.g., new Account()). This memory is allocated on the Heap.
 *
 * Static block: automatically executed
 * Static method: need to call not automatically executed
 * NON Static method: need to call not automatically executed
 * 
 */


 
