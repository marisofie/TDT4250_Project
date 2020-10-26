/**
 */
package at.impl;

import at.Airplane;
import at.AtPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Airplane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.impl.AirplaneImpl#getType <em>Type</em>}</li>
 *   <li>{@link at.impl.AirplaneImpl#getNumberOfSeats <em>Number Of Seats</em>}</li>
 *   <li>{@link at.impl.AirplaneImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link at.impl.AirplaneImpl#getMaximumWeight <em>Maximum Weight</em>}</li>
 *   <li>{@link at.impl.AirplaneImpl#getReach <em>Reach</em>}</li>
 *   <li>{@link at.impl.AirplaneImpl#getMinimumCrew <em>Minimum Crew</em>}</li>
 *   <li>{@link at.impl.AirplaneImpl#getRequiredRunwayLength <em>Required Runway Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AirplaneImpl extends MinimalEObjectImpl.Container implements Airplane {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfSeats() <em>Number Of Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSeats()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_SEATS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfSeats() <em>Number Of Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSeats()
	 * @generated
	 * @ordered
	 */
	protected int numberOfSeats = NUMBER_OF_SEATS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final int WEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected int weight = WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumWeight() <em>Maximum Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumWeight()
	 * @generated
	 * @ordered
	 */
	protected static final int MAXIMUM_WEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaximumWeight() <em>Maximum Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumWeight()
	 * @generated
	 * @ordered
	 */
	protected int maximumWeight = MAXIMUM_WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getReach() <em>Reach</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReach()
	 * @generated
	 * @ordered
	 */
	protected static final int REACH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReach() <em>Reach</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReach()
	 * @generated
	 * @ordered
	 */
	protected int reach = REACH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumCrew() <em>Minimum Crew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumCrew()
	 * @generated
	 * @ordered
	 */
	protected static final int MINIMUM_CREW_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinimumCrew() <em>Minimum Crew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumCrew()
	 * @generated
	 * @ordered
	 */
	protected int minimumCrew = MINIMUM_CREW_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequiredRunwayLength() <em>Required Runway Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredRunwayLength()
	 * @generated
	 * @ordered
	 */
	protected static final int REQUIRED_RUNWAY_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRequiredRunwayLength() <em>Required Runway Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredRunwayLength()
	 * @generated
	 * @ordered
	 */
	protected int requiredRunwayLength = REQUIRED_RUNWAY_LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AirplaneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtPackage.Literals.AIRPLANE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtPackage.AIRPLANE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfSeats(int newNumberOfSeats) {
		int oldNumberOfSeats = numberOfSeats;
		numberOfSeats = newNumberOfSeats;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtPackage.AIRPLANE__NUMBER_OF_SEATS, oldNumberOfSeats, numberOfSeats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(int newWeight) {
		int oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtPackage.AIRPLANE__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaximumWeight() {
		return maximumWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumWeight(int newMaximumWeight) {
		int oldMaximumWeight = maximumWeight;
		maximumWeight = newMaximumWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtPackage.AIRPLANE__MAXIMUM_WEIGHT, oldMaximumWeight, maximumWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getReach() {
		return reach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReach(int newReach) {
		int oldReach = reach;
		reach = newReach;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtPackage.AIRPLANE__REACH, oldReach, reach));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinimumCrew() {
		return minimumCrew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumCrew(int newMinimumCrew) {
		int oldMinimumCrew = minimumCrew;
		minimumCrew = newMinimumCrew;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtPackage.AIRPLANE__MINIMUM_CREW, oldMinimumCrew, minimumCrew));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRequiredRunwayLength() {
		return requiredRunwayLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredRunwayLength(int newRequiredRunwayLength) {
		int oldRequiredRunwayLength = requiredRunwayLength;
		requiredRunwayLength = newRequiredRunwayLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtPackage.AIRPLANE__REQUIRED_RUNWAY_LENGTH, oldRequiredRunwayLength, requiredRunwayLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AtPackage.AIRPLANE__TYPE:
				return getType();
			case AtPackage.AIRPLANE__NUMBER_OF_SEATS:
				return getNumberOfSeats();
			case AtPackage.AIRPLANE__WEIGHT:
				return getWeight();
			case AtPackage.AIRPLANE__MAXIMUM_WEIGHT:
				return getMaximumWeight();
			case AtPackage.AIRPLANE__REACH:
				return getReach();
			case AtPackage.AIRPLANE__MINIMUM_CREW:
				return getMinimumCrew();
			case AtPackage.AIRPLANE__REQUIRED_RUNWAY_LENGTH:
				return getRequiredRunwayLength();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AtPackage.AIRPLANE__TYPE:
				setType((String)newValue);
				return;
			case AtPackage.AIRPLANE__NUMBER_OF_SEATS:
				setNumberOfSeats((Integer)newValue);
				return;
			case AtPackage.AIRPLANE__WEIGHT:
				setWeight((Integer)newValue);
				return;
			case AtPackage.AIRPLANE__MAXIMUM_WEIGHT:
				setMaximumWeight((Integer)newValue);
				return;
			case AtPackage.AIRPLANE__REACH:
				setReach((Integer)newValue);
				return;
			case AtPackage.AIRPLANE__MINIMUM_CREW:
				setMinimumCrew((Integer)newValue);
				return;
			case AtPackage.AIRPLANE__REQUIRED_RUNWAY_LENGTH:
				setRequiredRunwayLength((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AtPackage.AIRPLANE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case AtPackage.AIRPLANE__NUMBER_OF_SEATS:
				setNumberOfSeats(NUMBER_OF_SEATS_EDEFAULT);
				return;
			case AtPackage.AIRPLANE__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case AtPackage.AIRPLANE__MAXIMUM_WEIGHT:
				setMaximumWeight(MAXIMUM_WEIGHT_EDEFAULT);
				return;
			case AtPackage.AIRPLANE__REACH:
				setReach(REACH_EDEFAULT);
				return;
			case AtPackage.AIRPLANE__MINIMUM_CREW:
				setMinimumCrew(MINIMUM_CREW_EDEFAULT);
				return;
			case AtPackage.AIRPLANE__REQUIRED_RUNWAY_LENGTH:
				setRequiredRunwayLength(REQUIRED_RUNWAY_LENGTH_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AtPackage.AIRPLANE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case AtPackage.AIRPLANE__NUMBER_OF_SEATS:
				return numberOfSeats != NUMBER_OF_SEATS_EDEFAULT;
			case AtPackage.AIRPLANE__WEIGHT:
				return weight != WEIGHT_EDEFAULT;
			case AtPackage.AIRPLANE__MAXIMUM_WEIGHT:
				return maximumWeight != MAXIMUM_WEIGHT_EDEFAULT;
			case AtPackage.AIRPLANE__REACH:
				return reach != REACH_EDEFAULT;
			case AtPackage.AIRPLANE__MINIMUM_CREW:
				return minimumCrew != MINIMUM_CREW_EDEFAULT;
			case AtPackage.AIRPLANE__REQUIRED_RUNWAY_LENGTH:
				return requiredRunwayLength != REQUIRED_RUNWAY_LENGTH_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", numberOfSeats: ");
		result.append(numberOfSeats);
		result.append(", weight: ");
		result.append(weight);
		result.append(", maximumWeight: ");
		result.append(maximumWeight);
		result.append(", reach: ");
		result.append(reach);
		result.append(", minimumCrew: ");
		result.append(minimumCrew);
		result.append(", requiredRunwayLength: ");
		result.append(requiredRunwayLength);
		result.append(')');
		return result.toString();
	}

} //AirplaneImpl
