/**
 */
package at;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Role</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see at.AtPackage#getRole()
 * @model instanceClass="at.Role"
 * @generated
 */
public enum Role implements Enumerator {
	/**
	 * The '<em><b>Pilot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PILOT_VALUE
	 * @generated
	 * @ordered
	 */
	PILOT(0, "Pilot", "Pilot"),

	/**
	 * The '<em><b>First Officer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRST_OFFICER_VALUE
	 * @generated
	 * @ordered
	 */
	FIRST_OFFICER(1, "FirstOfficer", "First officer"),

	/**
	 * The '<em><b>Second Officer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECOND_OFFICER_VALUE
	 * @generated
	 * @ordered
	 */
	SECOND_OFFICER(2, "SecondOfficer", "Second officer"),

	/**
	 * The '<em><b>Purser</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PURSER_VALUE
	 * @generated
	 * @ordered
	 */
	PURSER(3, "Purser", "Purser"),

	/**
	 * The '<em><b>Flight Attendant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLIGHT_ATTENDANT_VALUE
	 * @generated
	 * @ordered
	 */
	FLIGHT_ATTENDANT(4, "FlightAttendant", "Flight attendant");

	/**
	 * The '<em><b>Pilot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PILOT
	 * @model name="Pilot"
	 * @generated
	 * @ordered
	 */
	public static final int PILOT_VALUE = 0;

	/**
	 * The '<em><b>First Officer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRST_OFFICER
	 * @model name="FirstOfficer" literal="First officer"
	 * @generated
	 * @ordered
	 */
	public static final int FIRST_OFFICER_VALUE = 1;

	/**
	 * The '<em><b>Second Officer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECOND_OFFICER
	 * @model name="SecondOfficer" literal="Second officer"
	 * @generated
	 * @ordered
	 */
	public static final int SECOND_OFFICER_VALUE = 2;

	/**
	 * The '<em><b>Purser</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PURSER
	 * @model name="Purser"
	 * @generated
	 * @ordered
	 */
	public static final int PURSER_VALUE = 3;

	/**
	 * The '<em><b>Flight Attendant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLIGHT_ATTENDANT
	 * @model name="FlightAttendant" literal="Flight attendant"
	 * @generated
	 * @ordered
	 */
	public static final int FLIGHT_ATTENDANT_VALUE = 4;

	/**
	 * An array of all the '<em><b>Role</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Role[] VALUES_ARRAY =
		new Role[] {
			PILOT,
			FIRST_OFFICER,
			SECOND_OFFICER,
			PURSER,
			FLIGHT_ATTENDANT,
		};

	/**
	 * A public read-only list of all the '<em><b>Role</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Role> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Role</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Role get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Role result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Role</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Role getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Role result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Role</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Role get(int value) {
		switch (value) {
			case PILOT_VALUE: return PILOT;
			case FIRST_OFFICER_VALUE: return FIRST_OFFICER;
			case SECOND_OFFICER_VALUE: return SECOND_OFFICER;
			case PURSER_VALUE: return PURSER;
			case FLIGHT_ATTENDANT_VALUE: return FLIGHT_ATTENDANT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Role(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Role
