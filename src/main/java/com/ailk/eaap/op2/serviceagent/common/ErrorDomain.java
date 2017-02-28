package com.ailk.eaap.op2.serviceagent.common;

public final class ErrorDomain {
	/*
	 * 错误代码类型
	 */
	public static final String ERROR_TYPE_SUCCESS="0";
	public static final String ERROR_TYPE_SYS_ERROR="9";
	
	public static final String ERROR_TYPE_BIZ_ERROR="1";
	private static ReadProperties readProperties = ReadProperties.getInstance();
	/**
	 *交易成功则无需错误的分类代码，规定为0000
	 */
	public static final String ERROR_CODE_0000    = "0000";   
	
	/**
	 * 插件工程系统错误
	 */
	public static final String ERROR_CODE_9400 ="9400";
	/**
	 * 枢纽内部系统错误
	 */
	public static final String ERROR_CODE_9999 ="9999";
	/**
	 * 发起方组件认证失败
	 */
	public static final String ERROR_CODE_9001 = "9001";
	/**
	 *枢纽校验发起方消息报文控制报头格式错误                                
	 */
	public static final String ERROR_CODE_9002 = "9002";
	/**
	 *枢纽校验发起方消息报文业务包体格式错误
	 */
	public static final String ERROR_CODE_9003 = "9003";
	/**
	 * 枢纽校验落地方应答的消息报文控制报头格式错误
	 */
	public static final String ERROR_CODE_9004 = "9004";
	/**
	 * 枢纽校验落地方应答的消息报文业务包体格式错误
	 */
	public static final String ERROR_CODE_9005 = "9005";
	/**
	 * 枢纽校验消息报文格式错误
	 */
	public static final String ERROR_CODE_9006 = "9006";
	
	
	/**
	 *落地方交换节点发现报文Service Content格式错误                    
	 */
	public static final String ERROR_CODE_9009 = "9009";
	/**
	 * 落地方机构尚未在枢纽登记此业务或者落地方机构不存在
	 */
	public static final String ERROR_CODE_9010 = "9010";
	/**
	 * 落地方机构未开通
	 */
	public static final String ERROR_CODE_9011 = "9011";
	/**
	 * 落地方机构未签到
	 */
	public static final String ERROR_CODE_9012 = "9012";
	/**
	 * 落地方机构网络不通
	 */
	public static final String ERROR_CODE_9013 = "9013";
	/**
	 * 落地方机构系统僵死,稍后再访问
	 */
	public static final String ERROR_CODE_9014 = "9014";
	/**
	 * 落地方机构系统流量过大，请稍后访问
	 */
	public static final String ERROR_CODE_9015 = "9015";
	/**
	 * 等待落地方应答超时
	 */
	public static final String ERROR_CODE_9016 = "9016";
	/**
	 * 请求超过流量控制
	 */
	public static final String ERROR_CODE_9017 = "9017";
	/**
	 * 请求交易流水号重复
	 */
	public static final String ERROR_CODE_9018 = "9018";
	
	
	
	/**
	 * 发起方尚未开通此功能
	 */
	public static final String ERROR_CODE_9020 = "9020";
	/**
	 * 落地方尚未开通此功能
	 */
	public static final String ERROR_CODE_9021 = "9021";
	
	
	
	
	
	/**
	 * Ip认证不通过
	 */
	public static final String ERROR_CODE_9037 = "9037";
	/**
	 * 令牌认证不通过
	 */
	public static final String ERROR_CODE_9038 = "9038";
	
	/**
	 * 数字签名认证失败
	 */
	public static final String ERROR_CODE_9039 = "9039";
	
	/**
	 * 发起方无授权访问权限
	 */
	public static final String ERROR_CODE_9040 = "9040";
	/**
	 * 应答方无授权权限
	 */
	public static final String ERROR_CODE_9041 = "9041";
	
	
	/**
	 * 服务技术实现状态不可用
	 */
	public static final String ERROR_CODE_9042 = "9042";
	
	/**
	 * WebService接入异常
	 */
	public static final String ERROR_CODE_9050 = "9050";
	
	public static final String ERROR_CODE_9989 = "9989"; 
	
	/**
	 * 
	 */
	public static final String ERROR_CODE_9307 = "9307";
	public static final String ERROR_CODE_9310 = "9310";
	 
	
	/**
	 * 消息流内部错误
	 */
	public static final String ERROR_CODE_9991 = "9991"; 
	
