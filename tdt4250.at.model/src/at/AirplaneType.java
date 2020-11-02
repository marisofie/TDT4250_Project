/**
 */
package at;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Airplane Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see at.AtPackage#getAirplaneType()
 * @model instanceClass="at.AirplaneType"
 * @generated
 */
public enum AirplaneType implements Enumerator {
	/**
	 * The '<em><b>Boeing737800</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOEING737800_VALUE
	 * @generated
	 * @ordered
	 */
	BOEING737800(0, "Boeing737800", "Boeing 737-800"),

	/**
	 * The '<em><b>Boeing737700</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOEING737700_VALUE
	 * @generated
	 * @ordered
	 */
	BOEING737700(1, "Boeing737700", "Boeing 737-700"),

	/**
	 * The '<em><b>Boeing737600</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOEING737600_VALUE
	 * @generated
	 * @ordered
	 */
	BOEING737600(2, "Boeing737600", "Boeing 737-600"), /**
	 * The '<em><b>Bombardier Dash8100</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOMBARDIER_DASH8100_VALUE
	 * @generated
	 * @ordered
	 */
	BOMBARDIER_DASH8100(3, "BombardierDash8100", "Bombardier DHC-8 Dash 8-100");

	/**
	 * The '<em><b>Boeing737800</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOEING737800
	 * @model name="Boeing737800" literal="Boeing 737-800"
	 * @generated
	 * @ordered
	 */
	public static final int BOEING737800_VALUE = 0;

	/**
	 * The '<em><b>Boeing737700</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOEING737700
	 * @model name="Boeing737700" literal="Boeing 737-700"
	 * @generated
	 * @ordered
	 */
	public static final int BOEING737700_VALUE = 1;

	/**
	 * The '<em><b>Boeing737600</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOEING737600
	 * @model name="Boeing737600" literal="Boeing 737-600"
	 * @generated
	 * @ordered
	 */
	public static final int BOEING737600_VALUE = 2;

	/**
	 * The '<em><b>Bombardier Dash8100</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOMBARDIER_DASH8100
	 * @model name="BombardierDash8100" literal="Bombardier DHC-8 Dash 8-100"
	 * @generated
	 * @ordered
	 */
	public static final int BOMBARDIER_DASH8100_VALUE = 3;

	/**
	 * An array of all the '<em><b>Airplane Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AirplaneType[] VALUES_ARRAY =
		new AirplaneType[] {
			BOEING737800,
			BOEING737700,
			BOEING737600,
			BOMBARDIER_DASH8100,
		};

	/**
	 * A public read-only list of all the '<em><b>Airplane Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AirplaneType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Airplane Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AirplaneType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AirplaneType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Airplane Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AirplaneType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AirplaneType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Airplane Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AirplaneType get(int value) {
		switch (value) {
			case BOEING737800_VALUE: return BOEING737800;
			case BOEING737700_VALUE: return BOEING737700;
			case BOEING737600_VALUE: return BOEING737600;
			case BOMBARDIER_DASH8100_VALUE: return BOMBARDIER_DASH8100;
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
	private AirplaneType(int value, String name, String literal) {
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
	
} //AirplaneType
