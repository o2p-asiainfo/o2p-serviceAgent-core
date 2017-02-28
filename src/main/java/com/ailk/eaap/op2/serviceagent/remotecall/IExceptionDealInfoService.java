package com.ailk.eaap.op2.serviceagent.remotecall;

import java.util.List;

import javax.sql.DataSource;

import com.ailk.eaap.op2.bo.ExceptionDealInfo;

public interface IExceptionDealInfoService {
	
	 	void changeDataSource(DataSource dataSource);
	
		//异常信息保存接口：（通过接口方式调用日志服务接口，持久化异常信息到数据库）
		boolean  saveExceptionDealInfo(ExceptionDealInfo  exceptionDealInfo);
		
		//条件查询总数
		Integer queryCountExceptionDealInfo(ExceptionDealInfo  exceptionDealInfo);

		//异常信息查询接口，返回json：（通过接口方式调用日志服务接口，根据条件查询异常信息数据）
		String  selectExceptionDealInfoJson(ExceptionDealInfo  exceptionDealInfo,Integer startNo,Integer pageNo);
		
		//异常信息查询接口，返回List：（通过接口方式调用日志服务接口，根据条件查询异常信息数据）
		List<ExceptionDealInfo> selectExceptionDealInfoList(ExceptionDealInfo  exceptionDealInfo,Integer startNo,Integer pageNo);

		//根据ID查询详情
		ExceptionDealInfo selectExceptionDealInfoById(Integer id);

		//删除
		void deleteById(Integer exceptionId);

		//更新
		void updateExceptionDealInfo(ExceptionDealInfo info);
		
		void insertExceptionDealInfoHis(ExceptionDealInfo info);

}