	/**
	 * 找不到API参数
	 */
	public static final String lost_api = readProperties.readValueBykey("lost_api");
	/**
	 * api未配置
	 */
	public static final String api_not_exist = readProperties.readValueBykey("api_not_exist");
	public static final String Api_stats_unuseable = readProperties.readValueBykey("Api_stats_unuseable");
	
	
	public static final String appkey_lost = readProperties.readValueBykey("appkey_lost");
	public static final String appkey_cant_find = readProperties.readValueBykey("appkey_cant_find");
	public static final String app_state_unuseable = readProperties.readValueBykey("app_state_unuseable");
	public static final String TransactionID_lost = readProperties.readValueBykey("TransactionID_lost");
	public static final String ReqTime_lost = readProperties.readValueBykey("ReqTime_lost");
	public static final String ReqTime_is_error = readProperties.readValueBykey("ReqTime_is_error");
	
	public static final String req_msg_is_null = readProperties.readValueBykey("req_msg_is_null");
	public static final String req_msg_length_is_outoflimit = readProperties.readValueBykey("req_msg_length_is_outoflimit");
	public static final String error_xml_msg = readProperties.readValueBykey("error_xml_msg");
	public static final String error_json_msg = readProperties.readValueBykey("error_json_msg");
	public static final String lost_tcpcont_node = readProperties.readValueBykey("lost_tcpcont_node");
	public static final String tcpcont_node_error = readProperties.readValueBykey("tcpcont_node_error");
	public static final String svccont_node_error = readProperties.readValueBykey("svccont_node_error");
	public static final String BusCode_lost = readProperties.readValueBykey("BusCode_lost");
	public static final String BusCode_is_null = readProperties.readValueBykey("BusCode_is_null");
	public static final String BusCode_out_of_length = readProperties.readValueBykey("BusCode_out_of_length");
	public static final String ServiceCode_lost = readProperties.readValueBykey("ServiceCode_lost");
	public static final String ServiceCode_is_null = readProperties.readValueBykey("ServiceCode_is_null");
	public static final String ServiceCode_out_of_length = readProperties.readValueBykey("ServiceCode_out_of_length");
	public static final String ServiceContractVer_lost = readProperties.readValueBykey("ServiceContractVer_lost");
	public static final String ServiceContractVer_is_null = readProperties.readValueBykey("ServiceContractVer_is_null");
	public static final String ActionCode_lost = readProperties.readValueBykey("ActionCode_lost");
	public static final String ActionCode_is_null = readProperties.readValueBykey("ActionCode_is_null");
	public static final String ActionCode_must_be = readProperties.readValueBykey("ActionCode_must_be");
	public static final String TransactionID_is_null = readProperties.readValueBykey("TransactionID_is_null");
	public static final String TransactionID_out_of_length = readProperties.readValueBykey("TransactionID_out_of_length");
	public static final String ServiceLevel_lost = readProperties.readValueBykey("ServiceLevel_lost");
	public static final String ServiceLevel_is_null = readProperties.readValueBykey("ServiceLevel_is_null");
	public static final String ServiceLevel_is_error = readProperties.readValueBykey("ServiceLevel_is_error");
	public static final String SrcOrgID_lost = readProperties.readValueBykey("SrcOrgID_lost");
	public static final String SrcOrgID_is_null = readProperties.readValueBykey("SrcOrgID_is_null");
	public static final String SrcOrgID_out_of_length = readProperties.readValueBykey("SrcOrgID_out_of_length");
	public static final String SrcSysID_lost = readProperties.readValueBykey("SrcSysID_lost");
	public static final String SrcSysID_is_null = readProperties.readValueBykey("SrcSysID_is_null");
	public static final String SrcSysID_out_of_length = readProperties.readValueBykey("SrcSysID_out_of_length");
	public static final String SrcSysSign_lost = readProperties.readValueBykey("SrcSysSign_lost");
	public static final String DstOrgID_lost = readProperties.readValueBykey("DstOrgID_lost");
	public static final String DstOrgID_is_null = readProperties.readValueBykey("DstOrgID_is_null");
	public static final String DstOrgID_out_of_length = readProperties.readValueBykey("DstOrgID_out_of_length");
	public static final String DstSysID_lost = readProperties.readValueBykey("DstSysID_lost");
	public static final String DstSysID_is_null = readProperties.readValueBykey("DstSysID_is_null");
	public static final String DstSysID_out_of_length = readProperties.readValueBykey("DstSysID_out_of_length");
	public static final String ReqTime_is_null = readProperties.readValueBykey("ReqTime_is_null");
	public static final String not_register = readProperties.readValueBykey("not_register");
	
	public static final String component_not_register = readProperties.readValueBykey("component_not_register");
	
