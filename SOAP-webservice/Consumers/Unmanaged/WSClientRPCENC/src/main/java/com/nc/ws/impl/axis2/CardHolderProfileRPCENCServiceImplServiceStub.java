/**
 * CardHolderProfileRPCENCServiceImplServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package com.nc.ws.impl.axis2;

import javax.xml.namespace.QName;

/*
 *  CardHolderProfileRPCENCServiceImplServiceStub java implementation
 */

public class CardHolderProfileRPCENCServiceImplServiceStub extends
		org.apache.axis2.client.Stub {
	protected org.apache.axis2.description.AxisOperation[] _operations;

	// hashmaps to keep the fault mapping
	private final java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
	private final java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
	private final java.util.HashMap faultMessageMap = new java.util.HashMap();

	private static int counter = 0;

	private static synchronized java.lang.String getUniqueSuffix() {
		// reset the counter if it is greater than 99999
		if (counter > 99999) {
			counter = 0;
		}
		counter = counter + 1;
		return java.lang.Long.toString(java.lang.System.currentTimeMillis())
				+ "_" + counter;
	}

	private void populateAxisService() throws org.apache.axis2.AxisFault {

		// creating the Service with a unique name
		_service = new org.apache.axis2.description.AxisService(
				"CardHolderProfileRPCENCServiceImplService" + getUniqueSuffix());
		addAnonymousOperations();

		// creating the operations
		org.apache.axis2.description.AxisOperation __operation;

		_operations = new org.apache.axis2.description.AxisOperation[1];

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://intf.ws.nc.com/", "checkProfile"));
		_service.addOperation(__operation);

		_operations[0] = __operation;

	}

	// populates the faults
	private void populateFaults() {

	}

	/**
	 * Constructor that takes in a configContext
	 */

	public CardHolderProfileRPCENCServiceImplServiceStub(
			final org.apache.axis2.context.ConfigurationContext configurationContext,
			final java.lang.String targetEndpoint)
			throws org.apache.axis2.AxisFault {
		this(configurationContext, targetEndpoint, false);
	}

	/**
	 * Constructor that takes in a configContext and useseperate listner
	 */
	public CardHolderProfileRPCENCServiceImplServiceStub(
			final org.apache.axis2.context.ConfigurationContext configurationContext,
			final java.lang.String targetEndpoint,
			final boolean useSeparateListener)
			throws org.apache.axis2.AxisFault {
		// To populate AxisService
		populateAxisService();
		populateFaults();

		_serviceClient = new org.apache.axis2.client.ServiceClient(
				configurationContext, _service);

		_serviceClient.getOptions().setTo(
				new org.apache.axis2.addressing.EndpointReference(
						targetEndpoint));
		_serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

	}

	/**
	 * Default Constructor
	 */
	public CardHolderProfileRPCENCServiceImplServiceStub(
			final org.apache.axis2.context.ConfigurationContext configurationContext)
			throws org.apache.axis2.AxisFault {

		this(configurationContext, "http://localhost:9001/ws/rpcenc");

	}

	/**
	 * Default Constructor
	 */
	public CardHolderProfileRPCENCServiceImplServiceStub()
			throws org.apache.axis2.AxisFault {

		this("http://localhost:9001/ws/rpcenc");

	}

	/**
	 * Constructor taking the target endpoint
	 */
	public CardHolderProfileRPCENCServiceImplServiceStub(
			final java.lang.String targetEndpoint)
			throws org.apache.axis2.AxisFault {
		this(null, targetEndpoint);
	}

	/**
	 * Auto generated method signature
	 * 
	 * @see com.nc.ws.impl.CardHolderProfileRPCENCServiceImplService#checkProfile
	 * @param checkProfile0
	 */

	public com.nc.ws.impl.axis2.CardHolderProfileRPCENCServiceImplServiceStub.CheckProfileResponse checkProfile(

			final com.nc.ws.impl.axis2.CardHolderProfileRPCENCServiceImplServiceStub.CheckProfile checkProfile0)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[0].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://intf.ws.nc.com/CardHolderProfileRPCENCService/checkProfileRequest");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), checkProfile0,
					optimizeContent(new javax.xml.namespace.QName(
							"http://intf.ws.nc.com/", "checkProfile")),
					new javax.xml.namespace.QName("http://intf.ws.nc.com/",
							"checkProfile"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			final java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.nc.ws.impl.axis2.CardHolderProfileRPCENCServiceImplServiceStub.CheckProfileResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.nc.ws.impl.axis2.CardHolderProfileRPCENCServiceImplServiceStub.CheckProfileResponse) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(
								faultElt.getQName(), "checkProfile"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "checkProfile"));
						final java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor
								.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "checkProfile"));
						final java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						final java.lang.reflect.Method m = exceptionClass
								.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see com.nc.ws.impl.CardHolderProfileRPCENCServiceImplService#startcheckProfile
	 * @param checkProfile0
	 */
	public void startcheckProfile(

			final com.nc.ws.impl.axis2.CardHolderProfileRPCENCServiceImplServiceStub.CheckProfile checkProfile0,

			final com.nc.ws.impl.axis2.CardHolderProfileRPCENCServiceImplServiceCallbackHandler callback)

	throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[0].getName());
		_operationClient
				.getOptions()
				.setAction(
						"http://intf.ws.nc.com/CardHolderProfileRPCENCService/checkProfileRequest");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), checkProfile0,
				optimizeContent(new javax.xml.namespace.QName(
						"http://intf.ws.nc.com/", "checkProfile")),
				new javax.xml.namespace.QName("http://intf.ws.nc.com/",
						"checkProfile"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					@Override
					public void onMessage(
							final org.apache.axis2.context.MessageContext resultContext) {
						try {
							final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							final java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.nc.ws.impl.axis2.CardHolderProfileRPCENCServiceImplServiceStub.CheckProfileResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback.receiveResultcheckProfile((com.nc.ws.impl.axis2.CardHolderProfileRPCENCServiceImplServiceStub.CheckProfileResponse) object);

						} catch (final org.apache.axis2.AxisFault e) {
							callback.receiveErrorcheckProfile(e);
						}
					}

					@Override
					public void onError(final java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							final org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap
										.containsKey(new org.apache.axis2.client.FaultMapKey(
												faultElt.getQName(),
												"checkProfile"))) {
									// make the fault by reflection
									try {
										final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"checkProfile"));
										final java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										final java.lang.reflect.Constructor constructor = exceptionClass
												.getConstructor(String.class);
										final java.lang.Exception ex = (java.lang.Exception) constructor
												.newInstance(f.getMessage());
										// message class
										final java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"checkProfile"));
										final java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										final java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										final java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m.invoke(
												ex,
												new java.lang.Object[] { messageObject });

										callback.receiveErrorcheckProfile(new java.rmi.RemoteException(
												ex.getMessage(), ex));
									} catch (final java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorcheckProfile(f);
									} catch (final java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorcheckProfile(f);
									} catch (final java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorcheckProfile(f);
									} catch (final java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorcheckProfile(f);
									} catch (final java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorcheckProfile(f);
									} catch (final java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorcheckProfile(f);
									} catch (final org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorcheckProfile(f);
									}
								} else {
									callback.receiveErrorcheckProfile(f);
								}
							} else {
								callback.receiveErrorcheckProfile(f);
							}
						} else {
							callback.receiveErrorcheckProfile(error);
						}
					}

					@Override
					public void onFault(
							final org.apache.axis2.context.MessageContext faultContext) {
						final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					@Override
					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (final org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorcheckProfile(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[0].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[0].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * A utility method that copies the namepaces from the SOAPEnvelope
	 */
	private java.util.Map getEnvelopeNamespaces(
			final org.apache.axiom.soap.SOAPEnvelope env) {
		final java.util.Map returnMap = new java.util.HashMap();
		final java.util.Iterator namespaceIterator = env
				.getAllDeclaredNamespaces();
		while (namespaceIterator.hasNext()) {
			final org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator
					.next();
			returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
		}
		return returnMap;
	}

	private final javax.xml.namespace.QName[] opNameArray = null;

	private boolean optimizeContent(final javax.xml.namespace.QName opName) {

		if (opNameArray == null) {
			return false;
		}
		for (final QName element : opNameArray) {
			if (opName.equals(element)) {
				return true;
			}
		}
		return false;
	}

	// http://localhost:9001/ws/rpcenc
	public static class CardHolder implements
			org.apache.axis2.databinding.ADBBean {
		/*
		 * This type was generated from the piece of schema that had name =
		 * cardHolder Namespace URI = http://intf.ws.nc.com/ Namespace Prefix =
		 * ns1
		 */

		/**
		 * field for AnnualIncome
		 */

		protected double localAnnualIncome;

		/**
		 * Auto generated getter method
		 * 
		 * @return double
		 */
		public double getAnnualIncome() {
			return localAnnualIncome;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *            AnnualIncome
		 */
		public void setAnnualIncome(final double param) {

			this.localAnnualIncome = param;

		}

		/**
		 * field for Cards This was an Array!
		 */

		protected Card[] localCards;

		/*
		 * This tracker boolean wil be used to detect whether the user called
		 * the set method for this attribute. It will be used to determine
		 * whether to include this field in the serialized XML
		 */
		protected boolean localCardsTracker = false;

		public boolean isCardsSpecified() {
			return localCardsTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return Card[]
		 */
		public Card[] getCards() {
			return localCards;
		}

		/**
		 * validate the array for Cards
		 */
		protected void validateCards(final Card[] param) {

		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *            Cards
		 */
		public void setCards(final Card[] param) {

			validateCards(param);

			localCardsTracker = true;

			this.localCards = param;
		}

		/**
		 * Auto generated add method for the array for convenience
		 * 
		 * @param param
		 *            Card
		 */
		public void addCards(final Card param) {
			if (localCards == null) {
				localCards = new Card[] {};
			}

			// update the setting tracker
			localCardsTracker = true;

			final java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil
					.toList(localCards);
			list.add(param);
			this.localCards = (Card[]) list.toArray(new Card[list.size()]);

		}

		/**
		 * field for Id
		 */

		protected int localId;

		/**
		 * Auto generated getter method
		 * 
		 * @return int
		 */
		public int getId() {
			return localId;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *            Id
		 */
		public void setId(final int param) {

			this.localId = param;

		}

		/**
		 * field for Message
		 */

		protected java.lang.String localMessage;

		/*
		 * This tracker boolean wil be used to detect whether the user called
		 * the set method for this attribute. It will be used to determine
		 * whether to include this field in the serialized XML
		 */
		protected boolean localMessageTracker = false;

		public boolean isMessageSpecified() {
			return localMessageTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public java.lang.String getMessage() {
			return localMessage;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *            Message
		 */
		public void setMessage(final java.lang.String param) {
			localMessageTracker = param != null;

			this.localMessage = param;

		}

		/**
		 * field for Name
		 */

		protected java.lang.String localName;

		/*
		 * This tracker boolean wil be used to detect whether the user called
		 * the set method for this attribute. It will be used to determine
		 * whether to include this field in the serialized XML
		 */
		protected boolean localNameTracker = false;

		public boolean isNameSpecified() {
			return localNameTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public java.lang.String getName() {
			return localName;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *            Name
		 */
		public void setName(final java.lang.String param) {
			localNameTracker = param != null;

			this.localName = param;

		}

		/**
		 * field for OverallCreditLimit
		 */

		protected double localOverallCreditLimit;

		/**
		 * Auto generated getter method
		 * 
		 * @return double
		 */
		public double getOverallCreditLimit() {
			return localOverallCreditLimit;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *            OverallCreditLimit
		 */
		public void setOverallCreditLimit(final double param) {

			this.localOverallCreditLimit = param;

		}

		/**
		 * field for Status
		 */

		protected Status localStatus;

		/*
		 * This tracker boolean wil be used to detect whether the user called
		 * the set method for this attribute. It will be used to determine
		 * whether to include this field in the serialized XML
		 */
		protected boolean localStatusTracker = false;

		public boolean isStatusSpecified() {
			return localStatusTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return Status
		 */
		public Status getStatus() {
			return localStatus;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *            Status
		 */
		public void setStatus(final Status param) {
			localStatusTracker = param != null;

			this.localStatus = param;

		}

		/**
		 * 
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		@Override
		public org.apache.axiom.om.OMElement getOMElement(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory)
				throws org.apache.axis2.databinding.ADBException {

			final org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(
					this, parentQName);
			return factory.createOMElement(dataSource, parentQName);

		}

		@Override
		public void serialize(final javax.xml.namespace.QName parentQName,
				final javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException,
				org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		@Override
		public void serialize(final javax.xml.namespace.QName parentQName,
				final javax.xml.stream.XMLStreamWriter xmlWriter,
				final boolean serializeType)
				throws javax.xml.stream.XMLStreamException,
				org.apache.axis2.databinding.ADBException {

			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(),
					xmlWriter);

			if (serializeType) {

				final java.lang.String namespacePrefix = registerPrefix(
						xmlWriter, "http://intf.ws.nc.com/");
				if ((namespacePrefix != null)
						&& (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi",
							"http://www.w3.org/2001/XMLSchema-instance",
							"type", namespacePrefix + ":cardHolder", xmlWriter);
				} else {
					writeAttribute("xsi",
							"http://www.w3.org/2001/XMLSchema-instance",
							"type", "cardHolder", xmlWriter);
				}

			}

			namespace = "";
			writeStartElement(null, namespace, "annualIncome", xmlWriter);

			if (java.lang.Double.isNaN(localAnnualIncome)) {

				throw new org.apache.axis2.databinding.ADBException(
						"annualIncome cannot be null!!");

			} else {
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localAnnualIncome));
			}

			xmlWriter.writeEndElement();
			if (localCardsTracker) {
				if (localCards != null) {
					for (final Card localCard : localCards) {
						if (localCard != null) {
							localCard.serialize(new javax.xml.namespace.QName(
									"", "cards"), xmlWriter);
						} else {

							writeStartElement(null, "", "cards", xmlWriter);

							// write the nil attribute
							writeAttribute(
									"xsi",
									"http://www.w3.org/2001/XMLSchema-instance",
									"nil", "1", xmlWriter);
							xmlWriter.writeEndElement();

						}

					}
				} else {

					writeStartElement(null, "", "cards", xmlWriter);

					// write the nil attribute
					writeAttribute("xsi",
							"http://www.w3.org/2001/XMLSchema-instance", "nil",
							"1", xmlWriter);
					xmlWriter.writeEndElement();

				}
			}
			namespace = "";
			writeStartElement(null, namespace, "id", xmlWriter);

			if (localId == java.lang.Integer.MIN_VALUE) {

				throw new org.apache.axis2.databinding.ADBException(
						"id cannot be null!!");

			} else {
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localId));
			}

			xmlWriter.writeEndElement();
			if (localMessageTracker) {
				namespace = "";
				writeStartElement(null, namespace, "message", xmlWriter);

				if (localMessage == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException(
							"message cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localMessage);

				}

				xmlWriter.writeEndElement();
			}
			if (localNameTracker) {
				namespace = "";
				writeStartElement(null, namespace, "name", xmlWriter);

				if (localName == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException(
							"name cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localName);

				}

				xmlWriter.writeEndElement();
			}
			namespace = "";
			writeStartElement(null, namespace, "overallCreditLimit", xmlWriter);

			if (java.lang.Double.isNaN(localOverallCreditLimit)) {

				throw new org.apache.axis2.databinding.ADBException(
						"overallCreditLimit cannot be null!!");

			} else {
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localOverallCreditLimit));
			}

			xmlWriter.writeEndElement();
			if (localStatusTracker) {
				if (localStatus == null) {
					throw new org.apache.axis2.databinding.ADBException(
							"status cannot be null!!");
				}
				localStatus.serialize(new javax.xml.namespace.QName("",
						"status"), xmlWriter);
			}
			xmlWriter.writeEndElement();

		}

		private static java.lang.String generatePrefix(
				final java.lang.String namespace) {
			if (namespace.equals("http://intf.ws.nc.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil
					.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(java.lang.String prefix,
				final java.lang.String namespace,
				final java.lang.String localPart,
				final javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			final java.lang.String writerPrefix = xmlWriter
					.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(final java.lang.String prefix,
				final java.lang.String namespace,
				final java.lang.String attName,
				final java.lang.String attValue,
				final javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(final java.lang.String namespace,
				final java.lang.String attName,
				final java.lang.String attValue,
				final javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(final java.lang.String namespace,
				final java.lang.String attName,
				final javax.xml.namespace.QName qname,
				final javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			final java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter
					.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(final javax.xml.namespace.QName qname,
				final javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			final java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(prefix
							+ ":"
							+ org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter
							.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(qname));
				}

			} else {
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(qname));
			}
		}

		private void writeQNames(final javax.xml.namespace.QName[] qnames,
				final javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not
				// possible to write any
				// namespace data after writing the charactor data
				final java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite
									.append(prefix)
									.append(":")
									.append(org.apache.axis2.databinding.utils.ConverterUtil
											.convertToString(qnames[i]));
						} else {
							stringToWrite
									.append(org.apache.axis2.databinding.utils.ConverterUtil
											.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil
										.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(
				final javax.xml.stream.XMLStreamWriter xmlWriter,
				final java.lang.String namespace)
				throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				final javax.xml.namespace.NamespaceContext nsContext = xmlWriter
						.getNamespaceContext();
				while (true) {
					final java.lang.String uri = nsContext
							.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil
							.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 * 
		 */
		@Override
		public javax.xml.stream.XMLStreamReader getPullParser(
				final javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			final java.util.ArrayList elementList = new java.util.ArrayList();
			final java.util.ArrayList attribList = new java.util.ArrayList();

			elementList.add(new javax.xml.namespace.QName("", "annualIncome"));

			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
					.convertToString(localAnnualIncome));
			if (localCardsTracker) {
				if (localCards != null) {
					for (final Card localCard : localCards) {

						if (localCard != null) {
							elementList.add(new javax.xml.namespace.QName("",
									"cards"));
							elementList.add(localCard);
						} else {

							elementList.add(new javax.xml.namespace.QName("",
									"cards"));
							elementList.add(null);

						}

					}
				} else {

					elementList.add(new javax.xml.namespace.QName("", "cards"));
					elementList.add(localCards);

				}

			}
			elementList.add(new javax.xml.namespace.QName("", "id"));

			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
					.convertToString(localId));
			if (localMessageTracker) {
				elementList.add(new javax.xml.namespace.QName("", "message"));

				if (localMessage != null) {
					elementList
							.add(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(localMessage));
				} else {
					throw new org.apache.axis2.databinding.ADBException(
							"message cannot be null!!");
				}
			}
			if (localNameTracker) {
				elementList.add(new javax.xml.namespace.QName("", "name"));

				if (localName != null) {
					elementList
							.add(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(localName));
				} else {
					throw new org.apache.axis2.databinding.ADBException(
							"name cannot be null!!");
				}
			}
			elementList.add(new javax.xml.namespace.QName("",
					"overallCreditLimit"));

			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
					.convertToString(localOverallCreditLimit));
			if (localStatusTracker) {
				elementList.add(new javax.xml.namespace.QName("", "status"));

				if (localStatus == null) {
					throw new org.apache.axis2.databinding.ADBException(
							"status cannot be null!!");
				}
				elementList.add(localStatus);
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(
					qName, elementList.toArray(), attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object
			 * is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this
			 * object is not an element, it is a complex type and the reader is
			 * at the event just after the outer start element Postcondition: If
			 * this object is an element, the reader is positioned at its end
			 * element If this object is a complex type, the reader is
			 * positioned at the end element of its outer element
			 */
			public static CardHolder parse(
					final javax.xml.stream.XMLStreamReader reader)
					throws java.lang.Exception {
				final CardHolder object = new CardHolder();

				java.lang.String nillableValue = null;
				try {

					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					if (reader
							.getAttributeValue(
									"http://www.w3.org/2001/XMLSchema-instance",
									"type") != null) {
						final java.lang.String fullTypeName = reader
								.getAttributeValue(
										"http://www.w3.org/2001/XMLSchema-instance",
										"type");
						if (fullTypeName != null) {
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0,
										fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							final java.lang.String type = fullTypeName
									.substring(fullTypeName.indexOf(":") + 1);

							if (!"cardHolder".equals(type)) {
								// find namespace for the prefix
								final java.lang.String nsUri = reader
										.getNamespaceContext().getNamespaceURI(
												nsPrefix);
								return (CardHolder) ExtensionMapper
										.getTypeObject(nsUri, type, reader);
							}

						}

					}

					new java.util.Vector();

					reader.next();

					final java.util.ArrayList list2 = new java.util.ArrayList();

					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "annualIncome")
									.equals(reader.getName())) {

						nillableValue = reader.getAttributeValue(
								"http://www.w3.org/2001/XMLSchema-instance",
								"nil");
						if ("true".equals(nillableValue)
								|| "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "annualIncome"
											+ "  cannot be null");
						}

						final java.lang.String content = reader
								.getElementText();

						object.setAnnualIncome(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToDouble(content));

						reader.next();

					} // End of if for expected property start element

					else {
						// A start element we are not expecting indicates an
						// invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());
					}

					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "cards")
									.equals(reader.getName())) {

						// Process the array and step past its final element's
						// end.

						nillableValue = reader.getAttributeValue(
								"http://www.w3.org/2001/XMLSchema-instance",
								"nil");
						if ("true".equals(nillableValue)
								|| "1".equals(nillableValue)) {
							list2.add(null);
							reader.next();
						} else {
							list2.add(Card.Factory.parse(reader));
						}
						// loop until we find a start element that is not part
						// of this array
						boolean loopDone2 = false;
						while (!loopDone2) {
							// We should be at the end element, but make sure
							while (!reader.isEndElement()) {
								reader.next();
							}
							// Step out of this element
							reader.next();
							// Step to next element event.
							while (!reader.isStartElement()
									&& !reader.isEndElement()) {
								reader.next();
							}
							if (reader.isEndElement()) {
								// two continuous end elements means we are
								// exiting the xml structure
								loopDone2 = true;
							} else {
								if (new javax.xml.namespace.QName("", "cards")
										.equals(reader.getName())) {

									nillableValue = reader
											.getAttributeValue(
													"http://www.w3.org/2001/XMLSchema-instance",
													"nil");
									if ("true".equals(nillableValue)
											|| "1".equals(nillableValue)) {
										list2.add(null);
										reader.next();
									} else {
										list2.add(Card.Factory.parse(reader));
									}
								} else {
									loopDone2 = true;
								}
							}
						}
						// call the converter utility to convert and set the
						// array

						object.setCards((Card[]) org.apache.axis2.databinding.utils.ConverterUtil
								.convertToArray(Card.class, list2));

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "id")
									.equals(reader.getName())) {

						nillableValue = reader.getAttributeValue(
								"http://www.w3.org/2001/XMLSchema-instance",
								"nil");
						if ("true".equals(nillableValue)
								|| "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "id" + "  cannot be null");
						}

						final java.lang.String content = reader
								.getElementText();

						object.setId(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToInt(content));

						reader.next();

					} // End of if for expected property start element

					else {
						// A start element we are not expecting indicates an
						// invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());
					}

					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "message")
									.equals(reader.getName())) {

						nillableValue = reader.getAttributeValue(
								"http://www.w3.org/2001/XMLSchema-instance",
								"nil");
						if ("true".equals(nillableValue)
								|| "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "message"
											+ "  cannot be null");
						}

						final java.lang.String content = reader
								.getElementText();

						object.setMessage(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "name")
									.equals(reader.getName())) {

						nillableValue = reader.getAttributeValue(
								"http://www.w3.org/2001/XMLSchema-instance",
								"nil");
						if ("true".equals(nillableValue)
								|| "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "name"
											+ "  cannot be null");
						}

						final java.lang.String content = reader
								.getElementText();

						object.setName(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("",
									"overallCreditLimit").equals(reader
									.getName())) {

						nillableValue = reader.getAttributeValue(
								"http://www.w3.org/2001/XMLSchema-instance",
								"nil");
						if ("true".equals(nillableValue)
								|| "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "overallCreditLimit"
											+ "  cannot be null");
						}

						final java.lang.String content = reader
								.getElementText();

						object.setOverallCreditLimit(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToDouble(content));

						reader.next();

					} // End of if for expected property start element

					else {
						// A start element we are not expecting indicates an
						// invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());
					}

					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "status")
									.equals(reader.getName())) {

						object.setStatus(Status.Factory.parse(reader));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					if (reader.isStartElement()) {
						// A start element we are not expecting indicates a
						// trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());
					}

				} catch (final javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class Status implements org.apache.axis2.databinding.ADBBean {

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://intf.ws.nc.com/", "status", "ns1");

		/**
		 * field for Status
		 */

		protected java.lang.String localStatus;

		private static java.util.HashMap _table_ = new java.util.HashMap();

		// Constructor

		protected Status(final java.lang.String value,
				final boolean isRegisterValue) {
			localStatus = value;
			if (isRegisterValue) {

				_table_.put(localStatus, this);

			}

		}

		public static final java.lang.String _HIGH_RISK = org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString("HIGH_RISK");

		public static final java.lang.String _LOW_RISK = org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString("LOW_RISK");

		public static final java.lang.String _MODERATE_RISK = org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString("MODERATE_RISK");

		public static final java.lang.String _NORMAL = org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString("NORMAL");

		public static final Status HIGH_RISK = new Status(_HIGH_RISK, true);

		public static final Status LOW_RISK = new Status(_LOW_RISK, true);

		public static final Status MODERATE_RISK = new Status(_MODERATE_RISK,
				true);

		public static final Status NORMAL = new Status(_NORMAL, true);

		public java.lang.String getValue() {
			return localStatus;
		}

		@Override
		public boolean equals(final java.lang.Object obj) {
			return (obj == this);
		}

		@Override
		public int hashCode() {
			return toString().hashCode();
		}

		@Override
		public java.lang.String toString() {

			return localStatus.toString();

		}

		/**
		 * 
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		@Override
		public org.apache.axiom.om.OMElement getOMElement(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory)
				throws org.apache.axis2.databinding.ADBException {

			final org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(
					this, MY_QNAME);
			return factory.createOMElement(dataSource, MY_QNAME);

		}

		@Override
		public void serialize(final javax.xml.namespace.QName parentQName,
				final javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException,
				org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		@Override
		public void serialize(final javax.xml.namespace.QName parentQName,
				final javax.xml.stream.XMLStreamWriter xmlWriter,
				final boolean serializeType)
				throws javax.xml.stream.XMLStreamException,
				org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with
			// it

			final java.lang.String namespace = parentQName.getNamespaceURI();
			final java.lang.String _localName = parentQName.getLocalPart();

			writeStartElement(null, namespace, _localName, xmlWriter);

			// add the type details if this is used in a simple type
			if (serializeType) {
				final java.lang.String namespacePrefix = registerPrefix(
						xmlWriter, "http://intf.ws.nc.com/");
				if ((namespacePrefix != null)
						&& (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi",
							"http://www.w3.org/2001/XMLSchema-instance",
							"type", namespacePrefix + ":status", xmlWriter);
				} else {
					writeAttribute("xsi",
							"http://www.w3.org/2001/XMLSchema-instance",
							"type", "status", xmlWriter);
				}
			}

			if (localStatus == null) {

				throw new org.apache.axis2.databinding.ADBException(
						"status cannot be null !!");

			} else {

				xmlWriter.writeCharacters(localStatus);

			}

			xmlWriter.writeEndElement();

		}

		private static java.lang.String generatePrefix(
				final java.lang.String namespace) {
			if (namespace.equals("http://intf.ws.nc.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil
					.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(java.lang.String prefix,
				final java.lang.String namespace,
				final java.lang.String localPart,
				final javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			final java.lang.String writerPrefix = xmlWriter
					.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(final java.lang.String prefix,
				final java.lang.String namespace,
				final java.lang.String attName,
				final java.lang.String attValue,
				final javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(final java.lang.String namespace,
				final java.lang.String attName,
				final java.lang.String attValue,
				final javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(final java.lang.String namespace,
				final java.lang.String attName,
				final javax.xml.namespace.QName qname,
				final javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			final java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter
					.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(final javax.xml.namespace.QName qname,
				final javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			final java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(prefix
							+ ":"
							+ org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter
							.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(qname));
				}

			} else {
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(qname));
			}
		}

		private void writeQNames(final javax.xml.namespace.QName[] qnames,
				final javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not
				// possible to write any
				// namespace data after writing the charactor data
				final java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite
									.append(prefix)
									.append(":")
									.append(org.apache.axis2.databinding.utils.ConverterUtil
											.convertToString(qnames[i]));
						} else {
							stringToWrite
									.append(org.apache.axis2.databinding.utils.ConverterUtil
											.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil
										.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(
				final javax.xml.stream.XMLStreamWriter xmlWriter,
				final java.lang.String namespace)
				throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				final javax.xml.namespace.NamespaceContext nsContext = xmlWriter
						.getNamespaceContext();
				while (true) {
					final java.lang.String uri = nsContext
							.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil
							.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 * 
		 */
		@Override
		public javax.xml.stream.XMLStreamReader getPullParser(
				final javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with
			// it
			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(
					MY_QNAME,
					new java.lang.Object[] {
							org.apache.axis2.databinding.utils.reader.ADBXMLStreamReader.ELEMENT_TEXT,
							org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(localStatus) }, null);

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			public static Status fromValue(final java.lang.String value)
					throws java.lang.IllegalArgumentException {
				final Status enumeration = (Status)

				_table_.get(value);

				if ((enumeration == null)
						&& !((value == null) || (value.equals("")))) {
					throw new java.lang.IllegalArgumentException();
				}
				return enumeration;
			}

			public static Status fromString(final java.lang.String value,
					final java.lang.String namespaceURI)
					throws java.lang.IllegalArgumentException {
				try {

					return fromValue(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(value));

				} catch (final java.lang.Exception e) {
					throw new java.lang.IllegalArgumentException();
				}
			}

			public static Status fromString(
					final javax.xml.stream.XMLStreamReader xmlStreamReader,
					final java.lang.String content) {
				if (content.indexOf(":") > -1) {
					final java.lang.String prefix = content.substring(0,
							content.indexOf(":"));
					final java.lang.String namespaceUri = xmlStreamReader
							.getNamespaceContext().getNamespaceURI(prefix);
					return Status.Factory.fromString(content, namespaceUri);
				} else {
					return Status.Factory.fromString(content, "");
				}
			}

			/**
			 * static method to create the object Precondition: If this object
			 * is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this
			 * object is not an element, it is a complex type and the reader is
			 * at the event just after the outer start element Postcondition: If
			 * this object is an element, the reader is positioned at its end
			 * element If this object is a complex type, the reader is
			 * positioned at the end element of its outer element
			 */
			public static Status parse(
					final javax.xml.stream.XMLStreamReader reader)
					throws java.lang.Exception {
				Status object = null;
				new java.util.HashMap();
				new java.util.ArrayList<org.apache.axiom.om.OMAttribute>();

				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					new java.util.Vector();

					while (!reader.isEndElement()) {
						if (reader.isStartElement() || reader.hasText()) {

							nillableValue = reader
									.getAttributeValue(
											"http://www.w3.org/2001/XMLSchema-instance",
											"nil");
							if ("true".equals(nillableValue)
									|| "1".equals(nillableValue)) {
								throw new org.apache.axis2.databinding.ADBException(
										"The element: " + "status"
												+ "  cannot be null");
							}

							final java.lang.String content = reader
									.getElementText();

							if (content.indexOf(":") > 0) {
								// this seems to be a Qname so find the
								// namespace and send
								prefix = content.substring(0,
										content.indexOf(":"));
								namespaceuri = reader.getNamespaceURI(prefix);
								object = Status.Factory.fromString(content,
										namespaceuri);
							} else {
								// this seems to be not a qname send and empty
								// namespace incase of it is
								// check is done in fromString method
								object = Status.Factory.fromString(content, "");
							}

						} else {
							reader.next();
						}
					} // end of while loop

				} catch (final javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class CheckProfileResponse implements
			org.apache.axis2.databinding.ADBBean {

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://intf.ws.nc.com/", "checkProfileResponse", "ns1");

		/**
		 * field for _return
		 */

		protected CardHolder local_return;

		/**
		 * Auto generated getter method
		 * 
		 * @return CardHolder
		 */
		public CardHolder get_return() {
			return local_return;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *            _return
		 */
		public void set_return(final CardHolder param) {

			this.local_return = param;

		}

		/**
		 * 
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		@Override
		public org.apache.axiom.om.OMElement getOMElement(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory)
				throws org.apache.axis2.databinding.ADBException {

			final org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(
					this, MY_QNAME);
			return factory.createOMElement(dataSource, MY_QNAME);

		}

		@Override
		public void serialize(final javax.xml.namespace.QName parentQName,
				final javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException,
				org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		@Override
		public void serialize(final javax.xml.namespace.QName parentQName,
				final javax.xml.stream.XMLStreamWriter xmlWriter,
				final boolean serializeType)
				throws javax.xml.stream.XMLStreamException,
				org.apache.axis2.databinding.ADBException {

			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(),
					xmlWriter);

			if (serializeType) {

				final java.lang.String namespacePrefix = registerPrefix(
						xmlWriter, "http://intf.ws.nc.com/");
				if ((namespacePrefix != null)
						&& (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi",
							"http://www.w3.org/2001/XMLSchema-instance",
							"type", namespacePrefix + ":checkProfileResponse",
							xmlWriter);
				} else {
					writeAttribute("xsi",
							"http://www.w3.org/2001/XMLSchema-instance",
							"type", "checkProfileResponse", xmlWriter);
				}

			}

			if (local_return == null) {

				writeStartElement(null, "", "return", xmlWriter);

				// write the nil attribute
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);
				xmlWriter.writeEndElement();
			} else {
				local_return.serialize(new javax.xml.namespace.QName("",
						"return"), xmlWriter);
			}

			xmlWriter.writeEndElement();

		}

		private static java.lang.String generatePrefix(
				final java.lang.String namespace) {
			if (namespace.equals("http://intf.ws.nc.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil
					.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(java.lang.String prefix,
				final java.lang.String namespace,
				final java.lang.String localPart,
				final javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			final java.lang.String writerPrefix = xmlWriter
					.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(final java.lang.String prefix,
				final java.lang.String namespace,
				final java.lang.String attName,
				final java.lang.String attValue,
				final javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(final java.lang.String namespace,
				final java.lang.String attName,
				final java.lang.String attValue,
				final javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(final java.lang.String namespace,
				final java.lang.String attName,
				final javax.xml.namespace.QName qname,
				final javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			final java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter
					.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(final javax.xml.namespace.QName qname,
				final javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			final java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(prefix
							+ ":"
							+ org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter
							.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(qname));
				}

			} else {
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(qname));
			}
		}

		private void writeQNames(final javax.xml.namespace.QName[] qnames,
				final javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not
				// possible to write any
				// namespace data after writing the charactor data
				final java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite
									.append(prefix)
									.append(":")
									.append(org.apache.axis2.databinding.utils.ConverterUtil
											.convertToString(qnames[i]));
						} else {
							stringToWrite
									.append(org.apache.axis2.databinding.utils.ConverterUtil
											.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil
										.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(
				final javax.xml.stream.XMLStreamWriter xmlWriter,
				final java.lang.String namespace)
				throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				final javax.xml.namespace.NamespaceContext nsContext = xmlWriter
						.getNamespaceContext();
				while (true) {
					final java.lang.String uri = nsContext
							.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil
							.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 * 
		 */
		@Override
		public javax.xml.stream.XMLStreamReader getPullParser(
				final javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			final java.util.ArrayList elementList = new java.util.ArrayList();
			final java.util.ArrayList attribList = new java.util.ArrayList();

			elementList.add(new javax.xml.namespace.QName("", "return"));

			elementList.add(local_return == null ? null : local_return);

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(
					qName, elementList.toArray(), attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object
			 * is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this
			 * object is not an element, it is a complex type and the reader is
			 * at the event just after the outer start element Postcondition: If
			 * this object is an element, the reader is positioned at its end
			 * element If this object is a complex type, the reader is
			 * positioned at the end element of its outer element
			 */
			public static CheckProfileResponse parse(
					final javax.xml.stream.XMLStreamReader reader)
					throws java.lang.Exception {
				final CheckProfileResponse object = new CheckProfileResponse();

				java.lang.String nillableValue = null;
				try {

					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					if (reader
							.getAttributeValue(
									"http://www.w3.org/2001/XMLSchema-instance",
									"type") != null) {
						final java.lang.String fullTypeName = reader
								.getAttributeValue(
										"http://www.w3.org/2001/XMLSchema-instance",
										"type");
						if (fullTypeName != null) {
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0,
										fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							final java.lang.String type = fullTypeName
									.substring(fullTypeName.indexOf(":") + 1);

							if (!"checkProfileResponse".equals(type)) {
								// find namespace for the prefix
								final java.lang.String nsUri = reader
										.getNamespaceContext().getNamespaceURI(
												nsPrefix);
								return (CheckProfileResponse) ExtensionMapper
										.getTypeObject(nsUri, type, reader);
							}

						}

					}

					new java.util.Vector();

					reader.next();

					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "return")
									.equals(reader.getName())) {

						nillableValue = reader.getAttributeValue(
								"http://www.w3.org/2001/XMLSchema-instance",
								"nil");
						if ("true".equals(nillableValue)
								|| "1".equals(nillableValue)) {
							object.set_return(null);
							reader.next();

							reader.next();

						} else {

							object.set_return(CardHolder.Factory.parse(reader));

							reader.next();
						}
					} // End of if for expected property start element

					else {
						// A start element we are not expecting indicates an
						// invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());
					}

					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					if (reader.isStartElement()) {
						// A start element we are not expecting indicates a
						// trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());
					}

				} catch (final javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class ExtensionMapper {

		public static java.lang.Object getTypeObject(
				final java.lang.String namespaceURI,
				final java.lang.String typeName,
				final javax.xml.stream.XMLStreamReader reader)
				throws java.lang.Exception {

			if ("http://intf.ws.nc.com/".equals(namespaceURI)
					&& "status".equals(typeName)) {

				return Status.Factory.parse(reader);

			}

			if ("http://intf.ws.nc.com/".equals(namespaceURI)
					&& "cardHolder".equals(typeName)) {

				return CardHolder.Factory.parse(reader);

			}

			if ("http://intf.ws.nc.com/".equals(namespaceURI)
					&& "card".equals(typeName)) {

				return Card.Factory.parse(reader);

			}

			throw new org.apache.axis2.databinding.ADBException(
					"Unsupported type " + namespaceURI + " " + typeName);
		}

	}

	public static class CheckProfile implements
			org.apache.axis2.databinding.ADBBean {

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://intf.ws.nc.com/", "checkProfile", "ns1");

		/**
		 * field for Arg0
		 */

		protected CardHolder localArg0;

		/**
		 * Auto generated getter method
		 * 
		 * @return CardHolder
		 */
		public CardHolder getArg0() {
			return localArg0;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *            Arg0
		 */
		public void setArg0(final CardHolder param) {

			this.localArg0 = param;

		}

		/**
		 * 
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		@Override
		public org.apache.axiom.om.OMElement getOMElement(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory)
				throws org.apache.axis2.databinding.ADBException {

			final org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(
					this, MY_QNAME);
			return factory.createOMElement(dataSource, MY_QNAME);

		}

		@Override
		public void serialize(final javax.xml.namespace.QName parentQName,
				final javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException,
				org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		@Override
		public void serialize(final javax.xml.namespace.QName parentQName,
				final javax.xml.stream.XMLStreamWriter xmlWriter,
				final boolean serializeType)
				throws javax.xml.stream.XMLStreamException,
				org.apache.axis2.databinding.ADBException {

			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(),
					xmlWriter);

			if (serializeType) {

				final java.lang.String namespacePrefix = registerPrefix(
						xmlWriter, "http://intf.ws.nc.com/");
				if ((namespacePrefix != null)
						&& (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi",
							"http://www.w3.org/2001/XMLSchema-instance",
							"type", namespacePrefix + ":checkProfile",
							xmlWriter);
				} else {
					writeAttribute("xsi",
							"http://www.w3.org/2001/XMLSchema-instance",
							"type", "checkProfile", xmlWriter);
				}

			}

			if (localArg0 == null) {

				writeStartElement(null, "", "arg0", xmlWriter);

				// write the nil attribute
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);
				xmlWriter.writeEndElement();
			} else {
				localArg0.serialize(new javax.xml.namespace.QName("", "arg0"),
						xmlWriter);
			}

			xmlWriter.writeEndElement();

		}

		private static java.lang.String generatePrefix(
				final java.lang.String namespace) {
			if (namespace.equals("http://intf.ws.nc.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil
					.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(java.lang.String prefix,
				final java.lang.String namespace,
				final java.lang.String localPart,
				final javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			final java.lang.String writerPrefix = xmlWriter
					.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(final java.lang.String prefix,
				final java.lang.String namespace,
				final java.lang.String attName,
				final java.lang.String attValue,
				final javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(final java.lang.String namespace,
				final java.lang.String attName,
				final java.lang.String attValue,
				final javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(final java.lang.String namespace,
				final java.lang.String attName,
				final javax.xml.namespace.QName qname,
				final javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			final java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter
					.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(final javax.xml.namespace.QName qname,
				final javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			final java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(prefix
							+ ":"
							+ org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter
							.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(qname));
				}

			} else {
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(qname));
			}
		}

		private void writeQNames(final javax.xml.namespace.QName[] qnames,
				final javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not
				// possible to write any
				// namespace data after writing the charactor data
				final java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite
									.append(prefix)
									.append(":")
									.append(org.apache.axis2.databinding.utils.ConverterUtil
											.convertToString(qnames[i]));
						} else {
							stringToWrite
									.append(org.apache.axis2.databinding.utils.ConverterUtil
											.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil
										.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(
				final javax.xml.stream.XMLStreamWriter xmlWriter,
				final java.lang.String namespace)
				throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				final javax.xml.namespace.NamespaceContext nsContext = xmlWriter
						.getNamespaceContext();
				while (true) {
					final java.lang.String uri = nsContext
							.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil
							.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 * 
		 */
		@Override
		public javax.xml.stream.XMLStreamReader getPullParser(
				final javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			final java.util.ArrayList elementList = new java.util.ArrayList();
			final java.util.ArrayList attribList = new java.util.ArrayList();

			elementList.add(new javax.xml.namespace.QName("", "arg0"));

			elementList.add(localArg0 == null ? null : localArg0);

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(
					qName, elementList.toArray(), attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object
			 * is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this
			 * object is not an element, it is a complex type and the reader is
			 * at the event just after the outer start element Postcondition: If
			 * this object is an element, the reader is positioned at its end
			 * element If this object is a complex type, the reader is
			 * positioned at the end element of its outer element
			 */
			public static CheckProfile parse(
					final javax.xml.stream.XMLStreamReader reader)
					throws java.lang.Exception {
				final CheckProfile object = new CheckProfile();

				java.lang.String nillableValue = null;
				try {

					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					if (reader
							.getAttributeValue(
									"http://www.w3.org/2001/XMLSchema-instance",
									"type") != null) {
						final java.lang.String fullTypeName = reader
								.getAttributeValue(
										"http://www.w3.org/2001/XMLSchema-instance",
										"type");
						if (fullTypeName != null) {
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0,
										fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							final java.lang.String type = fullTypeName
									.substring(fullTypeName.indexOf(":") + 1);

							if (!"checkProfile".equals(type)) {
								// find namespace for the prefix
								final java.lang.String nsUri = reader
										.getNamespaceContext().getNamespaceURI(
												nsPrefix);
								return (CheckProfile) ExtensionMapper
										.getTypeObject(nsUri, type, reader);
							}

						}

					}

					new java.util.Vector();

					reader.next();

					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "arg0")
									.equals(reader.getName())) {

						nillableValue = reader.getAttributeValue(
								"http://www.w3.org/2001/XMLSchema-instance",
								"nil");
						if ("true".equals(nillableValue)
								|| "1".equals(nillableValue)) {
							object.setArg0(null);
							reader.next();

							reader.next();

						} else {

							object.setArg0(CardHolder.Factory.parse(reader));

							reader.next();
						}
					} // End of if for expected property start element

					else {
						// A start element we are not expecting indicates an
						// invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());
					}

					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					if (reader.isStartElement()) {
						// A start element we are not expecting indicates a
						// trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());
					}

				} catch (final javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class Card implements org.apache.axis2.databinding.ADBBean {
		/*
		 * This type was generated from the piece of schema that had name = card
		 * Namespace URI = http://intf.ws.nc.com/ Namespace Prefix = ns1
		 */

		/**
		 * field for CardType
		 */

		protected java.lang.String localCardType;

		/*
		 * This tracker boolean wil be used to detect whether the user called
		 * the set method for this attribute. It will be used to determine
		 * whether to include this field in the serialized XML
		 */
		protected boolean localCardTypeTracker = false;

		public boolean isCardTypeSpecified() {
			return localCardTypeTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public java.lang.String getCardType() {
			return localCardType;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *            CardType
		 */
		public void setCardType(final java.lang.String param) {
			localCardTypeTracker = param != null;

			this.localCardType = param;

		}

		/**
		 * field for CreditLimit
		 */

		protected double localCreditLimit;

		/**
		 * Auto generated getter method
		 * 
		 * @return double
		 */
		public double getCreditLimit() {
			return localCreditLimit;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *            CreditLimit
		 */
		public void setCreditLimit(final double param) {

			this.localCreditLimit = param;

		}

		/**
		 * field for ExpiryDate
		 */

		protected java.util.Calendar localExpiryDate;

		/*
		 * This tracker boolean wil be used to detect whether the user called
		 * the set method for this attribute. It will be used to determine
		 * whether to include this field in the serialized XML
		 */
		protected boolean localExpiryDateTracker = false;

		public boolean isExpiryDateSpecified() {
			return localExpiryDateTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.util.Calendar
		 */
		public java.util.Calendar getExpiryDate() {
			return localExpiryDate;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *            ExpiryDate
		 */
		public void setExpiryDate(final java.util.Calendar param) {
			localExpiryDateTracker = param != null;

			this.localExpiryDate = param;

		}

		/**
		 * field for Holdername
		 */

		protected java.lang.String localHoldername;

		/*
		 * This tracker boolean wil be used to detect whether the user called
		 * the set method for this attribute. It will be used to determine
		 * whether to include this field in the serialized XML
		 */
		protected boolean localHoldernameTracker = false;

		public boolean isHoldernameSpecified() {
			return localHoldernameTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public java.lang.String getHoldername() {
			return localHoldername;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *            Holdername
		 */
		public void setHoldername(final java.lang.String param) {
			localHoldernameTracker = param != null;

			this.localHoldername = param;

		}

		/**
		 * field for Id
		 */

		protected int localId;

		/**
		 * Auto generated getter method
		 * 
		 * @return int
		 */
		public int getId() {
			return localId;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *            Id
		 */
		public void setId(final int param) {

			this.localId = param;

		}

		/**
		 * field for IssuerName
		 */

		protected java.lang.String localIssuerName;

		/*
		 * This tracker boolean wil be used to detect whether the user called
		 * the set method for this attribute. It will be used to determine
		 * whether to include this field in the serialized XML
		 */
		protected boolean localIssuerNameTracker = false;

		public boolean isIssuerNameSpecified() {
			return localIssuerNameTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public java.lang.String getIssuerName() {
			return localIssuerName;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *            IssuerName
		 */
		public void setIssuerName(final java.lang.String param) {
			localIssuerNameTracker = param != null;

			this.localIssuerName = param;

		}

		/**
		 * 
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		@Override
		public org.apache.axiom.om.OMElement getOMElement(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory)
				throws org.apache.axis2.databinding.ADBException {

			final org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(
					this, parentQName);
			return factory.createOMElement(dataSource, parentQName);

		}

		@Override
		public void serialize(final javax.xml.namespace.QName parentQName,
				final javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException,
				org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		@Override
		public void serialize(final javax.xml.namespace.QName parentQName,
				final javax.xml.stream.XMLStreamWriter xmlWriter,
				final boolean serializeType)
				throws javax.xml.stream.XMLStreamException,
				org.apache.axis2.databinding.ADBException {

			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(),
					xmlWriter);

			if (serializeType) {

				final java.lang.String namespacePrefix = registerPrefix(
						xmlWriter, "http://intf.ws.nc.com/");
				if ((namespacePrefix != null)
						&& (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi",
							"http://www.w3.org/2001/XMLSchema-instance",
							"type", namespacePrefix + ":card", xmlWriter);
				} else {
					writeAttribute("xsi",
							"http://www.w3.org/2001/XMLSchema-instance",
							"type", "card", xmlWriter);
				}

			}
			if (localCardTypeTracker) {
				namespace = "";
				writeStartElement(null, namespace, "cardType", xmlWriter);

				if (localCardType == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException(
							"cardType cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localCardType);

				}

				xmlWriter.writeEndElement();
			}
			namespace = "";
			writeStartElement(null, namespace, "creditLimit", xmlWriter);

			if (java.lang.Double.isNaN(localCreditLimit)) {

				throw new org.apache.axis2.databinding.ADBException(
						"creditLimit cannot be null!!");

			} else {
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localCreditLimit));
			}

			xmlWriter.writeEndElement();
			if (localExpiryDateTracker) {
				namespace = "";
				writeStartElement(null, namespace, "expiryDate", xmlWriter);

				if (localExpiryDate == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException(
							"expiryDate cannot be null!!");

				} else {

					xmlWriter
							.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(localExpiryDate));

				}

				xmlWriter.writeEndElement();
			}
			if (localHoldernameTracker) {
				namespace = "";
				writeStartElement(null, namespace, "holdername", xmlWriter);

				if (localHoldername == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException(
							"holdername cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localHoldername);

				}

				xmlWriter.writeEndElement();
			}
			namespace = "";
			writeStartElement(null, namespace, "id", xmlWriter);

			if (localId == java.lang.Integer.MIN_VALUE) {

				throw new org.apache.axis2.databinding.ADBException(
						"id cannot be null!!");

			} else {
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localId));
			}

			xmlWriter.writeEndElement();
			if (localIssuerNameTracker) {
				namespace = "";
				writeStartElement(null, namespace, "issuerName", xmlWriter);

				if (localIssuerName == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException(
							"issuerName cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localIssuerName);

				}

				xmlWriter.writeEndElement();
			}
			xmlWriter.writeEndElement();

		}

		private static java.lang.String generatePrefix(
				final java.lang.String namespace) {
			if (namespace.equals("http://intf.ws.nc.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil
					.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(java.lang.String prefix,
				final java.lang.String namespace,
				final java.lang.String localPart,
				final javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			final java.lang.String writerPrefix = xmlWriter
					.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(final java.lang.String prefix,
				final java.lang.String namespace,
				final java.lang.String attName,
				final java.lang.String attValue,
				final javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(final java.lang.String namespace,
				final java.lang.String attName,
				final java.lang.String attValue,
				final javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(final java.lang.String namespace,
				final java.lang.String attName,
				final javax.xml.namespace.QName qname,
				final javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			final java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter
					.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(final javax.xml.namespace.QName qname,
				final javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			final java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(prefix
							+ ":"
							+ org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter
							.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(qname));
				}

			} else {
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(qname));
			}
		}

		private void writeQNames(final javax.xml.namespace.QName[] qnames,
				final javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not
				// possible to write any
				// namespace data after writing the charactor data
				final java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite
									.append(prefix)
									.append(":")
									.append(org.apache.axis2.databinding.utils.ConverterUtil
											.convertToString(qnames[i]));
						} else {
							stringToWrite
									.append(org.apache.axis2.databinding.utils.ConverterUtil
											.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil
										.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(
				final javax.xml.stream.XMLStreamWriter xmlWriter,
				final java.lang.String namespace)
				throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				final javax.xml.namespace.NamespaceContext nsContext = xmlWriter
						.getNamespaceContext();
				while (true) {
					final java.lang.String uri = nsContext
							.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil
							.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 * 
		 */
		@Override
		public javax.xml.stream.XMLStreamReader getPullParser(
				final javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			final java.util.ArrayList elementList = new java.util.ArrayList();
			final java.util.ArrayList attribList = new java.util.ArrayList();

			if (localCardTypeTracker) {
				elementList.add(new javax.xml.namespace.QName("", "cardType"));

				if (localCardType != null) {
					elementList
							.add(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(localCardType));
				} else {
					throw new org.apache.axis2.databinding.ADBException(
							"cardType cannot be null!!");
				}
			}
			elementList.add(new javax.xml.namespace.QName("", "creditLimit"));

			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
					.convertToString(localCreditLimit));
			if (localExpiryDateTracker) {
				elementList
						.add(new javax.xml.namespace.QName("", "expiryDate"));

				if (localExpiryDate != null) {
					elementList
							.add(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(localExpiryDate));
				} else {
					throw new org.apache.axis2.databinding.ADBException(
							"expiryDate cannot be null!!");
				}
			}
			if (localHoldernameTracker) {
				elementList
						.add(new javax.xml.namespace.QName("", "holdername"));

				if (localHoldername != null) {
					elementList
							.add(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(localHoldername));
				} else {
					throw new org.apache.axis2.databinding.ADBException(
							"holdername cannot be null!!");
				}
			}
			elementList.add(new javax.xml.namespace.QName("", "id"));

			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
					.convertToString(localId));
			if (localIssuerNameTracker) {
				elementList
						.add(new javax.xml.namespace.QName("", "issuerName"));

				if (localIssuerName != null) {
					elementList
							.add(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(localIssuerName));
				} else {
					throw new org.apache.axis2.databinding.ADBException(
							"issuerName cannot be null!!");
				}
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(
					qName, elementList.toArray(), attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object
			 * is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this
			 * object is not an element, it is a complex type and the reader is
			 * at the event just after the outer start element Postcondition: If
			 * this object is an element, the reader is positioned at its end
			 * element If this object is a complex type, the reader is
			 * positioned at the end element of its outer element
			 */
			public static Card parse(
					final javax.xml.stream.XMLStreamReader reader)
					throws java.lang.Exception {
				final Card object = new Card();

				java.lang.String nillableValue = null;
				try {

					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					if (reader
							.getAttributeValue(
									"http://www.w3.org/2001/XMLSchema-instance",
									"type") != null) {
						final java.lang.String fullTypeName = reader
								.getAttributeValue(
										"http://www.w3.org/2001/XMLSchema-instance",
										"type");
						if (fullTypeName != null) {
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0,
										fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							final java.lang.String type = fullTypeName
									.substring(fullTypeName.indexOf(":") + 1);

							if (!"card".equals(type)) {
								// find namespace for the prefix
								final java.lang.String nsUri = reader
										.getNamespaceContext().getNamespaceURI(
												nsPrefix);
								return (Card) ExtensionMapper.getTypeObject(
										nsUri, type, reader);
							}

						}

					}

					new java.util.Vector();

					reader.next();

					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "cardType")
									.equals(reader.getName())) {

						nillableValue = reader.getAttributeValue(
								"http://www.w3.org/2001/XMLSchema-instance",
								"nil");
						if ("true".equals(nillableValue)
								|| "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "cardType"
											+ "  cannot be null");
						}

						final java.lang.String content = reader
								.getElementText();

						object.setCardType(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "creditLimit")
									.equals(reader.getName())) {

						nillableValue = reader.getAttributeValue(
								"http://www.w3.org/2001/XMLSchema-instance",
								"nil");
						if ("true".equals(nillableValue)
								|| "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "creditLimit"
											+ "  cannot be null");
						}

						final java.lang.String content = reader
								.getElementText();

						object.setCreditLimit(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToDouble(content));

						reader.next();

					} // End of if for expected property start element

					else {
						// A start element we are not expecting indicates an
						// invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());
					}

					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "expiryDate")
									.equals(reader.getName())) {

						nillableValue = reader.getAttributeValue(
								"http://www.w3.org/2001/XMLSchema-instance",
								"nil");
						if ("true".equals(nillableValue)
								|| "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "expiryDate"
											+ "  cannot be null");
						}

						final java.lang.String content = reader
								.getElementText();

						object.setExpiryDate(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToDateTime(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "holdername")
									.equals(reader.getName())) {

						nillableValue = reader.getAttributeValue(
								"http://www.w3.org/2001/XMLSchema-instance",
								"nil");
						if ("true".equals(nillableValue)
								|| "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "holdername"
											+ "  cannot be null");
						}

						final java.lang.String content = reader
								.getElementText();

						object.setHoldername(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "id")
									.equals(reader.getName())) {

						nillableValue = reader.getAttributeValue(
								"http://www.w3.org/2001/XMLSchema-instance",
								"nil");
						if ("true".equals(nillableValue)
								|| "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "id" + "  cannot be null");
						}

						final java.lang.String content = reader
								.getElementText();

						object.setId(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToInt(content));

						reader.next();

					} // End of if for expected property start element

					else {
						// A start element we are not expecting indicates an
						// invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());
					}

					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "issuerName")
									.equals(reader.getName())) {

						nillableValue = reader.getAttributeValue(
								"http://www.w3.org/2001/XMLSchema-instance",
								"nil");
						if ("true".equals(nillableValue)
								|| "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "issuerName"
											+ "  cannot be null");
						}

						final java.lang.String content = reader
								.getElementText();

						object.setIssuerName(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					if (reader.isStartElement()) {
						// A start element we are not expecting indicates a
						// trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());
					}

				} catch (final javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	private org.apache.axiom.om.OMElement toOM(
			final com.nc.ws.impl.axis2.CardHolderProfileRPCENCServiceImplServiceStub.CheckProfile param,
			final boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.nc.ws.impl.axis2.CardHolderProfileRPCENCServiceImplServiceStub.CheckProfile.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (final org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			final com.nc.ws.impl.axis2.CardHolderProfileRPCENCServiceImplServiceStub.CheckProfileResponse param,
			final boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.nc.ws.impl.axis2.CardHolderProfileRPCENCServiceImplServiceStub.CheckProfileResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (final org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			final org.apache.axiom.soap.SOAPFactory factory,
			final com.nc.ws.impl.axis2.CardHolderProfileRPCENCServiceImplServiceStub.CheckProfile param,
			final boolean optimizeContent,
			final javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {

		try {

			final org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param.getOMElement(
									com.nc.ws.impl.axis2.CardHolderProfileRPCENCServiceImplServiceStub.CheckProfile.MY_QNAME,
									factory));
			return emptyEnvelope;
		} catch (final org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	/**
	 * get the default envelope
	 */
	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			final org.apache.axiom.soap.SOAPFactory factory) {
		return factory.getDefaultEnvelope();
	}

	private java.lang.Object fromOM(final org.apache.axiom.om.OMElement param,
			final java.lang.Class type, final java.util.Map extraNamespaces)
			throws org.apache.axis2.AxisFault {

		try {

			if (com.nc.ws.impl.axis2.CardHolderProfileRPCENCServiceImplServiceStub.CheckProfile.class
					.equals(type)) {

				return com.nc.ws.impl.axis2.CardHolderProfileRPCENCServiceImplServiceStub.CheckProfile.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.nc.ws.impl.axis2.CardHolderProfileRPCENCServiceImplServiceStub.CheckProfileResponse.class
					.equals(type)) {

				return com.nc.ws.impl.axis2.CardHolderProfileRPCENCServiceImplServiceStub.CheckProfileResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

		} catch (final java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
		return null;
	}

}
