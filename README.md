# Java-shutdown
Java关机程序
import java.io.IOException;: 导入IOException类，该类用于处理输入输出操作可能出现的异常。

public class ShutdownProgram {: 创建一个名为ShutdownProgram的公共类。

public static void main(String[] args) {: 程序的入口点，即程序开始执行的地方。

try {: 开始一个异常处理块，用于捕获可能抛出的异常。

Process process = Runtime.getRuntime().exec("shutdown -s -t 0");: 创建一个Process对象，通过Runtime.getRuntime().exec()方法执行系统命令shutdown -s -t 0，其中shutdown是关机命令，-s表示关机，-t 0表示立即执行。

process.waitFor();: 等待进程执行完成，阻塞当前线程直到关机命令执行完毕。

} catch (IOException | InterruptedException e) {: 捕获可能抛出的IOException和InterruptedException异常。

e.printStackTrace();: 打印异常堆栈跟踪信息，用于调试和定位错误。

}: 异常处理块的结束。
