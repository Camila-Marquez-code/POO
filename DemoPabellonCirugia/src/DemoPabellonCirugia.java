import java.util.Scanner;
public class DemoPabellonCirugia {
    public static void main(String[] args) {
        Scanner tcld = new Scanner(System.in);

        PabellonCirugia[] pabellonCirugias = new PabellonCirugia[6];

        System.out.println("INGRESO DE DATOS");
        for (int i=0;i<6;i++) {
            System.out.print("Numero: ");
            int numero = tcld.nextInt();

            tcld.nextLine();

            System.out.print("Especialidad: ");
            String especialidad = tcld.nextLine();

            pabellonCirugias[i] = new PabellonCirugia(numero, especialidad);
        }

        for (int i=0;i<6;i++) {
            if (i%2!=0) {
               pabellonCirugias[i].setEstado(Estado.OCUPADO);
            }
        }

        for (int i=0;i<6;i++) {
            System.out.println(pabellonCirugias[i].toString());
        }

        System.out.println("------------------");
        System.out.println("COMPARACION PABELLONES");
        System.out.println("Es el pabellon 1 igual al pabellon 2?: " + pabellonCirugias[0].equals(pabellonCirugias[1]));
        System.out.println("Es el pabellon 1 igual al pabellon 3?: " + pabellonCirugias[0].equals(pabellonCirugias[2]));
        System.out.println("Es el pabellon 1 igual al pabellon 4?: " + pabellonCirugias[0].equals(pabellonCirugias[3]));
        System.out.println("Es el pabellon 1 igual al pabellon 5?: " + pabellonCirugias[0].equals(pabellonCirugias[4]));
        System.out.println("Es el pabellon 1 igual al pabellon 6?: " + pabellonCirugias[0].equals(pabellonCirugias[5]));
        System.out.println("Es el pabellon 2 igual al pabellon 3?: " + pabellonCirugias[1].equals(pabellonCirugias[2]));
        System.out.println("Es el pabellon 2 igual al pabellon 4?: " + pabellonCirugias[1].equals(pabellonCirugias[3]));
        System.out.println("Es el pabellon 2 igual al pabellon 5?: " + pabellonCirugias[1].equals(pabellonCirugias[4]));
        System.out.println("Es el pabellon 2 igual al pabellon 6?: " + pabellonCirugias[1].equals(pabellonCirugias[5]));
        System.out.println("Es el pabellon 3 igual al pabellon 4?: " + pabellonCirugias[2].equals(pabellonCirugias[3]));
        System.out.println("Es el pabellon 3 igual al pabellon 5?: " + pabellonCirugias[2].equals(pabellonCirugias[4]));
        System.out.println("Es el pabellon 3 igual al pabellon 6?: " + pabellonCirugias[2].equals(pabellonCirugias[5]));
        System.out.println("Es el pabellon 4 igual al pabellon 5?: " + pabellonCirugias[3].equals(pabellonCirugias[4]));
        System.out.println("Es el pabellon 4 igual al pabellon 6?: " + pabellonCirugias[3].equals(pabellonCirugias[5]));
        System.out.println("Es el pabellon 5 igual al pabellon 6?: " + pabellonCirugias[4].equals(pabellonCirugias[5]));

        tcld.close();
    }
}