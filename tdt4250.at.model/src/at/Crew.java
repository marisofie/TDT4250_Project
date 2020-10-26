/**
 */
package at;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crew</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.Crew#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see at.AtPackage#getCrew()
 * @model
 * @generated
 */
public interface Crew extends EObject {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' reference list.
	 * The list contents are of type {@link at.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' reference list.
	 * @see at.AtPackage#getCrew_Members()
	 * @model
	 * @generated
	 */
	EList<Person> getMembers();

} // Crew
