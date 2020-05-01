/**
 * generated by Xtext 2.21.0
 */
package su.nsk.iae.post.poST.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import su.nsk.iae.post.poST.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PoSTFactoryImpl extends EFactoryImpl implements PoSTFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PoSTFactory init()
  {
    try
    {
      PoSTFactory thePoSTFactory = (PoSTFactory)EPackage.Registry.INSTANCE.getEFactory(PoSTPackage.eNS_URI);
      if (thePoSTFactory != null)
      {
        return thePoSTFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PoSTFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PoSTFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PoSTPackage.MODEL: return createModel();
      case PoSTPackage.GREETING: return createGreeting();
      case PoSTPackage.SYMBOLIC_VARIABLE: return createSymbolicVariable();
      case PoSTPackage.VAR_INIT_DECLARATION: return createVarInitDeclaration();
      case PoSTPackage.VAR_LIST: return createVarList();
      case PoSTPackage.INPUT_VAR_DECLARATION: return createInputVarDeclaration();
      case PoSTPackage.OUTPUT_VAR_DECLARATION: return createOutputVarDeclaration();
      case PoSTPackage.INPUT_OUTPUT_VAR_DECLARATION: return createInputOutputVarDeclaration();
      case PoSTPackage.VAR_DECLARATION: return createVarDeclaration();
      case PoSTPackage.TEMP_VAR_DECLARATION: return createTempVarDeclaration();
      case PoSTPackage.EXTERNAL_VAR_DECLARATION: return createExternalVarDeclaration();
      case PoSTPackage.EXTERNAL_VAR_INIT_DECLARATION: return createExternalVarInitDeclaration();
      case PoSTPackage.GLOBAL_VAR_DECLARATION: return createGlobalVarDeclaration();
      case PoSTPackage.GLOBAL_VAR_INIT_DECLARATION: return createGlobalVarInitDeclaration();
      case PoSTPackage.TIME_LITERAL: return createTimeLiteral();
      case PoSTPackage.SINGLE_ELEMENT_TYPE_DECLARATION: return createSingleElementTypeDeclaration();
      case PoSTPackage.SIMPLE_SPECIFICATION_INIT: return createSimpleSpecificationInit();
      case PoSTPackage.CONSTANT: return createConstant();
      case PoSTPackage.SIGNED_INTEGER: return createSignedInteger();
      case PoSTPackage.NUMERIC_LITERAL: return createNumericLiteral();
      case PoSTPackage.INTEGER_LITERAL: return createIntegerLiteral();
      case PoSTPackage.REAL_LITERAL: return createRealLiteral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Greeting createGreeting()
  {
    GreetingImpl greeting = new GreetingImpl();
    return greeting;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SymbolicVariable createSymbolicVariable()
  {
    SymbolicVariableImpl symbolicVariable = new SymbolicVariableImpl();
    return symbolicVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VarInitDeclaration createVarInitDeclaration()
  {
    VarInitDeclarationImpl varInitDeclaration = new VarInitDeclarationImpl();
    return varInitDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VarList createVarList()
  {
    VarListImpl varList = new VarListImpl();
    return varList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InputVarDeclaration createInputVarDeclaration()
  {
    InputVarDeclarationImpl inputVarDeclaration = new InputVarDeclarationImpl();
    return inputVarDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OutputVarDeclaration createOutputVarDeclaration()
  {
    OutputVarDeclarationImpl outputVarDeclaration = new OutputVarDeclarationImpl();
    return outputVarDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InputOutputVarDeclaration createInputOutputVarDeclaration()
  {
    InputOutputVarDeclarationImpl inputOutputVarDeclaration = new InputOutputVarDeclarationImpl();
    return inputOutputVarDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VarDeclaration createVarDeclaration()
  {
    VarDeclarationImpl varDeclaration = new VarDeclarationImpl();
    return varDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TempVarDeclaration createTempVarDeclaration()
  {
    TempVarDeclarationImpl tempVarDeclaration = new TempVarDeclarationImpl();
    return tempVarDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExternalVarDeclaration createExternalVarDeclaration()
  {
    ExternalVarDeclarationImpl externalVarDeclaration = new ExternalVarDeclarationImpl();
    return externalVarDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExternalVarInitDeclaration createExternalVarInitDeclaration()
  {
    ExternalVarInitDeclarationImpl externalVarInitDeclaration = new ExternalVarInitDeclarationImpl();
    return externalVarInitDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GlobalVarDeclaration createGlobalVarDeclaration()
  {
    GlobalVarDeclarationImpl globalVarDeclaration = new GlobalVarDeclarationImpl();
    return globalVarDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GlobalVarInitDeclaration createGlobalVarInitDeclaration()
  {
    GlobalVarInitDeclarationImpl globalVarInitDeclaration = new GlobalVarInitDeclarationImpl();
    return globalVarInitDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TimeLiteral createTimeLiteral()
  {
    TimeLiteralImpl timeLiteral = new TimeLiteralImpl();
    return timeLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SingleElementTypeDeclaration createSingleElementTypeDeclaration()
  {
    SingleElementTypeDeclarationImpl singleElementTypeDeclaration = new SingleElementTypeDeclarationImpl();
    return singleElementTypeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SimpleSpecificationInit createSimpleSpecificationInit()
  {
    SimpleSpecificationInitImpl simpleSpecificationInit = new SimpleSpecificationInitImpl();
    return simpleSpecificationInit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Constant createConstant()
  {
    ConstantImpl constant = new ConstantImpl();
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SignedInteger createSignedInteger()
  {
    SignedIntegerImpl signedInteger = new SignedIntegerImpl();
    return signedInteger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NumericLiteral createNumericLiteral()
  {
    NumericLiteralImpl numericLiteral = new NumericLiteralImpl();
    return numericLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntegerLiteral createIntegerLiteral()
  {
    IntegerLiteralImpl integerLiteral = new IntegerLiteralImpl();
    return integerLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RealLiteral createRealLiteral()
  {
    RealLiteralImpl realLiteral = new RealLiteralImpl();
    return realLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PoSTPackage getPoSTPackage()
  {
    return (PoSTPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PoSTPackage getPackage()
  {
    return PoSTPackage.eINSTANCE;
  }

} //PoSTFactoryImpl
