package tema1;
public class T1E4 {
    public static void main(String[] args) {
        System.out.println("Horario\t L\t M\t X\t J\t V");
        System.out.println("15:15\t ED\t Pro\t BD\t Pro\t Pro");
        System.out.println("16:15\t ED\t Pro\t BD\t Pro\t Pro");
        System.out.println("17:15\t ED\t DASP\t BD\t Pro\t LMSG");
        System.out.println("18:30\t SM\t BD\t IPE I\t Pro\t LMSG");
        System.out.println("19:30\t SM\t BD\t IPE I\t SM\t LMSG");
        System.out.println("20:30\t SM\t BD\t IPE I\t SM\t SOS");

        int base = 5, j = 0;
        for (int i = 1; i <= base; ++i, j = 0) {
            for (int espacio = 1; espacio <= base - i; ++espacio) {
                System.out.print(" ");
            }
            while (j != 2 * i - 1) {
                System.out.print("*");
                ++j;
            }
            System.out.println();
        }
    }
}