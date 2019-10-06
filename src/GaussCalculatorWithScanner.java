import java.util.Scanner;

public class GaussCalculatorWithScanner {

    public static void main(String[] args) {
        System.out.println("введите количество неизвестных");
        Scanner countofUnknowns = new Scanner(System.in);
        int kp=countofUnknowns.nextInt();
        double[][] array = new double[kp][kp+1];
        //вводим числа
        Scanner sc = new Scanner(System.in);
        // вводим данные матрицы
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("введите array[" + i+ "]["+j+"]");
                array[i][j] = sc.nextInt();
                System.out.println();
            }
            System.out.println();
        }
        //печатаем исходную матрицу
        int startNumber = 0;
        int lastNumber_arraySize = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
        //......................................................................................................
        for (int k = 0; k < array.length; k++) {
            System.out.println();
            System.out.println((k + 1) + "-ую строку делим на значение первого элемента первой строки первого столбца array[" + k + "]" + "[" + k + "]");
            System.out.println();
            double temp = array[k][k];
            for (int j = 0; j < array[0].length; j++) {
                array[k][j] = array[k][j] / temp;
            }
            //печатаем полученную матрицу
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + "  ");
                }
                System.out.println();
            }

            if (k == 0) {
                for (int p = 1; p < array.length; p++) {
                    System.out.println();
                    System.out.println("от " + (p + 1) + " строки отнимаем " + (k + 1) + "-ую строку, умноженную на array[" + p + "][" + k + "]");
                    System.out.println();
                    temp = array[p][k];
                    for (int j = 0; j < array[0].length; j++) {
                        array[p][j] = array[p][j] - (array[0][j] * temp);
                    }
                    //печатаем полученную матрицу
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                            System.out.print(array[i][j] + "  ");
                        }
                        System.out.println();
                    }
                }

            } else if (k > 0) {
                for (int p = 0; p < k; p++) {
                    System.out.println();
                    System.out.println("от " + (p + 1) + " строки отнимаем " + (k + 1) + "-ую строку, умноженную на array[" + p + "][" + k + "]");
                    System.out.println();
                    temp = array[p][k];
                    for (int j = 0; j < array[0].length; j++) {
                        array[p][j] = array[p][j] - (array[k][j] * temp);
                    }
                    //печатаем полученную матрицу
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                            System.out.print(array[i][j] + "  ");
                        }
                        System.out.println();
                    }
                }
                for (int p = k + 1; p < array.length; p++) {
                    System.out.println();
                    System.out.println("от " + (p + 1) + " строки отнимаем " + (k + 1) + "-ую строку, умноженную на array[" + p + "][" + k + "]");
                    System.out.println();
                    temp = array[p][k];
                    for (int j = 0; j < array[0].length; j++) {
                        array[p][j] = array[p][j] - (array[k][j] * temp);
                    }
                    //печатаем полученную матрицу
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                            System.out.print(array[i][j] + "  ");
                        }
                        System.out.println();
                    }
                }
            }
        }
        //................................................................................................
        System.out.println();
        System.out.println("полученные неизвестные");
        System.out.println();
        int count_of_unknown_elements = 0;
        //максимальное значение индекса массива "x"
        for (int i = 1; i < array.length + 1; i++) {
            count_of_unknown_elements = i;
        }
        double[] x = new double[count_of_unknown_elements];
        //присвоение каждому неизвестному - найденное для него значение
        for (int i = 0; i < x.length; i++) {
            x[i] = array[i][count_of_unknown_elements];
            System.out.println("x" + (i + 1) + " = " + x[i]);
        }
    }
}
