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
 *   <li>{@link at.Crew#getCrewAllocations <em>Crew Allocations</em>}</li>
 * </ul>
 *
 * @see at.AtPackage#getCrew()
 * @model
 * @generated
 */
public interface Crew extends EObject {
	/**
	 * Returns the value of the '<em><b>Crew Allocations</b></em>' containment reference list.
	 * The list contents are of type {@link at.CrewAllocation}.
	 * It is bidirectional and its opposite is '{@link at.CrewAllocation#getCrew <em>Crew</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crew Allocations</em>' containment reference list.
	 * @see at.AtPackage#getCrew_CrewAllocations()
	 * @see at.CrewAllocation#getCrew
	 * @model opposite="crew" containment="true"
	 * @generated
	 */
	EList<CrewAllocation> getCrewAllocations();

} // Crew
