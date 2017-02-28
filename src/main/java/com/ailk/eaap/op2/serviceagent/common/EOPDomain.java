package com.ailk.eaap.op2.serviceagent.common;

public final class EOPDomain {

	
	
	public static final int MAX_LIMIT_MESSAGE_SIZE=2*1024*1024;
	
	public static final String ERROR_TRASACTION_ID="9999999999999999999999999999";
	
	public static final String EOP_COMPONENT = "1000010002";

	
	public static final String REQUEST_TCP_SCHEMA = "REQUEST_TCP_SCHEMA";

	
	public static final String RESONSE_TCP_SCHEMA = "RESPONSE_TCP_SCHEMA";

	
	public static final String CHARSET_UTF8 = "UTF-8";
	public static final String CHARSET_GBK = "GBK";
	public static final String MD5 = "MD5";
	public static final String THREEDES = "3DES";
	public static final String SHA224 = "SHA224";
	public static final String SHA256 = "SHA256";
	public static final String SHA384 = "SHA384";
	public static final String SHA512 = "SHA512";
	
	public static final String MESSAGE_TEMPLATE = "MESSAGE_TEMPLATE";
	
	
	public static final String REQ_FLAG = "0";

	 
	public static final String RSP_FLAG = "1";
	
	public static final String YES = "Y";
	
	public static final String XML = "1";
	public static final String JSON = "2";
	public static final String URLGET = "3";
	public static final String FILE = "4";
	public static final String MAP = "5";
	public static final String xmlOrJson = "6";
	public static final String JSONFORMAT = "json";
	public static final String ACCEPT = "accept";
	public static final String CONTENT_TYPE = "Content-Type";
	public static final String CSV = "11";
	
	public static final String header = "1";
	public static final String body = "2";
	public static final String tail = "3";
	
	public static final String detect = "3";
	
	public static final String optional="3";
	public static final String mustOne = "1";
	public static final String mustmulti = "2";
	public static final String multi= "4";
	
	
	public static final String user_auth = "2";
	public static final String app_auth = "1";
	
	public static final String NORMAL = "A";
	
	public static final String ONLINE = "D";

	public static final String F = "F";
	public static final String V = "V";
	
	public static final String fixed = "1";
	public static final String enums = "2";
	public static final String regular = "2";
	public static final String mainData = "3";
	public static final String exceptioncode = "4";
	public static final String minMax = "5";
	
	public static final String date = "4";
	public static final String dateTime = "5";
	public static final String time = "6";
	
	
	public static final String JSONSTR = "8";
	public static final String XMLSTR = "9";
	
	public static final String DATA_EXCH_SYNC = "S";

	 
	public static final String DATA_EXCH_ASYN = "A";

	 
	public static final String DATA_EXCH_BATCH = "B";

	
	public static final String SERVICE_TYPE_SOAP = "SOAP";

	
	public static final String SERVICE_TYPE_HTTP = "HTTP";

	
	public static final String SERVICE_TYPE_SOCKET = "SOCKET";

	
	public static final String SERVICE_TYPE_FTP = "FTP";

	
	public static final String SERVICE_TYPE_IBM_MQ = "IBMMQ";
	final static public String EXCHANGE_MODE_SYN = "SYN";
	final static public String EXCHANGE_MODE_ASYN = "ASYN";
	
	public static final String ROUTE_TYPE_SERVICE_NUMBER = "11"; 

	public static final String ROUTE_TYPE_REGION_CODE = "12"; 

	 
	public static final String COMPONENT_SUBCRIBED = "Y"; 

	public static final String COMPONENT_SIGNED = "Y"; 

	public static final String COMPONENT_CONNECTED = "Y"; 
	

	
	public static final String HTTP_GET_PROTOCOL = "1";
	public static final String HTTP_POST_PROTOCOL = "2";
	public static final String WEBSERVICE = "6";
	public static final String WEBSERVICE_POST_PROTOCOL = "7";
	public static final String SOAP = "9";
	public static final String TUXDO = "8";
	public static final String rest = "11";
	public static final String LDAP = "13";
	public static final String FTP_PROTOCOL = "5";
	public static final String SFTP_PROTOCOL = "4";
	public static final String JMS = "12";
	
	 
	public static final int QUEUE_READ_TIME_OUT = 35 * 1000;

	 
	public static final int DB_TRANSACTION_TIME_OUT = 5;

	
	public static final int RESPONSE_DESC_LENGTH = 512;
	
