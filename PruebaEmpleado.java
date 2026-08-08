public class PruebaEmpleado {
    public static void main(String [] args){
        Empleado e1= new Empleado("Aylen", "Wyder", "43414123", "cedula", 3500000.0);
        Empleado e2= new Empleado("María", "Aquino", "7871968", "cedula", 3040000.0);
        
        System.out.println("Salario anual del empleado 1: " + e1.getSalarioMensual()*12);
        System.out.println("Salario anual del empleado 2: " + e2.getSalarioMensual()*12);
        /* 
        e1.setSalarioMensual(e1.getSalarioMensual() + e1.getSalarioMensual()*0.08);
        e2.setSalarioMensual(e2.getSalarioMensual() + e2.getSalarioMensual()*0.08);
        */

        e1.aumentarSalario(8);
        e2.aumentarSalario(8);
        System.out.println(e1);
        System.out.println(e2);
    }

}
