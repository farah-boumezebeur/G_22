/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;
import model.Model;
/**
 *
 * @author PC
 */
public interface Idao {
    public  void save(Model model);
    public void edit(Model model);
    public void delete();
}