	public static final int REQUEST_DESC_LENGTH = 128;

	public static final String REQ_QUEUE_KEY = "REQUEST_QUEUE_KEY";

	public static final String RES_QUEUE_KEY = "RES_QUEUE_KEY";

	public static final String EMPTY_STRING = "";
	

	public static final String BUS_CODE_BUS00001="BUS00001";
	
	public static final String SVC_CODE_SVC00001="SVC00001";
	
	/**
	 * HTTP响应编码
	 */
	public static final String HTTP_STATUS_CODE="HTTPSTATUSCODE";
	/**
	 * 
	 * 
	 * @param resOrReqFlag
	 * @return
	 */
	public static boolean isRequestMessage(String resOrReqFlag) {
		return EOPDomain.REQ_FLAG.equals(resOrReqFlag);
	}
	
	
	
	public static final String DepDataSourceContextName = "DepDataSource";
	
	public static final String DepTabSuffixContextName = "DepTabSuffix";
	
	public static final String CiiContextName = "cii";
	
	public static final String DepTabSuffixSQLPattern = "\\$\\{DepTabSuffix\\}";

	
	public static final String IPWhite = "WHITELIST";
	
	public static final String IPBlack = "BLACKLIST";
	
	
	public static final String COUNT_CONTROL = "1";

	
	public static final String SIZE_CONTROL = "2";
	
	
	public static final String CONCURRENT_CONTROL = "2";
	
	
	final static public String XQUERY ="XQuery";
	final static public String XSLT = "XSLT";
	
	
	public static final String CENTER_RECEIVE_SRC = "10001";
	
	public static final String CENTER_FORWARD_DST = "10002";
	
	public static final String CENTER_RECEIVE_DST = "10003";
	
	public static final String CENTER_RESPONSE_SRC = "10004";
	
	public static final String POINT_RESPONSE = "50001";
	
	public static final String POINT_RECEIVE = "50002";
	
	public static final String INSERT = "INSERT";
	public static final String UPDATE = "UPDATE";
	
	
	public static final String WHITELIST = "WHITELIST";
	
	public static final String BLACKLIST = "BLACKLIST";
	
	public static final String SIGNEDDATA = "SIGNEDDATA";
	
	public static final String PLAINTEXT = "PLAINTEXT";

	public static final String CIPHER = "CIPHER";
	

	public static final String TIMES = "1";

	public static final String SIZE = "2";
	
	public static final String THREAD_NUM = "3";
	
	//csv第一行
	public static final int CSV_FIRST_LINE_FIELD_NAME = 1;
	public static final int CSV_FIRST_LINE_ALL_COUNT = 2;
	public static final String DEFAULT_NEW_LINE = "\r\n";
	public static final String RESERVED_SPACE = "          ";
	
	//分页中rownum名
	public static final String ROWNUM_FIELD_NAME = "f$_rownum";
	
	public static final String CONTENT_TYPE_XML_UTF8 = "text/xml;charset=UTF-8";
	public static final String CONTENT_TYPE_PLAIN_UTF8 = "text/plain;charset=UTF-8";
	public static final String CONTENT_TYPE_JSON_UTF8 = "text/json;charset=UTF-8";
	
	//端点处理状态
	public static final String ENDPOINT_DESC_SUCCESS = "success";
	public static final String ENDPOINT_DESC_FAIL = "fail";
	
  /*文件下载排序
	* -1:  无排序
	*  0：文件最新修改时间降序排序
	*  1：文件最新修改时间升序排序
	*	2：文件名排序（0-9A-Za-z）
	*	3：文件名排序（z-aZ-A9-0）
	*	4：文件从大到小排序
	*	5：文件从小到大排序
	*	6：文件类型降序排序
	*	7：文件类型生序排序
	*/
	public static final String ORDERBY_NO = "-1";
	public static final String ORDERBY_MODIFY_DATE_DESC = "0";
	public static final String ORDERBY_MODIFY_DATE_ASC = "1";
	public static final String ORDERBY_NAME_ASC = "2";
	public static final String ORDERBY_NAME_DESC = "3";
	public static final String ORDERBY_LENGTH_DESC = "4";
	public static final String ORDERBY_LENGTH_ASC = "5";
	public static final String ORDERBY_FILE_TYPE_DESC = "6";
	public static final String ORDERBY_FILE_TYPE_ASC = "7";
	
	//服务器定义
	public static final String TOMCAT = "1";
	public static final String WEBLOGIC = "2";
	private EOPDomain() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}