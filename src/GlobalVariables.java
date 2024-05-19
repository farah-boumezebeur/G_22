
import dao.CertificatDao;
import dao.ConsultationDao;
import dao.OrdenanceDao;
import dao.UserDao;
import dao.PatientDao;
import dao.RDVDao;
import java.text.SimpleDateFormat;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class GlobalVariables {
    public static UserDao userDao = new UserDao();
    public static PatientDao patientDao = new PatientDao();
    public static RDVDao  rdvDao  = new RDVDao();
    public static ConsultationDao  consultationDao  = new ConsultationDao();
    public static CertificatDao  certificatDao  = new CertificatDao();
    public static OrdenanceDao  ordDao  = new OrdenanceDao();
    public static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
}
