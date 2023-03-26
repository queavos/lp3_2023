package funcionarios;
import salarios.Salario;
public class Funcionario {
    private String docnum;
    private String apellidos;
    private String nombres;
    private int edad;
    private final double salario_minlegal=2550000;
    private double salario_base;

    public String getDocnum() {
        return docnum;
    }

    public void setDocnum(String docnum) {
        this.docnum = docnum;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario_minlegal() {
        return salario_minlegal;
    }

   

    public double getSalario_base() {
        return salario_base;
    }

    public void setSalario_base(double salario_base) {
        this.salario_base = salario_base;
    }
    public double salario_neto(){
        return this.salario_base*Salario.ips;
    }
    public double salario_dif()
    {
        return this.salario_base-Salario.salario_min;
    }

    public Funcionario() {
        
    }

    public Funcionario(String docnum, String apellidos, String nombres) {
        this.docnum = docnum;
        this.apellidos = apellidos;
        this.nombres = nombres;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Funcionario{");
        sb.append("\ndocnum=").append(docnum);
        sb.append("\napellidos=").append(apellidos);
        sb.append("\n nombres=").append(nombres);
        sb.append("\n edad=").append(edad);
        sb.append("\n salario_base=").append(salario_base);
        sb.append("\n salario_neto=").append(salario_neto());
        sb.append("\n salario_dif=").append(salario_dif());
        sb.append('}');
        return sb.toString();
    }
    
    }
