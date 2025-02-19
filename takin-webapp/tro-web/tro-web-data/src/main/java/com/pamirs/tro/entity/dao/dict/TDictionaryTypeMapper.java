/*
 * Copyright 2021 Shulie Technology, Co.Ltd
 * Email: shulie@shulie.io
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pamirs.tro.entity.dao.dict;

import com.pamirs.tro.entity.domain.entity.TDictionaryType;
import org.apache.ibatis.annotations.Param;

public interface TDictionaryTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionary_type
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionary_type
     *
     * @mbggenerated
     */
    int insert(TDictionaryType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionary_type
     *
     * @mbggenerated
     */
    int insertSelective(TDictionaryType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionary_type
     *
     * @mbggenerated
     */
    TDictionaryType selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionary_type
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TDictionaryType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionary_type
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TDictionaryType record);

    /**
     * 获取字典类型
     *
     * @param typeAlias
     */
    TDictionaryType selectDictionaryByTypeAlias(@Param("typeAlias") String typeAlias);
}
