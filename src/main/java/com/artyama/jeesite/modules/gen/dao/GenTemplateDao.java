/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/artyama/jeesite">JeeSite</a> All rights reserved.
 */
package com.artyama.jeesite.modules.gen.dao;

import com.artyama.jeesite.common.persistence.CrudDao;
import com.artyama.jeesite.common.persistence.annotation.MyBatisDao;
import com.artyama.jeesite.modules.gen.entity.GenTemplate;

/**
 * 代码模板DAO接口
 * @author ThinkGem
 * @version 2013-10-15
 */
@MyBatisDao
public interface GenTemplateDao extends CrudDao<GenTemplate> {
	
}
