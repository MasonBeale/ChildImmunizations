/*
 * Dosable.java
 * @author Gabrielle Akers
 * version: 4/14/2025
 * check to see if a patient is dosable
 */
import java.time.LocalDate;

public class Dosable {
	int dosage;
	LocalDate date;
	int doseNum;
	int maxDose;
	LocalDate nextDose;
	int age;
	int minAge;
	boolean dosable;
	
	/**
	 * Checks if the patient's age meets the minimum required age.
	 * 
	 * @return true if the patient's age is greater than or equal to the minimum age, false otherwise
	 */
	public boolean checkAge(){
		if(age >= minAge) {
			return true;
		}
		return false;
	}
	
	/**
	 * Checks if the patient has received fewer than the maximum allowed doses.
	 * 
	 * @return true if the number of doses received is less than the maximum, false otherwise
	 */
	public boolean checkDosage() {
		if(doseNum < maxDose) {
			return true;
		}
		return false;
	}
	
	/**
	 * Checks if the current date is after the date the patient is allowed to receive the next dose.
	 * 
	 * @return true if the current date is after the nextDose date, false otherwise
	 */
	public boolean checkDate() {
		if(date.isAfter(nextDose)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Determines whether the patient is eligible (dosable) to receive a new dose.
	 * A patient is dosable if they meet the age requirement, have not exceeded the max dose,
	 * and the current date is after the allowed next dose date.
	 * 
	 * @return true if all conditions are met, false otherwise
	 */
	public boolean isDosable() {
		if(checkAge() && checkDosage() && checkDate()) {
			return true;
		}
		return false;
	}
	
}
