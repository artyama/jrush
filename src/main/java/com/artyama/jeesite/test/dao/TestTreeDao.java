/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/artyama/jeesite">JeeSite</a> All rights reserved.
 */
package com.artyama.jeesite.test.dao;

import com.artyama.jeesite.common.persistence.TreeDao;
import com.artyama.jeesite.common.persistence.annotation.MyBatisDao;
import com.artyama.jeesite.test.entity.TestTree;

/**
 * 树结构生成DAO接口
 * @author ThinkGem
 * @version 2015-04-06
 */
@MyBatisDao
public interface TestTreeDao extends TreeDao<TestTree> {
	
}