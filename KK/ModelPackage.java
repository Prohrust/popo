/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gef.examples.shapes.emf.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.gef.examples.shapes.emf.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///org/eclipse/gef/examples/shapes/emf/model.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.gef.examples.shapes.emf.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = org.eclipse.gef.examples.shapes.emf.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.gef.examples.shapes.emf.model.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gef.examples.shapes.emf.model.impl.ConnectionImpl
	 * @see org.eclipse.gef.examples.shapes.emf.model.impl.ModelPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Dashed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__DASHED = 2;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gef.examples.shapes.emf.model.impl.ShapeImpl <em>Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gef.examples.shapes.emf.model.impl.ShapeImpl
	 * @see org.eclipse.gef.examples.shapes.emf.model.impl.ModelPackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 3;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__Y = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__WIDTH = 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__HEIGHT = 3;

	/**
	 * The feature id for the '<em><b>Source Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__SOURCE_CONNECTIONS = 4;

	/**
	 * The feature id for the '<em><b>Target Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__TARGET_CONNECTIONS = 5;

	/**
	 * The number of structural features of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.gef.examples.shapes.emf.model.impl.EllipticalShapeImpl <em>Elliptical Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gef.examples.shapes.emf.model.impl.EllipticalShapeImpl
	 * @see org.eclipse.gef.examples.shapes.emf.model.impl.ModelPackageImpl#getEllipticalShape()
	 * @generated
	 */
	int ELLIPTICAL_SHAPE = 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPTICAL_SHAPE__X = SHAPE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * Test @wi.jjjj COMP-559 TEST 1
	 */
	int ELLIPTICAL_SHAPE__Y = SHAPE__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPTICAL_SHAPE__WIDTH = SHAPE__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPTICAL_SHAPE__HEIGHT = SHAPE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Source Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPTICAL_SHAPE__SOURCE_CONNECTIONS = SHAPE__SOURCE_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Target Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPTICAL_SHAPE__TARGET_CONNECTIONS = SHAPE__TARGET_CONNECTIONS;

	/**
	 * The number of structural features of the '<em>Elliptical Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPTICAL_SHAPE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gef.examples.shapes.emf.model.impl.RectangularShapeImpl <em>Rectangular Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gef.examples.shapes.emf.model.impl.RectangularShapeImpl
	 * @see org.eclipse.gef.examples.shapes.emf.model.impl.ModelPackageImpl#getRectangularShape()
	 * @generated
	 */
	int RECTANGULAR_SHAPE = 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_SHAPE__X = SHAPE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_SHAPE__Y = SHAPE__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_SHAPE__WIDTH = SHAPE__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_SHAPE__HEIGHT = SHAPE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Source Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_SHAPE__SOURCE_CONNECTIONS = SHAPE__SOURCE_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Target Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_SHAPE__TARGET_CONNECTIONS = SHAPE__TARGET_CONNECTIONS;

	/**
	 * The number of structural features of the '<em>Rectangular Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_SHAPE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gef.examples.shapes.emf.model.impl.ShapesDiagramImpl <em>Shapes Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gef.examples.shapes.emf.model.impl.ShapesDiagramImpl
	 * @see org.eclipse.gef.examples.shapes.emf.model.impl.ModelPackageImpl#getShapesDiagram()
	 * @generated
	 */
	int SHAPES_DIAGRAM = 4;

	/**
	 * The feature id for the '<em><b>Shapes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_DIAGRAM__SHAPES = 0;

	/**
	 * The number of structural features of the '<em>Shapes Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_DIAGRAM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gef.examples.shapes.emf.model.impl.MemoryMapShapeImpl <em>Memory Map Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gef.examples.shapes.emf.model.impl.MemoryMapShapeImpl
	 * @see org.eclipse.gef.examples.shapes.emf.model.impl.ModelPackageImpl#getMemoryMapShape()
	 * @generated
	 */
	int MEMORY_MAP_SHAPE = 5;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MAP_SHAPE__X = SHAPE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MAP_SHAPE__Y = SHAPE__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MAP_SHAPE__WIDTH = SHAPE__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MAP_SHAPE__HEIGHT = SHAPE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Source Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MAP_SHAPE__SOURCE_CONNECTIONS = SHAPE__SOURCE_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Target Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MAP_SHAPE__TARGET_CONNECTIONS = SHAPE__TARGET_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MAP_SHAPE__NAME = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MAP_SHAPE__ADDRESS = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MAP_SHAPE__END_ADDRESS = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MAP_SHAPE__SIZE = SHAPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Memory Map Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MAP_SHAPE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '<em>Image</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.swt.graphics.Image
	 * @see org.eclipse.gef.examples.shapes.emf.model.impl.ModelPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 6;


	/**
	 * Returns the meta object for class '{@link org.eclipse.gef.examples.shapes.emf.model.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see org.eclipse.gef.examples.shapes.emf.model.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gef.examples.shapes.emf.model.Connection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.eclipse.gef.examples.shapes.emf.model.Connection#getSource()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Source();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gef.examples.shapes.emf.model.Connection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.gef.examples.shapes.emf.model.Connection#getTarget()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gef.examples.shapes.emf.model.Connection#isDashed <em>Dashed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dashed</em>'.
	 * @see org.eclipse.gef.examples.shapes.emf.model.Connection#isDashed()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Dashed();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gef.examples.shapes.emf.model.EllipticalShape <em>Elliptical Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elliptical Shape</em>'.
	 * @see org.eclipse.gef.examples.shapes.emf.model.EllipticalShape
	 * @generated
	 */
	EClass getEllipticalShape();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gef.examples.shapes.emf.model.RectangularShape <em>Rectangular Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangular Shape</em>'.
	 * @see org.eclipse.gef.examples.shapes.emf.model.RectangularShape
	 * @generated
	 */
	EClass getRectangularShape();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gef.examples.shapes.emf.model.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape</em>'.
	 * @see org.eclipse.gef.examples.shapes.emf.model.Shape
	 * @generated
	 */
	EClass getShape();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gef.examples.shapes.emf.model.Shape#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.eclipse.gef.examples.shapes.emf.model.Shape#getX()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_X();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gef.examples.shapes.emf.model.Shape#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.eclipse.gef.examples.shapes.emf.model.Shape#getY()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gef.examples.shapes.emf.model.Shape#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.eclipse.gef.examples.shapes.emf.model.Shape#getWidth()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gef.examples.shapes.emf.model.Shape#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.eclipse.gef.examples.shapes.emf.model.Shape#getHeight()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_Height();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gef.examples.shapes.emf.model.Shape#getSourceConnections <em>Source Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Connections</em>'.
	 * @see org.eclipse.gef.examples.shapes.emf.model.Shape#getSourceConnections()
	 * @see #getShape()
	 * Test @wi.jjjj COMP-559 TEST 2
	 */
	EReference getShape_SourceConnections();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gef.examples.shapes.emf.model.Shape#getTargetConnections <em>Target Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Connections</em>'.
	 * @see org.eclipse.gef.examples.shapes.emf.model.Shape#getTargetConnections()
	 * @see #getShape()
	 * @generated
	 */
	EReference getShape_TargetConnections();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gef.examples.shapes.emf.model.ShapesDiagram <em>Shapes Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shapes Diagram</em>'.
	 * @see org.eclipse.gef.examples.shapes.emf.model.ShapesDiagram
	 * @generated
	 */
	EClass getShapesDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gef.examples.shapes.emf.model.ShapesDiagram#getShapes <em>Shapes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shapes</em>'.
	 * @see org.eclipse.gef.examples.shapes.emf.model.ShapesDiagram#getShapes()
	 * @see #getShapesDiagram()
	 * @generated
	 */
	EReference getShapesDiagram_Shapes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gef.examples.shapes.emf.model.MemoryMapShape <em>Memory Map Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Map Shape</em>'.
	 * @see org.eclipse.gef.examples.shapes.emf.model.MemoryMapShape
	 * @generated
	 */
	EClass getMemoryMapShape();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gef.examples.shapes.emf.model.MemoryMapShape#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.gef.examples.shapes.emf.model.MemoryMapShape#getName()
	 * @see #getMemoryMapShape()
	 * @generated
	 */
	EAttribute getMemoryMapShape_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gef.examples.shapes.emf.model.MemoryMapShape#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.eclipse.gef.examples.shapes.emf.model.MemoryMapShape#getAddress()
	 * @see #getMemoryMapShape()
	 * @generated
	 */
	EAttribute getMemoryMapShape_Address();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gef.examples.shapes.emf.model.MemoryMapShape#getEndAddress <em>End Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Address</em>'.
	 * @see org.eclipse.gef.examples.shapes.emf.model.MemoryMapShape#getEndAddress()
	 * @see #getMemoryMapShape()
	 * @generated
	 */
	EAttribute getMemoryMapShape_EndAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gef.examples.shapes.emf.model.MemoryMapShape#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.eclipse.gef.examples.shapes.emf.model.MemoryMapShape#getSize()
	 * @see #getMemoryMapShape()
	 * @generated
	 */
	EAttribute getMemoryMapShape_Size();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.swt.graphics.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Image</em>'.
	 * @see org.eclipse.swt.graphics.Image
	 * @model instanceClass="org.eclipse.swt.graphics.Image"
	 * @generated
	 */
	EDataType getImage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * Test @wi.jjjj COMP-559 TEST 3
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.gef.examples.shapes.emf.model.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gef.examples.shapes.emf.model.impl.ConnectionImpl
		 * @see org.eclipse.gef.examples.shapes.emf.model.impl.ModelPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__SOURCE = eINSTANCE.getConnection_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TARGET = eINSTANCE.getConnection_Target();

		/**
		 * The meta object literal for the '<em><b>Dashed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__DASHED = eINSTANCE.getConnection_Dashed();

		/**
		 * The meta object literal for the '{@link org.eclipse.gef.examples.shapes.emf.model.impl.EllipticalShapeImpl <em>Elliptical Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gef.examples.shapes.emf.model.impl.EllipticalShapeImpl
		 * @see org.eclipse.gef.examples.shapes.emf.model.impl.ModelPackageImpl#getEllipticalShape()
		 * @generated
		 */
		EClass ELLIPTICAL_SHAPE = eINSTANCE.getEllipticalShape();

		/**
		 * The meta object literal for the '{@link org.eclipse.gef.examples.shapes.emf.model.impl.RectangularShapeImpl <em>Rectangular Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gef.examples.shapes.emf.model.impl.RectangularShapeImpl
		 * @see org.eclipse.gef.examples.shapes.emf.model.impl.ModelPackageImpl#getRectangularShape()
		 * @generated
		 */
		EClass RECTANGULAR_SHAPE = eINSTANCE.getRectangularShape();

		/**
		 * The meta object literal for the '{@link org.eclipse.gef.examples.shapes.emf.model.impl.ShapeImpl <em>Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gef.examples.shapes.emf.model.impl.ShapeImpl
		 * @see org.eclipse.gef.examples.shapes.emf.model.impl.ModelPackageImpl#getShape()
		 * @generated
		 */
		EClass SHAPE = eINSTANCE.getShape();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__X = eINSTANCE.getShape_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__Y = eINSTANCE.getShape_Y();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__WIDTH = eINSTANCE.getShape_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__HEIGHT = eINSTANCE.getShape_Height();

		/**
		 * The meta object literal for the '<em><b>Source Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE__SOURCE_CONNECTIONS = eINSTANCE.getShape_SourceConnections();

		/**
		 * The meta object literal for the '<em><b>Target Connections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE__TARGET_CONNECTIONS = eINSTANCE.getShape_TargetConnections();

		/**
		 * The meta object literal for the '{@link org.eclipse.gef.examples.shapes.emf.model.impl.ShapesDiagramImpl <em>Shapes Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gef.examples.shapes.emf.model.impl.ShapesDiagramImpl
		 * @see org.eclipse.gef.examples.shapes.emf.model.impl.ModelPackageImpl#getShapesDiagram()
		 * @generated
		 */
		EClass SHAPES_DIAGRAM = eINSTANCE.getShapesDiagram();

		/**
		 * The meta object literal for the '<em><b>Shapes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPES_DIAGRAM__SHAPES = eINSTANCE.getShapesDiagram_Shapes();

		/**
		 * The meta object literal for the '{@link org.eclipse.gef.examples.shapes.emf.model.impl.MemoryMapShapeImpl <em>Memory Map Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gef.examples.shapes.emf.model.impl.MemoryMapShapeImpl
		 * @see org.eclipse.gef.examples.shapes.emf.model.impl.ModelPackageImpl#getMemoryMapShape()
		 * @generated
		 */
		EClass MEMORY_MAP_SHAPE = eINSTANCE.getMemoryMapShape();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_MAP_SHAPE__NAME = eINSTANCE.getMemoryMapShape_Name();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_MAP_SHAPE__ADDRESS = eINSTANCE.getMemoryMapShape_Address();

		/**
		 * The meta object literal for the '<em><b>End Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_MAP_SHAPE__END_ADDRESS = eINSTANCE.getMemoryMapShape_EndAddress();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_MAP_SHAPE__SIZE = eINSTANCE.getMemoryMapShape_Size();

		/**
		 * The meta object literal for the '<em>Image</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.swt.graphics.Image
		 * @see org.eclipse.gef.examples.shapes.emf.model.impl.ModelPackageImpl#getImage()
		 * @generated
		 */
		EDataType IMAGE = eINSTANCE.getImage();

	}

} //ModelPackage
