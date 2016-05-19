package com.nutils.www.nutils.utils;

import com.nutils.www.nutils.application.MyApplication;

/**
 * 类描述：String工具类
 * 创建人：xh_l
 * 创建时间：2016/5/9 13:15
 * 修改人：xh_l
 * 修改时间：2016/5/9 13:15
 * 修改备注：
 */
public class StringUtils extends MyApplication {
    private static StringUtils stringUtils;

    /**
     * 先单例获取对象
     * @return
     */
    public static StringUtils getInstance(){
        return stringUtils==null?new StringUtils():stringUtils;
    }
    /**
     * 通过id得到String
     * @param resId
     * @return
     */
    public String getStringForId(int resId){
        return getString(resId);
    }
}
