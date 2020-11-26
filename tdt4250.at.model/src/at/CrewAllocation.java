/**
 */
package at;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crew Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.CrewAllocation#getRole <em>Role</em>}</li>
 *   <li>{@link at.CrewAllocation#getMember <em>Member</em>}</li>
 *   <li>{@link at.CrewAllocation#getFlight <em>Flight</em>}</li>
 * </ul>
 *
 * @see at.AtPackage#getCrewAllocation()
 * @model
 * @generated
 */
public interface CrewAllocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The literals are from the enumeration {@link at.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see at.Role
	 * @see #setRole(Role)
	 * @see at.AtPackage#getCrewAllocation_Role()
	 * @model dataType="at.Role"
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link at.CrewAllocation#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see at.Role
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link at.Person#getAllocations <em>Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' reference.
	 * @see #setMember(Person)
	 * @see at.AtPackage#getCrewAllocation_Member()
	 * @see at.Person#getAllocations
	 * @model opposite="allocations"
	 * @generated
	 */
	Person getMember();

	/**
	 * Sets the value of the '{@link at.CrewAllocation#getMember <em>Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member</em>' reference.
	 * @see #getMember()
	 * @generated
	 */
	void setMember(Person value);

	/**
	 * Returns the value of the '<em><b>Flight</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link at.Flight#getAllocations <em>Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flight</em>' container reference.
	 * @see #setFlight(Flight)
	 * @see at.AtPackage#getCrewAllocation_Flight()
	 * @see at.Flight#getAllocations
	 * @model opposite="allocations" transient="false"
	 * @generated
	 */
	Flight getFlight();

	/**
	 * Sets the value of the '{@link at.CrewAllocation#getFlight <em>Flight</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flight</em>' container reference.
	 * @see #getFlight()
	 * @generated
	 */
	void setFlight(Flight value);

} // CrewAllocation
