/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/artyama/jeesite">JeeSite</a> All rights reserved.
 */
package com.artyama.jeesite.modules.cms.dao;

import com.artyama.jeesite.common.persistence.CrudDao;
import com.artyama.jeesite.common.persistence.annotation.MyBatisDao;
import com.artyama.jeesite.modules.cms.entity.ArticleData;

/**
 * 文章DAO接口
 * @author ThinkGem
 * @version 2013-8-23
 */
@MyBatisDao
public interface ArticleDataDao extends CrudDao<ArticleData> {
	
}
