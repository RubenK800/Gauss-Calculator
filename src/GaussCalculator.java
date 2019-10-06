public class GaussCalculator {
    public static void main(String[] args) {
        System.out.println("число неизвестных == 4");
        double[][] array = new double[4][5];
        //вводим числа
        array[0][0] = 5;
        array[0][1] = 2;
        array[0][2] = 4;
        array[0][3] = 8;
        array[0][4] = 16;
        array[1][0] = 8;
        array[1][1] = 6;
        array[1][2] = 15;
        array[1][3] = 26;
        array[1][4] = 100;
        array[2][0] = 3;
        array[2][1] = 5;
        array[2][2] = 14;
        array[2][3] = 23;
        array[2][4] = 87;
        array[3][0] = 2;
        array[3][1] = 12;
        array[3][2] = 8;
        array[3][3] = 32;
        array[3][4] = 125;
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
