/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fml.spider.kuaiji.spider;

import com.fml.spider.kuaiji.CityStatu;
import com.fml.spider.kuaiji.model.City;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author ky
 */
public interface Spider {

    public CityStatu tryConnect(String  cityCode)  throws  Exception ;

    public List<City> getEnableCity()  throws  Exception ;
    
    

}
