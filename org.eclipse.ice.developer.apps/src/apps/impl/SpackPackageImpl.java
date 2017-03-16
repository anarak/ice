/**
 */
package apps.impl;

import apps.AppsPackage;
import apps.PackageType;
import apps.SpackDependency;
import apps.SpackPackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spack Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apps.impl.SpackPackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link apps.impl.SpackPackageImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link apps.impl.SpackPackageImpl#getType <em>Type</em>}</li>
 *   <li>{@link apps.impl.SpackPackageImpl#getCompiler <em>Compiler</em>}</li>
 *   <li>{@link apps.impl.SpackPackageImpl#getCppFlags <em>Cpp Flags</em>}</li>
 *   <li>{@link apps.impl.SpackPackageImpl#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpackPackageImpl extends MinimalEObjectImpl.Container implements SpackPackage {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = "latest";

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final PackageType TYPE_EDEFAULT = PackageType.OS;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected PackageType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompiler() <em>Compiler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompiler()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPILER_EDEFAULT = "gcc@6.3.1";

	/**
	 * The cached value of the '{@link #getCompiler() <em>Compiler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompiler()
	 * @generated
	 * @ordered
	 */
	protected String compiler = COMPILER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCppFlags() <em>Cpp Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCppFlags()
	 * @generated
	 * @ordered
	 */
	protected static final String CPP_FLAGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCppFlags() <em>Cpp Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCppFlags()
	 * @generated
	 * @ordered
	 */
	protected String cppFlags = CPP_FLAGS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<SpackDependency> dependencies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpackPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppsPackage.Literals.SPACK_PACKAGE;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppsPackage.SPACK_PACKAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompiler() {
		return compiler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompiler(String newCompiler) {
		String oldCompiler = compiler;
		compiler = newCompiler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppsPackage.SPACK_PACKAGE__COMPILER, oldCompiler, compiler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppsPackage.SPACK_PACKAGE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(PackageType newType) {
		PackageType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppsPackage.SPACK_PACKAGE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCppFlags() {
		return cppFlags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCppFlags(String newCppFlags) {
		String oldCppFlags = cppFlags;
		cppFlags = newCppFlags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppsPackage.SPACK_PACKAGE__CPP_FLAGS, oldCppFlags, cppFlags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpackDependency> getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectResolvingEList<SpackDependency>(SpackDependency.class, this, AppsPackage.SPACK_PACKAGE__DEPENDENCIES);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppsPackage.SPACK_PACKAGE__NAME:
				return getName();
			case AppsPackage.SPACK_PACKAGE__VERSION:
				return getVersion();
			case AppsPackage.SPACK_PACKAGE__TYPE:
				return getType();
			case AppsPackage.SPACK_PACKAGE__COMPILER:
				return getCompiler();
			case AppsPackage.SPACK_PACKAGE__CPP_FLAGS:
				return getCppFlags();
			case AppsPackage.SPACK_PACKAGE__DEPENDENCIES:
				return getDependencies();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AppsPackage.SPACK_PACKAGE__NAME:
				setName((String)newValue);
				return;
			case AppsPackage.SPACK_PACKAGE__VERSION:
				setVersion((String)newValue);
				return;
			case AppsPackage.SPACK_PACKAGE__TYPE:
				setType((PackageType)newValue);
				return;
			case AppsPackage.SPACK_PACKAGE__COMPILER:
				setCompiler((String)newValue);
				return;
			case AppsPackage.SPACK_PACKAGE__CPP_FLAGS:
				setCppFlags((String)newValue);
				return;
			case AppsPackage.SPACK_PACKAGE__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends SpackDependency>)newValue);
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
			case AppsPackage.SPACK_PACKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AppsPackage.SPACK_PACKAGE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case AppsPackage.SPACK_PACKAGE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case AppsPackage.SPACK_PACKAGE__COMPILER:
				setCompiler(COMPILER_EDEFAULT);
				return;
			case AppsPackage.SPACK_PACKAGE__CPP_FLAGS:
				setCppFlags(CPP_FLAGS_EDEFAULT);
				return;
			case AppsPackage.SPACK_PACKAGE__DEPENDENCIES:
				getDependencies().clear();
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
			case AppsPackage.SPACK_PACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AppsPackage.SPACK_PACKAGE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case AppsPackage.SPACK_PACKAGE__TYPE:
				return type != TYPE_EDEFAULT;
			case AppsPackage.SPACK_PACKAGE__COMPILER:
				return COMPILER_EDEFAULT == null ? compiler != null : !COMPILER_EDEFAULT.equals(compiler);
			case AppsPackage.SPACK_PACKAGE__CPP_FLAGS:
				return CPP_FLAGS_EDEFAULT == null ? cppFlags != null : !CPP_FLAGS_EDEFAULT.equals(cppFlags);
			case AppsPackage.SPACK_PACKAGE__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", version: ");
		result.append(version);
		result.append(", type: ");
		result.append(type);
		result.append(", compiler: ");
		result.append(compiler);
		result.append(", cppFlags: ");
		result.append(cppFlags);
		result.append(')');
		return result.toString();
	}

} //SpackPackageImpl