	public static final String status_unusable = readProperties.readValueBykey("status_unusable");
	public static final String contract_version_not_exist = readProperties.readValueBykey("contract_version_not_exist");
	public static final String base_contract_version_not_exist = readProperties.readValueBykey("base_contract_version_not_exist");
	public static final String contract_version_unuseable = readProperties.readValueBykey("contract_version_unuseable");
	public static final String transactionId_component_error = readProperties.readValueBykey("transactionId_component_error");
	public static final String transactionId_repeat = readProperties.readValueBykey("transactionId_repeat");
	public static final String transactionId_length_error = readProperties.readValueBykey("transactionId_length_error");
	public static final String transactionId_time_error = readProperties.readValueBykey("transactionId_time_error");
	public static final String service_not_exist = readProperties.readValueBykey("service_not_exist");
	public static final String service_call_instance_not_exist = readProperties.readValueBykey("service_call_instance_not_exist");
	public static final String format_value_error = readProperties.readValueBykey("format_value_error");
	public static final String node_not_exist = readProperties.readValueBykey("node_not_exist");
	
	public static final String node_out_number = readProperties.readValueBykey("node_out_number");
	
	public static final String node_value_is_null = readProperties.readValueBykey("node_value_is_null");
	public static final String node_value_length_error = readProperties.readValueBykey("node_value_length_error");
	public static final String node_value_error = readProperties.readValueBykey("node_value_error");
	public static final String charset_trans_error = readProperties.readValueBykey("charset_trans_error");
	public static final String req_rsp_no_config = readProperties.readValueBykey("req_rsp_no_config");
	public static final String route_config_error = readProperties.readValueBykey("route_config_error");
	public static final String endpoint_processor_lost = readProperties.readValueBykey("endpoint_processor_lost");
	public static final String address_config_never_config = readProperties.readValueBykey("address_config_never_config");
	public static final String tech_never_config = readProperties.readValueBykey("tech_never_config");
	public static final String cannot_find_tech = readProperties.readValueBykey("cannot_find_tech");
	
	public static final String address_config_error = readProperties.readValueBykey("address_config_error");
	public static final String service_tech_status_unuseable = readProperties.readValueBykey("service_tech_status_unuseable");
	public static final String timeout_control_error = readProperties.readValueBykey("timeout_control_error");
	public static final String translate_endpoint_error = readProperties.readValueBykey("translate_endpoint_error");
	public static final String component_sign_not_config = readProperties.readValueBykey("component_sign_not_config");
	public static final String component_password_error = readProperties.readValueBykey("component_password_error");
	public static final String accesstoken_error = readProperties.readValueBykey("accesstoken_error");
	public static final String accesstoken_no_auth_access_api = readProperties.readValueBykey("accesstoken_no_auth_access_api");
	public static final String never_config_userinfo_path = readProperties.readValueBykey("never_config_userinfo_path");
	public static final String lost_user_info = readProperties.readValueBykey("lost_user_info");
	public static final String sign_validate_error = readProperties.readValueBykey("sign_validate_error");
	public static final String never_config_ip_list = readProperties.readValueBykey("never_config_ip_list");
	public static final String src_ip = readProperties.readValueBykey("src_ip");
	public static final String no_access_right = readProperties.readValueBykey("no_access_right");
	public static final String never_config_proof_type = readProperties.readValueBykey("never_config_proof_type");
	public static final String never_config_encryptType = readProperties.readValueBykey("never_config_encryptType");
	public static final String call = readProperties.readValueBykey("call");
	public static final String serverException_the_statuscode_is = readProperties.readValueBykey("serverException_the_statuscode_is");
	
	public static final String server_connect_timeout_please_check = readProperties.readValueBykey("server_connect_timeout_please_check");
	public static final String server_cant_connect_please_check = readProperties.readValueBykey("server_cant_connect_please_check");
	/**
	 * //没有访问权限
	 */
	public static final String server_exception = readProperties.readValueBykey("server_exception");
	/**
	 * //没有访问权限
	 */
	public static final String get_soap_response_error = readProperties.readValueBykey("get_soap_response_error");
	/**
	 * 没有访问权限
	 */
	public static final String build_soap_message_error = readProperties.readValueBykey("build_soap_message_error");
	
	
	public static final String webservice_methodname_not_config = readProperties.readValueBykey("webservice_methodname_not_config");
	
