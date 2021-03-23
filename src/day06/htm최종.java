package day06;

import java.util.*;

public class htm최종 {
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
        System.out.println("");

        String[][] employees = new String[1000][5];
        // 사원 데이터베이스 배열
        /*String[][] employees = {
                {"1", "ㅍㅍㅊ", "35", "ㄴㄴㄴ", " "},
                {"2", "ㅍㅍㅊ1", "35", "ㄴㄴㄴ", " "},
                {"3", "ㅍㅍㅊ2", "35", "ㄴㄴㄴ", " "}
        };*/
        int totalEmployee = 0;

        while (true) {
            System.out.println("===========사원관리 프로그램(HRM)=============");
            System.out.println("# 1. 사원 정보 신규등록");
            System.out.println("# 2. 모든 사원정보 보기");
            System.out.println("# 3. 사원정보 검색");
            System.out.println("# 4. 사원정보 수정");
            System.out.println("# 5. 사원정보 삭제");
            System.out.println("# 6. 부서별 직원현황");
            System.out.println("# 7. 프로그램 종료");
            System.out.println("============================================");
            System.out.print("메뉴 입력 > ");

            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    try {
                        System.out.println("사원 정보 등록");
                        System.out.print("사번을 입력하세요. > ");
                        String employeeNumber = sc.next();

                        System.out.print("이름을 입력하세요. > ");
                        String employeeName = sc.next();

                        System.out.print("나이를 입력하세요. > ");
                        int afterAge = sc.nextInt();
                        String employeeAge = String.valueOf(afterAge);

                        System.out.print("부서를 입력하세요. > ");
                        String department = sc.next();

                        for (int i = 0; i <= totalEmployee; i++) {
                            employees[totalEmployee][0] = employeeNumber;
                            employees[totalEmployee][1] = employeeName;
                            employees[totalEmployee][2] = employeeAge;
                            employees[totalEmployee][3] = department;
                        }

//                        System.out.println(Arrays.deepToString(employees));
                        totalEmployee += 1;

//                        오류 발생시 해당 문구 출력 후 강제 종료
                    } catch (Exception e) {
                        System.out.println("잘못 입력 하였습니다.");
                        sc.nextLine();
                        continue;
                    }
                    break;

                case 2:

                    System.out.println("------------- 전체 사원 정보 -------------");
                    System.out.println("사번\t\t이름\t\t나이\t\t부서");

                    for (int i = 0; i < totalEmployee; i++) {
                        System.out.printf("%s\t\t%s\t\t%s\t\t%s\n", employees[i][0], employees[i][1], employees[i][2], employees[i][3]);
                    }
                    System.out.println("-----------------------------------------");


                    break;

                case 3:
                    System.out.println("#조회하실 사원의 번호를 입력하세요.");
                    System.out.print("> ");
                    String employeeInfo = sc.next();

                    boolean flag = false;
                    for (int i = 0; i < totalEmployee; i++) {
                        if (employeeInfo.equals(employees[i][0])) {
                            System.out.println("------------ 조회된 사원 정보 ------------");
                            System.out.println("사번\t\t이름\t\t나이\t\t부서");

                            System.out.printf("%s\t\t%s\t\t%s\t\t%s\n", employees[i][0], employees[i][1], employees[i][2], employees[i][3]);

                            System.out.println("----------------------------------------");
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        System.out.println("입력한 사원은 존재하지 않습니다.");
                    }
                    break;

                case 4:
                    try {
                        System.out.println("수정하실 사원의 번호를 입력하세요");
                        System.out.print("> ");
                        String personnum = sc.next();
                        boolean noneFlag = false;

                        for (int i = 0; i < totalEmployee; i++) {
                            if (employees[i][0].equals(personnum)) {

                                System.out.printf("%s 님의 정보를 수정합니다\n", employees[i][1]);
                                System.out.println("1. 이름 변경\t|\t2. 나이변경\t|\t3. 부서변경\t|\t4. 취소 ");
                                System.out.print("> ");

                                int menu02 = sc.nextInt();
                                sc.nextLine();
                                switch (menu02) {
                                    case 1:
                                        System.out.println("# 변경하실 이름를 입력하세요.");
                                        System.out.print("> ");
                                        String personName = sc.next();
                                        employees[i][1] = String.valueOf(personName);
                                        System.out.println("# 이름이 " + personName + "로 변경되었습니다.");
                                        noneFlag = true;
                                        break;

                                    case 2:
                                        System.out.println("# 변경하실 나이를 입력하세요.");
                                        System.out.print("> ");
                                        int personage = sc.nextInt();
                                        employees[i][2] = String.valueOf(personage);
                                        System.out.println("# 나이가 " + personage + "세로 변경되었습니다.");
                                        noneFlag = true;
                                        break;

                                    case 3:
                                        System.out.println("# 변경하실 부서를 입력하세요.");
                                        System.out.print("> ");
                                        String personarea = sc.next();
                                        employees[i][3] = String.valueOf(personarea);
                                        System.out.println("# 부서가 " + personarea + "로 변경되었습니다.");
                                        noneFlag = true;
                                        break;

                                    case 4:
                                        System.out.println("# 정보수정을 취소합니다.");
                                        noneFlag = true;
                                        break;

                                    default:
                                        System.out.println("잘못 입력하였습니다.");
                                        noneFlag = true;
                                        break;
                                }
                            }
                        }
                        if (!noneFlag) {
                            System.out.println("존재하지 않는 사원입니다.");
                        }
                    } catch (Exception e) {
                        System.out.println("잘못 입력 하였습니다.");
                        sc.nextLine();
                        continue;
                    }

                    break;

                case 5:
                    System.out.println("# 삭제하실 사원의 번호를 입력하세요");
                    System.out.print("> ");
                    String delEmployee = sc.next();
//                    String cast = String.valueOf(delEmployee);
                    String[][] temp = new String[employees.length - 1][5];

                    boolean secondFlag = false;

                    for (int i = 0; i < employees.length; i++) {
                        if (delEmployee.equals(employees[i][0])) {
                            System.out.printf("%s 님의 정보를 삭제합니다.[y/n]\n", employees[i][1]);
                            String something = sc.next();

                            if (something.equals("y")) {
                                int dummyData = i + 1;

                                // i가 가리키는 값이 Null일 경우 (배열에 들어간 마지막 사원 다음 배열은 Null임)
                                if (employees[dummyData].equals("null")) {
                                    for (int x = 0; x < temp.length; x++) {

                                        if (dummyData > temp.length)
                                            break;
                                        temp[x] = employees[dummyData - 1];
//                                    System.out.println("");
                                        dummyData += 1;
                                    }

                                    for (int j = 0; j < temp.length; j++) {
                                        int sum = i + j;
                                        if (sum >= temp.length) break;
                                        employees[j + i] = temp[j];
                                    }
                                    temp = null;
                                    totalEmployee--;

                                    secondFlag = true;

                                } else {
                                    for (int x = 0; x < temp.length; x++) {

                                        if (dummyData > temp.length)
                                            break;
                                        temp[x] = employees[dummyData];
                                        dummyData += 1;
                                    }

                                    for (int j = 0; j < temp.length; j++) {
                                        int sum = i + j;
                                        if (sum >= temp.length) break;
                                        employees[sum] = temp[j];
                                    }
                                    temp = null;
                                    totalEmployee--;

                                    secondFlag = true;
                                }
                                break;
                            } else {
                                System.out.println("사원정보 삭제를 취소합니다.");
                                secondFlag = true;
                            }
                        }
                    }
                    if (!secondFlag) {
                        System.out.println("존재하지 않는 사원입니다.");
                    }
                    break;
                //

                case 6:
                    //System.out.println("*****");
                    System.out.println("------------- 부서별 직원 현황 -------------");
                    System.out.println("총무\t\t\t경영\t\t\t인사\t\t\t개발");
                    System.out.println("----------------------------------------");

                    int departmentInfo = 0; //부서별 총 직원현황
                    int department1 = 0; // 총무부서 인원수를 기록할 변수
                    int department2 = 0; // 경영부서 인원수를 기록할 변수
                    int department3 = 0; // 인사부서 인원수를 기록할 변수
                    int department4 = 0; // 개발부서 인원수를 기록할 변수

                    for (int i = 0; i < totalEmployee; i++) {
                        if (employees[i][3].equals("총무")) {
                            department1++;
                            departmentInfo += i;
                        } else if (employees[i][3].equals("경영")) {
                            department2++;
                            departmentInfo += i;
                        } else if (employees[i][3].equals("인사")) {
                            department3++;
                            departmentInfo += i;
                        } else if (employees[i][3].equals("개발")) {
                            department4++;
                            departmentInfo += i;
                        }
                    }
                    System.out.printf("%s\t\t\t %s\t\t\t %s\t\t\t %s\t\t\t \n", department1, department2, department3, department4);
                    break;

                case 7:
                    System.out.println("프로그램을 종료합니다.");
                    return;
            }

        }


    }
}
