/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.HashMap;

/**
 *
 * @author USER
 */
public class CHITIETORDERService {
    public static void insertChiTietOrder(int idorder, HashMap<String, Integer> spdvHashMap) {
        Model.CHITIETORDERModel.insertChiTietOrder(idorder, spdvHashMap);
    }
}
