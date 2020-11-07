/**
 */
package at.impl;

import at.Airplane;
import at.AirplaneType;
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
 *   <li>{@link at.impl.AirplaneImpl#getId <em>Id</em>}</li>
 *   <li>{@link at.impl.AirplaneImpl#getType <em>Type</em>}</li>
 *   <li>{@link at.impl.AirplaneImpl#getNumberOfSeats <em>Number Of Seats</em>}</li>
 *   <li>{@link at.impl.AirplaneImpl#getMinimumCrew <em>Minimum Crew</em>}</li>
 *   <li>{@link at.impl.AirplaneImpl#getRequiredRunwayLengthTakeoff <em>Required Runway Length Takeoff</em>}</li>
 *   <li>{@link at.impl.AirplaneImpl#getRequiredRunwayLengthLanding <em>Required Runway Length Landing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AirplaneImpl extends MinimalEObjectImpl.Container implements Airplane {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final AirplaneType TYPE_EDEFAULT = AirplaneType.BOEING737800;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected AirplaneType type = TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getRequiredRunwayLengthTakeoff() <em>Required Runway Length Takeoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredRunwayLengthTakeoff()
	 * @generated
	 * @ordered
	 */
	protected static final int REQUIRED_RUNWAY_LENGTH_TAKEOFF_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRequiredRunwayLengthTakeoff() <em>Required Runway Length Takeoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredRunwayLengthTakeoff()
	 * @generated
	 * @ordered
	 */
	protected int requiredRunwayLengthTakeoff = REQUIRED_RUNWAY_LENGTH_TAKEOFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequiredRunwayLengthLanding() <em>Required Runway Length Landing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredRunwayLengthLanding()
	 * @generated
	 * @ordered
	 */
	protected static final int REQUIRED_RUNWAY_LENGTH_LANDING_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRequiredRunwayLengthLanding() <em>Required Runway Length Landing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredRunwayLengthLanding()
	 * @generated
	 * @ordered
	 */
	protected int requiredRunwayLengthLanding = REQUIRED_RUNWAY_LENGTH_LANDING_EDEFAULT;

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
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtPackage.AIRPLANE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AirplaneType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(AirplaneType newType) {
		AirplaneType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
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
	public int getRequiredRunwayLengthTakeoff() {
		return requiredRunwayLengthTakeoff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredRunwayLengthTakeoff(int newRequiredRunwayLengthTakeoff) {
		int oldRequiredRunwayLengthTakeoff = requiredRunwayLengthTakeoff;
		requiredRunwayLengthTakeoff = newRequiredRunwayLengthTakeoff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtPackage.AIRPLANE__REQUIRED_RUNWAY_LENGTH_TAKEOFF, oldRequiredRunwayLengthTakeoff, requiredRunwayLengthTakeoff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRequiredRunwayLengthLanding() {
		return requiredRunwayLengthLanding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredRunwayLengthLanding(int newRequiredRunwayLengthLanding) {
		int oldRequiredRunwayLengthLanding = requiredRunwayLengthLanding;
		requiredRunwayLengthLanding = newRequiredRunwayLengthLanding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtPackage.AIRPLANE__REQUIRED_RUNWAY_LENGTH_LANDING, oldRequiredRunwayLengthLanding, requiredRunwayLengthLanding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AtPackage.AIRPLANE__ID:
				return getId();
			case AtPackage.AIRPLANE__TYPE:
				return getType();
			case AtPackage.AIRPLANE__NUMBER_OF_SEATS:
				return getNumberOfSeats();
			case AtPackage.AIRPLANE__MINIMUM_CREW:
				return getMinimumCrew();
			case AtPackage.AIRPLANE__REQUIRED_RUNWAY_LENGTH_TAKEOFF:
				return getRequiredRunwayLengthTakeoff();
			case AtPackage.AIRPLANE__REQUIRED_RUNWAY_LENGTH_LANDING:
				return getRequiredRunwayLengthLanding();
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
			case AtPackage.AIRPLANE__ID:
				setId((Integer)newValue);
				return;
			case AtPackage.AIRPLANE__TYPE:
				setType((AirplaneType)newValue);
				return;
			case AtPackage.AIRPLANE__NUMBER_OF_SEATS:
				setNumberOfSeats((Integer)newValue);
				return;
			case AtPackage.AIRPLANE__MINIMUM_CREW:
				setMinimumCrew((Integer)newValue);
				return;
			case AtPackage.AIRPLANE__REQUIRED_RUNWAY_LENGTH_TAKEOFF:
				setRequiredRunwayLengthTakeoff((Integer)newValue);
				return;
			case AtPackage.AIRPLANE__REQUIRED_RUNWAY_LENGTH_LANDING:
				setRequiredRunwayLengthLanding((Integer)newValue);
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
			case AtPackage.AIRPLANE__ID:
				setId(ID_EDEFAULT);
				return;
			case AtPackage.AIRPLANE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case AtPackage.AIRPLANE__NUMBER_OF_SEATS:
				setNumberOfSeats(NUMBER_OF_SEATS_EDEFAULT);
				return;
			case AtPackage.AIRPLANE__MINIMUM_CREW:
				setMinimumCrew(MINIMUM_CREW_EDEFAULT);
				return;
			case AtPackage.AIRPLANE__REQUIRED_RUNWAY_LENGTH_TAKEOFF:
				setRequiredRunwayLengthTakeoff(REQUIRED_RUNWAY_LENGTH_TAKEOFF_EDEFAULT);
				return;
			case AtPackage.AIRPLANE__REQUIRED_RUNWAY_LENGTH_LANDING:
				setRequiredRunwayLengthLanding(REQUIRED_RUNWAY_LENGTH_LANDING_EDEFAULT);
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
			case AtPackage.AIRPLANE__ID:
				return id != ID_EDEFAULT;
			case AtPackage.AIRPLANE__TYPE:
				return type != TYPE_EDEFAULT;
			case AtPackage.AIRPLANE__NUMBER_OF_SEATS:
				return numberOfSeats != NUMBER_OF_SEATS_EDEFAULT;
			case AtPackage.AIRPLANE__MINIMUM_CREW:
				return minimumCrew != MINIMUM_CREW_EDEFAULT;
			case AtPackage.AIRPLANE__REQUIRED_RUNWAY_LENGTH_TAKEOFF:
				return requiredRunwayLengthTakeoff != REQUIRED_RUNWAY_LENGTH_TAKEOFF_EDEFAULT;
			case AtPackage.AIRPLANE__REQUIRED_RUNWAY_LENGTH_LANDING:
				return requiredRunwayLengthLanding != REQUIRED_RUNWAY_LENGTH_LANDING_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", type: ");
		result.append(type);
		result.append(", numberOfSeats: ");
		result.append(numberOfSeats);
		result.append(", minimumCrew: ");
		result.append(minimumCrew);
		result.append(", requiredRunwayLengthTakeoff: ");
		result.append(requiredRunwayLengthTakeoff);
		result.append(", requiredRunwayLengthLanding: ");
		result.append(requiredRunwayLengthLanding);
		result.append(')');
		return result.toString();
	}

} //AirplaneImpl
