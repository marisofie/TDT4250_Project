/**
 */
package at;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link at.CrewAllocation#getCrew <em>Crew</em>}</li>
 * </ul>
 *
 * @see at.AtPackage#getCrewAllocation()
 * @model
 * @generated
 */
public interface CrewAllocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see at.AtPackage#getCrewAllocation_Role()
	 * @model
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link at.CrewAllocation#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference list.
	 * The list contents are of type {@link at.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' reference list.
	 * @see at.AtPackage#getCrewAllocation_Member()
	 * @model
	 * @generated
	 */
	EList<Person> getMember();

	/**
	 * Returns the value of the '<em><b>Crew</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link at.Crew#getCrewAllocations <em>Crew Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crew</em>' container reference.
	 * @see #setCrew(Crew)
	 * @see at.AtPackage#getCrewAllocation_Crew()
	 * @see at.Crew#getCrewAllocations
	 * @model opposite="crewAllocations" transient="false"
	 * @generated
	 */
	Crew getCrew();

	/**
	 * Sets the value of the '{@link at.CrewAllocation#getCrew <em>Crew</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crew</em>' container reference.
	 * @see #getCrew()
	 * @generated
	 */
	void setCrew(Crew value);

} // CrewAllocation
