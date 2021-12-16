package oop_mvc.bai1.service.impt;

import oop_mvc.bai1.model.Candidate;
import oop_mvc.bai1.service.CandidateService;

import java.util.Scanner;

public class TestCandidate implements CandidateService {
    private Candidate[] candidates = new Candidate[100];
    private static Scanner scanner = new Scanner(System.in);
    private static int count = 0;

    @Override
    public void addCandidate() {
        System.out.print("Nhập số lượng học viên cần thêm vào: ");
        int number = Integer.parseInt(scanner.nextLine());
        if (number + count <= 100) {
            for (int index = 0; index < number; index++) {
                System.out.print("Nhập mã học viên: ");
                String code = scanner.nextLine();
                System.out.print("Nhập họ và tên: ");
                String name = scanner.nextLine();
                System.out.print("Nhập ngày tháng năm sinh: ");
                String dateOb = scanner.nextLine();
                System.out.print("Nhập điểm Toán: ");
                double pointMath = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhập điểm Văn: ");
                double pointLiterature = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhập điểm Anh: ");
                double pointEnglish = Double.parseDouble(scanner.nextLine());
                Candidate candidate = new Candidate(code, name, dateOb, pointMath, pointLiterature, pointEnglish);
                candidates[count] = candidate;
                count++;
            }
        }else {
            System.out.println("Danh sách đầy.");
        }
    }

    @Override
    public void getAll() {
        for (Candidate candidate: candidates) {
            if (candidate == null) {
                break;
            }
            if (candidate.getPointMath() + candidate.getPointLiterature() + candidate.getPointEnglish() > 15) {
                System.out.println(candidate);
            }
        }

    }

}
