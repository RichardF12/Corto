/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import conexion.Conexion;
import Interface.metodos;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Table.Disponibilidad;
/**
 *
 * @author LN710Q
 */
public class Dao implements metodos<Disponibilidad>{
    private static final String SQL_CREATE="CREATE TABLE `productos` (\n" + "  `id` int(11) NOT NULL,\n" + "  `nombre` varchar(20) DEFAULT NULL,\n" + "  `codigo` varchar(6) DEFAULT NULL,\n" + "  `tipo` varchar(15) DEFAULT NULL,\n" + "  `cantidad` int(11) DEFAULT NULL,\n" + "  `precio` double DEFAULT NULL,\n" + "  `disponibilidad` tinyint(1) DEFAULT NULL\n" + ") ENGINE=InnoDB DEFAULT CHARSET=latin1;";
    private static final String SQL_INSERT="INSERT INTO `productos` (`id`, `nombre`, `codigo`, `tipo`, `cantidad`, `precio`, `disponibilidad`) VALUES\n" + "(1, 'Manzana Roja', 'TC8281', 'Fruta', 20, 1, 1),\n" + "(2, 'Lechuga Romana', 'TC8237', 'Verdura', 30, 3.5, 1),\n" + "(3, 'Mountain Dew', 'FY6473', 'Bebida', 100, 0.5, 1),\n" + "(4, 'Coca Cola', 'FY6430', 'Bebida', 200, 0.5, 1),\n" + "(5, 'Kisses Hershey's', 'HJ8236', 'Dulce', 30, 1.49, 1);";
    private static final String SQL_ALTER="ALTER TABLE `productos`\n" + "  ADD PRIMARY KEY (`id`);";
    private static final String SQL_ALTER2="ALTER TABLE `productos`\n" + "  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;\n" + "/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;\n" + "/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;\n" + "/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;";
    private static final String SQL_READALL="SELECT * FROM ";
    private static final Conexion con=Conexion.conectar();
    @Override
    public boolean create(Disponibilidad g) {
         PreparedStatement ps;
         try {
             ps= con.getCnx().prepareStatement(SQL_INSERT);
             ps.setString(1, g.getCodigo());
             ps.setString(2,g.getTipo());
             ps.setInt(3, g.getCantidad());
             ps.setBoolean(4, true);
             if (ps.executeUpdate()>0){
                 return true;
             }
             
         } catch (SQLException ex){
             System.out.println(ex.getMessage());
             Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
             
         } finally {
             con.cerrarConexion();
         }
         return false;
    }

    @Override
    public boolean delete(Object key) {
        PreparedStatement ps;
        return false;
    }

    @Override
    public boolean update(Disponibilidad c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Disponibilidad read(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Disponibilidad> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
