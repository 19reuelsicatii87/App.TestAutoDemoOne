package other.AppName;

// Class Level
// ====================================================================================
// Access Modifier -- public, default
// Non Access Modifier - final, abstract
// SYNTAX: <Access Modifier> <Non-Access Modifier> class <ClassName>
// ===================================================================================
public abstract class OOPReview01 {
	
	// Constructor Level
	// ==================================================================================
	// Access Modifier -- public, private, default, protected
	// SYNTAX: <Access Modifier> <ConstructorName> <Parameter (parType, parName)>
	// =================================================================================
	protected OOPReview01(int integer) {
		OOPReview01.property = integer;
	}

	
	// Attribute/Property Level
	// ==================================================================================
	// Access Modifier -- public, private, default, protected
	// Non Access Modifier - final, static, abstract, transient, synchronized, volatile
	// SYNTAX: <Access Modifier> <Non-Access Modifier> type <PropertyName>
	// =================================================================================
	private final static int integerConstant = 20;
	private static int property;
	

	// Method Level
	// =============================================================================================================
	// Access Modifier -- public, private, default, protected
	// Non Access Modifier - final, static, abstract, transient, synchronized, volatile
	// SYNTAX: SYNTAX: <Access Modifier> <Non-Access Modifier> type <MethodName> <Parameter (parType, parName)>
	// =============================================================================================================
	public static void main(String[] arg) {
		System.out.println("value of integerConstant: " + OOPReview01.integerConstant);
		System.out.println("value of property: " + OOPReview01.property);
	}
}


