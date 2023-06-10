import java.io.IOException;

public class ShutdownProgram {

    public static void main(String[] args) {
        try {
            // 创建进程对象并执行关机命令
            Process process = Runtime.getRuntime().exec("shutdown -s -t 0");
            // 等待进程执行完成
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
