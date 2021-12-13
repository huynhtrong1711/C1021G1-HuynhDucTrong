package oop_mvc.bai1.controller;

import oop_mvc.bai1.service.CandidateService;
import oop_mvc.bai1.service.impt.TestCandidate;

import java.util.Scanner;

public class CandidateController {
    public static void main(String[] args) {
        CandidateService candidateService = new TestCandidate();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Thêm học viên mới. ");
            System.out.println("2. Hiển thị danh sách học viên. ");
            System.out.println("3. kết thúc. ");
            int chose = Integer.parseInt(scanner.nextLine());
            switch (chose) {
                case 1:
                    candidateService.addCandidate();
                    break;
                case 2:
                    candidateService.getAll();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }

        }while (true);
    }
}
