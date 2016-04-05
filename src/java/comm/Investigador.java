/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comm;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JhGomezR
 */
@Entity
@Table(name = "investigador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Investigador.findAll", query = "SELECT i FROM Investigador i"),
    @NamedQuery(name = "Investigador.findByIdInvestigador", query = "SELECT i FROM Investigador i WHERE i.idInvestigador = :idInvestigador"),
    @NamedQuery(name = "Investigador.findByInNombres", query = "SELECT i FROM Investigador i WHERE i.inNombres = :inNombres"),
    @NamedQuery(name = "Investigador.findByInApellido1", query = "SELECT i FROM Investigador i WHERE i.inApellido1 = :inApellido1"),
    @NamedQuery(name = "Investigador.findByInApellido2", query = "SELECT i FROM Investigador i WHERE i.inApellido2 = :inApellido2"),
    @NamedQuery(name = "Investigador.findByInTipoIdentificacion", query = "SELECT i FROM Investigador i WHERE i.inTipoIdentificacion = :inTipoIdentificacion"),
    @NamedQuery(name = "Investigador.findByInNumIdentificacion", query = "SELECT i FROM Investigador i WHERE i.inNumIdentificacion = :inNumIdentificacion"),
    @NamedQuery(name = "Investigador.findByInFechaNac", query = "SELECT i FROM Investigador i WHERE i.inFechaNac = :inFechaNac"),
    @NamedQuery(name = "Investigador.findByInDireccion", query = "SELECT i FROM Investigador i WHERE i.inDireccion = :inDireccion"),
    @NamedQuery(name = "Investigador.findByInTelefono", query = "SELECT i FROM Investigador i WHERE i.inTelefono = :inTelefono"),
    @NamedQuery(name = "Investigador.findByInMovil", query = "SELECT i FROM Investigador i WHERE i.inMovil = :inMovil"),
    @NamedQuery(name = "Investigador.findByInTipoInves", query = "SELECT i FROM Investigador i WHERE i.inTipoInves = :inTipoInves"),
    @NamedQuery(name = "Investigador.findByInEstado", query = "SELECT i FROM Investigador i WHERE i.inEstado = :inEstado"),
    @NamedQuery(name = "Investigador.findByInSalario", query = "SELECT i FROM Investigador i WHERE i.inSalario = :inSalario"),
    @NamedQuery(name = "Investigador.findByInContrase\u00f1a", query = "SELECT i FROM Investigador i WHERE i.inContrase\u00f1a = :inContrase\u00f1a"),
    @NamedQuery(name = "Investigador.findByInObservacion", query = "SELECT i FROM Investigador i WHERE i.inObservacion = :inObservacion")})
public class Investigador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_investigador")
    private Integer idInvestigador;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "in_nombres")
    private String inNombres;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "in_apellido1")
    private String inApellido1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "in_apellido2")
    private String inApellido2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "in_tipo_identificacion")
    private String inTipoIdentificacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "in_num_identificacion")
    private int inNumIdentificacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "in_fecha_nac")
    @Temporal(TemporalType.DATE)
    private Date inFechaNac;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "in_direccion")
    private String inDireccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "in_telefono")
    private String inTelefono;
    @Size(max = 20)
    @Column(name = "in_movil")
    private String inMovil;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "in_tipo_inves")
    private String inTipoInves;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "in_estado")
    private String inEstado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "in_salario")
    private long inSalario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "in_contrase\u00f1a")
    private String inContraseña;
    @Size(max = 200)
    @Column(name = "in_observacion")
    private String inObservacion;

    public Investigador() {
    }

    public Investigador(Integer idInvestigador) {
        this.idInvestigador = idInvestigador;
    }

    public Investigador(Integer idInvestigador, String inNombres, String inApellido1, String inApellido2, String inTipoIdentificacion, int inNumIdentificacion, Date inFechaNac, String inDireccion, String inTelefono, String inTipoInves, String inEstado, long inSalario, String inContraseña) {
        this.idInvestigador = idInvestigador;
        this.inNombres = inNombres;
        this.inApellido1 = inApellido1;
        this.inApellido2 = inApellido2;
        this.inTipoIdentificacion = inTipoIdentificacion;
        this.inNumIdentificacion = inNumIdentificacion;
        this.inFechaNac = inFechaNac;
        this.inDireccion = inDireccion;
        this.inTelefono = inTelefono;
        this.inTipoInves = inTipoInves;
        this.inEstado = inEstado;
        this.inSalario = inSalario;
        this.inContraseña = inContraseña;
    }

    public Integer getIdInvestigador() {
        return idInvestigador;
    }

    public void setIdInvestigador(Integer idInvestigador) {
        this.idInvestigador = idInvestigador;
    }

    public String getInNombres() {
        return inNombres;
    }

    public void setInNombres(String inNombres) {
        this.inNombres = inNombres;
    }

    public String getInApellido1() {
        return inApellido1;
    }

    public void setInApellido1(String inApellido1) {
        this.inApellido1 = inApellido1;
    }

    public String getInApellido2() {
        return inApellido2;
    }

    public void setInApellido2(String inApellido2) {
        this.inApellido2 = inApellido2;
    }

    public String getInTipoIdentificacion() {
        return inTipoIdentificacion;
    }

    public void setInTipoIdentificacion(String inTipoIdentificacion) {
        this.inTipoIdentificacion = inTipoIdentificacion;
    }

    public int getInNumIdentificacion() {
        return inNumIdentificacion;
    }

    public void setInNumIdentificacion(int inNumIdentificacion) {
        this.inNumIdentificacion = inNumIdentificacion;
    }

    public Date getInFechaNac() {
        return inFechaNac;
    }

    public void setInFechaNac(Date inFechaNac) {
        this.inFechaNac = inFechaNac;
    }

    public String getInDireccion() {
        return inDireccion;
    }

    public void setInDireccion(String inDireccion) {
        this.inDireccion = inDireccion;
    }

    public String getInTelefono() {
        return inTelefono;
    }

    public void setInTelefono(String inTelefono) {
        this.inTelefono = inTelefono;
    }

    public String getInMovil() {
        return inMovil;
    }

    public void setInMovil(String inMovil) {
        this.inMovil = inMovil;
    }

    public String getInTipoInves() {
        return inTipoInves;
    }

    public void setInTipoInves(String inTipoInves) {
        this.inTipoInves = inTipoInves;
    }

    public String getInEstado() {
        return inEstado;
    }

    public void setInEstado(String inEstado) {
        this.inEstado = inEstado;
    }

    public long getInSalario() {
        return inSalario;
    }

    public void setInSalario(long inSalario) {
        this.inSalario = inSalario;
    }

    public String getInContraseña() {
        return inContraseña;
    }

    public void setInContraseña(String inContraseña) {
        this.inContraseña = inContraseña;
    }

    public String getInObservacion() {
        return inObservacion;
    }

    public void setInObservacion(String inObservacion) {
        this.inObservacion = inObservacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInvestigador != null ? idInvestigador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Investigador)) {
            return false;
        }
        Investigador other = (Investigador) object;
        if ((this.idInvestigador == null && other.idInvestigador != null) || (this.idInvestigador != null && !this.idInvestigador.equals(other.idInvestigador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "comm.Investigador[ idInvestigador=" + idInvestigador + " ]";
    }
    
}
