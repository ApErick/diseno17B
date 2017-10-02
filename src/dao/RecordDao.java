/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;

/**
 *
 * @author wildc
 */
public interface RecordDao {
    
    
    public void guardaRecord(int r,String user, String idj);
    public ArrayList[] Topten(int idj);
    
    
}