	public static final String webservice_returnparam_not_config = readProperties.readValueBykey("webservice_returnparam_not_config");
	public static final String req_no_auth_error = readProperties.readValueBykey("req_no_auth_error");
	public static final String rsp_no_auth_error = readProperties.readValueBykey("rsp_no_auth_error");
	public static final String req_xml_lost_userinfo_error = readProperties.readValueBykey("req_xml_lost_userinfo_error");
	public static final String rep_xml_error = readProperties.readValueBykey("rep_xml_error");
	
	public static final String never_config_token_path = readProperties.readValueBykey("never_config_token_path");
	public static final String range_config_error = readProperties.readValueBykey("range_config_error");
	
	public static final String auth_config_error = readProperties.readValueBykey("auth_config_error");
	public static final String rsp_xml_null = readProperties.readValueBykey("rsp_xml_null");
	public static final String RspDesc_out_length = readProperties.readValueBykey("RspDesc_out_length");
	public static final String RspDesc_not_only_one = readProperties.readValueBykey("RspDesc_not_only_one");
	public static final String RspType_not_number = readProperties.readValueBykey("RspType_not_number");
	public static final String RspType_is_null = readProperties.readValueBykey("RspType_is_null");
	public static final String RspType_is_lost = readProperties.readValueBykey("RspType_is_lost");
	public static final String RspTime_format_error = readProperties.readValueBykey("RspTime_format_error");
	public static final String RspTime_is_null = readProperties.readValueBykey("RspTime_is_null");
	public static final String RspTime_is_lost = readProperties.readValueBykey("RspTime_is_lost");
	public static final String RspCode_is_lost = readProperties.readValueBykey("RspCode_is_lost");
	public static final String RspCode_is_null = readProperties.readValueBykey("RspCode_is_null");
	public static final String target_version_not_config = readProperties.readValueBykey("target_version_not_config");
	public static final String time_flow_out = readProperties.readValueBykey("time_flow_out");
	public static final String size_flow_out = readProperties.readValueBykey("size_flow_out");
	public static final String thread_flow_out = readProperties.readValueBykey("thread_flow_out");
	public static final String flow_memcache_error = readProperties.readValueBykey("flow_memcache_error");
	public static final String cant_find_dst_component = readProperties.readValueBykey("cant_find_dst_component");
	public static final String call_webservice_time_out = readProperties.readValueBykey("call_webservice_time_out");
	
	public static final String lost_token_info = readProperties.readValueBykey("lost_token_info");
	
	public static final String system_error = "system error";
	public static final String never_config_auth_req_or_rsp = readProperties.readValueBykey("never_config_auth_req_or_rsp");
	public static final String encrypt_error = readProperties.readValueBykey("encrypt_error");
	public static final String encryptType_config_error = readProperties.readValueBykey("encryptType_config_error");
	public static final String threedes_lost_private_key = readProperties.readValueBykey("threedes_lost_private_key");
	public static final String never_config_regula = readProperties.readValueBykey("never_config_regula");
	
	public static final String connect_memcache_timeout = readProperties.readValueBykey("connect_memcache_timeout");
	
	public static final String memcache_thread_interrupt = readProperties.readValueBykey("memcache_thread_interrupt");
	public static final String memcache_self_error = readProperties.readValueBykey("memcache_self_error");
	
	public static final String mac_Path_not_config = readProperties.readValueBykey("mac_Path_not_config");
	public static final String service_provid = readProperties.readValueBykey("service_provid");
	public static final String write_queue_error = readProperties.readValueBykey("write_queue_error");
	
	public static final String get_queue_error = readProperties.readValueBykey("get_queue_error");
	
	public static final String asyn_endpoint_error = readProperties.readValueBykey("asyn_endpoint_error");
	public static final String cant_find_model = readProperties.readValueBykey("cant_find_model");
	public static final String batch_parse_to_db_error = readProperties.readValueBykey("batch_parse_to_db_error");
	public static final String batch_parse_inner_error = readProperties.readValueBykey("batch_parse_inner_error");
	public static final String sql_nerver_config = readProperties.readValueBykey("sql_nerver_config");
	
	public static final String call_tuxedo_error = readProperties.readValueBykey("call_tuxedo_error");
	
	public static final String not_find_webservice = readProperties.readValueBykey("not_find_webservice");
	 
	public static final String sub_message_config_error = readProperties.readValueBykey("sub_message_config_error");
	 
	public static final String message_template_config_error = readProperties.readValueBykey("message_template_config_error");
	/**
	 * 容器配置文件没找到
	 */
	public static final String container_configuration_file_error = "not_find _container_configuration_file";
	private ErrorDomain() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static final String configuration_information_container_type = "not_find _container_type";//配置容器类型
	public static final String configuration_information_local_number = "not_find _local_number";//配置本地标识位数
}
