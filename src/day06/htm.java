package day06;

import java.util.Arrays;
import java.util.Scanner;

public class htm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢠⣴⣾⣿⣶⣶⣆⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀ ");
        System.out.println("⢀⢀⢀⣀⢀⣤⢀⢀⡀⢀⣿⣿⣿⣿⣷⣿⣿⡇⢀⢀⢀⢀⣤⣀⢀⢀⢀⢀⢀ ");
        System.out.println("⢀⢀ ⣶⢻⣧⣿⣿⠇ ⢸⣿⣿⣿⣷⣿⣿⣿⣷⢀⢀⢀⣾⡟⣿⡷⢀⢀⢀⢀");
        System.out.println("⢀⢀⠈⠳⣿⣾⣿⣿⢀⠈⢿⣿⣿⣷⣿⣿⣿⣿⢀⢀⢀⣿⣿⣿⠇⢀⢀⢀⢀ ");
        System.out.println("⢀⢀⢀⢀⢿⣿⣿⣿⣤⡶⠺⣿⣿⣿⣷⣿⣿⣿⢄⣤⣼⣿⣿⡏⢀⢀⢀⢀⢀ ");
        System.out.println("⢀⢀⢀⢀⣼⣿⣿⣿⠟⢀⢀⠹⣿⣿⣿⣷⣿⣿⣎⠙⢿⣿⣿⣷⣤⣀⡀⢀⢀ ");
        System.out.println("⢀⢀⢀ ⢸⣿⣿⣿⡿⢀⢀⣤⣿⣿⣿⣷⣿⣿⣿⣄⠈⢿⣿⣿⣷⣿⣿⣷⡀⢀");
        System.out.println("⢀⢀⢀⣿⣿⣿⣿⣷⣀⣀⣠⣿⣿⣿⣿⣷⣿⣷⣿⣿⣷⣾⣿⣿⣿⣷⣿⣿⣿⣆");
        System.out.println("⣿⣿⠛⠋⠉⠉⢻⣿⣿⣿⣿⡇⡀⠘⣿⣿⣿⣷⣿⣿⣿⠛⠻⢿⣿⣿⣿⣿⣷⣦");
        System.out.println("⣿⣿⣧⡀⠿⠇⣰⣿⡟⠉⠉⢻⡆⠈⠟⠛⣿⣿⣿⣯⡉⢁⣀⣈⣉⣽⣿⣿⣿⣷");
        System.out.println("⡿⠛⠛⠒⠚⠛⠉⢻⡇⠘⠃⢸⡇⢀⣤⣾⠋⢉⠻⠏⢹⠁⢤⡀⢉⡟⠉⡙⠏⣹");
        System.out.println("⣿⣦⣶⣶⢀⣿⣿⣿⣷⣿⣿⣿⡇⢀⣀⣹⣶⣿⣷⠾⠿⠶⡀⠰⠾⢷⣾⣷⣶⣿");
        System.out.println("⣿⣿⣿⣿⣇⣿⣿⣿⣷⣿⣿⣿⣇⣰⣿⣿⣷⣿⣿⣷⣤⣴⣶⣶⣦⣼⣿⣿⣿⣷");
        System.out.println();

        String[][] employees = new String[1000][5];
        int totalEmployee = 0;

        while (true) {
            System.out.println("===========사원관리 프로그램(HRM)============");
            System.out.println("# 1. 사원 정보 신규등록");
            System.out.println("# 2. 모든 사원정보 보기");
            System.out.println("# 3. 사원정보 검색");
            System.out.println("# 4. 사원정보 수정");
            System.out.println("# 5. 사원정보 삭제");
            System.out.println("# 6. 프로그램 종료");
            System.out.println("============================================");
            System.out.print("메뉴 입력 > ");

            int menu = sc.nextInt();

            // 사원 데이터베이스 배열
           /* String[][] employees = {
                    {"12", "ㅍㅍㅊ", "35", "ㄴㄴㄴ", " "},
                    {"13", "ㅍㅍㅊ1", "35", "ㄴㄴㄴ", " "},
                    {"14", "ㅍㅍㅊ2", "35", "ㄴㄴㄴ", " "}
            };*/


            switch (menu) {
                case 1:
                    System.out.println("사원 정보 등록");
                    System.out.print("사번을 입력하세요. > ");
                    String employeeNumber = sc.next();

                    System.out.print("이름을 입력하세요. > ");
                    String employeeName = sc.next();

                    System.out.print("나이를 입력하세요. > ");
                    String employeeAge = sc.next();

                    System.out.print("부서를 입력하세요. > ");
                    String department = sc.next();

                    for (int i = 0; i <= totalEmployee; i++) {
                        employees[totalEmployee][0] = employeeNumber;
                        employees[totalEmployee][1] = employeeName;
                        employees[totalEmployee][2] = employeeAge;
                        employees[totalEmployee][3] = department;
                    }

                    System.out.println(Arrays.deepToString(employees));
                    totalEmployee += 1;

                    break;

                case 2:

                    System.out.println("--------전체 사원 정보 -----------");
                    System.out.println("사번      이름      나이      부서");
                    System.out.println("--------------------------------");

                    for (int i = 0; i < totalEmployee; i++) {
                        System.out.printf("%s     %s     %s     %s\n", employees[i][0], employees[i][1], employees[i][2], employees[i][3]);
                    }

//                    System.out.println(Arrays.deepToString(employees));
//                    System.out.print(employees);
//                    System.out.print(Info[1]);
//                    System.out.print(Info[2]);
//                    System.out.print(Info[3]);
//                    System.out.println("");

                    break;
                case 3:
                    System.out.println("3");
                    return;

                case 4:
                    System.out.println("수정하실 사원의 번호를 입력하세요");
                    System.out.print("> ");
                    String personnum = sc.next();


                    for (int i = 0; i < totalEmployee; i++) {
                        if (employees[i][0].equals(personnum)) {
                            System.out.printf("%s 님의 정보를 수정합니다\n", employees[i][1]);
                            System.out.println("1. 나이 변경 | 2. 부서변경 | 3. 취소 ");
                            System.out.print("> ");

                            int menu02 = sc.nextInt();
                            switch (menu02) {
                                case 1:
                                    System.out.println("# 변경하실 나이를 입력하세요.");
                                    System.out.print("> ");
                                    int personage = sc.nextInt();
                                    employees[i][2] = String.valueOf(personage);
                                    System.out.println("# 나이가 " + personage + "세로 변경되었습니다.");
                                    break;
                                case 2:
                                    System.out.println("# 변경하실 부서를 입력하세요.");
                                    System.out.print("> ");
                                    String personarea = sc.next();
                                    employees[i][3] = String.valueOf(personarea);
                                    System.out.println("# 부서가 " + personarea + "로 변경되었습니다.");
                                    break;
                                case 3:
                                    System.out.println("# 정보수정을 취소합니다.");
                                    break;
                            }
                        } else {
                            System.out.println("해당 사원의 정보가 존재하지 않습니다.");
                            break;
                        }
                    }

                case 5:
                    System.out.println("# 삭제하실 사원의 번호를 입력하세요");
                    System.out.print("> ");
                    String personnum1 = sc.next();

                    for (int i = 0; i < totalEmployee; i++) {
                        if (employees[i][0].equals(personnum1)) {
                            System.out.printf("%s 님의 정보를 삭제합니다.[y/n]\n", employees[i][1]);



                                }
                            }

//                                     }

                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    return;
            }
}
        }
    }