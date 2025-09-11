package dulibrary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static AnnotationConfigApplicationContext ctx = null;
    private static DuLibraryDao dao = null;

    public static void main(String[] args) throws IOException {
        ctx = new AnnotationConfigApplicationContext(AppCtx.class);
        dao = ctx.getBean(DuLibraryDao.class);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("명령어를 입력하세요:");
            String command = reader.readLine();

            if (command.equalsIgnoreCase("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (command.startsWith("insert ")) {
                processInsertCommand(command.split(" "));
            } else if (command.startsWith("loanupdate ")) {
                processLoanUpdateCommand(command.split(" "));
            } else if (command.startsWith("delete ")) {
                processDeleteCommand(command.split(" "));
            } else if (command.startsWith("select ")) {
                processSelectIdCommand(command.split(" "));
            } else if (command.equals("list")) {
                processSelectAllCommand();
            } else {
                printHelp();
            }
        }
    }

    private static void processInsertCommand(String[] args) {
        if (args.length != 6) {
            printHelp();
            return;
        }

        String id = args[1];
        String name = args[2];
        Boolean loan = Boolean.parseBoolean(args[3]);
        Date borrowdate = "null".equalsIgnoreCase(args[4]) ? null : Date.valueOf(args[4]);
        Date duedate = "null".equalsIgnoreCase(args[5]) ? null : Date.valueOf(args[5]);

        DuLibrary dulibrary = new DuLibrary(id, name, loan, borrowdate, duedate);
        dao.insert(dulibrary);
        System.out.println("도서 등록 완료: " + dulibrary);
    }

    private static void processLoanUpdateCommand(String[] args) {
        if (args.length != 4) {
            printHelp();
            return;
        }

        String id = args[1];
        Boolean loan = Boolean.parseBoolean(args[2]);
        Date borrowdate = "null".equalsIgnoreCase(args[3]) ? null : Date.valueOf(args[3]);

        DuLibrary dulibrary = new DuLibrary(id, null, loan, borrowdate, null);
        dao.loanupdate(dulibrary);
        System.out.println("대출 정보 업데이트 완료: " + dulibrary);
    }

    private static void processDeleteCommand(String[] args) {
        if (args.length != 2) {
            printHelp();
            return;
        }

        String id = args[1];
        dao.delete(id);
        System.out.println("도서 삭제 완료: id=" + id);
    }

    private static void processSelectIdCommand(String[] args) {
        if (args.length != 2) {
            printHelp();
            return;
        }

        String id = args[1];
        DuLibrary dulibrary = dao.selectId(id);
        if (dulibrary == null) {
            System.out.println("해당 ID의 도서가 없습니다: " + id);
        } else {
            System.out.println(dulibrary);
        }
    }

    private static void processSelectAllCommand() {
        List<DuLibrary> list = dao.selectAll();
        if (list.isEmpty()) {
            System.out.println("등록된 도서가 없습니다.");
        } else {
            System.out.println("전체 도서 목록:");
            for (DuLibrary d : list) {
                System.out.println(d);
            }
        }
    }

    private static void printHelp() {
        System.out.println();
        System.out.println("잘못된 명령어입니다. 사용 가능한 명령어:");
        System.out.println("insert id name loan(true/false) borrowdate(YYYY-MM-DD or null) duedate(YYYY-MM-DD or null)");
        System.out.println("loanupdate id loan(true/false) borrowdate(YYYY-MM-DD or null)");
        System.out.println("delete id");
        System.out.println("select id");
        System.out.println("list");
        System.out.println("exit");
        System.out.println();
    }
}
