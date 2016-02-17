/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/artyama/jeesite">JeeSite</a> All rights reserved.
 */
package com.artyama.jeesite.modules.gen.dao;

import java.util.List;

import com.artyama.jeesite.common.persistence.CrudDao;
import com.artyama.jeesite.common.persistence.annotation.MyBatisDao;
import com.artyama.jeesite.modules.gen.entity.GenTable;
import com.artyama.jeesite.modules.gen.entity.GenTableColumn;

/**
 * 业务表字段DAO接口
 * @author ThinkGem
 * @version 2013-10-15
 */
@MyBatisDao
public interface GenDataBaseDictDao extends CrudDao<GenTableColumn> {

	/**
	 * 查询表列表
	 * @param genTable
	 * @return
	 */
	List<GenTable> findTableList(GenTable genTable);

	/**
	 * 获取数据表字段
	 * @param genTable
	 * @return
	 */
	List<GenTableColumn> findTableColumnList(GenTable genTable);
	
	/**
	 * 获取数据表主键
	 * @param genTable
	 * @return
	 */
	List<String> findTablePK(GenTable genTable);
	
}