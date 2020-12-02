/**
 */
package at;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.Person#getFullName <em>Full Name</em>}</li>
 *   <li>{@link at.Person#getFirstName <em>First Name</em>}</li>
 *   <li>{@link at.Person#getFamilyName <em>Family Name</em>}</li>
 *   <li>{@link at.Person#getGender <em>Gender</em>}</li>
 *   <li>{@link at.Person#getAge <em>Age</em>}</li>
 *   <li>{@link at.Person#getAllocations <em>Allocations</em>}</li>
 *   <li>{@link at.Person#getEmployer <em>Employer</em>}</li>
 * </ul>
 *
 * @see at.AtPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Name</em>' attribute.
	 * @see at.AtPackage#getPerson_FullName()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/acceleo/query/1.0 derivation='self.firstName + \'  \' + self.familyName'"
	 * @generated
	 */
	String getFullName();

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see at.AtPackage#getPerson_FirstName()
	 * @model
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link at.Person#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Family Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family Name</em>' attribute.
	 * @see #setFamilyName(String)
	 * @see at.AtPackage#getPerson_FamilyName()
	 * @model
	 * @generated
	 */
	String getFamilyName();

	/**
	 * Sets the value of the '{@link at.Person#getFamilyName <em>Family Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family Name</em>' attribute.
	 * @see #getFamilyName()
	 * @generated
	 */
	void setFamilyName(String value);

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' attribute.
	 * The literals are from the enumeration {@link at.Gender}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gender</em>' attribute.
	 * @see at.Gender
	 * @see #setGender(Gender)
	 * @see at.AtPackage#getPerson_Gender()
	 * @model dataType="at.Gender"
	 * @generated
	 */
	Gender getGender();

	/**
	 * Sets the value of the '{@link at.Person#getGender <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' attribute.
	 * @see at.Gender
	 * @see #getGender()
	 * @generated
	 */
	void setGender(Gender value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see at.AtPackage#getPerson_Age()
	 * @model
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link at.Person#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * Returns the value of the '<em><b>Allocations</b></em>' reference list.
	 * The list contents are of type {@link at.CrewAllocation}.
	 * It is bidirectional and its opposite is '{@link at.CrewAllocation#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocations</em>' reference list.
	 * @see at.AtPackage#getPerson_Allocations()
	 * @see at.CrewAllocation#getMember
	 * @model opposite="member"
	 * @generated
	 */
	EList<CrewAllocation> getAllocations();

	/**
	 * Returns the value of the '<em><b>Employer</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link at.Airline#getEmployees <em>Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employer</em>' container reference.
	 * @see #setEmployer(Airline)
	 * @see at.AtPackage#getPerson_Employer()
	 * @see at.Airline#getEmployees
	 * @model opposite="employees" transient="false"
	 * @generated
	 */
	Airline getEmployer();

	/**
	 * Sets the value of the '{@link at.Person#getEmployer <em>Employer</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employer</em>' container reference.
	 * @see #getEmployer()
	 * @generated
	 */
	void setEmployer(Airline value);

} // Person
